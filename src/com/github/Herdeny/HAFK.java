package com.github.Herdeny;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class HAFK extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        this.getLogger().info("===================");
        this.getLogger().info("HAFK插件已启用！");
        this.getLogger().info("版本：1.0.0");
        this.getLogger().info("作者：Herdeny");
        this.getLogger().info("插件交流群:698558500");
        this.getLogger().info("===================");//插件启用输出

        saveDefaultConfig();//加载config.yml

        Bukkit.getPluginManager().registerEvents(this,this);
    }


    public void onDisable() {

        this.getLogger().info("HAFK插件已禁用！");//插件禁用输出
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        String start = getConfig().getString("message.start");//声明start信息
        String stop = getConfig().getString("message.stop");//声明stop信息

        if (cmd.getName().equalsIgnoreCase("gj")) {
            if (args.length == 0 || args[0].equalsIgnoreCase("help") || args[0].equalsIgnoreCase("?")) {
                sender.sendMessage("&r=======[&b挂机系统&r]========");
                sender.sendMessage("&b/gj start &7- &r开始挂机");
                sender.sendMessage("&b/gj stop &7- &r停止挂机");
                sender.sendMessage("&r====[Made by &bHerdeny&r]====");
                return true;
            }
            if (args[0].equalsIgnoreCase("start")) {
                sender.sendMessage(start);//发送开始挂机信息
                return true;
            }
            if (args[0].equalsIgnoreCase("stop")) {
                sender.sendMessage(stop);//发送停止挂机信息
                return true;
            }
        }
        return false;
    }

    @EventHandler
    public void onPlayerJoin (PlayerJoinEvent e) {
        final Player p = e.getPlayer();
    }

    @EventHandler
    public void onPlayerMoveEvent(PlayerMoveEvent p){

        }
}