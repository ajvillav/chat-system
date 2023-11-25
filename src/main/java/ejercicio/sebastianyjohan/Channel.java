package ejercicio.sebastianyjohan;

import java.util.LinkedList;
import java.util.List;

public class Channel {
    private String channelName;
    private String lastMessage;
    private List<IUser> subscribers;

    public Channel(String channelName) {
        this.channelName = channelName;
        subscribers = new LinkedList<>();
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
        notifySubscribers();
    }

    public String getChannelName() {
        return channelName;
    }

    public void subscribe (IUser s) {
        subscribers.add(s);
    }

    public void unsubscribe(IUser s) {
        subscribers.remove(s);
    }

    private void notifySubscribers() {
        for(IUser user: subscribers) {
            user.update(this.lastMessage,this.getChannelName());
        }
    }
}