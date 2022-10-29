import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        mostrarMenu();
    }

    public static void mostrarMenu() {
        Scanner junt = new Scanner(System.in);
        while (true) {
            System.out.println("0: Salir");
            System.out.println("1: Nuevo vehiculo");
            System.out.println("2: Ver informacion de vehiculos");
            System.out.println("3: Numero de vehiculos almacenados");
            System.out.println("4: Ver informacíon de vehículos verdes");
            System.out.println("5: vehículos modelos entre 2000 y 2021");
            System.out.println("6: Nuevo sensor");
            System.out.println("7: Ver informacíon de sensores");
            System.out.println("8: Numero de sensores almacenados");
            System.out.println("9: Ver informacíon de sensores tipo: temperatura");
            System.out.println("666: Ver informacíon de sensores temperatura ordenados por valor\n");
            int numero = junt.nextInt();
            if (numero == 0) {
                break;
            }else if (numero == 1){
                if (Vehiculo.posAnadir < 10) {
                    System.out.println("Digite modelo");
                    int modelo = junt.nextInt();
                    System.out.println("Digite marca:");
                    String marca = junt.next();
                    System.out.println("Digite valor comercial");
                    double valor = junt.nextDouble();
                    System.out.println("Digite color");
                    String color = junt.next();
                    Vehiculo vehiculo = new Vehiculo(modelo, marca, valor, color);
                    Vehiculo.agregar(vehiculo);
                } else {
                    System.out.println("Error base de datos llena");
                }
            }else if(numero == 2){
                System.out.println(Vehiculo.toStringVehiculos());
            }else if(numero == 3){
                System.out.println("Cantidad de vehiculos en la base de datos: " + Vehiculo.cantidadVehiculos());
            }else if(numero == 4){
                System.out.println("Los vehiculos verdes son:");
                System.out.println(Vehiculo.toStringColor());
            }else if(numero == 5){
                System.out.println("Vehículos con modelo del 2000 hasta 2021 son: ");
                System.out.println(Vehiculo.vehiculoModelo());
            }else if(numero == 6){
                if (Sensor.posAnadir < 8) {
                    System.out.println("Digite tipo:");
                    String tipo = junt.next();
                    System.out.println("Digite valor:");
                    int valor = junt.nextInt();
                    Sensor sensor = new Sensor(tipo, valor);
                    Sensor.agregar(sensor);
                }else{
                    System.out.println("Error base de datos llena");
                }
            }else if(numero == 7){
                System.out.println(Sensor.toStringSensores());
            }else if(numero == 8){
                System.out.println("Cantidad de sensores en la base de datos: " + Sensor.cantidadSensores());
            }else if(numero == 9){
                System.out.println("Los sensores de tipo temperatura son:");
                System.out.println(Sensor.toStringTipo(Sensor.sensores));
            }else if(numero == 666){
                System.out.println("Los sensores de tipo temperatura ordenados son:");
                System.out.println(Sensor.toStringTipo(Sensor.ordenarSensores()));    
            }
        }
        junt.close();
    }
}