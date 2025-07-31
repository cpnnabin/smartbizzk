package SmartBizzk.SmartBizzk.service;

import SmartBizzk.SmartBizzk.entity.Item;
import SmartBizzk.SmartBizzk.entity.Party;

import java.util.List;
import java.util.Optional;

public interface ItemService {
    List<Item> getAllItems();
    void saveItem(Item item);
    Optional<Item> getItemById(Long id);
    void deleteItem(Long id);

    interface PartyService {
        List<Party> getAllParties();
        Party getPartyById(Long id);
        Party saveParty(Party party);
        void deleteParty(Long id);
    }
}
