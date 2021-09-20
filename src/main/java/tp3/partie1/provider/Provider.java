package tp3.partie1.provider;

import lombok.Data;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Provider implements IProvider {


    @Autowired
    IProvider provider ;


    @Override
    public double getPrice(String itemId) {
        return 35;
    }

    @Override
    public void order(String item, int quantity) {

     System.out.println("commander " +item +", quantité "+ quantity );
    }

}
