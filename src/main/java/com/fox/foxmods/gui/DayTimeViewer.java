package com.fox.foxmods.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.world.World;
import net.minecraft.world.storage.WorldInfo;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class DayTimeViewer extends Gui {


    public DayTimeViewer(Minecraft mc){
        ScaledResolution scaled = new ScaledResolution(mc);
//        int width = scaled.getScaledWidth();
        int height = scaled.getScaledHeight();

        drawCenteredString(mc.fontRenderer, countDays(), 20, (height) - 20, Integer.parseInt("FFAA00", 16));
    }

    public String countDays(){
        return "Day: " + ((Minecraft.getMinecraft().world.getTotalWorldTime() / 24000) + 1); //so we don't start with day 0
    }


}
