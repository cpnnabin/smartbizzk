package SmartBizzk.SmartBizzk.service;

import SmartBizzk.SmartBizzk.entity.PartyLedger;
import SmartBizzk.SmartBizzk.repo.PartyLedgerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PartyLedgerService {

    @Autowired
    private PartyLedgerRepository ledgerRepo;

    public List<PartyLedger> getLedgerByParty(String partyName) {
        return ledgerRepo.findByPartyNameOrderByTransactionDateDesc(partyName);
    }

    public List<PartyLedger> getAllLedgers() {
        return ledgerRepo.findAllByOrderByTransactionDateDesc();
    }
    public List<PartyLedger> getLedgerByPartyAndDateRange(String partyName, LocalDate start, LocalDate end) {
        if (start != null && end != null) {
            return ledgerRepo.findByPartyNameAndTransactionDateBetweenOrderByTransactionDateAsc(partyName, start, end);
        } else {
            return getLedgerByParty(partyName);
        }
    }


}
