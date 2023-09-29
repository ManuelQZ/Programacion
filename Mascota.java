package TiendaMascotas;


public class Mascota {
    private String nombre;
    private String tipo;
    private String raza;

    public Mascota (String nombre, String tipo, String  raza){
        this.nombre = nombre;
        this.tipo = tipo;
        this.raza = raza;        
}

    public String getNombre(){
        return nombre;

    }

    public String gettipo(){
        return tipo;

    }

    public String getraza(){
        return raza;
    }

    // Setters

    public void setnombre(String nombre){
        this.nombre = nombre;
    }

    public void settipo(String tipo){
        this.tipo = tipo;
    }

    public void setraza(String raza){
        this.raza = raza;
    }
}
