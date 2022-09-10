package com.theo95snow.theoprocessedminerals.setup;

import com.theo95snow.theoprocessedminerals.TheoProcessedMinerals;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
@Mod.EventBusSubscriber(modid = TheoProcessedMinerals.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModSetup {

  public static final String TAB_NAME = "theoprocessedminerals";

  public static final CreativeModeTab ITEM_GROUP = new CreativeModeTab(TAB_NAME) {
    @Override
    public ItemStack makeIcon() {
      return new ItemStack(Items.DIAMOND);
    }
  };

  public static void setup() {
    IEventBus bus = MinecraftForge.EVENT_BUS;
  }
  public static void init(FMLCommonSetupEvent event) {
    //Messages.register();
  }
}
