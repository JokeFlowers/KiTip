package wizn.kitip.listener;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import wizn.kitip.event.OpJoinGameEvent;

public class OpJoinQuitListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        if (event.getPlayer().isOp()){
            Bukkit.getPluginManager().callEvent(new OpJoinGameEvent());
        }
    }
    @EventHandler
    public void onOpJoin(OpJoinGameEvent event){
        Bukkit.getConsoleSender().sendMessage("一个op进入了游戏");
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event){

        Bukkit.getConsoleSender().sendMessage(event.getPlayer().getName()+"离开了游戏");
    }


}
