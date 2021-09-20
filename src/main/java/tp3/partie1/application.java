package tp3.partie1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tp3.partie1.client.IRun;

import java.util.logging.Logger;
@SpringBootApplication
public class application implements CommandLineRunner {

    private static final Logger logger = Logger.getLogger(application.class.getName());

    @Autowired
    private IRun irun;


    @Override
    public void run(String... args) throws Exception {
        this.irun.run();
    }
    public static void main(String[] args) {

        SpringApplication.run(application.class, args);
    }



}
