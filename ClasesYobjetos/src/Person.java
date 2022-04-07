import java.util.Date;

/**
 * @author Karen Vásquez Hernandez
 */

//Definicion de clase Persona 
public class Person{
    //Atributos especificos de la clase persona
    public String name ;
    public String lastName ;
    public String LastName2;
    public Date DateBirth;
    public float height;

//gets y set para obtener estos atributos
    /**
     * get de nombre
     * @return el nombre de una persona
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
     * get de apellido1
     * @return el primer apellido
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * set de apellido1
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * get de apellido2 
     * @return el segundo pellido
     */
    public String getLastName2() {
        return LastName2;
    }
    /**
     * set de apellido2
     * @param lastName2
     */
    public void setLastName2(String lastName2) {
        LastName2 = lastName2;
    }
    /**
     * get de fecha de nacimiento 
     * @return la fecha de nacimiento de la persona
     */
    public Date getDateBirth() {
        return DateBirth;
    }
    /**
     * set de fecha de nacimiento
     * @param dateBirth
     */
    public void setDateBirth(Date dateBirth) {
        DateBirth = dateBirth;
    }
    /**
     * get de altura
     * @return la altura de la persona
     */
    public float getHeight() {
        return height;
    }
    /**
     * set de la altura
     * @param height
     */
    public void setHeight(float height) {
        this.height = height;
    }

    
}