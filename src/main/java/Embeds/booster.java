package Embeds;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class booster extends ListenerAdapter {

    public void onMessageReceived (MessageReceivedEvent ereignis) {

        Member member = ereignis.getMember();


        if (ereignis.getMessage().getContentStripped().equals("booster!!12")) {

            EmbedBuilder banner = new EmbedBuilder();
            banner.setColor(0x31AEE8);
            banner.setImage("https://cdn.discordapp.com/attachments/921107780734164992/977989141163814982/BoosterBannernew.png");


            EmbedBuilder builder = new EmbedBuilder();
            builder.setColor(0x31AEE8);

            builder.setThumbnail("https://cdn.discordapp.com/attachments/921107780734164992/977984456533110784/icons8-rocket-96.png");
            builder.setTitle("<:booster:976931159776849942>│Booster werden auf LIFE");
            builder.setImage("https://cdn.discordapp.com/attachments/980881618522742794/1038753681379704852/UnterstrichDunnBlau.png");
            builder.setDescription("Wenn du unseren Server boostest währe das ein vorteil für uns und für dich. Als Dankeschön erhälst du Exklusive Vorteile.\n" +
                    "\n" +
                    "**Vorteile mit einem Boost.**\n" +
                    "\n" +
                    "> **•** Du erhältst die Boosterrolle.\n" +
                    "> **•** Du kannst Threads erstellen.\n" +
                    "> **•** Du erhältst 25% mehr LevelXP.\n" +
                    "\n" +
                    "**Vorteile mit zwei Boosts**\n" +
                    "\n" +
                    "> **•** Du erhältst eine custom rolle deiner wahl. (gleiche rechte als V.I.P) deine Rolle wird über LIFE Clan Mitgliedern angezeigt.\n");


            ereignis.getChannel().sendMessageEmbeds(banner.build()).queue();
            ereignis.getChannel().sendMessageEmbeds(builder.build()).queue();

        }

    }

}
