public class GuessGame {
    int[] cell;  //creating an array
    int correctGuess=0; //creating a variable to store the number of guess

    public void setNumbersInRandomCells(int[] numbers){
        cell = numbers; //Initialization the array with the list of numbers taken from the parameter
    }


    public String guessNumberChecker(String Guess){  //checking if the number is in the array
        int guessNumber=  Integer.parseInt(Guess); //converting the string input to integer
        String output = "WRONG GUESS!";  //creating a variable and intailziing to miss
        for(int index: cell){  //loop through the array to find if the number exist if so change miss to hit
            if(guessNumber==index){
                output = "CORRECT GUESS!";
                cell[correctGuess]= -1;  //remove the number in that index after hit
                correctGuess++; //Incrementing the number of guess
                break;
            }
        }

        if(correctGuess == cell.length){
            output="KILL!"; //if all the correct guesses done then we kill the system(Exit)
        }

        System.out.println(output);
        return output;
    }

}
