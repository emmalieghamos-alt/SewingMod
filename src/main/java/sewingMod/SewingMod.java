package sewingMod;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(SewingMod.MODID)
public class SewingMod {
    public static final String MODID = "sewingmod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public SewingMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // This connects your block registry to the game engine
        ModBlocks.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
        LOGGER.info("Sewing Machine Mod Initialized!");
    }
}