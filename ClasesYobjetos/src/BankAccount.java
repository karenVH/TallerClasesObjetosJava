public class BankAccount {
    //atributos especificos de la cuenta bancaria
    private int accountNumber;
    protected boolean activated;

    // gets y sets 

    /**
     * get de activado
     * @return solo un si o no si la cuenta está activada
     */
    public boolean isActivated() {
        return activated;
    }
    /**
     * set de activado
     * @param activated
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    
}