package net.wolfertamer.tutorialmod.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;

public class MobInspectorItem extends Item {
    public MobInspectorItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        float health = entity.getHealth();
        float maxHealth = entity.getMaxHealth();
        String s = String.format("%.1f/%.1f Health",health,maxHealth);
        if(entity instanceof TameableEntity && ((TameableEntity) entity).getOwner() != null) {
            s += ", Owner: " + ((TameableEntity) entity).getOwner().getDisplayName();
        }
        Text t = Text.literal(s);
        user.sendMessage(t);
        return ActionResult.SUCCESS;
    }
}
