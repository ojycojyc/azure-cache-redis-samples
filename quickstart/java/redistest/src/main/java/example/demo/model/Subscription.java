package example.demo.model;

import lombok.Data;

@Data
public class Subscription {
    private String id; // should be a guid
    private String userId;
    private double totalPrice;
    private SubscriptionType type;

    // VS Code not recognizing Lombok's @Data annotation
    public Subscription(String id, String userId, double price, SubscriptionType monthly) {
        this.id = id;
        this.userId = userId;
        this.totalPrice = price;
        this.type = monthly;
    }
}
