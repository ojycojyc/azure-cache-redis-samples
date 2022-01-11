package example.demo.model;

public enum SubscriptionType {
    MONTHLY("monthly"),
    ON_DEMAND("on-demand"),
    YEARLY("yearly"),
    TRIAL("trial");

    private final String type;

    SubscriptionType (String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
