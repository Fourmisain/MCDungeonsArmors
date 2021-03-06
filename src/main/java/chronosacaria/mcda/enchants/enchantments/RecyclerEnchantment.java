package chronosacaria.mcda.enchants.enchantments;

import chronosacaria.mcda.Mcda;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.registry.Registry;

public class RecyclerEnchantment extends Enchantment {
    public RecyclerEnchantment(Rarity weight, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
        super(weight, type, slotTypes);
        Registry.register(Registry.ENCHANTMENT, Mcda.ID("recycler"), this);
    }

    public int getMaxLevel(){
        return 3;
    }

    public void onUserDamaged(LivingEntity user, Entity attacker, int level){
        if (user.getRecentDamageSource().isProjectile()){
            float recyclerRand = user.getRandom().nextFloat();
            float recyclerChance = level * 0.1F;
            if (recyclerRand <= recyclerChance){
                ItemEntity arrowDrop = new ItemEntity(user.world, user.getX(), user.getY(), user.getZ(),
                        new ItemStack(Items.ARROW));
                user.world.spawnEntity(arrowDrop);
            }
        }
    }
}
