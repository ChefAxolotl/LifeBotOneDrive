package Embeds;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class bewerbung extends ListenerAdapter {

    public void onMessageReceived (MessageReceivedEvent ereignis) {

        Member member = ereignis.getMember();


        if (ereignis.getMessage().getContentStripped().equals("bewerbungxD2010")) {

            EmbedBuilder banner = new EmbedBuilder();
            banner.setColor(0x31AEE8);
            banner.setImage("https://cdn.discordapp.com/attachments/1149285863239458826/1149287555863420929/Ticket-BewerbungBanner.png");


            EmbedBuilder builder = new EmbedBuilder();
            builder.setColor(0x31AEE8);

            builder.setThumbnail("https://cdn.discordapp.com/attachments/1149285863239458826/1149332623596982365/unterstutzung.png");
            builder.setTitle(":bookmark_tabs:│Bewerbungen für LIFE");
            builder.setImage("https://cdn.discordapp.com/attachments/1149285863239458826/1149289008275398727/UnterstrichDunnBlau.png");
            builder.setDescription("**\uD83D\uDCCC│Allgemeine Informationen\n**" +
                    "\n" +
                    "> **•** Um dich zu bewerben musst du ein <#914155459852795914> erstellen.\n" +
                    "> **•** Wenn du dich Erfolgreich Beworben hast bekommst du zugriff auf eine extra Team Kategorie.\n" +
                    "> **•** In dieser Kategorie findet du den <#977954510796357642> Kanal.\n" +
                    "> **•** Hier erfährst du über deine Rechte.\n" +
                    "\n" +
                    "**<:icons8zwietracht500:1150882523740635258>│Bewerbung für das Discord Server Team.\n**" +
                    "\n" +
                    "> **•** Du musst mindestens 14 Jahre Alt sein.\n" +
                    "> **•** Du benötigst das 5.XP Level auf dießem Server.\n" +
                    "> **•** Erzähle uns wofür/warum du ins Team möchtest.\n" +
                    "> **•** Gib uns ein Paar Infos über dich (Name, Alter, Stärken, Schwächen, Interessen).\n" +
                    "> **•** Sag uns wie viel zeit du durchschnittlich am PC verbringst oder du Mitgliedern Helfen kannst.\n" +
                    "\n" +
                    "**<:icons8valorant5001:1143885966436741120>│Bewerbung für das Valorant LIFE Team.\n**" +
                    "\n" +
                    "> **•** Du musst mindestens 13 Jahre Alt sein.\n" +
                    "> **•** Du benötigst das 5.XP Level auf dießem Server.\n" +
                    "> **•** Du musst mindesten Bronze sein.\n" +
                    "> **•** Du solltest den LIFE Discord aktiv benutzen.\n" +
                    "> **•** Wenn du dem Team beitreten willst musst du vor deinen Valorant namen **LIFE** schreiben.\n" +
                    "\n" +
                    "**<:icons8minecraft500:1150883047525339276>│Bewerbung für das Minecraft Server Team.\n**" +
                    "\n" +
                    "> **•** Du musst mindestens 14 Jahre Alt sein.\n" +
                    "> **•** Du benötigst das 5.XP Level auf dießem Server.\n" +
                    "> **•** Erzähle uns wofür/warum du ins Team möchtest.\n" +
                    "> **•** Gib uns ein Paar Infos über dich (Name, Alter, Stärken, Schwächen, Interessen).\n" +
                    "> **•** Sag uns wie viel zeit du durchschnittlich am PC verbringst oder du Mitgliedern Helfen kannst.\n" +
                    "> **•** Sag uns worin deine stärken in Minecraft liegen.\n");


            ereignis.getChannel().sendMessageEmbeds(banner.build()).queue();
            ereignis.getChannel().sendMessageEmbeds(builder.build()).queue();

        }

    }

}