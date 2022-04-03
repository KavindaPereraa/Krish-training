
//Testing the GuessGame Class with hardcore values(to check if it working)
public class GuessGameTestDrive {

    public static void main(String[] args){
        GuessGame game1 = new GuessGame(); //creating a guess game object
        int[] numbers = {9,5,6,11,14};    //creating an array with 5 values
        game1.setNumbersInRandomCells(numbers);
        String guessedNumber = "9";
        game1.guessNumberChecker(guessedNumber);
    }
}



