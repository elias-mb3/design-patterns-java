public class ControleRemoto {
     // aqui guardamos a instância única
    private static ControleRemoto instanciaUnica;

    // construtor privado
    private ControleRemoto() {
        // Construtor privado
        System.out.println("Controle Remoto criado!");
    }

    // método para obter a instância única
    public static ControleRemoto getInstance() {
        if (instanciaUnica == null) {
            instanciaUnica = new ControleRemoto();
        }
        return instanciaUnica;
    }
}
