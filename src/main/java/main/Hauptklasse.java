package main;

import Embeds.*;
import commands.created;
import commands.userinfo;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.utils.ChunkingFilter;
import net.dv8tion.jda.api.utils.MemberCachePolicy;
import willkommen.verlassen;
import willkommen.wilkommensnachrichtmitembed;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class Hauptklasse {

    public static void main(String[] args) throws LoginException {

        //

        String prefix = "!";

        System.out.println(prefix);

        String status;
        status = "test";

        String token = "OTY1MjE4Mzc4MDU2ODgwMTI5.GyZaWY.YxDLE7c-wYquOh0BTiWjLjbnMuIK3qtUAClyZs";

        JDABuilder builder = JDABuilder.createDefault(token);

        builder.setStatus(OnlineStatus.DO_NOT_DISTURB);
        builder.setActivity(Activity.streaming("auf \uD83C\uDF00・LIFE・\uD83C\uDF00 " , "https://www.twitch.tv/chef_axolotl"));


        builder.setChunkingFilter(ChunkingFilter.ALL);
        builder.setMemberCachePolicy(MemberCachePolicy.ALL);
        builder.enableIntents(GatewayIntent.GUILD_MEMBERS, GatewayIntent.GUILD_PRESENCES, GatewayIntent.GUILD_VOICE_STATES, GatewayIntent.DIRECT_MESSAGE_TYPING, GatewayIntent.DIRECT_MESSAGES);


        builder.addEventListeners(new userinfo());
        builder.addEventListeners(new NachrichtenReaktion());
        builder.addEventListeners(new created());
        builder.addEventListeners(new regelwerk());
        builder.addEventListeners(new booster());
        builder.addEventListeners(new serverinfo());
        builder.addEventListeners(new bewerbung());
        builder.addEventListeners(new teaminfo());

        JDA bot = builder.build();

        System.out.println("Der Bot ist Erfolgreich gestratet");

    }

}