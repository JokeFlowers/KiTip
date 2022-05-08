package wizn.kitip.executor;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class KiTipExecutor implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length==1&&args[0].equalsIgnoreCase("help")){
            sender.sendMessage("帮助");
        }
        return false;
    }

}
