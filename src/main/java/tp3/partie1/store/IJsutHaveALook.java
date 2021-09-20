package tp3.partie1.store;



public interface IJsutHaveALook {


    /**
     * get price of the item 
     * @param itemiD : id of the product 
     * @return the price of the item 
     */
    public double getPrice (Long itemiD);
    
    /**
     * check if the Item is available  
     * @param itemId : id of the item
     * @return
     */
    public boolean isAvailable(String itemId);

}
