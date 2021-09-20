package tp3.partie1;

import org.springframework.beans.factory.annotation.Autowired;
import service.IRun;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Partie1Application {


    @Autowired
    private IRun Irun;
    public void run() {
        Irun.run();
    }

    public static void main(String[] args) {

        SpringApplication.run(Partie1Application.class, args);
    }

}
