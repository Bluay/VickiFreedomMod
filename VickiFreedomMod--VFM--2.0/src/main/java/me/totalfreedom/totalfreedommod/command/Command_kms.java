
package me.totalfreedom.totalfreedommod.command;


import me.totalfreedom.totalfreedommod.rank.Rank;
import me.totalfreedom.totalfreedommod.util.FUtil;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;



@CommandPermissions(level = Rank.OP, source = SourceType.BOTH)
@CommandParameters(description = "Kill yourself", usage = "/<command>")
public class Command_kms extends FreedomCommand
{

    @Override
       public boolean run(final CommandSender sender, Player playerSender, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
 {
        final Player player = getPlayer(args[0]);
        FUtil.bcastMsg(ChatColor.translateAlternateColorCodes('&', "&c" + sender.getName() + " has chosen the easy way out!"));
         try {
    Thread.sleep(1000);                 //1000 milliseconds is one second.
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
        player.chat("Goodbye cruel world!");
         try {
    Thread.sleep(1000);                 //1000 milliseconds is one second.
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
         player.setHealth(0.0);
        
    return true;
    
    }
    }
}
         
