package com.finndog.calorieexpansion.registry;

import com.finndog.calorieexpansion.CalorieExpansion;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //Items
    public static final Item FRIED_EGG = new Item(new Item.Settings().group(ItemGroup.FOOD).maxCount(16).food(new FoodComponent.Builder().hunger(5).saturationModifier(6f).snack().statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH,20*3), 0.6f).build()));
    public static final Item COOKED_CARROT = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(2.4f).snack().build()));
    public static final Item COOKED_BEETROOT = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(3f).snack().build()));
    public static final Item HONEY_APPLE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(9.6f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 20*15), 1f).build()));
    public static final Item FISH_AND_CHIPS = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(8).saturationModifier(12.8f).statusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 20*10), 0.3f).build()));
    public static final Item PANCAKE_BATTER = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(3).saturationModifier(7f).build()));
    public static final Item PANCAKES = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(10).saturationModifier(15f).build()));
    public static final Item EGGY_BREAD = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(7).saturationModifier(8f).build()));
    public static final Item TOMATO_SLICES = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(1.4f).snack().build()));
    public static final Item BURGER = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(9).saturationModifier(12f).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH,20*5), 0.6f).build()));
    public static final Item CHEESE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(3).saturationModifier(5f).snack().build()));
    public static final Item BAGUETTE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(8).saturationModifier(7.3f).build()));
    public static final Item TOMATO = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(1.4f).build()));


    //Crop Items


    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(CalorieExpansion.MOD_ID, "fried_egg"), FRIED_EGG);
        Registry.register(Registry.ITEM, new Identifier(CalorieExpansion.MOD_ID, "cooked_carrot"), COOKED_CARROT);
        Registry.register(Registry.ITEM, new Identifier(CalorieExpansion.MOD_ID, "cooked_beetroot"), COOKED_BEETROOT);
        Registry.register(Registry.ITEM, new Identifier(CalorieExpansion.MOD_ID, "honey_apple"), HONEY_APPLE);
        Registry.register(Registry.ITEM, new Identifier(CalorieExpansion.MOD_ID, "fish_and_chips"), FISH_AND_CHIPS);
        Registry.register(Registry.ITEM, new Identifier(CalorieExpansion.MOD_ID, "pancake_batter"), PANCAKE_BATTER);
        Registry.register(Registry.ITEM, new Identifier(CalorieExpansion.MOD_ID, "pancakes"), PANCAKES);
        Registry.register(Registry.ITEM, new Identifier(CalorieExpansion.MOD_ID, "eggy_bread"), EGGY_BREAD);
        Registry.register(Registry.ITEM, new Identifier(CalorieExpansion.MOD_ID, "tomato_slices"), TOMATO_SLICES);
        Registry.register(Registry.ITEM, new Identifier(CalorieExpansion.MOD_ID, "burger"), BURGER);
        Registry.register(Registry.ITEM, new Identifier(CalorieExpansion.MOD_ID, "cheese"), CHEESE);
        Registry.register(Registry.ITEM, new Identifier(CalorieExpansion.MOD_ID, "baguette"), BAGUETTE);
        Registry.register(Registry.ITEM, new Identifier(CalorieExpansion.MOD_ID, "tomato"), TOMATO);


        //Crop Items
    }
}
