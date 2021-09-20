package model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import service.IRun;
import service.Iclient;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Component
@Data
public class Client implements IRun {

    /**
     * L'identifiant unique
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long Id;

    /**
     * Le nom du client
     */
    public String name;
    /**
     * Le solde du compte client
     */
    public float credit;

    @Autowired
    Account account;

    @Autowired
    IRun run ;
    @Autowired
    Iclient client;

    @Override
    public void run() {
        System.out.println("Test de l fonction run");
    }
}
