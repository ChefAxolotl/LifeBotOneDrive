package main;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class NachrichtenReaktion extends ListenerAdapter {

    public void onMessageReceived (MessageReceivedEvent ereignis) {

        if (ereignis.isFromGuild()) {

            if (ereignis.getMessage().getContentStripped().equals("!hilfe")) {

                EmbedBuilder builder = new EmbedBuilder();

                builder.setTitle("Gib einen genaueren Commands an!");
                builder.setDescription("**``Der Prefix für den Bot ist !.``**");
                builder.setColor(0x217bdb);

                builder.setThumbnail("https://cdn.discordapp.com/attachments/921107780734164992/974758484614721607/unterstutzung.png");
                builder.addField("Commands | \uD83D\uDD0C", "```!help commands```", false);
                builder.addField("Music | \uD83D\uDCFB", "```!help music```", false);
                builder.setImage("https://cdn.discordapp.com/attachments/1149285863239458826/1149289008275398727/UnterstrichDunnBlau.png");

                ereignis.getChannel().sendMessageEmbeds(builder.build()).queue();

            } else if (ereignis.getMessage().getContentStripped().equals("!help commands")) {

                EmbedBuilder builder = new EmbedBuilder();

                builder.setTitle("Diese Commands sind verfügbar.");
                builder.setDescription("**Versuche:**");
                builder.setColor(0x217bdb);

                builder.setThumbnail("https://cdn.discordapp.com/attachments/1149285863239458826/1149332623596982365/unterstutzung.png");
                builder.addField("Acc Erstellungsdatum", "```!created```", false);
                builder.addField("Benutzerinfo", "```!userinfo```", false);
                builder.setImage("https://cdn.discordapp.com/attachments/1149285863239458826/1149289008275398727/UnterstrichDunnBlau.png");

                ereignis.getChannel().sendMessageEmbeds(builder.build()).queue();

            }

        }

        }

    }

