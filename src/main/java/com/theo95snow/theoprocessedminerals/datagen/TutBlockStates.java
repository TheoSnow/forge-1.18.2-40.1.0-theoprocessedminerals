package com.theo95snow.theoprocessedminerals.datagen;

import com.theo95snow.theoprocessedminerals.TheoProcessedMinerals;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TutBlockStates extends BlockStateProvider {

  public TutBlockStates(DataGenerator gen, ExistingFileHelper helper) {
    super(gen, TheoProcessedMinerals.MODID, helper);
  }

  @Override
  protected void registerStatesAndModels() {

  }
}
