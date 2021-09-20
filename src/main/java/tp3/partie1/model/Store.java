package tp3.partie1.model;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tp3.partie1.repositories.ProductRepository;
import tp3.partie1.service.*;


@Component
@Data
public class Store implements IFastLane, IJsutHaveALook, IStore, ILane {


    @Autowired
    ProductRepository productRepository;
    @Autowired
    IBank ibank;

    @Autowired
    IProvider iProvider;

    @Override
    public void oneShotOrder(Product item, int amount) {

    }

    @Override
    public double getPrice(Long  itemId) {
        Product item =productRepository.getById(itemId);
        return item.getPrice();
    }

    @Override
    public boolean isAvailable(Long itemId) {
        Product item = productRepository.getById(itemId);
        if(!item.isAvailable()){
            return false;
        }
        return true;
    }

    @Override
    public void addItemToCart(Long itemId) {
        Product item = productRepository.getById(itemId);
        if(item.isAvailable()){
            productRepository.save(item);
        }
    }

    public void pay(float price) {
    }
}
