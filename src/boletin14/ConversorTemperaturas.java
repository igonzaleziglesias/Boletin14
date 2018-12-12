
package boletin14;


public class ConversorTemperaturas {
    private final int temperatura=80;
    
    public float centigradosAFarenheit(float centigrados) throws TemperaturaErradaExcepcion{
        
        if (centigrados > temperatura) {
            throw new TemperaturaErradaExcepcion("temperatura superior a 80ºC ");
       
        } else {
            return (float) (9.0/5.0*centigrados+32.4);
        }
        
    }
    public float centigradosAReamur(float centigrados) throws TemperaturaErradaExcepcion{
        
       if (centigrados > temperatura) {
            throw new TemperaturaErradaExcepcion("temperatura superior a 80ºC ");
       
        } else {
            return (float) (4.0/5.0*centigrados);
            
        }
        
    }
    
}
