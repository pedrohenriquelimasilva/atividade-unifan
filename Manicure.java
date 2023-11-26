import java.util.Scanner;

public class Manicure {
  private List<Client> clients;

  public Manicure() {
    this.clients = new ArrayList<>();
  }

  public void cadastrarCliente() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o nome do cliente:");
    String name = scanner.nextLine();

    System.out.println("Digite o telefone do cliente:");
    String telefone = scanner.nextLine();

    Cliente client = new Client(name, telefone);
    clients.add(client);

    System.out.println("Cliente cadastrado com sucesso!");
  }

  public void agendarServico() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o nome do cliente:");
    String nomeClient = scanner.nextLine();

    Cliente cliente = encontrarCliente(nomeClient);
    if (cliente != null) {
      System.out.println("Digite o tipo de serviço:");
      String tipoServico = scanner.nextLine();

      System.out.println("Digite os produtos utilizados (separados por vírgula):");
      String produtosString = scanner.nextLine();
      List<String> produtos = List.of(produtosString.split(","));

      System.out.println("Digite o custo do serviço:");
      double custo = scanner.nextDouble();

      Service servico = new Service(tipoServico, produtos, custo);
      cliente.adicionarServico(servico);

      System.out.println("Serviço agendado com sucesso!");
    } else {
      System.out.println("Cliente não encontrado.");
    }
  }

  public void visualizarInfoCliente() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o nome do cliente:");
    String nomeClient = scanner.nextLine();

    Cliente client = encontrarCliente(nomeClient);
    if (client != null) {
      client.visualizerInfo();
    } else {
      System.out.println("Cliente não encontrado.");
    }
  }

  private Client encontrarCliente(String nomeClient) {
    for (Client client : clients) {
      if (client.nome.equalsIgnoreCase(nomeClient)) {
        return client;
      }
    }
    return null;
  }
}