# Multiples of 3 and 5
# Problem 1
# If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
#
# Find the sum of all the multiples of 3 or 5 below 1000.

def three_and_five(n):
    return sum([y for y in range(n) if y % 3 == 0 or y % 5 == 0])


# def three_and_five(n):
#     nums = range(n)
#     sol_array = []
#     for num in nums:
#         if num % 3 == 0 or num % 5 == 0:
#             sol_array.append(num)
#     return sum(sol_array)


print(three_and_five(4))
print(three_and_five(6))
print(three_and_five(1000))
