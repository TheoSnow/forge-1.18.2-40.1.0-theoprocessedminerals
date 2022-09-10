package com.theo95snow.theoprocessedminerals.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.loot.LootTableProvider;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BaseLootTableProvider extends LootTableProvider {

  private static final Logger LOGGER = LogManager.getLogger();

  private final DataGenerator generator;

  public BaseLootTableProvider(DataGenerator dataGeneratorIn) {
    super(dataGeneratorIn);
    this.generator = dataGeneratorIn;
  }

  //protected abstract void addTables();
}
