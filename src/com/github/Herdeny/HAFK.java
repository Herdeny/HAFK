package com.github.Herdeny;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class HAFK extends JavaPlugin implements Listener {
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if (cmd.getName().equalsIgnoreCase("gj start")){
            sender.sendMessage("§r[§b挂机提示§r]§a您已开始挂机！挂机期间将持续获得经验和金币，若要退出挂机请输入指令 §e/gj stop");
            return true;
        }
        return false;}
}
