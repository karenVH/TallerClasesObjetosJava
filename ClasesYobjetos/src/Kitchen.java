//importaciones
import java.util.ArrayList;

/**
 * @author Karen Vásquez Hernández
 */
public class Kitchen{
     //Atributos especificos
    public String tipoMeson;
    private String faucet;
    public ArrayList<String> frets;

    // gets y sets
    /**
     * get de grifo
     * @return grifo
     */
    public String getFaucet() {
        return faucet;
    }

    /**
     * set de grifo
     * @param faucet
     */
    public void setFaucet(String faucet) {
        this.faucet = faucet;
    }

    /**
     * Metodo de lo que se hace en la cocina
     */
    public void Cooking(){
        System.out.println("Se usan los utencilios como: " + frets);
    }
    
}