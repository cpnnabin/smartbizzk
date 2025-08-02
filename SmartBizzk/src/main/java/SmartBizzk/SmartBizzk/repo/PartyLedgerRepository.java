package SmartBizzk.SmartBizzk.repo;

import SmartBizzk.SmartBizzk.entity.PartyLedger;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface PartyLedgerRepository extends JpaRepository<PartyLedger, Long> {

    List<PartyLedger> findByPartyNameOrderByTransactionDateDesc(String partyName);
    List<PartyLedger> findByPartyNameAndTransactionDateBetweenOrderByTransactionDateAsc(String partyName, LocalDate startDate, LocalDate endDate);

    List<PartyLedger> findAllByOrderByTransactionDateDesc();
}
