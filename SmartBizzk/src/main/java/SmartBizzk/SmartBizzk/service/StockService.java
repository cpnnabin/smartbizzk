package SmartBizzk.SmartBizzk.service;

import SmartBizzk.SmartBizzk.entity.Stock;

import java.util.List;
import java.util.Optional;

public interface StockService {
    List<Stock> getAllStocks();
    Optional<Stock> getStockById(Long id);
    Stock saveStock(Stock stock);
    void deleteStock(Long id);
}
