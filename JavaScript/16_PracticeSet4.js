// Q1. Create an array of numbers and take input from the user to add numbers to this array
let array = new Array(5);
for(let i=0; i<array.length; i++) {
  let a = prompt("Enter a number: ");
  array[i] = Number.parseInt(a);
}
console.log(array);

// Q2. Keep adding numbers to the array in Q1, until 0 is added to the array
let array = new Array();
for(;;) {
  let num = prompt("Enter a number: ");
  array.push(Number.parseInt(num));
  if(num==0)  // === used for checking the type
    break;
}
console.log(array);

// Q3. Filter for numbers divisible by 10 from a given array
let array = [10, 2, 5, 20, 30, 77, 99, 55, 60];
const newArray = array.filter( (element)=> {
  return element%10==0;
})
console.log(newArray);

// Q4. Create an array of square of given numbers
let array = [10, 20, 30, 40, 50];
const newArray = array.map((element)=>{
  return element*element;
})
console.log(newArray);

// Q5. Use reduce to calculate factorial of a given number from an array of first n natural numbers
 // (n being the number whose factorial needs to be calculated)
let array = [1,2,3,4,5];
const result = array.reduce( (a, b) => {
  return a*b;
})
console.log(result);