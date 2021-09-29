
package entidades;


public class Auto {
    
    private String color;
    private String marca;
    private String modelo;
    private String patente;
    private int cantidadPuertas;

    public Auto() {
    }

    public Auto(String color, String marca, String modelo, String patente, int cantidadPuertas) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.cantidadPuertas = cantidadPuertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public String toString() {
        return "Auto{" + "color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", patente=" + patente + ", cantidadPuertas=" + cantidadPuertas + '}';
    }
    
    
    
    
}
