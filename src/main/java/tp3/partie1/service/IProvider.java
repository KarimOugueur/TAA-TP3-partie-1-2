package tp3.partie1.service;import tp3.partie1.model.Product;public interface IProvider {    public double getPrice(Long itemId);    public void order(Product product, int amount);}