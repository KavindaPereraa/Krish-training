public class SpecialTier extends Handler {


    @Override
    public void extraFeatures(ExtraFeatures extraFeatures) {

        System.out.println("You Got Free Coke As Your Addon (For Items More Than 4999)");
        if(extraFeatures.getTotalPurchase() >= 5900){
            successor.extraFeatures(extraFeatures);
        }
    }
}
