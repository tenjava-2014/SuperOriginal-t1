package com.tenjava.entries.SuperOriginal.t1;

import com.tenjava.entries.SuperOriginal.t1.events.ProjectileLaunch;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class TenJava extends JavaPlugin {

    public void onEnable(){

        Bukkit.getServer().getPluginManager().registerEvents(new ProjectileLaunch(), this);

    }


}
