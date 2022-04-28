package ivansimeonov.springframework.msscbeerinventoryservice.web.mappers;

import ivansimeonov.springframework.msscbeerinventoryservice.domain.BeerInventory;
import ivansimeonov.springframework.msscbeerinventoryservice.web.model.BeerInventoryDto;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

/**
 * @Author ivansimeonov
 * @Date 28.04.22
 */
@Component
@Mapper(uses = {DateMapper.class}, componentModel = "spring")
public interface BeerInventoryMapper {
    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);

    BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDto);
}
