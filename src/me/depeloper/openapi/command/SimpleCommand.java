package me.depeloper.openapi.command;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandMap;
import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;

import java.lang.reflect.Field;

public abstract class SimpleCommand extends BukkitCommand {

    public SimpleCommand(String name)
    {
        super(name);

        getCommandMap().register(name, this);
    }

    public boolean execute(CommandSender commandSender, String s, String[] strings)
    {
        return on(commandSender, strings);
    }

    public abstract boolean on(CommandSender sender, String[] args);

    private CommandMap getCommandMap()
    {
        try
        {
            Field field = Bukkit.getServer().getClass().getDeclaredField("commandMap");
            field.setAccessible(true);
            return (CommandMap) field.get("commandMap");
        } catch (NoSuchFieldException | IllegalAccessException e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
