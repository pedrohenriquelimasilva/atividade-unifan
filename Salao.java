import java.util.Scanner;

public class Salao {
  public static void main(String[] args) {
    Manicure sistema = new Manicure();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("\n=== Sistema de Manicure ===");
      System.out.println("1. Cadastrar Cliente");
      System.out.println("2. Agendar Serviço");
      System.out.println("3. Visualizar Informações do Cliente");
      System.out.println("4. Sair");

      System.out.println("Escolha uma opção:");
      int opcao = scanner.nextInt();

      switch (opcao) {
        case 1:
          sistema.cadastrarCliente();
          break;
        case 2:
          sistema.agendarServico();
          break;
        case 3:
          sistema.visualizarInfoCliente();
          break;
        case 4:
          System.out.println("Sistema encerrado.");
          System.exit(0);
        default:
          System.out.println("Opção inválida. Tente novamente.");
      }
    }
  }
}
