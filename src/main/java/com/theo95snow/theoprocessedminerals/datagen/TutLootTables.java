package com.theo95snow.theoprocessedminerals.datagen;

import net.minecraft.data.DataGenerator;
import com.theo95snow.theoprocessedminerals.setup.Registration;

public class TutLootTables extends BaseLootTableProvider {
  public TutLootTables(DataGenerator dataGeneratorIn) {
    super(dataGeneratorIn);
  }

  @Override
  protected void addTables() {
    lootTables.put(Registration.RAW_TIN_BLOCK.get(), createSimpleTable("raw_tin_block", Registration.RAW_TIN_BLOCK.get()) );
    lootTables.put(Registration.TIN_BLOCK.get(), createSimpleTable("raw_tin_block", Registration.TIN_BLOCK.get()) );
  }
}
