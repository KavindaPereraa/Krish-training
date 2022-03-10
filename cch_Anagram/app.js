const anagram= require('./anagram');
  const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
  });
 
 
 
  readline.question("\r\nEnter Your First Word To Check Anagram -  ", function(wordA) {
    readline.question("Enter Your Second Word To Check Anagram - ", function(wordB) {
        console.log(`\r\nThe First Word You Entered  Is : ${wordA}\r\nThe Second Word You Entered Is : ${wordB}`);
        readline.close();
        let ValidateUser = anagram.validateUserInput(wordA,wordB);
        if(ValidateUser=="NoError"){
          
            let split_user_input = anagram.splitWord(wordA,wordB);
            let findAnagram = anagram.findAnagram(split_user_input[0],split_user_input[1]);
            console.log(findAnagram);

        }else{
          console.log(ValidateUser);
        } 
    });
});
 
  
 