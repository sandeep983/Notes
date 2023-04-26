// Practice Set 3

// Q1. What will be the output of the following print statement -> console.log("har\"".length);
// ans --> 4 
console.log("har\"".length);

//Q2. Explore the includes, startsWith and endsWith functions of a string.
let name = "My name is sandeep";
console.log(name.includes("sandeep"));
console.log(name.startsWith("My"));
console.log(name.endsWith("p"));

//Q3. Write a program to convert a given string to lowercase
let str = prompt("Enter a string: ");
str2 = str.toLowerCase();
console.log(str2);

//Q4. Extract the amount out of this string "Please give rs 1000"
let str3 = "Please give RS 1000";
console.log(Number.parseInt(str3.slice("Please give RS ".length)));
console.log(str3.substr(-4));

//Q5. Try to change 4th character of a given string. Were you able to do it?
// ans-> no, because string are imutable in javascript

