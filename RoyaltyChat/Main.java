package pw.missaglialfio.royaltychat;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{
	
	//INIZIALIZZAZIONE
	public void onEnable(){
	}
	public void onDisable(){
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if(commandLabel.equalsIgnoreCase("announce") || commandLabel.equalsIgnoreCase("a")){
			if(args.length == 0){
				sender.sendMessage(ChatColor.RED + "[Royalty] Sintassi errata! Utilizzo corretto: " + ChatColor.ITALIC + "/announce <messaggio>");
				return true;
			}
			else{
					StringBuilder builder = new StringBuilder();
					for (String arg : args){
						builder.append(arg + " ");
					}
		        	Bukkit.broadcastMessage("§3§lAnnounce§r§3>§r " + builder.toString());
		        	return true;
			}
		}		
		return false;
	}
}
