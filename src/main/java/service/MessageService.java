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
    }

    public static void updateMessage() {
    }
}
