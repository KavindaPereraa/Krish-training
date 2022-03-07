//import org.junit.Before;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestApplication {

      FindMissingNUmber findMissingNumber = new FindMissingNUmber();
     @BeforeAll
      static void BeforeAllTestCases() {
            System.out.println("ALL TEST CASES WILL BEGIN");
      }

      @BeforeEach
      void BeforeEachTestCase(TestInfo testInfo) {
            System.out.println("Start..." + testInfo.getDisplayName());
      }

      @Test
      @DisplayName("Testing correct  Sorted Numbers")
      void  checkNumberSorted(){
            int[] expectOutput = {3,4,5};
            int[] givenInput = {5,4,3};

            int[] actualOutputInInt= findMissingNumber.sortInOrder(givenInput);
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

            int[] actualOutputInInt= findMissingNumber.sortInOrder(givenInput);
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
      @DisplayName("Testing correct input  Numbers")
      void  validateUserInputTrue(){
            int expectOutput = 0;
            int[] givenInput = {5,4,3};

            int actualOutputInInt= findMissingNumber.validateInput(givenInput);
            assertEquals(expectOutput, actualOutputInInt, "Actual Output : " +actualOutputInInt +
                    "Expected Output : " +expectOutput);



      }



    @Test
    @DisplayName("Testing  incorrect  input  Numbers with negative")
    void  validateUserInputForNegativeValues(){
        int expectOutput = -1;
        int[] givenInput = {5,4,-2};

        int actualOutputInInt= findMissingNumber.validateInput(givenInput);
        assertEquals(expectOutput, actualOutputInInt, "Actual Output : " +actualOutputInInt +
                "Expected Output : " +expectOutput);
        System.out.println("INVALID SO IT PRINTS NEGATIVE");


    }


    @Test
    @DisplayName("Testing  incorrect  input  for zero")
    void  validateUserInputForZero(){
        int expectOutput = -1;
        int[] givenInput = {5,4,0};

        int actualOutputInInt= findMissingNumber.validateInput(givenInput);
        assertEquals(expectOutput, actualOutputInInt, "Actual Output : " +actualOutputInInt +
                "Expected Output : " +expectOutput);
        System.out.println("INVALID SO IT PRINTS NEGATIVE");


    }


    @Test
    @DisplayName("Testing wrong  Sorted Numbers")
    void  checkFindMissingNumber() {
        int expectOutput = 2;
        int[] givenInput = {1, 3, 4, 5, 6, 7};
        int actualOutputInInt= findMissingNumber.FindMissingNumberz(givenInput);
        assertEquals(expectOutput, actualOutputInInt, "Actual Output : " +actualOutputInInt +
                "Expected Output : " +expectOutput);
        System.out.println("CORRECT");
    }

    @Test
    @DisplayName("Testing wrong  Sorted Numbers")
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
            System.out.println("Finished..." + testInfo.getDisplayName());
      }

      @AfterAll
      static void AfterAllTestCases() {
            System.out.println("ALL TEST CASES COMPLETED");
      }


}
