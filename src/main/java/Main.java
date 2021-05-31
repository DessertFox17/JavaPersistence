import service.MessageService;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int option = 0;

        do {
            System.out.println("\n------------------------------");
            System.out.println(" Messenger Application");
            System.out.println("------------------------------");
            System.out.println(" 1. Create a new message");
            System.out.println(" 2. Get all messages");
            System.out.println(" 3. Edit a message");
            System.out.println(" 4. Delete a message");
            System.out.println(" 5. Exit");
            System.out.println("------------------------------");
            System.out.print("-> ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    MessageService.createMessage();
                    break;
                case 2:
                    MessageService.getMessages();
                    break;
                case 3:
                    MessageService.updateMessage();
                    break;
                case 4:
                    MessageService.deleteMessage();
                    break;
                default:
                    System.out.println("Please insert a valid option\n");
                    break;
            }
        }while(option != 5);

        }
    }
