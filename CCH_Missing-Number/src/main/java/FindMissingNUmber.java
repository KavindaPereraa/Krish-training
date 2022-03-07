import java.util.Scanner; //importing class to get input
public class FindMissingNUmber { 

    Scanner takeInput; //creating object
    public FindMissingNUmber(){
        takeInput = new Scanner(System.in);  //geting input values into variable
    }

    public void  main_start() throws InterruptedException {

        String userInput = gainInput();  //method to get user input
        int[] vals = convertToInt(userInput);  //method to convert array into integer
        int count = validateInput(vals); //validating input

     //   System.out.println(count);
        if(count==-1)
        {
            System.out.println("Invalid Input: Please Do Enter Numbers Seperated By Comma (No zero or negative numbers[it will give you an error])"); //error
        }else{
            int[] sortedVal = sortInOrder(vals); //sorrting the array to get the numbers in ascending

            int MissingNumber = FindMissingNumberz(sortedVal); //finding the missing value
            System.out.println("Wait Processing");
            Thread.sleep(1000);
            if(MissingNumber==0){
                System.out.println("Tricky Guy :) No Missing Values In the Given Sequence"); //no missing values

            }else if (MissingNumber ==-1){
                System.out.println("ERROR : Pherhaps More than one value is missing"); //error if two or more values missing
            }else{
                System.out.println("MISSING NUMBER IS : " +MissingNumber); //print the missing numbers
            }

        }

    }

    /* Getting user input as a string*/
    public String gainInput() throws InterruptedException {


        //getting user input

        System.out.println("Hi Welcome ! We Will Find You The Missing Number Now");
        Thread.sleep(10);
        System.out.println("Enter more than three inputs separated  By Comma (,) ");
        String userInput = takeInput.nextLine();

        return userInput;
    }


    /*validing the input */
    //converting the string to int
    public int[] convertToInt(String userInput)
    {
        try {
            String[] numbers = userInput.split(","); //splitng the values by the comma
            int[] intNumbers = new int[numbers.length]; //int array
            for(int i=0; i<numbers.length; i++)
            {
                // numbers.valueOf(i);
                intNumbers[i] = Integer.parseInt(numbers[i]);

            }
            return intNumbers;
        }catch (Exception e)
        {
            System.out.println(e);
        }
        return new int[]{-1};  //return values
    }



    public int validateInput(int vals[]) //validating input in integer array
    {
        //returing 0 if all correct and -1 if it is wrong
        int count=0;
        for (int i = 0; i < vals.length; i++) {
            if((Integer.valueOf(vals[i]) )>0) {
               count++;
            }
          }

       if(count==vals.length)
       {
           return 0;
       }
       return -1;
    }

    public int[] sortInOrder(int[] arr){  //sort the values in the array in the ascending order
        int temp;
        for (int i = 0; i <= arr.length; i++) {
            for (int j = 0 + i; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        return arr;
    }

    public int FindMissingNumberz(int[] arr) {
        //method to find the missing number
        try {
            int No_Of_Missing_Numbers = 0;
            int Sorted_Minimum_Number = arr[0]; //consider the 0th index is the minimum
            int Missing_Number = 0;


            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != Sorted_Minimum_Number) {
                    Missing_Number = Sorted_Minimum_Number;
                    No_Of_Missing_Numbers++;
                }
                Sorted_Minimum_Number = arr[j] + 1;
            }
            if (No_Of_Missing_Numbers == 0) {   //if there is no missing number return 0/ error
                return 0;
            } else if (No_Of_Missing_Numbers > 1) { //if there is more than one missing number return error 
                return -1;
            }
            if (No_Of_Missing_Numbers == 1) {  //if one is missing return the missing number 
                return Missing_Number;
            }
            return Missing_Number; //return


        } catch (Exception e) {
            System.out.println("INVALID" + e); //priting if error
        }
            return -1;
    }
}



