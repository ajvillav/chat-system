package ejercicio.sebastianyjohan;

public class User implements IUser {

    private Channel channel;
    private String name;
    public String message;

    public User(String name, Channel channel) {
        this.channel = channel;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public void update(String context, String channelName) {
        System.out.println(name+" recibió el mensaje: '" + context + "' de la lista: '" + channelName + "'");
    }

    @Override
    public void sendMessage(String messageContent, String channelName) {
        System.out.println(this.name + " escribió: '" +
                messageContent + "' en la lista: '" + channelName + "'");
        this.channel.setLastMessage(messageContent);
        this.message = messageContent;
    }
}