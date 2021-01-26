package antidimension.antidimension;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.world.PortalCreateEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiDimension extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new Listeners(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public class Listeners implements Listener {
        @EventHandler(priority = EventPriority.HIGH)
        public void onPortalCreate(PortalCreateEvent e) {
            e.setCancelled(true);
        }
    }
}