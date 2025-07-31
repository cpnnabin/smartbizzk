package SmartBizzk.SmartBizzk.service;

import SmartBizzk.SmartBizzk.entity.PaymentOut;
import java.util.List;

public interface PaymentOutService {
    void save(PaymentOut paymentOut);
    List<PaymentOut> getAll();
    PaymentOut findById(Long id);
    void delete(Long id);
}
