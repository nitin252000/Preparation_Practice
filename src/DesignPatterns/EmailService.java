package DesignPatterns;

public class EmailService implements Observer{

    @Override
    public void update(String message) {
        System.out.println("Email Received "+message);
    }
}
