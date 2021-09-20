package model;


import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.metadata.HsqlTableMetaDataProvider;
import org.springframework.stereotype.Component;
import service.IBank;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Component
@Data
public class Bank implements IBank {



    @Autowired
    IBank iBank;

    @Override
    public void transfer(double amount, Account clientAccount, Account accountMagasin) {

        if(amount>0){
            double soldeAccount1= clientAccount.getSolde();
            clientAccount.setSolde(soldeAccount1-amount);

            double soldeAccountMagasin = accountMagasin.getSolde();
            accountMagasin.setSolde(soldeAccountMagasin+amount);
        }

    }
}
