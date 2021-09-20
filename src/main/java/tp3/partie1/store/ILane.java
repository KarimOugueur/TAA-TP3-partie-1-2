package tp3.partie1.store;

public interface ILane {
    /**
     * add item to cart 
     * @param itemId : id of the item
     */
    public void addItemToCart(String itemId);

    /**
     * pay the item 
     * @param price : price of the item 
     */
    public void pay(float price);
}
