package com.kovuko_.mintleaf.items;

import com.kovuko_.mintleaf.Start;
import net.minecraft.item.Item;

public class ItemSword extends Item {
    public ItemSword() {
        super(new Item.Properties().group(Start.TAB).maxStackSize(1).maxDamage(2000));
    }
}
