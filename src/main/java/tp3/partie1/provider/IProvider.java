package tp3.partie1.provider;



public interface IProvider {
    /**
     * 
     * @param itemId : id of the item
     * @return price of the item 
     */

    public double getPrice(String itemId);

    /**
     * allows to order a item with a quantity
     * @param product : item 
     * @param quantity : quantity
     */
    public void order(String product, int quantity);
}
