package ivansimeonov.springframework.msscbeerinventoryservice.web.controllers;

import ivansimeonov.springframework.msscbeerinventoryservice.services.BeerInventoryService;
import ivansimeonov.springframework.msscbeerinventoryservice.web.model.BeerInventoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

/**
 * @Author ivansimeonov
 * @Date 29.04.22
 */
@RestController
@RequestMapping("/api/v1/")
public class BeerInventoryController {

    private final BeerInventoryService beerInventoryService;

    @Autowired
    public BeerInventoryController(BeerInventoryService beerInventoryService) {
        this.beerInventoryService = beerInventoryService;
    }

    @GetMapping("beer/{beerId}/inventory")
    List<BeerInventoryDto> listBeerInventoryByBeerId(@PathVariable("beerId") UUID beerId) {
        return beerInventoryService.listBeersById(beerId);
    }

}
