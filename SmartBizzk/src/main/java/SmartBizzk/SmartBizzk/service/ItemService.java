package SmartBizzk.SmartBizzk.service;

import SmartBizzk.SmartBizzk.entity.Item;
import java.util.List;
import java.util.Optional;

public interface ItemService {
    List<Item> getAllItems();
    Optional<Item> getItemById(Long id);
    Item saveItem(Item item);
    void deleteItem(Long id);
}
