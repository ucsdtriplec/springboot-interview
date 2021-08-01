package org.triplec.shoppingcart;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.triplec.shoppingcart.model.Item;
import org.triplec.shoppingcart.service.ShoppingCartService;

@RestController
@RequestMapping("/shopping-cart")
@AllArgsConstructor
public class ShoppingCartController {
    private final ShoppingCartService shoppingCartService;

    @GetMapping
    public List<Item> getAllItems() {
        return shoppingCartService.getAllItems();
    }
}
