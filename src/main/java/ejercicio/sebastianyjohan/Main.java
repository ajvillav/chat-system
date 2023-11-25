package ejercicio.sebastianyjohan;

public class Main {
    public static void main(String[] args) {
        Channel channel1 = new Channel("Fans de Mia Kalifa");
        User user1 = new User("Sebastian", channel1);
        User user2 = new User("Johan", channel1);
        User user3 = new User("Villa", channel1);

        channel1.subscribe(user1);
        channel1.subscribe(user2);
        channel1.subscribe(user3);

        user1.sendMessage("Hola chicos, soy Sebastian", channel1.getChannelName());
    }
}