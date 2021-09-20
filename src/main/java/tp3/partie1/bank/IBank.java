package tp3.partie1.bank;


public interface IBank {

    /**
     * 
     * @param amount : amount to transfer 
     * @param account1 : account of the client 
     * @param account2 : account of the magasin 
     */
    public void transfert(double amount, String account1, String account2) ;
}
 