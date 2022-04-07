
/**
 * @author Karen Vásquez Hernandez
 */


public class LivingBeing{
    //Atributos Especificos
    public String specie;
    private boolean Head;
    public String body;
    public int hand;
    public int feet;
    protected boolean heart;

    /**gets y sets para obtener datos de un ser vivo */

    /**
     * get de el especie de ser vivo
     * @return una especie
     */
    public String getSpecie() {
        return specie;
    }
    /**
     * set de especie de ser vivo
     * @param specie
     */
    public void setSpecie(String specie) {
        this.specie = specie;
    }
    /**
     * get de cabeza parte de ser vivo
     * @return falso o verdadero
     */
    public boolean getHead() {
        return Head;
    }
    /**
     * set de cabeza de ser vivo
     * @param head
     */
    public void setHead(boolean head) {
        Head = head;
    }
    /**
     * get si tiene corazon
     * @return falso o verdader de Corazon
     */
    public boolean isHeart() {
        return heart;
    }
    /**
     * set de cabeza
     * @param heart
     */
    public void setHeart(boolean heart) {
        this.heart = heart;
    }

    /**
     * Metodo Privado de los latidos del corazon de un humano
     * @return falso o verdadero
     */
    private void heartBeatMethod(){
        System.out.println("este ser vivo de especie " + specie + "¿tiene corazon?" + heart);
        if(heart == true){
            System.out.println("Los latidos del corazon son contables");
        }
    }
}