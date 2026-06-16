package DesignPatterns;

public class ObserverMain {
    public static void main(String[] args) {
        NotificationService notificationService=new NotificationService();
        Observer email=new EmailService();
        notificationService.subsrcibe(email);
        notificationService.sendNotification("Transaction Successful");
    }
}
