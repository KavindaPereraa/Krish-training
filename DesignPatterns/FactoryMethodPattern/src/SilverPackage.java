public class SilverPackage extends  Package {

    @Override
    protected void createPackage(){
        internetserviceprovider.add(new InternetPrePaid());
        internetserviceprovider.add(new InternetPostPaid());
        internetserviceprovider.add(new Television());
    }
}
