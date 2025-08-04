package SmartBizzk.SmartBizzk.service;

import SmartBizzk.SmartBizzk.entity.PaymentIn;
import SmartBizzk.SmartBizzk.repo.PaymentInRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentInService {

    @Autowired
    private PaymentInRepository paymentInRepository;

    public PaymentIn save(PaymentIn paymentIn) {
        return paymentInRepository.save(paymentIn);
    }

    public List<PaymentIn> getAll() {
        return paymentInRepository.findAll();
    }

    public PaymentIn getById(Long id) {
        return paymentInRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        paymentInRepository.deleteById(id);
    }
}