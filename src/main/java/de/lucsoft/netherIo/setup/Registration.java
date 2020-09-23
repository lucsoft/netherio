package de.lucsoft.netherIo.setup;

import de.lucsoft.netherIo.NetherIO;
import de.lucsoft.netherIo.blocks.CombinedFurnace;
import de.lucsoft.netherIo.blocks.CombinedFurnaceTile;
import de.lucsoft.netherIo.items.MachineHousing;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registration {

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, NetherIO.ModId);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NetherIO.ModId);
    private static final DeferredRegister<TileEntityType<?>> TILES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, NetherIO.ModId);

    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        TILES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<CombinedFurnace> CombinedFurnaceObject = BLOCKS.register("combined_furnace", CombinedFurnace::new);
    public static final RegistryObject<Item> CombinedFurnaceItemObject = ITEMS.register("combined_furnace", () -> new BlockItem(CombinedFurnaceObject.get(), new Item.Properties().group(ModSetup.itemGroup)));
    public static final RegistryObject<TileEntityType<CombinedFurnaceTile>> CombinedFurnaceTileObject = TILES.register("combined_furnace", () -> TileEntityType.Builder.create(CombinedFurnaceTile::new, CombinedFurnaceObject.get()).build(null));

    public  static  final  RegistryObject<MachineHousing> MachineHousingObject = ITEMS.register("machine_housing", MachineHousing::new);
}
