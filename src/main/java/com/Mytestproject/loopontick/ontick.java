package com.Mytestproject.loopontick;

import com.Mytestproject.testproject;
import com.sun.jna.platform.win32.COM.TypeLibUtil;
import net.minecraft.network.chat.Component;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.commands.SetBlockCommand;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.neoforge.event.entity.living.LivingDamageEvent;
import net.neoforged.neoforge.event.tick.ServerTickEvent;

import static net.minecraft.commands.arguments.EntityArgument.players;

@EventBusSubscriber(modid = testproject.MODID, bus = EventBusSubscriber.Bus.GAME)
public class ontick {

    @SubscribeEvent
    public static void serverTick(ServerTickEvent.Pre event){
        MinecraftServer server = event.getServer();
        ServerLevel overworld = server.getLevel(Level.OVERWORLD);
        int count = overworld.players().size();
        System.out.println("Players in Overworld: " + count);

    }
    @SubscribeEvent
    public static void livingDamage(LivingDamageEvent.Pre event) {
        if (event.getSource().getDirectEntity() instanceof Player player) {
            player.sendSystemMessage(Component.literal("hoi"));
        }
    }


}
