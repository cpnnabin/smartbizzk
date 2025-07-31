package SmartBizzk.SmartBizzk.repo;

import SmartBizzk.SmartBizzk.entity.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {
}
