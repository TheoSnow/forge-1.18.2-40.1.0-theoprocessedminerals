package com.theo95snow.theoprocessedminerals.datagen;

import com.theo95snow.theoprocessedminerals.TheoProcessedMinerals;
import com.theo95snow.theoprocessedminerals.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static com.theo95snow.theoprocessedminerals.setup.ModSetup.TAB_NAME;

public class TutLanguageProvider extends LanguageProvider {
  public TutLanguageProvider(DataGenerator gen, String locale) {
    super(gen, TheoProcessedMinerals.MODID, locale);
  }

  @Override
  protected void addTranslations() {
    add("itemGroup." + TAB_NAME, "Processed Minerals");

    //Blocks
    add(Registration.RAW_TIN_BLOCK.get(), "Raw Tin Block");
    add(Registration.TIN_BLOCK.get(), "Tin Block");
    //Items
    add(Registration.RAW_TIN_CHUNK.get(), "Raw Tin Chunk");
    add(Registration.TIN_DUST.get(), "Tin Ingot");
    add(Registration.TIN_INGOT.get(), "Tin Ingot");
    add(Registration.TIN_NUGGET.get(), "Tin Nugget");
    add(Registration.TIN_ROD.get(), "Tin Rod");
    add(Registration.TIN_PLATE.get(), "Tin Plate");
    add(Registration.TIN_GEAR.get(), "Tin Gear");
    add(Registration.TIN_WIRE.get(), "Tin Wire");
  }
}
