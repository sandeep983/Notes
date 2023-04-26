console.log("var, let, const difference");

//var - Global Scope Variable
var a = 7;  
var b = "Sandeep";
console.log(a, b);


//let - Block Scope Variable
{
  let a = 10;
  let b = "Patel";
  console.log(a, b);
}

//const - for declaring constants
const name = "Sandeep";
  // name = "Patel"; - throws an error
console.log(name);