package willkommen;

import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.guild.member.GuildMemberRemoveEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class verlassen extends ListenerAdapter {
@Override
    public void onGuildMemberRemove (GuildMemberRemoveEvent event) {

        User user = event.getUser();

        event.getGuild().getTextChannelById("976932627158302770").sendMessage(user.getAsMention() + " hat den Server verlassen! <:icons8rocket96:976931159776849942>").queue();

    }

}