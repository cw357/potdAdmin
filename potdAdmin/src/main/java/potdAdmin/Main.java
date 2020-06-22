package potdAdmin;
import discord4j.core.*;
import discord4j.core.event.domain.lifecycle.ReadyEvent;
import discord4j.core.object.entity.User;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Main {

	public static void main(String[] args) {
		GatewayDiscordClient client = DiscordClientBuilder.create("NzIzNzI5OTkyODEwMzY1MDI4.XvDE8Q.H5VAxxaQ3QvQWqwH4abtR5rw3GM")
                .build()
                .login()
                .block();
		client.getEventDispatcher().on(ReadyEvent.class)
        .subscribe(event -> {
          User self = event.getSelf();
          System.out.println(String.format("Logged in as %s#%s", self.getUsername(), self.getDiscriminator()));
        });

        client.onDisconnect().block();
	}

	static void initializeApplet() {
		
	}
}
