package tp3.partie1.store;



public interface IFastLane {
    /**
     * oneShotOrder method allows
     *  to order a single item with a quantity.
     * @param item 
     * @param amount 
     */

    public void oneShotOrder(String item, int quantity);
}
