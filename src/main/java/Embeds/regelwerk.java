package Embeds;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class regelwerk extends ListenerAdapter {

    public void onMessageReceived (MessageReceivedEvent ereignis) {

        Member member = ereignis.getMember();


        if (ereignis.getMessage().getContentStripped().equals("regelwerk#2008")) {

            EmbedBuilder banner = new EmbedBuilder();
            banner.setColor(0x31AEE8);
            banner.setImage("https://cdn.discordapp.com/attachments/1149285863239458826/1149287528348798976/RegelwerkBanner.png");


            EmbedBuilder builder = new EmbedBuilder();
            builder.setColor(0x31AEE8);

            builder.setThumbnail("https://cdn.discordapp.com/attachments/1149285863239458826/1149332550351855686/gesetzbuch.png");
            builder.setTitle("\uD83D\uDCDA│Regelwerk auf Life");
            builder.setImage("https://cdn.discordapp.com/attachments/1149285863239458826/1149289008275398727/UnterstrichDunnBlau.png");
            builder.setDescription("**§1 <:voice_emoji:954500064435384450>│Verhalten in Sprachkanälen.\n**" +
                    "\n" +
                    "> **•** Immer Höflich sein.\n" +
                    "> **•** Kein Channel hopping.\n" +
                    "> **•** Keine Nutzung von Stimmverzerrern oder Soundboards.\n" +
                    "> **•** Kein Rassismus.\n" +
                    "\n" +
                    "**§2 <:locked_textchannel:954500246157791282>│Verhalten In Textkanählen.\n**" +
                    "\n" +
                    "> **•** Immer Höflich sein.\n" +
                    "> **•** Keine Schimpfwörter.\n" +
                    "> **•** Kein Spamm von Textnachrichten.\n" +
                    "> **•** Keine Verbreitungen von 18+ Inhalten.\n" +
                    "> **•** Kein Links.\n" +
                    "> **•** Keine Werbung aller art.\n" +
                    "\n" +
                    "**§3 <:ban_hammer:954500828788572180>│Nutzung von Rechten.\n**" +
                    "\n" +
                    "> **•** Nutzung der Rechte nur für ihren Aufgabenbereich.\n" +
                    "> **•** Rechte Dürfen nicht ausgenutzt werden.\n");


            ereignis.getChannel().sendMessageEmbeds(banner.build()).queue();
            ereignis.getChannel().sendMessageEmbeds(builder.build()).queue();

        }

    }

}
