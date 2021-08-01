package org.triplec.shoppingcart.service;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.triplec.shoppingcart.model.Item;
import org.triplec.shoppingcart.repository.ShoppingCartRepository;

@Service
@AllArgsConstructor
public class ShoppingCartService {
    private final ShoppingCartRepository shoppingCartRepository;

    public List<Item> getAllItems() {
        return shoppingCartRepository.getItems();
    }
}
