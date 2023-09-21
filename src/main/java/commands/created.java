package commands;

import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.time.OffsetDateTime;

public class created extends ListenerAdapter {

    public void onMessageReceived(MessageReceivedEvent event) {

        Member mentioned;

        String[] args = event.getMessage().getContentStripped().split(" ");

        if (event.getMessage().getContentStripped().startsWith("!created")) {

            if (!event.getMessage().getMentionedMembers().isEmpty()) {

                mentioned = event.getMessage().getMentionedMembers().get(0);

                OffsetDateTime time = mentioned.getUser().getTimeCreated();

                event.getChannel().sendMessage("<t." + time.toInstant().getEpochSecond() + ":R>").queue();

            } else {

                mentioned = event.getMember();

                OffsetDateTime time = mentioned.getUser().getTimeCreated();

                event.getChannel().sendMessage("<t:" + time.toInstant().getEpochSecond() + ":R>").queue();

                event.getChannel().sendTyping().queue();

            }

        }

    }

}