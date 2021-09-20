package tp3.partie1.bank;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component

public class Bank implements IBank {


    @Override
    public void transfert(double amount, String clientAccount, String accountMagasin) {

        if(amount>0){
            
            System.out.println("transferer cette somme "+amount+ " du compte client" + clientAccount+ " vers le compte du magasin " + accountMagasin);
        }
    }
}
