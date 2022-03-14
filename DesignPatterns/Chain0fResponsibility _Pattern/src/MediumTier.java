public class MediumTier  extends Handler{


    @Override
    public void extraFeatures(ExtraFeatures extraFeatures) {
        System.out.println("You Got Free Chips As Your Addon (For Items More Than 2500)");
        if(extraFeatures.getTotalPurchase() >= 4999){
            successor.extraFeatures(extraFeatures);
        }
    }
}
