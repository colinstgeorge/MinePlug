package com.hwcdi;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class MinePlug extends JavaPlugin {

    private final MinePlugCommandExecutor commandExecutor = new MinePlugCommandExecutor(this);
    private final MinePlugEventListener eventListener = new MinePlugEventListener(this);

    @Override
    public void onDisable() {
    }

    @Override
    public void onEnable() { 

        PluginManager pm = this.getServer().getPluginManager();

        getCommand("ignite").setExecutor(commandExecutor);

    }
}

