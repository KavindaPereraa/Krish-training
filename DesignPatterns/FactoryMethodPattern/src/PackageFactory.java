import javax.swing.*;

public class PackageFactory {

    public static Package createPackage(PackageCode packageCode){
        switch (packageCode){
            case BASIC :
                return new BasicPackage();
            case BRONZE:
                return new BronzePackage();

            case SILVER:
                return new SilverPackage();

            case GOLD:
                return new GoldPackage();
            default:
                return null;
        }
    }
}
