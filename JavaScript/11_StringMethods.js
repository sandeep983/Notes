// String Methods
let name = "Sandeep   ";

console.log(name.trim() + "<--");
console.log(name.toUpperCase() + "<--");
console.log(name.toLowerCase() + "<--");
console.log(name.slice(1, 4) + "<--");
console.log(name.slice(3) + "<--");
console.log(name.replace("   ", " Patel") + "<--");

// Interesting, none of the methods changes the string --> String are immutable in javascript also
console.log("-->"+name+"<--");

name[0] = "P"; // No errors are generated
console.log(name);

// Q. Use a for loop to print the string
name = "Surjit";
console.log("For loop starts here-->")
for(let i=0; i<name.length; i++) {
  process.stdout.write(name[i]);
}
console.log(); // changing the line after the for loop

// console.log() changes the line by default, so we can use the process.stdout.write()