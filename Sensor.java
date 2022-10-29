
public class Sensor{

  public static int tamano = 8;
  public static Sensor[] sensores = new Sensor[tamano];
  public static int posAnadir = 0;

  private String Tipo;
  private double valor;


  public Sensor(String tipo, double valor) {
    this.Tipo = Tipo;
    this.valor = valor;
  }

  public String getTipo() {
    return this.Tipo;
  }

  public double getValor() {
    return this.valor;
  }

  public void setTipo(String tipo) {
    this.Tipo = Tipo;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public static void agregar(Sensor n){
    sensores[posAnadir] = n;
    posAnadir ++;
  }

  public String toString() {
    return "El Sensor es tipo: " + this.Tipo + "\n" + "Su valor es: " + this.valor + "\n\n";
  }

  public static String toStringSensores() {
    String salida = "";
    for (int r = 0; r < posAnadir; r++) {
      salida = salida + sensores[r].toString();
    }
    return salida;
  }

  public static String toStringTipo(Sensor[] temperatura) {
    String salida = "";
    for (int r = 0; r < posAnadir; r++) {
      if (temperatura[r].Tipo.equals("temperatura")) {
        salida += temperatura[r].toString();
      }
    }
    return salida;
  }

  public static int cantidadSensores() {
    return posAnadir;
  }

  public static Sensor[] ordenarSensores() {
    Sensor[] nuevo = sensores.clone();
    Sensor jr;
    
    for (int r = 1; r < posAnadir; r++){

      for (int p = 0; p < posAnadir - 1; p++) {
        
        if (nuevo[p].getValor() > nuevo[p + 1].getValor()) {
          jr = nuevo[p];
          nuevo[p] = nuevo[p + 1];
          nuevo[p + 1] = jr;
        }
      }
    }
    return nuevo;
  }
}