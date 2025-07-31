package SmartBizzk.SmartBizzk.service;

import SmartBizzk.SmartBizzk.entity.Purchase;
import java.util.List;

public interface PurchaseService {
    List<Purchase> getAllPurchases();
    Purchase getPurchaseById(Long id);
    Purchase savePurchase(Purchase purchase);
    void deletePurchase(Long id);
}
