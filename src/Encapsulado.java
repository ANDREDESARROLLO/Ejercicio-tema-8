public class Encapsulado {
    public static void main(String [] args){

     Vehiculo coche = new Vehiculo(); //instancia

     coche.setTipo("couper");


     Vehiculo moto = new Vehiculo();
     moto.setTipo("Scotter");

     System.out.println(coche.getTipo());
     System.out.println(moto.getTipo());
    }

}

class Vehiculo {
    private String tipo; //creaeremos un setter u un getter

    public void setTipo(String valor) { //los setter toma como tipo de dato el tipo de dato de la proiebdad "String en este caso"
        this.tipo = valor;
    }

    public String getTipo() {
        return this.tipo;
    }
}