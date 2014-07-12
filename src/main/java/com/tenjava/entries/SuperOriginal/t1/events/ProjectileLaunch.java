package com.tenjava.entries.SuperOriginal.t1.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileLaunchEvent;

/**
 * Created by Aaron(SuperOriginal).
 */
public class ProjectileLaunch implements Listener{

    @EventHandler

    public void onLaunch(ProjectileLaunchEvent e){

        if(e.getEntity().getShooter() instanceof Player){

            Player p = (Player) e.getEntity().getShooter();

        }
    }

}
