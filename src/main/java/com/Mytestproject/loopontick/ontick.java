package com.Mytestproject.loopontick;

import com.Mytestproject.testproject;
import com.sun.jna.platform.win32.COM.TypeLibUtil;
import net.minecraft.network.chat.Component;
import net.minecraft.server.commands.SetBlockCommand;
import net.minecraft.world.entity.player.Player;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingDamageEvent;
import net.neoforged.neoforge.event.tick.ServerTickEvent;
@EventBusSubscriber(modid = testproject.MODID, bus = EventBusSubscriber.Bus.GAME)
public class ontick {

    @SubscribeEvent
    public static void serverTick(ServerTickEvent.Pre event){
        System.out.println("hoi");
    }
    @SubscribeEvent
    public static void livingDamage(LivingDamageEvent.Pre event) {
        if (event.getSource().getDirectEntity() instanceof Player player) {
            player.sendSystemMessage(Component.literal("hoi"));
        }
    }


}
