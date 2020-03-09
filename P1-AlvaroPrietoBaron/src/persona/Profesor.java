/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author adoenlunnae
 */
public class Profesor extends Persona{
    private String universidad;
    private int id_profesor;

    public Profesor() {
    }

    public Profesor(String universidad, int id_profesor, String name, String surname, int age) {
        super(name, surname, age);
        this.universidad = universidad;
        this.id_profesor = id_profesor;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public int getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }
}
