public class BasicPackage extends Package {

    @Override
    protected void createPackage(){
        internetserviceprovider.add(new InternetPrePaid());
    }
}
