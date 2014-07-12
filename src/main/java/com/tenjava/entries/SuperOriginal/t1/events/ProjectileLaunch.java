package com.tenjava.entries.SuperOriginal.t1.events;

import com.tenjava.entries.SuperOriginal.t1.TenJava;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.metadata.MetadataValue;

/**
 * Created by Aaron(SuperOriginal).
 */
public class ProjectileLaunch implements Listener{

    @EventHandler

    public void onLaunch(ProjectileLaunchEvent e){

        if(e.getEntity().getShooter() instanceof Player){

            Player p = (Player) e.getEntity().getShooter();

            e.getEntity().setPassenger(p);
            p.sendMessage(ChatColor.AQUA + "Weeeeeeeee");
            e.getEntity().setMetadata("SPECIAL", new FixedMetadataValue(TenJava.getInstance(), true));

        }
    }

}
