// # Largest prime factor
// # Problem 3
// # The prime factors of 13195 are 5, 7, 13 and 29.
// #
// # What is the largest prime factor of the number 600851475143 ?

// var sol = 0
// var num = 600851475143
// var counter = 2
// while (num > 1) {
//   if (num % counter == 0) {
//     sol = counter
//     num /= counter
//   }
//   else {
//     counter += 1
//   }
// }
// console.log(sol)


var my_largest_prime = function(num) {
  var sol = 0
  var counter = 2
  while (num > 1) {
    if (num % counter == 0) {
      sol = counter
      num /= counter
    }
    else {
      counter += 1
    }
  }
  return sol
}

var num = 600851475143
console.log(my_largest_prime(num)) //  expecting 6857
