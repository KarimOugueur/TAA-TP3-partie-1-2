package tp3.partie1.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tp3.partie1.model.Account;
import tp3.partie1.service.*;


@Component
@Data
public class Client implements IRun {


    @Autowired
    IFastLane FastLane;
    @Autowired
    IJsutHaveALook havelook;
    @Autowired
    ILane lane ;

    @Override
    public void run() {
        System.out.println("Test de l fonction run");
    }
}
