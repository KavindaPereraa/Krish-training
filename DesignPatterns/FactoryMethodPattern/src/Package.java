import java.util.ArrayList;
import java.util.List;

public abstract class Package {
    protected List<InternetServiceProvider> internetserviceprovider = new ArrayList<>();

    public Package(){
        createPackage();
    }

    protected  abstract  void  createPackage();

    @Override
    public String toString(){
        return "Package{"+
                "InternetServiceProvider=" +internetserviceprovider +
                '}';

    }
}
