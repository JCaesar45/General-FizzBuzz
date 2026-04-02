def genFizzBuzz(rules, num):
    result = ""
    
    for factor, word in rules:
        if num % factor == 0:
            result += word
    
    return result if result else str(num)


# Test cases
print(genFizzBuzz([[3, "Fizz"], [5, "Buzz"]], 6))      # Fizz
print(genFizzBuzz([[3, "Fizz"], [5, "Buzz"]], 10))     # Buzz
print(genFizzBuzz([[3, "Buzz"], [5, "Fizz"]], 15))     # BuzzFizz
print(genFizzBuzz([[3, "Fizz"], [5, "Buzz"]], 15))     # FizzBuzz
print(genFizzBuzz([[3, "Fizz"], [5, "Buzz"], [7, "Baxx"]], 105))  # FizzBuzzBaxx
print(genFizzBuzz([[3, "Fizz"], [5, "Buzz"]], 13))     # 13
