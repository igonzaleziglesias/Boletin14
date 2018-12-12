
package boletin14;

import javax.swing.JOptionPane;


public class Boletin14 {

    
    public static void main(String[] args) throws TemperaturaErradaExcepcion {
        int T;
        ConversorTemperaturas obx = new ConversorTemperaturas();
        
        try {
            T = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la temperatura:"));
            JOptionPane.showMessageDialog(null, obx.centigradosAFarenheit(T)+" Farenheit");
            JOptionPane.showMessageDialog(null, obx.centigradosAReamur(T)+" Reamur");
        }catch (TemperaturaErradaExcepcion ex){
            System.out.println(ex.getMessage());
        }catch (NumberFormatException ex){
            System.out.println("No has introducido un numero");
        }
    }
    
}
