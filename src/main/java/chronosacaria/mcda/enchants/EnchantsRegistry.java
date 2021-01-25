package chronosacaria.mcda.enchants;

import chronosacaria.mcda.enchants.enchantments.BurningEnchantment;
import chronosacaria.mcda.enchants.enchantments.ChillingEnchantment;
import chronosacaria.mcda.enchants.enchantments.SnowballEnchantment;
import chronosacaria.mcda.enchants.enchantments.SwiftfootedEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;

public class EnchantsRegistry {
    public static Enchantment BURNING;
    public static Enchantment CHILLING;
    public static Enchantment SNOWBALL;
    public static Enchantment SWIFTFOOTED;

    public static void init(){
        BURNING = new BurningEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.ARMOR,
                new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET});
        CHILLING = new ChillingEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.ARMOR,
                new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET});
        SNOWBALL = new SnowballEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.ARMOR,
                new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET});
        SWIFTFOOTED = new SwiftfootedEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.ARMOR,
                new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET});
    }
}