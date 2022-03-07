import java.util.Scanner;
public class FindMissingNUmber {

    Scanner takeInput;
    public FindMissingNUmber(){
        takeInput = new Scanner(System.in);
    }

    public void  main_start() throws InterruptedException {

        String userInput = gainInput();
        int[] vals = convertToInt(userInput);
        int count = validateInput(vals);

     //   System.out.println(count);
        if(count==-1)
        {
            System.out.println("Invalid Input: Please Do Enter Numbers Seperated By Comma (No zero or negative numbers[it will give you an error])");
        }else{
            int[] sortedVal = sortInOrder(vals);

            int MissingNumber = FindMissingNumberz(sortedVal);
            System.out.println("Wait Processing");
            Thread.sleep(1000);
            if(MissingNumber==0){
                System.out.println("Tricky Guy :) No Missing Values In the Given Sequence");

            }else if (MissingNumber ==-1){
                System.out.println("ERROR : Pherhaps More than one value is missing");
            }else{
                System.out.println("MISSING NUMBER IS : " +MissingNumber);
            }

        }

    }

    /* Getting user input as a string*/
    public String gainInput() throws InterruptedException {




        System.out.println("Hi Welcome ! We Will Find You The Missing Number Now");
        Thread.sleep(10);
        System.out.println("Enter more than three inputs separated  By Comma (,) ");
        String userInput = takeInput.nextLine();

        return userInput;
    }


    /*validing the input */
    public int[] convertToInt(String userInput)
    {
        try {
            String[] numbers = userInput.split(",");
            int[] intNumbers = new int[numbers.length];
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
        return new int[]{-1};
    }



    public int validateInput(int vals[])
    {

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

    public int[] sortInOrder(int[] arr){
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
            if (No_Of_Missing_Numbers == 0) {
                return 0;
            } else if (No_Of_Missing_Numbers > 1) {
                return -1;
            }
            if (No_Of_Missing_Numbers == 1) {
                return Missing_Number;
            }
            return Missing_Number;


        } catch (Exception e) {
            System.out.println("INVALID" + e);
        }
            return -1;
    }
}



