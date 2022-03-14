public class NormalTier extends Handler {
    @Override
    public void extraFeatures(ExtraFeatures extraFeatures) {
        System.out.println("Thank You For Purchasing Food! Hope You Enjoy");

        if(extraFeatures.getTotalPurchase() >= 2500){
            successor.extraFeatures(extraFeatures);
        }
    }
}
