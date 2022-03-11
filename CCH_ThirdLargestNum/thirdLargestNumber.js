const specialCharacters = /[ `!@#$%^&*()_+\-=\[\]{};':"\\|.<>\/?~]/;
let numericCharacter = /^\d+$/;
let status;
function splitWord(numbers){

    let number_Pattern = numbers.split(','); //spliiting the userinput by comma
    return number_Pattern;
}

function validateUserInput(numbers)   //used to validate the user input (valdate if any symbol , any string letters and minimum of 3 numbers )
{ 
    let number_Pattern = numbers;
    let number_Pattern_Length = number_Pattern.length;
     
    for(let x=0; x<number_Pattern_Length; x++){
            if(number_Pattern_Length>=3){

                  if(!specialCharacters.test(number_Pattern[x])){
                        let status =  numericCharacter.test(number_Pattern[x]);
                     if(!status){
                        return "\r\nINVALID INPUT: Only Numeric Numbers (Enter Only Numbers Separated By Comma No Space! )";
                    }
             
                }else{
                    return "\r\nINVALID ERROR: No Special Characters";
                }
                 
            }else{
                return "\r\nINVALID ERROR: Ops Should Have At Least Three Numbers In Order To Work";
            }

            
    }
        return "Done";
}


 
 
function sortNumbers(numbers){  //sort the values in the array in the ascending order
    let temp;
    for(var x = 0; x < numbers.length; x++){
        for(var y = x + 1; y < numbers.length; y++){

          if(numbers[x] > numbers[y]){
            temp = numbers[x];
            numbers[x] = numbers[y];
            numbers[y] = temp;
          }
        }
      }
      return numbers;
 }
    
 
 
    
    
 

function convertNumberToInt(numbers){ //converting the string array into integer values (need causes if you input :100 or any 3 digit number with 2 digit then it will not be sorted)
    let intNumbers = []; //it order to sort 2 digit and three digit you need to convert them into integer
    for (let i = 0; i < numbers.length; i++) {
        intNumbers[i] =  parseInt(numbers[i]);
    }
   // console.log(intNumbers);
    return intNumbers;

}



function findThirdLargestNumber(numbers){ //finding the third largest number you can also just print the array index after sorting (just decided to go with the function)
 
    let currentValue=0;
     
 
     let count = 1;
 
     
    for(let x=0; x<numbers.length; x++){
        
        if(numbers[x] < numbers[x+1]){
            currentValue =numbers[x+1];
            count++;
        }
        if(count==3){
            return currentValue;
        }
    }

   
}   
 
module.exports = {
    validateUserInput,splitWord,sortNumbers,findThirdLargestNumber,convertNumberToInt
 }

 
