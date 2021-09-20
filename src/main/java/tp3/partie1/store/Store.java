package tp3.partie1.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tp3.partie1.bank.IBank;
import tp3.partie1.provider.IProvider;



@Component
public class Store implements IFastLane, IJsutHaveALook, ILane {


    @Autowired
    IBank ibank;

    @Autowired
    IProvider iProvider;

    @Override
    public void oneShotOrder(String item, int amount) {

        if(isAvailable(item)){
            System.out.println("Vendeur :  saiser le prix et les coordonnée banquaires");
            this.ibank.transfert(15,"numeredecompteClient", "numerodecompteMagasin");

            for (int i=0; i<amount; i++){
                System.out.println("Vendeur : Je rachete le produit au fournisseur");
		        this.iProvider.order("racheterleproduit", 15);
            }

        }

    }

    @Override
    public double getPrice(Long  itemId) {
       System.out.println( "article avec cet identifiant" + itemId+ "vaut 15 euros");
        return 15; 
    }

    @Override
    public boolean isAvailable(String itemId) {
      
        System.out.println( "article avec cet identifiant" + itemId+ "est disponible");
        return true; 

    }

    @Override
    public void addItemToCart(String itemId) {
        
        System.out.println("Vendeur : saiser le prix et les coordonnée banquaires");
		this.ibank.transfert(15,"numeredecompteClient", "numerodecompteMagasin");
			
    }

    public void pay(float price) {

        System.out.println("Vendeur :  saiser le prix et les coordonnée banquaires");
        System.out.println("Vendeur : Transferer l'argent de compte client vers le compte du magasin ");
		this.ibank.transfert(25,"numeroCompteClient", "numeroCompteMagasin");
		
		
		this.iProvider.order("produitPanierClient", 15);
		
		System.out.println("à bientôt! ");
    }
}
