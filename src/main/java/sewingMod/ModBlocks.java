package sewingMod;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = 
            DeferredRegister.create(ForgeRegistries.BLOCKS, "sewingmod");
    public static final DeferredRegister<Item> ITEMS = 
            DeferredRegister.create(ForgeRegistries.ITEMS, "sewingmod");

// --- YOUR NEW ITEM REGISTERED HERE ---
    public static final RegistryObject<Item> SEWING_PATTERN = ITEMS.register("sewing_pattern", 
            () -> new Item(new Item.Properties()));

    // This clones the physical properties of the Loom (sound, hardness, tool required, etc.)
    public static final RegistryObject<Block> SEWING_MACHINE = registerBlock("sewing_machine", 
            () -> new SewingMachineBlock(BlockBehaviour.Properties.copy(Blocks.LOOM)));

    // Helper method that automatically creates an item form of the block so you can hold it in your hand
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
}