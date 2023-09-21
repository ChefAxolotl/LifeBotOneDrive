package willkommen;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class wilkommensnachrichtmitembed extends ListenerAdapter {
@Override
    public void onGuildMemberJoin (GuildMemberJoinEvent event) {

        User user = event.getUser();

        EmbedBuilder banner = new EmbedBuilder();
        banner.setColor(0x31AEE8);
        banner.setImage("https://cdn.discordapp.com/attachments/921107780734164992/974773273294417940/BannerWilkommen.png");

        EmbedBuilder embed = new EmbedBuilder();
        embed.setColor(0x31AEE8);

        embed.setTitle("<:4481plus:970040702287356014>┃Willkommen");
        embed.setDescription("**Hey, **" + user.getAsMention() + "**! Willkommen auf \uD83C\uDF10・\uD835\uDD43\uD835\uDD40\uD835\uDD3D\uD835\uDD3C・\uD83C\uDF10**" +
                "\n" +
                "\n" +
                "<:Discord_Rules_Channel:954499941089280011> • ``Regelwerk:``\n" +
                "<#905011005350875157>\n" +
                "\n" +
                "<:8744specialroles:970040899419664384> • ``Profil:``\n" +
                "<#914545532813316186>\n" +
                "\n" +
                "Viel Spaß auf dem Server!");
        embed.setImage("https://cdn.discordapp.com/attachments/975102657125564487/976920352041107517/Unterstrich.png");
        embed.setThumbnail("https://cdn.discordapp.com/attachments/975102657125564487/976928962401935410/add.png");



        event.getGuild().getTextChannelById("976932527191248916").sendMessageEmbeds(banner.build()).queue();
        event.getGuild().getTextChannelById("976932527191248916").sendMessageEmbeds(embed.build()).queue();

    }

}