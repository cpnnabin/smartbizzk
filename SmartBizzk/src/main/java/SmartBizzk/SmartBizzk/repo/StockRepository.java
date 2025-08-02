package SmartBizzk.SmartBizzk.repo;

import SmartBizzk.SmartBizzk.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Long> {
}
