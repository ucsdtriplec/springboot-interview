package org.triplec.shoppingcart.repository;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import org.springframework.stereotype.Repository;
import org.triplec.shoppingcart.model.Item;

@Repository
@Getter
public class ShoppingCartRepository {
    private final List<Item> items;

    public ShoppingCartRepository() {
        Item item1 = new Item("item1", 10);
        Item item2 = new Item("item2", 20);
        items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
    }
}
