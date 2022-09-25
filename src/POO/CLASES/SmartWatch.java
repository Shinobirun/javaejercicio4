package POO.CLASES;

public class SmartWatch extends SmartDevice{

    //atributos
    Integer ritmoCardiaco;
    String fecha;
    String hora;


    //constructores

    public SmartWatch() {}
    public SmartWatch(Integer ritmoCardiaco, String  fecha, String hora){
        this.ritmoCardiaco = ritmoCardiaco;
        this.fecha = fecha;
        this.hora = hora;

    }
    public SmartWatch(Integer ritmoCardiaco, String fecha, String hora, Integer bateria, boolean wiFi){
        this.ritmoCardiaco = ritmoCardiaco;
        this.fecha = fecha;
        this.hora = hora;
        this.bateria = bateria;
        this.wiFi = wiFi;
    }

    //metodos
}
