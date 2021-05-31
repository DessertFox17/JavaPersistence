import connection.DBConnection;
import service.MessageService;

import java.sql.Connection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int option = 0;

        do {
            System.out.println("-----------------");
            System.out.println(" Messenger Application");
            System.out.println(" 1. Create a new message");
            System.out.println(" 2. Get all messages");
            System.out.println(" 3. Edit a message");
            System.out.println(" 4. Delete a message");
            System.out.println(" 5. Exit");
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
                    break;
            }
        }while(option != 5);

        }
    }
