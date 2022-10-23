package de.bellobodo.tntwars;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Tntwars extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.broadcastMessage("OFF");
    }
}
