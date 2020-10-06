package corgiaoc.byg.common.world.feature.features.overworld.trees.acacia;

import com.mojang.serialization.Codec;
import net.minecraft.block.Blocks;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.IWorldGenerationBaseReader;
import corgiaoc.byg.common.world.feature.featureconfig.BYGTreeFeatureConfig;
import corgiaoc.byg.common.world.feature.features.overworld.trees.util.BYGAbstractTreeFeature;
import corgiaoc.byg.core.byglists.BYGBlockList;

import java.util.Random;
import java.util.Set;

public class AcaciaTree1 extends BYGAbstractTreeFeature<BYGTreeFeatureConfig> {

    public AcaciaTree1(Codec<BYGTreeFeatureConfig> configIn) {
        super(configIn);
    }

    /**
     * TODO: Redo.
     */
    protected boolean place(Set<BlockPos> changedBlocks, ISeedReader worldIn, Random rand, BlockPos pos, MutableBoundingBox boundsIn, boolean isSapling, BYGTreeFeatureConfig config) {

        int randTreeHeight = 8;
        BlockPos.Mutable mainmutable = new BlockPos.Mutable().setPos(pos);

        if (pos.getY() + randTreeHeight + 1 < worldIn.getHeight()) {

            if (!isDesiredGroundwDirtTag(worldIn, pos.down(), Blocks.GRASS_BLOCK)) {
                return false;
            } else if (!this.isAnotherTreeNearby(worldIn, pos, randTreeHeight, 0, isSapling)) {
                return false;
            } else if (!this.doesSaplingHaveSpaceToGrow(worldIn, pos, randTreeHeight, 5, 5, 5, isSapling)) {
                return false;
            } else {
                for (int buildTrunk = 0; buildTrunk <= randTreeHeight; buildTrunk++) {
                    placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.move(Direction.UP), boundsIn);
                }
                mainmutable.setPos(pos);

                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 0, -1), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 0, 0), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 1, -1), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 1, 0), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 2, -1), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 2, 0), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 3, -1), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 3, 0), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 4, 0), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 4, -1), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 5, -1), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 5, 0), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 6, -1), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 6, 0), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 7, -1), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 7, 0), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 8, -1), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 8, 0), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 9, -1), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 9, 0), boundsIn);

                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 0, -2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(0, 0, -2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 0, -1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(0, 0, -1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(1, 0, -1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 0, 0), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(1, 0, 0), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 0, 1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(0, 0, 1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(0, 1, -2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 1, -1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(0, 1, -1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(1, 1, 0), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 1, 1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(0, 2, -1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(0, 3, -1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(0, 4, -1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(0, 5, -1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 5, 0), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 5, 1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 6, 1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 7, -2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 7, -1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 7, 1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 8, -3), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 8, -1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(1, 8, 0), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 9, -3), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(2, 9, 0), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(0, 9, 1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.add(0, 10, 2), boundsIn);

                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 5, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 5, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 5, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-4, 5, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 5, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 5, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-4, 5, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 5, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-4, 5, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 5, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 5, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 5, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 5, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 5, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 5, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 6, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 6, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 6, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 6, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 6, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 6, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 7, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 7, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 7, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 7, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-4, 7, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 7, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 7, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 7, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 7, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-4, 7, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 7, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 7, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 7, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 7, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-4, 7, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 7, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 7, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 7, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 7, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 7, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-4, 7, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 7, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 7, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 7, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 7, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 7, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 7, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-4, 7, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 7, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 7, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 7, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 7, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 7, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 7, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 7, 4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 7, 4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 7, 4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 7, 4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 7, 4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-4, 8, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 8, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 8, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 8, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 8, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-5, 8, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-4, 8, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 8, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 8, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 8, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 8, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-5, 8, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-4, 8, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 8, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 8, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 8, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 8, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 8, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-5, 8, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-4, 8, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 8, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 8, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 8, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-5, 8, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-4, 8, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 8, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 8, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-5, 8, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-4, 8, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 8, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 8, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 8, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 8, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 8, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-4, 8, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 8, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 8, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 8, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 8, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 8, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 9, -6), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 9, -6), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 9, -6), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 9, -6), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 9, -6), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-4, 9, -5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 9, -5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 9, -5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 9, -5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 9, -5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 9, -5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 9, -5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-4, 9, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 9, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 9, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 9, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 9, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 9, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 9, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-4, 9, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 9, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 9, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 9, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 9, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 9, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-4, 9, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 9, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 9, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 9, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 9, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 9, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 9, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(3, 9, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-4, 9, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 9, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 9, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 9, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 9, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 9, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(3, 9, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 9, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 9, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 9, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 9, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(3, 9, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 9, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 9, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 9, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(3, 9, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 9, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 9, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(3, 9, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 10, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 10, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 10, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 10, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 10, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 10, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 10, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 10, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 10, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 10, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 10, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 10, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 10, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 10, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 10, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 10, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 10, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(3, 10, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 10, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 10, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 10, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 10, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 10, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(3, 10, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 10, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 10, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 10, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 10, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 10, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 10, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(3, 10, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 10, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 10, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 10, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 10, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 10, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(3, 10, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 10, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 10, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 10, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 10, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 10, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 10, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(3, 10, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-3, 10, 4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 10, 4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 10, 4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 10, 4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 10, 4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 10, 4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(3, 10, 4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 10, 5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 10, 5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 10, 5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 10, 5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 10, 5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 11, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 11, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 11, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 11, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-2, 11, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 11, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 11, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 11, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(2, 11, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(-1, 11, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 11, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(1, 11, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.add(0, 11, 4), boundsIn);
            }
        }
        return true;
    }


    private void treeLog(Set<BlockPos> setlogblock, ISeedReader reader, BlockPos pos, MutableBoundingBox boundingBox) {
        if (canLogPlaceHere(reader, pos)) {
            this.setFinalBlockState(setlogblock, reader, pos, BYGBlockList.PINE_LOG.getDefaultState(), boundingBox);
        }
    }


    private void treeBranch(Set<BlockPos> setlogblock, ISeedReader reader, BlockPos pos, MutableBoundingBox boundingBox) {
        if (canLogPlaceHere(reader, pos)) {
            this.setFinalBlockState(setlogblock, reader, pos, BYGBlockList.AMETRINE_BLOCK.getDefaultState(), boundingBox);
        }
    }


    private void leafs(Set<BlockPos> blockPos, ISeedReader reader, BlockPos pos, MutableBoundingBox boundingBox) {
        BlockPos.Mutable blockpos = new BlockPos.Mutable().setPos(pos);
        if (isAir(reader, blockpos)) {
            this.setFinalBlockState(blockPos, reader, blockpos, BYGBlockList.PINE_LEAVES.getDefaultState(), boundingBox);
        }
    }


    private boolean doesTreeFit(IWorldGenerationBaseReader reader, BlockPos blockPos, int height) {
        int x = blockPos.getX();
        int y = blockPos.getY();
        int z = blockPos.getZ();
        BlockPos.Mutable pos = new BlockPos.Mutable();

        for (int yOffset = 0; yOffset <= height + 1; ++yOffset) {
            //Distance/Density of trees. Positive Values ONLY
            int distance = 2;

            for (int xOffset = -distance; xOffset <= distance; ++xOffset) {
                for (int zOffset = -distance; zOffset <= distance; ++zOffset) {
                    if (!canLogPlaceHere(reader, pos.setPos(x + xOffset, y + yOffset, z + zOffset))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}