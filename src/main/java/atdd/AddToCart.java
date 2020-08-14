package atdd;

public class AddToCart {

  public String add(String product) {
    switch (product) {
      case "apple juice":
        return "Item Added";
      case "orange juice":
        return "Out of Stock";
      default:
        return "Item not found";
    }
  }
}
