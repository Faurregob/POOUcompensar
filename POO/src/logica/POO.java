package logica;

import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

public class POO {
    public static void main(String[] args) {
        
        Alumno alu1 =  new Alumno();
        Alumno alu2 =  new Alumno(5, "Freddy", "Urrego");
        
        JOptionPane.showMessageDialog(null, "La id del alumno 2 es: " + alu2.getId()+"\n"
                                          + "El Nombre es: "+alu2.getNombre()+"\n"
                                          + "El Apellido es: "+alu2.getApellido());
    
         
        alu1.setId(8);
        alu1.setNombre("Aaron");
        alu1.setApellido("Urrego");
        
        
        JOptionPane.showMessageDialog(null, "La id del alumno 1 es: " + alu1.getId()+"\n"
                                          + "El Nombre es: "+alu1.getNombre()+"\n"
                                          + "El Apellido es: "+alu1.getApellido());
        
        alu2.setId(35);
        alu2.setNombre("Alexander");
        alu2.setApellido("Beltran");
        
                
        JOptionPane.showMessageDialog(null, "La id del alumno 2 es: " + alu2.getId()+"\n"
                                          + "El Nombre es: "+alu2.getNombre()+"\n"
                                          + "El Apellido es: "+alu2.getApellido());
        
    }
    
}
