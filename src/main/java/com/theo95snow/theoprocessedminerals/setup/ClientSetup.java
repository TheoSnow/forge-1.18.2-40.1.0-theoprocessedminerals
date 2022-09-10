package com.theo95snow.theoprocessedminerals.setup;

import com.theo95snow.theoprocessedminerals.TheoProcessedMinerals;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
@Mod.EventBusSubscriber(modid = TheoProcessedMinerals.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientSetup {
  public static void init(FMLClientSetupEvent event){

  }
}
