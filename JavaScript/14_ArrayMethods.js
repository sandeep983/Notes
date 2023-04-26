// Arrays Methods

let array = [10, 20, 30, 40, 50];
console.log(array);

let arrToString = array.toString();
console.log(typeof arrToString);

let arrJoin = array.join(" || ");
console.log(arrJoin);

array.pop();// removes the last element and returns it
console.log(array);

array.push(60); // adds a new element at the end of the array
console.log(array);

console.log(array.push(10, 60, 50)); // adds a new element at the end of the array and returns the length
console.log(array);

console.log(array.shift()); // removes an element from the start of the array
console.log(array.unshift(100)); // adds an element at the starting of the array
console.log(array);    

console.log(delete array[0]); // doesn't change the length of the array
console.log(array);

let newArray = ["ten", "twenty", "thirty", "forty", "fifty"];
console.log(array.concat(newArray));

// NOTE: JavaScripts sort function only sorts in alphabetical order
let arr = [50, 40, 44, 10, 20, 320, 30];
arr.sort();
console.log(arr);

// for sorting it to ascending or descending order we can do it like this
let compare = (a, b) => {
  return b-a;
}
arr.sort(compare);
console.log(arr);


// splice and slice
let newNum = [20, 10, 30, 50, 40];
newNum.splice(1, 2, 1000, 1000, 1000); 
console.log(newNum);

console.log(newNum.slice(2));
console.log(newNum.slice(1, 4));