package POO.CLASES;

public class SmartPhone extends SmartDevice{

    //atributos
    double credito;
    boolean llamada;


    //constructores

    public SmartPhone (){

    }

    public SmartPhone (double credito, boolean llamada){
        this.credito = credito;
        this.llamada = llamada;

    }

    public SmartPhone (double credito, boolean llamada, Integer bateria, boolean wiFi ){
        this.credito = credito;
        this.llamada = llamada;
        this.bateria = bateria;
        this.wiFi = wiFi;

    }

    //metodos
}
