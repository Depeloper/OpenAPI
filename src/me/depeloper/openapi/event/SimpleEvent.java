package me.depeloper.openapi.event;

import me.depeloper.openapi.OpenAPI;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;

public abstract class SimpleEvent<E extends Event> implements Listener {

    private final OpenAPI plugin;

    public SimpleEvent()
    {
        this.plugin = OpenAPI.getInstance();
        this.plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    public abstract void on(E event);

    public void unregister()
    {
        HandlerList.unregisterAll(this);
    }
}
