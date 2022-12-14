package com.theo95snow.theoprocessedminerals.datagen;

import com.theo95snow.theoprocessedminerals.TheoProcessedMinerals;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = TheoProcessedMinerals.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
  @SubscribeEvent
  public static void gatherData(GatherDataEvent event) {
    DataGenerator generator = event.getGenerator();
    if (event.includeServer()) {
      generator.addProvider(new TutRecipes(generator));
      generator.addProvider(new TutLootTables(generator));
      TutBlockTags blockTags = new TutBlockTags(generator, event.getExistingFileHelper());
      generator.addProvider(blockTags);
      generator.addProvider(new TutItemTags(generator, blockTags, event.getExistingFileHelper()));
      //generator.addProvider(new TutBiomeTags(generator, event.getExistingFileHelper()));
      //generator.addProvider(new TutStructureSetTags(generator, event.getExistingFileHelper()));
    }
    if (event.includeClient()) {
      generator.addProvider(new TutBlockStates(generator, event.getExistingFileHelper()));
      generator.addProvider(new TutItemModels(generator, event.getExistingFileHelper()));
      generator.addProvider(new TutLanguageProvider(generator, "en_us"));
    }
  }
}
