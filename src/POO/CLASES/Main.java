package POO.CLASES;

public class  Main {
    public static void main(String[] args) {

        SmartPhone samungA3= new SmartPhone();
        SmartPhone samungA4= new SmartPhone(1000,true);
        SmartPhone samungA5= new SmartPhone(2000,true,100,true);

        SmartWatch sami1= new SmartWatch();
        SmartWatch sami2= new SmartWatch(90,"23/9/2022","12:18:00" );

        SmartWatch sami3= new SmartWatch(87, "25/9/2022", "12:20,98",98,true);

        System.out.println(samungA4.credito);
        System.out.println(samungA4.llamada);
        System.out.println(samungA5.credito);
        System.out.println(samungA5.llamada);
        System.out.println(samungA5.bateria);
        System.out.println(samungA5.wiFi);


        System.out.println(sami2.ritmoCardiaco);
        System.out.println(sami2.fecha);
        System.out.println(sami2.hora);
        System.out.println(sami3.ritmoCardiaco);
        System.out.println(sami3.fecha);
        System.out.println(sami3.hora);
        System.out.println(sami3.bateria);
        System.out.println(sami3.wiFi);

    }
}