// Multiples of 3 and 5
// Problem 1
// If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

// Find the sum of all the multiples of 3 or 5 below 1000.

function three_and_five (n) {
  sol = 0;
  for (var i = 1; i < n; i ++) {
    if (i % 3 === 0 || i % 5 === 0 ) {
      sol += i
    }
  }
  return sol
}

console.log(three_and_five(4)) //  expecting 3
console.log(three_and_five(6)) //  expecting 8
console.log(three_and_five(7)) //  expecting 14
console.log(three_and_five(1000)) //  expecting 233168
