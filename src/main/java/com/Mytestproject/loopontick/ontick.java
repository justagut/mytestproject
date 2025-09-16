package com.Mytestproject.loopontick;

import net.minecraft.network.chat.Component;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.tick.ServerTickEvent;

public class ontick {

    @SubscribeEvent
    public static void onServerTick(ServerTickEvent.Pre event) {
        // Controleer of de server nog tijd heeft (bijv. voor IO)
        if (event.hasTime()) {
            // Hier je tick-actie uitvoeren (bijv. timer bijwerken, entiteiten updaten, etc.)
            event.getServer().getPlayerList().getPlayers().forEach(p -> {
                while (1==1){

                }
            });
        }
    }
    public static void register(IEventBus eventBus){}
}
