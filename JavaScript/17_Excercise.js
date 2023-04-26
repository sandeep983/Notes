// Q. WAP to generate a random number and store it in a variable. The program then takes an input from the user to tell them whether the guess was correct, greater or lesses than the original number. 100-(number of guesses) is the score of the user. The program is expected to terminate once the number is guessed. Number should be between 1-100.

console.log("\"Number Guessing Game\"\n");

let totalGuesses = 100;
let guessCount = 1;
let generatedRandomNum = Math.floor(Math.random() * 101);

while(guessCount <= totalGuesses) {
  let guessesAvailable = totalGuesses-guessCount;
  
  console.log("-------------------------------");
  let userEnteredNum = Number.parseInt(prompt("Guess the number: "));
  
  if(isNaN(userEnteredNum)) {
    console.log("Please enter number only.\n");
    continue;
  }

  if(generatedRandomNum === userEnteredNum) {
    console.log("\nYou guessed the number correctly, Your score is: " +  guessesAvailable);
    console.log("The generated number was: " + generatedRandomNum);
    break;
  }
  else if (generatedRandomNum > userEnteredNum) {
    console.log("\nYour guessed number is lesser than the generated number.\nKeep guessing.\n");
  }
  else if (generatedRandomNum < userEnteredNum) {
    console.log("\nYour guessed number is greater than the generated number.\nKeep guessing.\n");
  }

  console.log("Total number of guesses available: " + guessesAvailable + "\n");
  guessCount++;
}