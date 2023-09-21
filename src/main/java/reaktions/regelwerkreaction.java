package reaktions;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.message.react.MessageReactionAddEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Member;

public class regelwerkreaction extends ListenerAdapter {

    public void performCommand(Member m, TextChannel channel, Message message) {

        String[] args = message.getContentStripped().split(" ");

    }
}
