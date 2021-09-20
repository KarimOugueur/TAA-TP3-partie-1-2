package tp3.partie1.model;


import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import tp3.partie1.service.IBank;


@Component
@Data
public class Bank implements IBank {

    @Autowired
    private IBank iBank;

    @Override
    public void transfert(double amount, Account clientAccount, Account accountMagasin) {

        if(amount>0){
            double soldeAccount1= clientAccount.getSolde();
            clientAccount.setSolde(soldeAccount1-amount);

            double soldeAccountMagasin = accountMagasin.getSolde();
            accountMagasin.setSolde(soldeAccountMagasin+amount);
        }
    }
}
