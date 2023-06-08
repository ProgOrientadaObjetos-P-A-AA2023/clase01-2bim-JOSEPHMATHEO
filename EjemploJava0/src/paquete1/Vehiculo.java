package paquete1;

public class Vehiculo {
    
    private String tipo;
    private String matricula;
    private double valor;
    
    public Vehiculo(String t,String m , double v){
    
        tipo = t;
        matricula= m;
        valor = v;
    
    }

    public void establecerTipo(String tp) {
        
        tipo = tp;
        
    }

    public void establecerMatricula(String mt) {
        
        matricula = mt;
        
    }

    public void establecerValor(double vl) {
        
        valor = vl;
        
    }

    public String obtenerTipo() {
        
        return tipo;
        
    }

    public String obtenerMatricula() {
        
        return matricula;
        
    }

    public double obtenerValor() {
        
        return valor;
        
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Tipo de Vehiculo %s\n"
                + "Matricula: $s\n"
                + "El costo del vehiculo es: %.2f", 
                tipo,
                matricula,
                valor);
        
        return cadena;
        
    }
    
}
