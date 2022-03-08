
public class InternetConnection {
    private static volatile InternetConnection internetConnection;

    private InternetConnection() {
       //to stop framework like reflection to prevent intefer and create instance

        if(internetConnection!=null){
            throw new RuntimeException("Please use getInternetConnection Method");
        }
    }

    public static InternetConnection getInternetConnection() {
        if(internetConnection==null){
            synchronized (InternetConnection.class) {
                if (internetConnection == null) {
                    internetConnection = new InternetConnection();
                }

            }
        }
        return internetConnection;
    }


}
