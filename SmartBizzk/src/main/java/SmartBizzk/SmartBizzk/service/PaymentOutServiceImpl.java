package SmartBizzk.SmartBizzk.service;

import SmartBizzk.SmartBizzk.entity.PaymentOut;
import SmartBizzk.SmartBizzk.repo.PaymentOutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentOutServiceImpl implements PaymentOutService {

    @Autowired
    private PaymentOutRepository repo;

    @Override
    public void save(PaymentOut paymentOut) {
        repo.save(paymentOut);
    }

    @Override
    public List<PaymentOut> getAll() {
        return repo.findAll();
    }

    @Override
    public PaymentOut findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}