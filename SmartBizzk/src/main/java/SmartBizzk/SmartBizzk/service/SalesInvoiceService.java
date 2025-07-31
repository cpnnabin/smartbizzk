package SmartBizzk.SmartBizzk.service;

import SmartBizzk.SmartBizzk.entity.SalesInvoice;
import java.util.List;

public interface SalesInvoiceService {
    List<SalesInvoice> getAllInvoices();
    SalesInvoice getInvoiceById(Long id);
    SalesInvoice saveInvoice(SalesInvoice invoice);
    void deleteInvoice(Long id);
}
