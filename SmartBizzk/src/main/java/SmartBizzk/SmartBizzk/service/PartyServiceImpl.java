package SmartBizzk.SmartBizzk.service;

import SmartBizzk.SmartBizzk.entity.Party;
import SmartBizzk.SmartBizzk.repo.PartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartyServiceImpl implements PartyService {

    @Autowired
    private PartyRepository partyRepository;

    @Override
    public List<Party> getAllParties() {
        return partyRepository.findAll();
    }

    @Override
    public Party getPartyById(Long id) {
        return partyRepository.findById(id).orElse(null);
    }

    @Override
    public Party saveParty(Party party) {
        return partyRepository.save(party);
    }

    @Override
    public void deleteParty(Long id) {
        partyRepository.deleteById(id);
    }
}