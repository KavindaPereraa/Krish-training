import java.util.HashMap; //mapping value and the key
import java.util.Scanner; //getting user input
public class NumberofOccurences { //class name
    private Scanner takeinput;   //object of scanner
    private String uppercase_Word; //variable name
    private HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>(); //creating object of hashmap

    public NumberofOccurences() {
        takeinput = new Scanner(System.in); //constructor intailizing the scanner class
    }

    public void getingInput() throws InterruptedException {  //getting input

        String inputWord;  //variable to get the user input

        System.out.println("Hi Welcome To Number Occurence Calculator");
        Thread.sleep(1000); //wait 1 second and continue the rest of the code
        System.out.println("Please Do Enter A Word ");  //promote to the user
        inputWord = takeinput.nextLine(); //get input and assing the variable

        System.out.println("The word you have entered is : " + inputWord); //printing the input
        Thread.sleep(1000); //wait 1 second
        String uppercase_word = convertToUpperCase(inputWord); //converting the word to uppercase
      // System.out.println(uppercase_word); //printing the uppercase word
        String orderedWord; //priting the word in ordered mannger

        int validateCharacter = validateCharacter(uppercase_word); //calling the method to validae the input
        if (validateCharacter == 0) { //if no issue run this block

            orderedWord = sortCharacters(uppercase_word); //sort the algorithmn
            System.out.println(orderedWord); //priting the ordered word

            hashMap=calculateOccurence(orderedWord);

            for(Character itt : hashMap.keySet()){
                System.out.println(itt+" = " +hashMap.get(itt));
            }

        } else {
            //when the input is wrong
            System.out.println("Ops Your Input is wrong either you have numbers, spaces, or symbols ! CHECK AGAIN");
            System.out.println("Program will exist now!");
            Thread.sleep(2000);
            System.exit(0);
        }

    }

    public String convertToUpperCase(String word) { //method to convert the word to uppercase
        uppercase_Word = word.toUpperCase();
        return uppercase_Word;
    }

    public int validateCharacter(String uppercase_Word) throws InterruptedException {
        char checkCharacter;
        for (int i = 0; i < uppercase_Word.length(); i++) {

            checkCharacter = uppercase_Word.charAt(i); //validating the word and checking if any symbolic letter present if so error
            if (Character.isAlphabetic(checkCharacter)) {

                System.out.println("Hold on we validating the input");
                Thread.sleep(100);
            } else {
                return -1;
            }
        }
        return 0;
    }

    public String  sortCharacters(String uppercase_word) {
        //sorting the values in alphabetic order
        char temp;
        char arr[] = uppercase_word.toCharArray(); //sort
        String orderedWord = null;
        for (int i = 0; i <= arr.length; i++) {
            for (int j = 0 + i; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }


            }
            orderedWord = String.valueOf(arr);

        }
        return orderedWord;

    }



    public HashMap<Character, Integer> calculateOccurence(String uppercase_word) //algorithmn to count the number of occurence
    {
        char ch_character;
        int count;
        for(int i= 0; i<uppercase_word.length(); i++)
        {
            ch_character=uppercase_word.charAt(i);
            if(hashMap.containsKey(ch_character)){
                count=hashMap.get(ch_character);
                count++;
                hashMap.replace(ch_character, count);
            }else{
                hashMap.put(ch_character, 1);
            }

        }
        return hashMap;
    }
}


















