package tp3.partie1.client;

import lombok.Data;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.logging.Logger;
import tp3.partie1.store.IFastLane;
import tp3.partie1.store.IJsutHaveALook;
import tp3.partie1.store.ILane;


@Component
@Data
public class Client implements IRun {


    @Autowired
    IFastLane fastLane;

    @Autowired
    IJsutHaveALook havelook;

    @Autowired
    ILane lane;

    @Override
    public void run() {
        System.out.println("Run l'application!");
    }
}
