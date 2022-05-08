package wizn.kitip.listener;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinQuitListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){

        Bukkit.getConsoleSender().sendMessage(event.getPlayer().getName()+"加入了游戏");
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event){

        Bukkit.getConsoleSender().sendMessage(event.getPlayer().getName()+"离开了游戏");
    }


}
