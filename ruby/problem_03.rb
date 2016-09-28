# Largest prime factor
# Problem 3
# The prime factors of 13195 are 5, 7, 13 and 29.
#
# What is the largest prime factor of the number 600851475143 ?

def my_largest_prime(num)
  counter = 2
  until num == 1
    if num % counter == 0
      sol = counter
      num /= counter
    else
      counter += 1
    end
  end
  return sol
end

num = 600851475143
puts my_largest_prime(num) #  expecting 6857
