package tp3.partie1.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;



//@Entity
@Data
public class User {

   // @Id
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    @Autowired
    private Account account;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

