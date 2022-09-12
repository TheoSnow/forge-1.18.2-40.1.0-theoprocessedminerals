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

    withExistingParent(Registration.RAW_TIN_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/raw_tin_block"));
    withExistingParent(Registration.TIN_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/tin_block"));

    singleTexture(Registration.RAW_TIN_CHUNK.get().getRegistryName().getPath(),
            mcLoc("item/generated"),
            "layer0", modLoc("item/raw_tin_chunk"));
    singleTexture(Registration.TIN_DUST.get().getRegistryName().getPath(),
            mcLoc("item/generated"),
            "layer0", modLoc("item/tin_dust"));
    singleTexture(Registration.TIN_INGOT.get().getRegistryName().getPath(),
            mcLoc("item/generated"),
            "layer0", modLoc("item/tin_ingot"));
    singleTexture(Registration.TIN_NUGGET.get().getRegistryName().getPath(),
            mcLoc("item/generated"),
            "layer0", modLoc("item/tin_nugget"));
    singleTexture(Registration.TIN_ROD.get().getRegistryName().getPath(),
            mcLoc("item/generated"),
            "layer0", modLoc("item/tin_rod"));
    singleTexture(Registration.TIN_PLATE.get().getRegistryName().getPath(),
            mcLoc("item/generated"),
            "layer0", modLoc("item/tin_plate"));
    singleTexture(Registration.TIN_GEAR.get().getRegistryName().getPath(),
            mcLoc("item/generated"),
            "layer0", modLoc("item/tin_gear"));
    singleTexture(Registration.TIN_WIRE.get().getRegistryName().getPath(),
            mcLoc("item/generated"),
            "layer0", modLoc("item/tin_wire"));
  }
}
