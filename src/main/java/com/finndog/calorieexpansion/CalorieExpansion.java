package com.finndog.calorieexpansion;


import com.finndog.calorieexpansion.registry.CustomCropBlock;
import com.finndog.calorieexpansion.registry.ModBlocks;
import com.finndog.calorieexpansion.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.CropBlock;
import net.minecraft.block.Material;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;



public class CalorieExpansion implements ModInitializer {

    public static final String MOD_ID = "calexp";


    public static final CropBlock TOMATO_BUSH = new CustomCropBlock(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));
    public static final Item TOMATO_SEEDS = new AliasedBlockItem(CalorieExpansion.TOMATO_BUSH, new Item.Settings().group(ItemGroup.MISC));

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();

        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), TOMATO_BUSH);

        Registry.register(Registry.BLOCK, new Identifier("calexp", "tomato_bush"), TOMATO_BUSH);
        Registry.register(Registry.ITEM, new Identifier("calexp", "tomato_seeds"), TOMATO_SEEDS);


    }
}
