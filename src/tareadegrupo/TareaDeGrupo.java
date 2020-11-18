/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareadegrupo;
import Persona.Persona;
/**
 *
 * @author CINDY GONZALEZ
 */
public class TareaDeGrupo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Doctor doctor=new Doctor();
       Deportista deportista =new Deportista();
       
       doctor.MostrarInformacion();
       deportista.MostrarInformacion();
    }
    
}
