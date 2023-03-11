
package helpers;
public class Formas {
    
     String nombre;
     String lados;
   
    
    public Formas(){
    }
  public void establecerNombre(String nombre) {
        this.nombre = nombre;
        
    }
    public String obtenerNombre () {
        return this.nombre;
        
    }
  public void establecerLados(String lados) {
        this.lados = lados;
        
    }
    public String obtenerLados () {
        return this.lados;
        
    }
    
    public void imprimirDatos(){
    System.out.println("Nombre: " + nombre);
    System.out.println("Lados: " + lados);
    }
    
}
