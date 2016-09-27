# Largest prime factor
# Problem 3
# The prime factors of 13195 are 5, 7, 13 and 29.
#
# What is the largest prime factor of the number 600851475143 ?

def my_largest_prime(num):
    counter = 2
    sol = []
    while num != 1:
        if num % counter == 0:
            num /= counter
            if counter not in sol:
                sol.append(counter)
            counter = 2
        else:
            counter += 1

    sol.sort()
    return sol[-1]

num = 600851475143
print(my_largest_prime(21)) #  expecting 7
print(my_largest_prime(100)) #  expecting 5
print(my_largest_prime(num)) #  expecting 6857
