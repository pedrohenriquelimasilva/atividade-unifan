import java.util.List;

public class Service {
  private String type;
  private List<String> products;
  private double expense;

  public Service(String type, List<String> products, double expense) {
    this.type = type;
    this.products = products;
    this.expense = expense;
  }

  @Override
  public String toString() {
    return "Tipo: " + type + ", Produtos: " + products + ", Custo: R$" + expense;
  }
}
