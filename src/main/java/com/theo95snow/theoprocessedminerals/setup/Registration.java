package com.theo95snow.theoprocessedminerals.setup;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.theo95snow.theoprocessedminerals.TheoProcessedMinerals.MODID;

public class Registration {

  private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
  private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
  public static void init() {
    IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    BLOCKS.register(bus);
    ITEMS.register(bus);
    //BLOCK_ENTITIES.register(bus);
    //CONTAINERS.register(bus);
    //ENTITIES.register(bus);
    //STRUCTURES.register(bus);
  }

  public static final BlockBehaviour.Properties BLOCK_PROPERTIES = BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops();
  public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(ModSetup.ITEM_GROUP);

  //Blocks
  public static final RegistryObject<Block> RAW_TIN_BLOCK = BLOCKS.register("raw_tin_block", () -> new Block(BLOCK_PROPERTIES));
  public static final RegistryObject<Item> RAW_TIN_BLOCK_ITEM = fromBlock(RAW_TIN_BLOCK);
  public static final RegistryObject<Block> TIN_BLOCK = BLOCKS.register("tin_block", () -> new Block(BLOCK_PROPERTIES));
  public static final RegistryObject<Item> TIN_BLOCK_ITEM = fromBlock(TIN_BLOCK);

  //Items
  public static final RegistryObject<Item> RAW_TIN_CHUNK = ITEMS.register("raw_tin_chunk", () -> new Item(ITEM_PROPERTIES));
  public static final RegistryObject<Item> TIN_DUST = ITEMS.register("tin_dust", () -> new Item(ITEM_PROPERTIES));
  public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(ITEM_PROPERTIES));
  public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget", () -> new Item(ITEM_PROPERTIES));
  public static final RegistryObject<Item> TIN_ROD = ITEMS.register("tin_rod", () -> new Item(ITEM_PROPERTIES));
  public static final RegistryObject<Item> TIN_PLATE = ITEMS.register("tin_plate", () -> new Item(ITEM_PROPERTIES));
  public static final RegistryObject<Item> TIN_GEAR = ITEMS.register("tin_gear", () -> new Item(ITEM_PROPERTIES));
  public static final RegistryObject<Item> TIN_WIRE = ITEMS.register("tin_wire", () -> new Item(ITEM_PROPERTIES));

  public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block) {
    return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
  }
}
