package SmartBizzk.SmartBizzk.service;

import SmartBizzk.SmartBizzk.entity.LedgerEntry;
import SmartBizzk.SmartBizzk.repo.LedgerEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class LedgerService {

    @Autowired
    private LedgerEntryRepository ledgerEntryRepository;

    public List<LedgerEntry> getAllLedgerEntries() {
        return ledgerEntryRepository.findAll();
    }

    public List<LedgerEntry> getLedgerByDateRange(LocalDate start, LocalDate end) {
        return ledgerEntryRepository.findByDateBetween(start, end);
    }
}
