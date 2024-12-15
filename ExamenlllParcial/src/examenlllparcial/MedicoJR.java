/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlllparcial;

/**
 *
 * @author anton
 */
public class MedicoJR extends Persona
{
   private String Especialidad;
   private String Experiencia;

    public MedicoJR(String Especialidad, String Experiencia, String nombre, String Edad, String direccion, String telefono) {
        super(nombre, Edad, direccion, telefono);
        this.Especialidad = Especialidad;
        this.Experiencia = Experiencia;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public String getExperiencia() {
        return Experiencia;
    }

    public void setExperiencia(String Experiencia) {
        this.Experiencia = Experiencia;
    }
   
   
           
}
