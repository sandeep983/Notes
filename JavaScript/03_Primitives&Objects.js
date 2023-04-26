console.log("Primitives & Objects");

// nn bb ss u

// null
// number
// byte
// bigint
// string
// symbol
// undefined

let a = Symbol("I am a symbol");
console.log(typeof(a));

let b = BigInt("250");
console.log(typeof(b));



// Objects
const items = {
  "name" : "Sandeep",
  "age" : 26,
  "hasMobile" : true,
  "mobile" : 7000792264
};

console.log(items["name"]);
console.log(items["hasMobile"]);