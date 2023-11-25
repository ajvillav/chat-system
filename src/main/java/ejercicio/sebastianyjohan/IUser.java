package ejercicio.sebastianyjohan;

public interface IUser {

    public String getName();
    public String getMessage();
    public void update(String context, String channelName);
    public void sendMessage(String context, String channelName);
}

