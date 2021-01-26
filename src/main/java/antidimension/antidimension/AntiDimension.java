package antidimension.antidimension;

import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPortalEvent;
import org.bukkit.event.player.PlayerPortalEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiDimension extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Listeners(), this);
    }

    @Override
    public void onDisable() {
    }

    public class Listeners implements Listener {
        @EventHandler(priority = EventPriority.HIGHEST)
        public void onEntityEnterPortal(EntityPortalEvent e) {
            e.setCancelled(true);
        }

        @EventHandler(priority = EventPriority.HIGHEST)
        public void onEnterPortal(PlayerPortalEvent e) {
            e.setCancelled(true);
        }
    }
}