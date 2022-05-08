package wizn.kitip;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import wizn.kitip.executor.KiTipExecutor;
import wizn.kitip.listener.JoinQuitListener;

public class KiTip extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("§aKiTip已开启");
        //注册事件的处理者
        getServer().getPluginManager().registerEvents(new JoinQuitListener(),this);
        //注册命令的处理者
        getCommand("EasyPvp").setExecutor(new KiTipExecutor());
    }

    @Override
    public void onDisable() {

        Bukkit.getConsoleSender().sendMessage("§4KiTip已关闭");
    }
}