def three_and_five(n)
  Array(1...n).reduce(0) do |sum, x|
    x % 3 == 0 || x % 5 == 0 ? sum += x : sum
  end
end

puts three_and_five(4) #  expecting 3
puts three_and_five(6) # expecting 8
puts three_and_five(7) # expecting 14
puts three_and_five(1000) # expecting 233168
