package ivansimeonov.springframework.msscbeerinventoryservice.repositories;

import ivansimeonov.springframework.msscbeerinventoryservice.domain.BeerInventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

/**
 * @Author ivansimeonov
 * @Date 28.04.22
 */
@Repository
public interface BeerInventoryRepository extends JpaRepository<BeerInventory, UUID> {
    List<BeerInventory> findAllByBeerId(UUID beerId);
}
