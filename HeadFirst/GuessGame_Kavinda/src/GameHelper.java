import java.io.BufferedReader;
import java.io.InputStreamReader; //function to get the user input
//used to get user in put and validate if the user input is accurate or not.
public class GameHelper {

        public String getUserInput(){
        String inputArray = null;
        System.out.println("Enter a Number : ");
        try{
            BufferedReader is = new BufferedReader(
                    new InputStreamReader(System.in));
            inputArray = is.readLine();
            if (inputArray.length() == 0 ) return null;
        }catch (Exception e){
            System.out.println("IOException: " + e);
        }
        return inputArray;
    }
}
