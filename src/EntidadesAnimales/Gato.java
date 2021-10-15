
package EntidadesAnimales;


public class Gato {
    
    private String nombre;
    private int edad;
    private String origen;
    private String tamaño;

    public Gato() {
    }

    public Gato(String nombre, int edad, String origen, String tamaño) {
        this.nombre = nombre;
        this.edad = edad;
        this.origen = origen;
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Gato{" + "nombre=" + nombre + ", edad=" + edad + ", origen=" + origen + ", tama\u00f1o=" + tamaño + '}';
    }
    
    
    
}
