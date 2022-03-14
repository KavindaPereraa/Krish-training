public class ExtraFeatures {
    private int extraFeatureId;
    private double totalPurchase;

    public ExtraFeatures(int extraFeatureId, double totalPurchase) {
        this.extraFeatureId = extraFeatureId;
        this.totalPurchase = totalPurchase;
    }

    public int getExtraFeatureId() {
        return extraFeatureId;
    }

    public double getTotalPurchase() {
        return totalPurchase;
    }
}
