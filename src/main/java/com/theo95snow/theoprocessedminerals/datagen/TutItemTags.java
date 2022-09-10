package com.theo95snow.theoprocessedminerals.datagen;

import com.theo95snow.theoprocessedminerals.TheoProcessedMinerals;
import com.theo95snow.theoprocessedminerals.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TutItemTags extends ItemTagsProvider {
  public TutItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper helper) {
    super(generator, blockTags, TheoProcessedMinerals.MODID, helper);
  }

  @Override
  protected void addTags() {
    tag(Tags.Items.RAW_MATERIALS)
            .add(Registration.RAW_TIN_CHUNK.get());
  }

  @Override
  public String getName() {
    return "Tutorial Tags";
  }
}
