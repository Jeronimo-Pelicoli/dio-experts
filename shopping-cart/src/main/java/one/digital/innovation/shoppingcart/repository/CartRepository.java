package one.digital.innovation.shoppingcart.repository;

import org.springframework.data.repository.CrudRepository;
import one.digital.innovation.shoppingcart.model.Cart;

public interface CartRepository extends CrudRepository<Cart, Integer> {
    
}
