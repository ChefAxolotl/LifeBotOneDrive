package Embeds;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class serverinfo extends ListenerAdapter {

    public void onMessageReceived (MessageReceivedEvent ereignis) {

        Member member = ereignis.getMember();


        if (ereignis.getMessage().getContentStripped().equals("!sererinfo20123")) {

            EmbedBuilder banner = new EmbedBuilder();
            banner.setColor(0x31AEE8);
            banner.setImage("https://cdn.discordapp.com/attachments/1149285863239458826/1149287504445456414/LIFEBanner.png");


            EmbedBuilder builder = new EmbedBuilder();
            builder.setColor(0x31AEE8);

            builder.setThumbnail("https://cdn.discordapp.com/attachments/1149285863239458826/1149332613480325150/sprachen.png");
            builder.setTitle("\uD83D\uDCDA│Teaminfo von Life");
            builder.setImage("https://cdn.discordapp.com/attachments/1149285863239458826/1149289008275398727/UnterstrichDunnBlau.png");
            builder.setDescription("**\uD83D\uDCEF│Ankündigungen\n**" +
                    "\n" +
                    "> **•** <#905018547133112370> Hier wirst du auf dem Neustem stand gehalten.\n" +
                    "\n" +
                    "**\uD83D\uDCDA│Regelwerk\n**" +
                    "\n" +
                    "> **•** Alle Regeln findest du hier <#905011005350875157>.\n" +
                    "\n" +
                    "**\uD83D\uDCB8│Gewinnspiele\n**" +
                    "\n" +
                    "> **•** <#930117458201817199> Hier kannst du ab und zu an gewinnspielen teil nehmen.\n" +
                    "\n" +
                    "**\uD83D\uDCCA│Umfragen\n**" +
                    "\n" +
                    "> **•** <#1051164943103311932> Hier kannst du Serververbesserungen vorschlagen und auch für andere Vorschläge abstimmen.\n" +
                    "\n" +
                    "**\uD83D\uDD0C│Commands\n**" +
                    "\n" +
                    "> **•** <#905067174748618782> Dies ist ein Kanal für Commands.\n" +
                    "> **•** Verwende dießen Kanal bitte nur für Commands!!!\n" +
                    "\n" +
                    "\uD83D\uDE80│Booster\n" +
                    "\n" +
                    "> **•** <#977960367353368626> Hier werden alle Leute im Chat angezeigt die den Server Boosten.\n" +
                    "\n" +
                    "**\uD83D\uDCDD│Bewerbung\n**" +
                    "\n" +
                    "> **•** Um dich für unser Team zu Bewerben benötigst du die Rolle LvL 5 und min. 2 Serverinvites.\n" +
                    "> **•** Um dich zu Bewerben findest du bei <#981173356772622356> mehr infos zur Bewerbung.\n" +
                    "\n" +
                    "\uD83C\uDF77│Chilli Milli Room\n" +
                    "\n" +
                    "> **•** <#964147402233749594> Dies ist der main voice channel, alle sind Willkommen\n" +
                    "\n" +
                    "**➕│Join2Create & ⚙│Tempchannel\n**" +
                    "\n" +
                    "> **•** Wenn du <#1032258970179604520> joinst erstellst du einen eigenen & temporären Sprach Kanal.\n" +
                    "> **•** In dem <#1032258971869904896> Kanal kannst du deinen eigenen Sprach Kanal konfigurieren.\n");


            ereignis.getChannel().sendMessageEmbeds(banner.build()).queue();
            ereignis.getChannel().sendMessageEmbeds(builder.build()).queue();

        }

    }

}