package SmartBizzk.SmartBizzk.service;

import SmartBizzk.SmartBizzk.entity.Party;
import java.util.List;

public interface PartyService {
    List<Party> getAllParties();
    Party getPartyById(Long id);
    Party saveParty(Party party);
    void deleteParty(Long id);
}