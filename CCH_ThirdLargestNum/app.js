const thirdLargestNumber= require('./thirdLargestNumber');
  const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
  });


  readline.question("\r\nEnter The Nummbers In A Pattern Seperated By Comma(,) -  ", function(wordA) {
 
    
    let word_Split = thirdLargestNumber.splitWord(wordA); //spliting the words
    
    let validate_User = thirdLargestNumber.validateUserInput(word_Split);
     
    if(validate_User=="Done"){


      let intNumbers = thirdLargestNumber.convertNumberToInt(word_Split);
   //   console.log("\r\nInt Numbers : " +intNumbers);

      let sortnumbers = thirdLargestNumber.sortNumbers(intNumbers);
      console.log("\r\nSorted Numbers : " +sortnumbers)

      let findThirdLargestNumberz = thirdLargestNumber.findThirdLargestNumber(sortnumbers); 
      console.log("\r\nThrid Largest Number : "+findThirdLargestNumberz);  
    }else{
      console.log(validate_User);
    }
   
   /*   
 


      let findThirdLargestNumberz = thirdLargestNumber.findThirdLargestNumber(sortnumbers); 

     
      console.log("\r\nThrid Largest Number : "+findThirdLargestNumberz);  
    }else{
      console.log(validate_User);
    }
 
 
     */

 

    readline.close();

});
 
  
 