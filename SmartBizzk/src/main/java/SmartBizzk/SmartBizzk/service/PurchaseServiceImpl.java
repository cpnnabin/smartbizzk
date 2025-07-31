package SmartBizzk.SmartBizzk.service;

import SmartBizzk.SmartBizzk.entity.Purchase;
import SmartBizzk.SmartBizzk.repo.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseServiceImpl implements PurchaseService {

    @Autowired
    private PurchaseRepository repo;

    @Override
    public List<Purchase> getAllPurchases() {
        return repo.findAll();
    }

    @Override
    public Purchase getPurchaseById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Purchase savePurchase(Purchase purchase) {
        return repo.save(purchase);
    }

    @Override
    public void deletePurchase(Long id) {
        repo.deleteById(id);
    }
}
