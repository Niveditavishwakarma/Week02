 public class IsPalindrome{
	 public static void main(String[] args) {
        PalindromeChecker checker1 = new PalindromeChecker("Racecar");
        checker1.displayResult();

        PalindromeChecker checker2 = new PalindromeChecker("OpenAI");
        checker2.displayResult();

        PalindromeChecker checker3 = new PalindromeChecker("Was it a car or a cat I saw");
        checker3.displayResult();
    }
}
 
 class PalindromeChecker {
    private String text;

    // Constructor 
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        String cleanedText = text.replaceAll("\\s+", "").toLowerCase();
        String reversedText = new StringBuilder(cleanedText).reverse().toString();
        return cleanedText.equals(reversedText);
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }
}
	

