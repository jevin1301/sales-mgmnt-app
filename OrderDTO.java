import java.util.List;

public class OrderDTO {
    private Long orderId;
    private Long customerId;
    private List<Long> productIds;
    private String orderDate;
    private double totalAmount;

    // Constructors
    public OrderDTO() {}

    public OrderDTO(Long orderId, Long customerId, List<Long> productIds, String orderDate, double totalAmount) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.productIds = productIds;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
    }

    // Getters and Setters
    public Long getOrderId() { return orderId; }
    public void setOrderId(Long orderId) { this.orderId = orderId; }

    public Long getCustomerId() { return customerId; }
    public void setCustomerId(Long customerId) { this.customerId = customerId; }

    public List<Long> getProductIds() { return productIds; }
    public void setProductIds(List<Long> productIds) { this.productIds = productIds; }

    public String getOrderDate() { return orderDate; }
    public void setOrderDate(String orderDate) { this.orderDate = orderDate; }

    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }
}
