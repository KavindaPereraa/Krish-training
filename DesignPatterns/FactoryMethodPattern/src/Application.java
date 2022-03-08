public class Application {
    public static void main(String [] args)
    {
            Package basicPackage =PackageFactory.createPackage(PackageCode.BASIC);
            System.out.println(basicPackage);

            Package  BronzePackage=PackageFactory.createPackage(PackageCode.BRONZE);
            System.out.println(BronzePackage);

           Package  silverPackage=PackageFactory.createPackage(PackageCode.SILVER);
           System.out.println(silverPackage);

           Package  goldPackage=PackageFactory.createPackage(PackageCode.GOLD);
           System.out.println(goldPackage);






    }

}
