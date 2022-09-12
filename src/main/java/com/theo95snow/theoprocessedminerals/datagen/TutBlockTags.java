package com.theo95snow.theoprocessedminerals.datagen;

import com.theo95snow.theoprocessedminerals.TheoProcessedMinerals;
import com.theo95snow.theoprocessedminerals.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TutBlockTags extends BlockTagsProvider {

  public TutBlockTags(DataGenerator generator, ExistingFileHelper helper) {
    super(generator, TheoProcessedMinerals.MODID, helper);
  }

  @Override
  protected void addTags() {
    tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .add(Registration.RAW_TIN_BLOCK.get())
            .add(Registration.TIN_BLOCK.get());
    tag(BlockTags.NEEDS_STONE_TOOL)
            .add(Registration.RAW_TIN_BLOCK.get())
            .add(Registration.TIN_BLOCK.get());
  }

  @Override
  public String getName() {
    return "Processed Minerals Tags";
  }
}
