package ivansimeonov.springframework.msscbeerinventoryservice.web.model;

import lombok.*;

import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * @Author ivansimeonov
 * @Date 28.04.22
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class BeerInventoryDto extends BaseItem {

    private UUID beerId;
    private String upc;
    private Integer quantityOnHand;

    public BeerInventoryDto(UUID id, Integer version, OffsetDateTime createdDate, OffsetDateTime lastModifiedDate,
                            UUID beerId, String upc, Integer quantityOnHand) {
        super(id, version, createdDate, lastModifiedDate);
        this.beerId = beerId;
        this.upc = upc;
        this.quantityOnHand = quantityOnHand;
    }
}
