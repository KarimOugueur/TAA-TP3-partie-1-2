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
    ILane ilane;

    
	@Override
	public void scenario1() {
		System.out.println("Le clientfait une commande fast.");
		fastLane.oneShotOrder("t-shirt adidas taille M", 12);
        ilane.pay(15);
		System.out.println("Le client a ajouter un produit à son panier et a payé.");
	}

	@Override
	public void run() {
		System.out.println("Le client a fait ses courses.");
		
	}

	@Override
	public void scenario2() {
		System.out.println("Le client entre dans le magasin et fait une commande classique.");
		ilane.addItemToCart("1");
		System.out.println("Le client à ajouter un produit à son panier");
		ilane.addItemToCart("5");
		ilane.pay(100);
		System.out.println("Le client a payé");
			
	}






}
