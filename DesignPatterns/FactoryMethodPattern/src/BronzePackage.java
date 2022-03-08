public class BronzePackage extends Package{

    @Override
    protected void createPackage(){
        internetserviceprovider.add(new InternetPrePaid());
        internetserviceprovider.add(new InternetPostPaid());
    }
}
