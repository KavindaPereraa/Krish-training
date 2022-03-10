const specialCharacters = /[ `!@#$%^&*()_+\-=\[\]{};':"\\|,.<>\/?~]/;
var hasNumber = /\d/;   
function validateUserInput(wordA, wordB)   //used to validate the user input
{
    let word_A = wordA;
    let word_B = wordB;
    if(word_A.length == word_B.length){   //checking wether the entered word is the same length
        
        if((!hasNumber.test(word_A)) && (!hasNumber.test(word_B))){
          if(specialCharacters.test(word_A) || specialCharacters.test(word_B)){
                return"INVALID ERROR : Contain Special Characters In The Given Input";
          }else{
              return "NoError";
          }

        }else{
            return "INVALID ERROR: Ops Words Cannot Have Any Numbers";
        }

    }else{
        return "INVALID ERROR: Ops Please Enter Two Words That Have The Same Length  (Note - If one word contain 5 characters Second word should contain 5 characters as well)";
    }

}


function splitWord(wordA, wordB){

    let word_A = wordA.split('').sort();
    let word_B = wordB.split('').sort();

    return [word_A, word_B];
}




function findAnagram(word_A, word_B){
 
    for(let i=0; i<word_A.length; i++){
        if(word_A[i] !== word_B[i]) {
            return "\r\nThe Words Are Not Anagram";
        }
    }
      return  "\r\nThe Two Words Are Anagram";
}


 
 
 
module.exports = {
   validateUserInput,splitWord,findAnagram,
}
 