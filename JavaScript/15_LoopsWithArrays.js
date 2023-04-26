// Loops with arrays
let num = [10, 20, 30, 40, 50];

// for
for(let i=0; i<num.length; i++) {
  console.log(num[i]);
}

//for-each
num.forEach((items) => {
  console.log(items);
})

//Array.from
let str = "hello";
let arr = Array.from(str)
console.log(arr);

//for-of
for(let i of arr) {
  console.log(i);
}

//for-in
for(let i in arr) {
  console.log(arr[i]);
}

// map - creates a new array by performing some operations on each array element
let arr = num.map((val, index, num) => {
  console.log(val, index, num);
  return val*val;
})
console.log(arr);

//filter - creates a new array of filtered values which passes the test
let array = num.filter((elements) => {
  return elements<30;
})
console.log(array);

//reduce - returns a single value, uses the result with the next array element
let arr1 = num.reduce((i,j) => {
  return i+j;
})
console.log(arr1);

//Q1. Finding minimum element in array
//using normal loop
let min = num[0];
for(let i=0; i<num.length; i++) {
  if(num[i] < min) {
    min = num[i];
  }
}
console.log(min);


// using reduce
num = [10, 2, 1, 2, -2, -1, 4, 0, 2];
let min = num.reduce((i, j) => {
  if(i<j)
    return i;
  return j; 
})
console.log(min);