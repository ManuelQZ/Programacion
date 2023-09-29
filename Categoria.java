package TiendaMascotas;

public class Categoria{
    private String perro;
    private String gato;
    private String pajaro;

    public Categoria (String perro, String gato, String  pajaro){
        this.perro = perro;
        this.gato = gato;
        this.pajaro = pajaro;        
}

    public String getperro(){
        return perro;

    }

    public String getgato(){
        return gato;

    }

    public String getpajaro(){
        return pajaro;
    }

    // Setters

    public void setperro(String perro){
        this.perro = perro;
    }

    public void setgato(String gato){
        this.gato = gato;
    }

    public void setpajaro(String pajaro){
        this.pajaro = pajaro;
    }
}
