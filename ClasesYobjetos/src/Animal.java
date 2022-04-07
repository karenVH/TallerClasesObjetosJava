/**
 * @author Karen Vásquez Hernández
 */
public class Animal {
    //atributos especificos
    public String name;
    protected String habitat;
    public String specie;

    /**
     * gets y sets para tomar y utilizar datos*/ 

     /**
      * get del nombre de animal
      * @return nombre de animal
      */
    public String getName() {
        return name;
    }
    /**
     * set de nombre
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * get de habitad
     * @return el habitad del animal
     */
    public String getHabitat() {
        return habitat;
    }
    /**
     * set de habitad
     * @param habitat
     */
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    /**
     * get de la especie
     * @return especie del animal
     */
    public String getSpecie() {
        return specie;
    }
    /**
     * set de la especie del animal
     * @param specie
     */
    public void setSpecie(String specie) {
        this.specie = specie;
    }
    
}
