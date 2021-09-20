package tp3.partie1.service;

import tp3.partie1.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import tp3.partie1.repositories.ProductRepository;

import java.util.List;

public class ProductService {

    @Autowired
    ProductRepository productRepository ;

    public Product saveItem(Product p) {
        return productRepository.save(p);
    }

    public Product updatItem(Product p) { return productRepository.save(p);}

    public void deleteItem(Product p) {productRepository.delete(p);}

    public void deleteItemById(Long id) {productRepository.deleteById(id);}

    public Product getItem(Long id) {
        return productRepository.findById(id).get();
    }

    public List<Product> getAllItems() {
        return productRepository.findAll();
    }
}
