package SmartBizzk.SmartBizzk.service;

import SmartBizzk.SmartBizzk.entity.SalesInvoice;
import SmartBizzk.SmartBizzk.repo.SalesInvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesInvoiceServiceImpl implements SalesInvoiceService {

    @Autowired
    private SalesInvoiceRepository repo;

    @Override
    public List<SalesInvoice> getAllInvoices() {
        return repo.findAll();
    }

    @Override
    public SalesInvoice getInvoiceById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public SalesInvoice saveInvoice(SalesInvoice invoice) {
        return repo.save(invoice);
    }

    @Override
    public void deleteInvoice(Long id) {
        repo.deleteById(id);
    }
}
