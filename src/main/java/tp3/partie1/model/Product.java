package tp3.partie1.model;


import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Data
public class Product {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String title;
        private double price;
        private String barcode;
        private boolean available ;

        public boolean isAvailable() {
                return available;
        }

        public void setAvailable(boolean available) {
                this.available = available;
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getTitle() {
                return title;
        }

        public void setTitle(String title) {
                this.title = title;
        }

        public double getPrice() {
                return price;
        }

        public void setPrice(double price) {
                this.price = price;
        }

        public String getBarcode() {
                return barcode;
        }

        public void setBarcode(String barcode) {
                this.barcode = barcode;
        }

}
