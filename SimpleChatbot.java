import java.util.Scanner;

public class SimpleChatbot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        System.out.println("🤖 Chatbot: Hello! I’m your friendly Java chatbot. Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            userInput = scanner.nextLine().toLowerCase(); // convert to lowercase for easier comparison

            if (userInput.contains("hi") || userInput.contains("hello")) {
                System.out.println("🤖 Chatbot: Hi there! How can I help you today?");
            } 
            else if (userInput.contains("how are you")) {
                System.out.println("🤖 Chatbot: I'm just a program, but I'm doing great! What about you?");
            } 
            else if (userInput.contains("your name")) {
                System.out.println("🤖 Chatbot: I'm CodeAlpha Chatbot, created using Java!");
            } 
            else if (userInput.contains("time")) {
                System.out.println("🤖 Chatbot: The current system time is " + java.time.LocalTime.now());
            } 
            else if (userInput.contains("date")) {
                System.out.println("🤖 Chatbot: Today’s date is " + java.time.LocalDate.now());
            } 
            else if (userInput.contains("bye")) {
                System.out.println("🤖 Chatbot: Goodbye! Have a great day!");
                break;
            } 
            else {
                System.out.println("🤖 Chatbot: Sorry, I didn’t understand that. Can you please rephrase?");
            }
        }

        scanner.close();
    }
}