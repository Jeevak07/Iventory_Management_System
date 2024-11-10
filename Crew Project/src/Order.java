import java.sql.Date;
import java.time.LocalDate;

public class Order {
    private int orderId;
    private String productId;
    private int orderQuantity;
    private LocalDate orderDate;

    public Order(int orderID, String productId, int orderQuantity,LocalDate orderDate) {
        this.orderId = orderID;
        this.productId = productId;
        this.orderQuantity = orderQuantity;
        this.orderDate=orderDate;

    }

  

	public String toString() {
        return orderId + " | " + productId + " | " + orderQuantity + " | " + orderDate;
    }
}
