package Embeds;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class teaminfo extends ListenerAdapter {

    public void onMessageReceived (MessageReceivedEvent ereignis) {

        Member member = ereignis.getMember();


        if (ereignis.getMessage().getContentStripped().equals("!teaminfo20123")) {

            EmbedBuilder banner = new EmbedBuilder();
            banner.setColor(0x31AEE8);
            banner.setImage("https://cdn.discordapp.com/attachments/1149285863239458826/1149287548586299492/TeamInfoBanner.png");


            EmbedBuilder builder = new EmbedBuilder();
            builder.setColor(0x31AEE8);

            builder.setThumbnail("https://cdn.discordapp.com/attachments/1149285863239458826/1149332613480325150/sprachen.png");
            builder.setTitle("\uD83D\uDCDA│Teaminfo von Life");
            builder.setImage("https://cdn.discordapp.com/attachments/1149285863239458826/1149289008275398727/UnterstrichDunnBlau.png");
            builder.setDescription("**\uD83D\uDCCC│Allgemeine Informationen\n**" +
                    "\n" +
                    "> **•** Lies dir deine Informationen für deinen Teambereich durch.\n" +
                    "> **•** Halte dich an deinen Teambereich, nutze keine Rechte aus.\n" +
                    "> **•** Der <#921114377933975614> ist für Besprechungen im Team.\n" +
                    "\n" +
                    "**<:icons8zwietracht500:1150882523740635258>│Infos für das Discord Server Team.\n**" +
                    "\n" +
                    "**➜** Nutzung von Timeouts, Warnungen, Banns und Kicks.\n" +
                    "\n" +
                    "**10 min Timeout + eine Warnung bei:**\n" +
                    "\n" +
                    "> **•** Channel hopping, Nutzung von Stimmverzerrern/Soundboards.\n" +
                    "> **•** Werbung aller Art, Spamm, Beleidigungen\n" +
                    "\n" +
                    "**1h Timeout + eine Warnung bei:**\n" +
                    "\n" +
                    "> **•** Rassismus oder Verbreitungen von 18+ Inhalten.\n" +
                    "\n" +
                    "**Bann oder Kick bei:**\n" +
                    "\n" +
                    "> **•** 3-5 Warnungen, kommt auf den Regelverstoß drauf an.\n" +
                    "\n" +
                    "**➜** Infos für die **<@&914233508669562901>** Rolle.\n" +
                    "\n" +
                    "> **•** Als Helper solltest du an Erster stelle Tickets bearbeiten.\n" +
                    "> **•** Versuche Konflikte zwischen anderen zu lösen.\n" +
                    "> **•** Falls sich jemand unangemessen verhalten sollte, kannst du diese Person Timeouten.\n" +
                    "\n" +
                    "**➜** Infos für die **<@&914225980577562625>** Rolle.\n" +
                    "\n" +
                    "> **•** Als Moderator solltest du auch Tickets bearbeiten.\n" +
                    "> **•** Als Moderator solltest du Chats und Sprachkanäle überwachen.\n" +
                    "> **•** Versuche Konflikte zwischen anderen zu lösen.\n" +
                    "> **•** Falls sich jemand unangemessen verhalten sollte, kannst du diese Person Timeouten.\n" +
                    "> **•** Ab 3 Warnugnen auch Kicken oder Bannen.\n" +
                    "\n" +
                    "**➜** Infos für die **<@&1029083194202529933>** Rolle.\n" +
                    "\n" +
                    "> **•** Als Team Leiter solltest du auch Tickets bearbeiten.\n" +
                    "> **•** Falls sich jemand unangemessen verhalten sollte, kannst du diese Person Timeouten.\n" +
                    "> **•** Ab 3 Warnugnen auch Kicken oder Bannen.\n" +
                    "> **•** Du solltest regelmäßig (LIFE) Team Checks durchführen.\n" +
                    "> **•** Du darfst auch Leute aus dem Team ausschließen und neue Leute aufnehmen.\n" +
                    "\n" +
                    "**<:icons8valorant5001:1143885966436741120>│Infos für das Valorant LIFE Team.\n**" +
                    "\n" +
                    "**➜** Infos für die **<@&1011287688164409425>** Rolle.\n" +
                    "\n" +
                    "> **•** Du solltest den Discord Server Aktiv benutzen.\n" +
                    "> **•** Du solltest auch Aktiv mit anderen LIFE Team Mitgliedern Spielen.\n" +
                    "> **•** Du solltest den Discord Server Aktiv benutzen.\n" +
                    "> **•** Der main Channel für Ranked um nicht gestört zu werden ist <#1011286551277346897>.\n" +
                    "> **•** Es gibt auch einen <#1038906705444077638>.\n");


            ereignis.getChannel().sendMessageEmbeds(banner.build()).queue();
            ereignis.getChannel().sendMessageEmbeds(builder.build()).queue();

        }

    }

}