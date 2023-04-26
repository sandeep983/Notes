// Questions 

// 1. Create a variable of type string and try to add a number to it.
let a = "string";
console.log(a + 25);


// 2. Use typeof operator to find the datatype of the string in last question
console.log(typeof(a));


// 3. Create a const object in js. Can you change it to hold a number later?  ans - no
const items = {
  "item1" : "string"
};
items["item1"] = 10;

console.log(items["item1"]); //however we can change the value of a key it is possible


// 4. Try to add a new key to the const object in problem 3 were you able to do it?  ans - no
// items = {
//   "item2" : 20
// };

// 5. WAP to create a word-meaning dictionary for 5 words
const dict = {
  easy: "easy",
  medium: "medium",
  hard: "hard",
  fourth: "4th",
  fifth: "5th"
};

console.log(dict.fourth);