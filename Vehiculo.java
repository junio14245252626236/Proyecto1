public class Vehiculo {

    public static int tamano = 10;
    public static Vehiculo[] vehiculos = new Vehiculo[tamano];
    public static int posAnadir = 0;

    private int modelo;
    private String marca;
    private double valor;
    private String color;

    public Vehiculo(int modelo, String marca, double valor) {
        this(modelo, marca, valor, "verde");
    }

    public Vehiculo(int modelo, String marca, double valor, String color) {
        this.modelo = modelo;
        this.marca = marca;
        this.valor = valor;
        this.color = color;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setValor(double valorComercial) {
        this.valor = valorComercial;
    }

    public String getColor() {
        return this.color;
    }

    public String getMarca() {
        return this.marca;
    }

    public int getModelo() {
        return this.modelo;
    }

    public double getValor() {
        return this.valor;
    }


    public String toString() {
        return "El modelo  es: " + modelo + "\n" + "La marca es: " + marca + "\n" + "El valor es: " + valor + "\n" + "El color es: " + color + "\n\n";
    }

    public static String toStringVehiculos() {
        String salida = "";
        for (int r = 0; r < posAnadir; r++) {
            salida += vehiculos[r].toString();
        }
        return salida;
    }

    public static String toStringColor() {
        String salida = "";
        for (int r = 0; r < posAnadir; r++) {
            if (vehiculos[r].color.equals("verde")) {
                salida += vehiculos[r].toString();
            }
        }
        return salida;
    }

    public static String vehiculoModelo() {
        String salida = "";
        for (int r = 0; r < posAnadir; r++) {
            if(vehiculos[r].modelo >= (2000) && vehiculos[r].modelo <= (2021)) {
                salida += vehiculos[r].toString();
            }
        }
        return salida;
    }

    public static int cantidadVehiculos() {
        return posAnadir;
    }

    public static void agregar(Vehiculo vehiculo){
        vehiculos[posAnadir] = vehiculo;
        posAnadir ++;
      }

}