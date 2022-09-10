package com.theo95snow.theoprocessedminerals;

import com.mojang.logging.LogUtils;
import com.theo95snow.theoprocessedminerals.setup.ClientSetup;
import com.theo95snow.theoprocessedminerals.setup.Config;
import com.theo95snow.theoprocessedminerals.setup.ModSetup;
import com.theo95snow.theoprocessedminerals.setup.Registration;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(TheoProcessedMinerals.MODID)
public class TheoProcessedMinerals
{
  private static final Logger LOGGER = LogManager.getLogger();
  public static final String MODID = "theoprocessedminerals";


  public TheoProcessedMinerals()
  {
    // Register the deferred registry
    ModSetup.setup();
    Registration.init();
    Config.register();

    // Register the setup method for modloading
    IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();
    modbus.addListener(ModSetup::init);
    DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> modbus.addListener(ClientSetup::init));
  }
}
