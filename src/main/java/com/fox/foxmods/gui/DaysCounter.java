package com.fox.foxmods.gui;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class DaysCounter {

    public static int days;
    public static long hours;
    public static long minutes;

    @SubscribeEvent
    public void onTickEvent(TickEvent.WorldTickEvent event)
    {

    }

}
