package ivansimeonov.springframework.msscbeerinventoryservice.services;

import ivansimeonov.springframework.msscbeerinventoryservice.domain.BeerInventory;
import ivansimeonov.springframework.msscbeerinventoryservice.web.model.BeerInventoryDto;

import java.util.List;
import java.util.UUID;

/**
 * @Author ivansimeonov
 * @Date 28.04.22
 */
public interface BeerInventoryService {
    List<BeerInventoryDto> listBeersById(UUID beerId);
}
