package com.fox.foxmods.util.handlers;

import com.fox.foxmods.gui.DayTimeViewer;
import com.fox.foxmods.items.tools.ToolMop;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class RenderGuiHandler {

    @SubscribeEvent
    public void onRenderGui(RenderGameOverlayEvent.Post event){
        if (event.getType() != RenderGameOverlayEvent.ElementType.EXPERIENCE)
            return;

        ToolMop.tickWetMobs();

        new DayTimeViewer(Minecraft.getMinecraft());
    }

}
