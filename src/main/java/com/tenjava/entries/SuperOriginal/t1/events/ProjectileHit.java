package com.tenjava.entries.SuperOriginal.t1.events;

import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.inventory.meta.FireworkMeta;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aaron(SuperOriginal).
 */
public class ProjectileHit implements Listener{

    @EventHandler

    public void onHit(ProjectileHitEvent e){

            if(e.getEntity().hasMetadata("SPECIAL")){
                if(e.getEntity().getPassenger() == null) return;
                Player p = (Player) e.getEntity().getPassenger();
                if(p.getVehicle() != null) p.getVehicle().eject();

                Firework firework = p.getWorld().spawn(p.getLocation(), Firework.class);

                FireworkMeta meta = firework.getFireworkMeta();
                meta.addEffect(FireworkEffect.builder()
                        .flicker(true)
                        .trail(true)
                        .withColor(Color.AQUA)
                        .withColor(Color.WHITE)
                        .with(FireworkEffect.Type.STAR)
                        .build());
                firework.setFireworkMeta(meta);

                List<Block> blocks = new ArrayList<>();
                int radius = 5;
                double y = p.getLocation().getY() - 1;
                for (double x = -p.getLocation().getX() + radius; x < p.getLocation().getX(); x++)
                        for (double z = -p.getLocation().getZ() + radius; x < p.getLocation().getZ(); z++)
                            blocks.add(p.getWorld().getBlockAt(Math.round((float) x), Math.round((float) y), Math.round((float) z)));

                for(Block b: blocks){
                    b.setType(Material.DIAMOND_BLOCK);
                }

            }
    }

}
