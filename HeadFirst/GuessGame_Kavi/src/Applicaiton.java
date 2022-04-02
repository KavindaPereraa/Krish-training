import java.util.Random;
public class Applicaiton {
    public static void main(String[] args) {
        System.out.println("HI WELCOME TO THE GAME! TRY TO GUESS A NUMBER BETWEEN 1 TO 10 (GUESS 3 NUMBERS TO WIN)");
        int totalGuesses = 0 ;  // variable to hold the  guesses
        Random rand = new Random();
        GameHelper getInput = new GameHelper();
        GuessGame game1 = new GuessGame();

        int n = rand.nextInt(6); //creating a random number from 1- 10
        int[] numbers = {n, n+1, n+2}; //increting the random by 1 and 2 then store in the array

        game1.setNumbersInRandomCells(numbers);

        String result = "Active";

        while (result=="Active"){

            String userInputNumber = getInput.getUserInput();
            String validateNum = game1.guessNumberChecker(userInputNumber);
            totalGuesses++;
             /*check if number exist if so change the output according to that additonal print a message based
            on the number of guesses*/
            if (validateNum.equals("KILL!")) {
                result = "Not Active";
                System.out.println("You took " + totalGuesses + " guesses");

                if(totalGuesses >=7){
                    System.out.println("You Took Too many Gusses Keep Trying");
                }else if(totalGuesses >= 4){
                    System.out.println("Not Bad TRY AGAIN  and get better results");
                }else{
                    System.out.println("Excellent");
                }

            }

        }

    }
}




