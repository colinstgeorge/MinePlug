package com.hwcdi;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.Bukkit;

public class MinePlugCommandExecutor implements CommandExecutor {
    private MinePlug plugin;

    public MinePlugCommandExecutor(MinePlug plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        //plugin.getLogger().info("onCommand Reached in MyCommandExecutor");
        if (cmd.getName().equalsIgnoreCase("ignite")) {
            if (args.length != 1) {
                return false;
            }
            // Make sure the sender is a player.
            if (!(sender instanceof Player)) {
                sender.sendMessage("Only players can set other players on fire.");
                sender.sendMessage("This is an arbitrary requirement for demonstration purposes only.");
                return true;
            }
            Player target = Bukkit.getServer().getPlayer(args[0]);
            // Make sure the player is online.
            if (target == null) {
                sender.sendMessage(args[0] + " is not currently online.");
                return true;
            }
        // Sets the player on fire for 1,000 ticks (there are ~20 ticks in second, so 50 seconds total).
            target.setFireTicks(1000);
            return true;
        }
        return false;
    }
}
