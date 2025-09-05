package com.Mytestproject.somerandomitem;

import com.Mytestproject.testproject;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class moditems {
    public static final DeferredRegister.items ITEMS = DeferredRegister.createItems(testproject.MODID);
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
