import java.util.List;

public class FizzBuzz {
    
    public static String genFizzBuzz(List<int[]> rules, int num) {
        // rules: List of arrays where each array is [factor, word]
        // But since Java doesn't allow mixed types easily, we'll use a custom class or Pair.
        // Here's a clean version using a list of objects.

        StringBuilder result = new StringBuilder();

        for (Rule rule : rules) {
            if (num % rule.factor == 0) {
                result.append(rule.word);
            }
        }

        return result.length() > 0 ? result.toString() : String.valueOf(num);
    }

    // Helper class to represent a rule
    static class Rule {
        int factor;
        String word;

        Rule(int factor, String word) {
            this.factor = factor;
            this.word = word;
        }
    }

    // Example usage
    public static void main(String[] args) {
        List<Rule> rules1 = List.of(
            new Rule(3, "Fizz"),
            new Rule(5, "Buzz")
        );

        List<Rule> rules2 = List.of(
            new Rule(3, "Buzz"),
            new Rule(5, "Fizz")
        );

        List<Rule> rules3 = List.of(
            new Rule(3, "Fizz"),
            new Rule(5, "Buzz"),
            new Rule(7, "Baxx")
        );

        System.out.println(genFizzBuzz(rules1, 6));      // Fizz
        System.out.println(genFizzBuzz(rules1, 10));     // Buzz
        System.out.println(genFizzBuzz(rules2, 15));     // BuzzFizz
        System.out.println(genFizzBuzz(rules1, 15));     // FizzBuzz
        System.out.println(genFizzBuzz(rules3, 105));    // FizzBuzzBaxx
        System.out.println(genFizzBuzz(rules1, 13));     // 13
    }
}
