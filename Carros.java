public class Carros {
    public String marca;
    public String modelo;

    public Carros(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
}

Carros bmw = new Carros("bmw", "x6");
System.out.println("a marca é a "+ bmw.getMarca());
System.out.println("o modelo  é o "+ bmw.getModelo());
