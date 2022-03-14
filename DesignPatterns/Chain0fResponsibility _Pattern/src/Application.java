public class Application {


    public static void main(String [] args){

        NormalTier normalTier = new NormalTier();
        SpecialTier specialTier = new SpecialTier();
        MediumTier mediumTier = new MediumTier();
        ExtraSpecialTier extraSpecialTier = new ExtraSpecialTier();

        normalTier.setSuccessor(mediumTier);
        mediumTier.setSuccessor(specialTier);
        specialTier.setSuccessor(extraSpecialTier);

        ExtraFeatures extraFeatures = new ExtraFeatures(1,5000);
        normalTier.extraFeatures(extraFeatures);
    }
}
