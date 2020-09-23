package de.lucsoft.netherIo.setup;

import de.lucsoft.netherIo.NetherIO;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = NetherIO.ModId, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModSetup {

    public static final ItemGroup itemGroup = new ItemGroup(NetherIO.ModId) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Registration.CombinedFurnaceObject.get());
        }
    };

    public static void init() {

    }
}
