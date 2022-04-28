package ivansimeonov.springframework.msscbeerinventoryservice.services;

import ivansimeonov.springframework.msscbeerinventoryservice.repositories.BeerInventoryRepository;
import ivansimeonov.springframework.msscbeerinventoryservice.web.mappers.BeerInventoryMapper;
import ivansimeonov.springframework.msscbeerinventoryservice.web.model.BeerInventoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * @Author ivansimeonov
 * @Date 28.04.22
 */
@Service
public class BeerInventoryServiceImpl implements BeerInventoryService {

    private final BeerInventoryRepository beerInventoryRepository;
    private final BeerInventoryMapper beerInventoryMapper;

    @Autowired
    public BeerInventoryServiceImpl(BeerInventoryRepository beerInventoryRepository, BeerInventoryMapper beerInventoryMapper) {
        this.beerInventoryRepository = beerInventoryRepository;
        this.beerInventoryMapper = beerInventoryMapper;
    }

    @Override
    public List<BeerInventoryDto> listBeersById(UUID beerId) {
        return beerInventoryRepository.findAllByBeerId(beerId)
                .stream()
                .map(beerInventoryMapper::beerInventoryToBeerInventoryDto)
                .collect(Collectors.toList());
    }
}
