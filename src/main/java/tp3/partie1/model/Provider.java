package tp3.partie1.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tp3.partie1.repositories.ProductRepository;
import tp3.partie1.service.IProvider;

@Component
@Data
public class Provider implements IProvider {


    @Autowired
    IProvider provider ;

    @Autowired
    private ProductRepository productRepository;


    @Override
    public double getPrice(Long  itemId) {
        Product product =productRepository.getById(itemId);
        return product.getPrice();
    }

    @Override
    public void order(Product item, int amount) {

        if(item!=null  && item.isAvailable()){
            for (int i=0; i<amount; i++){
                productRepository.save(item);
            }
            // make item not available
            item.setAvailable(false);
        }
    }
}
