import java.util.Random;
import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Amazon Chat Bot. Type 'exit' to end the conversation.");
        while (true) {
            System.out.print("You: ");
            String query = scanner.nextLine().toLowerCase();
            String response = getResponse(query);
            System.out.println("Bot: " + response);
            if (query.equals("exit")) {
                break;
            }
        }
    }

    public static String getResponse(String query) {
        if (query.contains("hello") || query.contains("hi")) {
            return "Hello! How can I help you today?";
        } else if (query.contains("product")) {
            return "To find a product, please visit the Amazon website and use the search bar.";
        } else if (query.contains("order")) {
            return "To track your order, please visit the 'Your Orders' section on the Amazon website.";
        } else if (query.contains("delivery")) {
            return "For delivery inquiries, please check the tracking information provided for your order.";
        } else if (query.contains("payment")) {
            return "For payment issues, please contact Amazon customer service for assistance.";
        } else if (query.contains("return")) {
            return "To initiate a return, please visit the 'Returns & Orders' section on the Amazon website.";
        } else if (query.contains("contact")) {
            return "You can contact Amazon customer service at 1-888-280-4331.";
        } else if (query.equals("exit")) {
            return "Goodbye! Have a great day.";
        } else {
            String[] responses = {
                "I'm sorry, I didn't understand your query.",
                "Could you please provide more details?",
                "I'm here to help. What can I assist you with?"
            };
            Random random = new Random();
            return responses[random.nextInt(responses.length)];
        }
    }
}