package service;

import dao.MessageDAO;
import model.Message;

import java.io.IOException;
import java.util.Scanner;

public class MessageService {

    public static void createMessage() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nType your message here");
        System.out.print("-> ");
        String message = sc.nextLine();

        System.out.println("Type your name here");
        System.out.print("-> ");
        String author = sc.nextLine();

        Message newMessage = new Message();
        newMessage.setMessage(message);
        newMessage.setM_author(author);
        MessageDAO.createMessage(newMessage);
    }

    public static void getMessages() {
        MessageDAO.getMessages();
    }

    public static void deleteMessage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nType the message id to delete here");
        System.out.print("-> ");
        int id = sc.nextInt();
        MessageDAO.deleteMessage(id);
    }

    public static void updateMessage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nType the message to update here");
        System.out.print("-> ");
        String message = sc.nextLine();

        System.out.println("Type the message id to update here");
        System.out.print("-> ");
        int id = sc.nextInt();



        Message updateMessage = new Message();
        updateMessage.setMessage_id(id);
        updateMessage.setMessage(message);
        MessageDAO.updateMessage(updateMessage);
    }
}
