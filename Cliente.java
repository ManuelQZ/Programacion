package TiendaMascotas;

public class Cliente{
    private String nombre;
    private String direccion;
    private int contacto;

    public Cliente(String nombre, String direccion, int contacto){
        this.nombre = nombre;
        this.direccion = direccion;
        this.contacto = contacto;        
}

    public String getNombre(){
        return nombre;

    }

    public String getdireccion(){
        return direccion;

    }

    public int getcontacto(){
        return contacto;
    }

    // Setters

    public void setnombre(String nombre){
        this.nombre = nombre;
    }

    public void setdireccion(String direccion){
        this.direccion = direccion;
    }

    public void setcontacto(int contacto){
        this.contacto = contacto;
    }
}
