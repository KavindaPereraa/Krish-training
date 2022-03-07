import org.junit.Before;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoTest {
    NumberofOccurences occurences = new NumberofOccurences();

    @BeforeAll
   static void BeforeAllTestCases() {
        System.out.println("ALL TEST CASES WILL BEGIN");
    }

    @BeforeEach
    void BeforeEachTestCase(TestInfo testInfo) {
        System.out.println("Start..." + testInfo.getDisplayName());
    }


    @Test
   @DisplayName("Testing wether the input word is capital")
     void uppercaseWordTest(){
       String expectedOutput = "JAVA";
       String actualOutput= occurences.convertToUpperCase("java");
       assertEquals(expectedOutput, actualOutput, "Actual Value : " +actualOutput +
               "Expected Value :" +expectedOutput);

   }

    @Test
    @DisplayName("Testing Wether the input string is valid")
    void validateInputNumber() throws InterruptedException {
        int expectedOutput = -1;
        int actualOutput= occurences.validateCharacter("java01");
        assertEquals(expectedOutput, actualOutput, "Actual Value : " +actualOutput +
                "Expected Value :" +expectedOutput);
    }


    @Test
    @DisplayName("Testing Wether the input string is valid")
    void validateInputSymbol() throws InterruptedException {
        int expectedOutput = -1;
        int actualOutput= occurences.validateCharacter("java$");
        assertEquals(expectedOutput, actualOutput, "Actual Value : " +actualOutput +
                "Expected Value :" +expectedOutput);
    }

    @Test
    @DisplayName("Testing Wether the input string is valid")
    void validateInputSpace() throws InterruptedException {
        int expectedOutput = -1;
        int actualOutput= occurences.validateCharacter("ja va");
      //  System.out.println(actualOutput);
        assertEquals(expectedOutput, actualOutput, "Actual Value : " +actualOutput +
                "Expected Value :" +expectedOutput);
    }


    @Test
    @DisplayName("Testing he number of occurences")
    void patternCheck() throws InterruptedException {
        String expectedOutput = "{A=2, V=1, J=1}";

        HashMap<Character, Integer> actualHashOutput = occurences.calculateOccurence("JAVA");

       String actualOutput = actualHashOutput.toString();


        assertEquals(expectedOutput, actualOutput, "Actual Value : " +actualOutput +
               "Expected Value :" +expectedOutput);
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
