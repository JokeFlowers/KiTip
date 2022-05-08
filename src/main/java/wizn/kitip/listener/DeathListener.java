package wizn.kitip.listener;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import wizn.kitip.event.OpDieEvent;

public class DeathListener implements Listener {

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event){
        if (event.getEntity().isOp()){
            Bukkit.getPluginManager().callEvent(new OpDieEvent());
        }
    }
    @EventHandler
    public void onDeathEvent(OpDieEvent event){
        Bukkit.getConsoleSender().sendMessage("§5一个op去世了");
    }


}