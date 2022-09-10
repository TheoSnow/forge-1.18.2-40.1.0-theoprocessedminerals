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

    add(Registration.RAW_TIN_CHUNK.get(), "Raw Tin Chunk");
  }
}
