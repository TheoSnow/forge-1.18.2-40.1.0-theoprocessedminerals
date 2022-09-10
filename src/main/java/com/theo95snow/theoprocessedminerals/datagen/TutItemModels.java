package com.theo95snow.theoprocessedminerals.datagen;

import com.theo95snow.theoprocessedminerals.TheoProcessedMinerals;
import com.theo95snow.theoprocessedminerals.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TutItemModels extends ItemModelProvider {
  public TutItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
    super(generator, TheoProcessedMinerals.MODID, existingFileHelper);
  }

  @Override
  protected void registerModels() {


    singleTexture(Registration.RAW_TIN_CHUNK.get().getRegistryName().getPath(),
            mcLoc("item/generated"),
            "layer0", modLoc("item/raw_tin_chunk"));
  }
}
