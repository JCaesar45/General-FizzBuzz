function genFizzBuzz(rules, num) {
    let result = "";

    for (let [factor, word] of rules) {
        if (num % factor === 0) {
            result += word;
        }
    }

    // If no rules matched, return the number as string
    return result || num.toString();
}

// Test cases
console.log(genFizzBuzz([[3, "Fizz"], [5, "Buzz"]], 6));     // "Fizz"
console.log(genFizzBuzz([[3, "Fizz"], [5, "Buzz"]], 10));    // "Buzz"
console.log(genFizzBuzz([[3, "Buzz"], [5, "Fizz"]], 15));    // "BuzzFizz"
console.log(genFizzBuzz([[3, "Fizz"], [5, "Buzz"]], 15));    // "FizzBuzz"
console.log(genFizzBuzz([[3, "Fizz"], [5, "Buzz"], [7, "Baxx"]], 105)); // "FizzBuzzBaxx"
console.log(genFizzBuzz([[3, "Fizz"], [5, "Buzz"]], 13));    // "13"
