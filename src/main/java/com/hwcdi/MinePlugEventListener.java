package com.hwcdi;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class MinePlugEventListener implements Listener {

    private MinePlug plugin;

    public MinePlugEventListener(MinePlug plugin) {
        this.plugin = plugin;
    }

    // http://jd.bukkit.org/apidocs/ provide a complete list of events that can be registered.

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        Bukkit.getServer().broadcastMessage("Player " + event.getPlayer().getName() + " placed " + event.getBlock().getType() + " at " + event.getBlock().getLocation());
    }
}
