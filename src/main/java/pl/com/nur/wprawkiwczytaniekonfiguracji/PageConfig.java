package pl.com.nur.wprawkiwczytaniekonfiguracji;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "page-config")
public class PageConfig {
    private String author;
    private int creationData;  // zmienne muszą mic dokładnie tą nazwę co w application.properties
    private String nick;


    @EventListener(ApplicationReadyEvent.class)
    public void printConfig(){
        System.out.println(author);
        System.out.println(creationData);
        System.out.println(nick);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCreationData() {
        return creationData;
    }

    public void setCreationData(int creationData) {
        this.creationData = creationData;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
}
