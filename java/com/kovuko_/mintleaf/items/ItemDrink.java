package com.kovuko_.mintleaf.items;

import com.kovuko_.mintleaf.Start;
import net.minecraft.item.Item;

public class ItemDrink extends Item {
    public ItemDrink() {
        super(new Item.Properties().maxStackSize(1).group(Start.TAB));
    }
}
