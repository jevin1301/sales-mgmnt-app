public class SalesDTO {
    private Long saleId;
    private Long orderId;
    private double revenue;
    private String saleDate;

    // Constructors
    public SalesDTO() {}

    public SalesDTO(Long saleId, Long orderId, double revenue, String saleDate) {
        this.saleId = saleId;
        this.orderId = orderId;
        this.revenue = revenue;
        this.saleDate = saleDate;
    }

    // Getters and Setters
    public Long getSaleId() { return saleId; }
    public void setSaleId(Long saleId) { this.saleId = saleId; }

    public Long getOrderId() { return orderId; }
    public void setOrderId(Long orderId) { this.orderId = orderId; }

    public double getRevenue() { return revenue; }
    public void setRevenue(double revenue) { this.revenue = revenue; }

    public String getSaleDate() { return saleDate; }
    public void setSaleDate(String saleDate) { this.saleDate = saleDate; }
}
