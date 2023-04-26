// Practice Set 2 - Questions
// 1.  Write a program to print the marks of a student in an object using for loop
obj = { harry: 98, rohan: 70, aakash: 7 }

for (let i in obj) {
  console.log("Marks of " + i + " is: " + obj[i]);
}

// 2. Write the program to print "try again" until the user enters the correct number
let a;
const num = 4;
while (a != num) {
  a = prompt("Enter a number: ");
}


// 3. Write a function to find mean of 5 number
const findMean = (a, b, c, d, e) => {
  let mean = ((a + b + c + d + e) / 5);
  console.log(mean);
}
findMean(10, 20, 30, 40, 50);