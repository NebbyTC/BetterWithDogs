package com.Nikodemis_.fluffy.blocks;

import com.Nikodemis_.fluffy.Fluffy;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {
    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(Fluffy.TAB));
    }
}
