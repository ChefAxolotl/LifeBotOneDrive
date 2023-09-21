package commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class userinfo extends ListenerAdapter {

    public void onMessageReceived (MessageReceivedEvent ereignis) {


        Member member = ereignis.getMember();


        if (ereignis.getMessage().getContentStripped().equals("!userinfo")) {

            EmbedBuilder builder = new EmbedBuilder();

            String.class.getClasses();

            builder.setTitle(":busts_in_silhouette:│USER INFORMATION│:busts_in_silhouette:");
            builder.setColor(0x31AEE8);

            builder.setThumbnail(member.getEffectiveAvatarUrl());
            builder.addField("", "", false);
            builder.addField("Nickname│<:Members:954111264186048574>", "```" + member.getNickname() + "```", false);
            builder.addField("", "", false);
            builder.addField("Username│<:Members:954111264186048574>", "```" + member.getUser().getAsTag() + "```", true);
            builder.addField("UserID│<:Members:954111264186048574>", "```ID: " + member.getId() + "```", true);
            builder.addField("", "", false);
            builder.addField("Dem Server Beigetreten│<:plus_8333955:1150386168224022608>", "```" + member.getTimeJoined() + "```", false);
            builder.addField("", "", false);



            builder.addField("Den Account erstellt│<:plus_8333955:1150386168224022608>","```" + member.getTimeCreated() + "```", false);

            ereignis.getChannel().sendMessageEmbeds(builder.build()).queue();

        }

    }

}
