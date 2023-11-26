import java.util.ArrayList;
import java.util.List;

public class Client {
  private String name;
  private String telefone;
  private List<Service> history;
  private List<String> preference;

  public Client(String name, String telefone) {
    this.name = name;
    this.telefone = telefone;
    this.history = new ArrayList<>();
    this.preference = new ArrayList<>();
  }

  public void visualizerInfo() {
    System.out.println("Cliente: " + name + "Contato: " + telefone);
    System.out.println("Historico do cliente: ");

    int index = 1;
    for (Service service : history) {
      System.out.println(index + "- " + service);
      index++;
    }

  }

  public void addService(Service service) {
    history.add(service);
  }
}
