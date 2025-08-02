package SmartBizzk.SmartBizzk.repo;

import SmartBizzk.SmartBizzk.entity.LedgerEntry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface LedgerEntryRepository extends JpaRepository<LedgerEntry, Long> {
    List<LedgerEntry> findByPartyName(String partyName);
    List<LedgerEntry> findByDateBetween(LocalDate start, LocalDate end);
    List<LedgerEntry> findByPartyNameAndDateBetween(String partyName, LocalDate start, LocalDate end);
}
