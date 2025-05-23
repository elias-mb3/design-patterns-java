public class Main {
  public static void main (String[] args) {
    ControleRemoto controle1 = ControleRemoto.getInstance();
    ControleRemoto controle2 = ControleRemoto.getInstance();

    // Verifica se as duas instâncias são a mesma
    if (controle1 == controle2) {
      System.out.println("As instâncias são iguais!");
    } else {
      System.out.println("As instâncias são diferentes!");
    }
  }
}
