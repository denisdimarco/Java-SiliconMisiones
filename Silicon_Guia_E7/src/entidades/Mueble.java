
package entidades;


public class Mueble {
    
    private String nombre;
    private int alto;
    private int ancho;
    private String material;
    private int cantidad;

    public Mueble() {
    }

    public Mueble(String nombre, int alto, int ancho, String material, int cantidad) {
        this.nombre = nombre;
        this.alto = alto;
        this.ancho = ancho;
        this.material = material;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Mueble{" + "nombre=" + nombre + ", alto=" + alto + ", ancho=" + ancho + ", material=" + material + ", cantidad=" + cantidad + '}';
    }
    
    
    
    
    
}
