const thirdLargestNumber= require('./thirdLargestNumber');
  const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
  });


  readline.question("\r\nEnter The Nummbers In A Pattern Seperated By Comma(,) -  ", function(wordA) {
 
    
    let word_Split = thirdLargestNumber.splitWord(wordA); //spliting the words
    
    let validate_User = thirdLargestNumber.validateUserInput(word_Split); //calling the validate user function 
     //sucesfull then we sort numbers and print the third largest
    if(validate_User=="Done"){ 
 

      let intNumbers = thirdLargestNumber.convertNumberToInt(word_Split); //convert numbers to integer

      let sortnumbers = thirdLargestNumber.sortNumbers(intNumbers); //sort the numbers
      console.log("\r\nSorted Numbers : " +sortnumbers)

      let findThirdLargestNumberz = thirdLargestNumber.findThirdLargestNumber(sortnumbers);  //find the third largest number
      console.log("\r\nThrid Largest Number : "+findThirdLargestNumberz);  
    }else{
      console.log(validate_User);
    }

    readline.close();

});
 
  
 
