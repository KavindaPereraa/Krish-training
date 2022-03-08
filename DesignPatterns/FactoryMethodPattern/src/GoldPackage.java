public class GoldPackage extends Package{

    @Override
    protected void createPackage(){
        internetserviceprovider.add(new InternetPrePaid());
        internetserviceprovider.add(new InternetPostPaid());
        internetserviceprovider.add(new Television());
        internetserviceprovider.add(new PhoneServices());
    }
}
