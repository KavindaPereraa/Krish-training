//import org.junit.Before;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
//Testing the application  methods 
public class TestApplication {

      FindMissingNUmber findMissingNumber = new FindMissingNUmber(); //intialzing 
     @BeforeAll
      static void BeforeAllTestCases() {
            System.out.println("ALL TEST CASES WILL BEGIN"); //metioning the test cases are going to start
      }

      @BeforeEach
      void BeforeEachTestCase(TestInfo testInfo) {
            System.out.println("Start..." + testInfo.getDisplayName());  //geting the test case name before each test
      }

      @Test
      @DisplayName("Testing correct  Sorted Numbers")
      void  checkNumberSorted(){
            int[] expectOutput = {3,4,5};
            int[] givenInput = {5,4,3};

            int[] actualOutputInInt= findMissingNumber.sortInOrder(givenInput);  //sorting the number and checking wether it is in the correct  pattern
           // String[] actualOutput = new String[actualOutputInInt.length];
            for (int i = 0; i < actualOutputInInt.length; i++) {

                  for(int j=0; j<expectOutput.length; j++)
                  {
                        assertEquals(expectOutput[i], actualOutputInInt[i], "Actual Output : " +actualOutputInInt[i] +
                                "Expected Output : " +expectOutput[i]);
                  }
            }


      }


      @Test
      @DisplayName("Testing wrong  Sorted Numbers")
      void  checkWrongNumberSorted(){
            int[] expectOutput = {3,4,6};
            int[] givenInput = {5,4,3};

            int[] actualOutputInInt= findMissingNumber.sortInOrder(givenInput); //check wether sorting number gets an error
            // String[] actualOutput = new String[actualOutputInInt.length];
            for (int i = 0; i < actualOutputInInt.length; i++) {

                  for(int j=0; j<expectOutput.length; j++)
                  {
                        assertEquals(expectOutput[i], actualOutputInInt[i], "Actual Output : " +actualOutputInInt[i] +
                                "Expected Output : " +expectOutput[i]);
                  }
            }


      }

      @Test
      @DisplayName("Testing correct input  Numbers")   //validating user input with correct values
      void  validateUserInputTrue(){
            int expectOutput = 0;
            int[] givenInput = {5,4,3};

            int actualOutputInInt= findMissingNumber.validateInput(givenInput);
            assertEquals(expectOutput, actualOutputInInt, "Actual Output : " +actualOutputInInt +
                    "Expected Output : " +expectOutput);



      }



    @Test
    @DisplayName("Testing  incorrect  input  Numbers with negative")  //vlading user input with negative values.
    void  validateUserInputForNegativeValues(){
        int expectOutput = -1;
        int[] givenInput = {5,4,-2};

        int actualOutputInInt= findMissingNumber.validateInput(givenInput);
        assertEquals(expectOutput, actualOutputInInt, "Actual Output : " +actualOutputInInt +
                "Expected Output : " +expectOutput);
        System.out.println("INVALID SO IT PRINTS NEGATIVE");


    }


    @Test
    @DisplayName("Testing  incorrect  input  for zero") //Testing wether it prints false if the number is 0 
    void  validateUserInputForZero(){
        int expectOutput = -1;
        int[] givenInput = {5,4,0};

        int actualOutputInInt= findMissingNumber.validateInput(givenInput);
        assertEquals(expectOutput, actualOutputInInt, "Actual Output : " +actualOutputInInt +
                "Expected Output : " +expectOutput);
        System.out.println("INVALID SO IT PRINTS NEGATIVE");


    }


    @Test
    @DisplayName("Testing correct missing number") //check if you get the missing number
    void  checkFindMissingNumber() {
        int expectOutput = 2;
        int[] givenInput = {1, 3, 4, 5, 6, 7};
        int actualOutputInInt= findMissingNumber.FindMissingNumberz(givenInput);
        assertEquals(expectOutput, actualOutputInInt, "Actual Output : " +actualOutputInInt +
                "Expected Output : " +expectOutput);
        System.out.println("CORRECT");
    }

    @Test
    @DisplayName("Testing if two missing values")  //check if it gives a result if there is more than one missing number 
    void  checkForTwoMissingNumbers() {
        int expectOutput = -1;
        int[] givenInput = {1, 3, 4, 5, 6, 7, 9};
        int actualOutputInInt= findMissingNumber.FindMissingNumberz(givenInput);
        assertEquals(expectOutput, actualOutputInInt, "Actual Output : " +actualOutputInInt +
                "Expected Output : " +expectOutput);
        System.out.println("INVALID MISSING MORE THAN ONE NUMBER SO PRINTS -1");
    }





      @AfterEach
      void AfterEachTestCase(TestInfo testInfo) {
            System.out.println("Finished..." + testInfo.getDisplayName()); //Getting the test info after each test case 
      }

      @AfterAll
      static void AfterAllTestCases() {
            System.out.println("ALL TEST CASES COMPLETED"); //printing message after all test case 
      }


}
