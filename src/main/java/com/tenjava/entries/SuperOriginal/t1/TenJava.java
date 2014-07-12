package com.tenjava.entries.SuperOriginal.t1;

import com.tenjava.entries.SuperOriginal.t1.events.ProjectileHit;
import com.tenjava.entries.SuperOriginal.t1.events.ProjectileLaunch;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class TenJava extends JavaPlugin {

    static TenJava instance;

    public static TenJava getInstance(){
        return instance;
    }


    public void onEnable(){

        instance = this;

        Bukkit.getServer().getPluginManager().registerEvents(new ProjectileLaunch(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new ProjectileHit(), this);

    }


}
