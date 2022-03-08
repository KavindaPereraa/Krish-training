public class Applicaiton {
    public static void main(String[] args)
    {

        long start;
        long end;


        InternetConnection internetConnection = InternetConnection.getInternetConnection();
        System.out.println(internetConnection);

        InternetConnection connection =InternetConnection.getInternetConnection();

        InternetConnection internetConnection1 = InternetConnection.getInternetConnection();
        System.out.println(internetConnection1);
    }
}
