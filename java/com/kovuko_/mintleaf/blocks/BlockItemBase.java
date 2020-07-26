package com.kovuko_.mintleaf.blocks;

import com.kovuko_.mintleaf.Start;
import net.minecraft.item.BlockItem;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {
    public BlockItemBase(Block block) {
        super(block, new Item.Properties()
                .group(Start.TAB)
        );
    }
}
