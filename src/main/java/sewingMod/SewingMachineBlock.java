package sewingMod;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.CraftingMenu;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class SewingMachineBlock extends Block {
    private static final Component CONTAINER_TITLE = Component.translatable("container.sewing_machine");

    public SewingMachineBlock(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        if (level.isClientSide) {
            return InteractionResult.SUCCESS;
        } else {
            player.openMenu(state.getMenuProvider(level, pos));
            return InteractionResult.CONSUME;
        }
    }

    @Override
    public MenuProvider getMenuProvider(BlockState state, Level level, BlockPos pos) {
        return new SimpleMenuProvider((containerId, playerInventory, playerEntity) -> {
            // This returns the vanilla 3x3 crafting grid interface
            return new CraftingMenu(containerId, playerInventory, ContainerLevelAccess.create(level, pos)) {
                @Override
                public boolean stillValid(Player player) {
                    return stillValid(ContainerLevelAccess.create(level, pos), player, ModBlocks.SEWING_MACHINE.get());
                }
            };
        }, CONTAINER_TITLE);
    }
}