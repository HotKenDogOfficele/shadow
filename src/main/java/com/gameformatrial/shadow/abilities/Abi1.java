package com.gameformatrial.shadow.abilities;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;

public class Abi1 {
    // Here we gona make the first ability Shadow foot. Its make 5 slashes bij the player foot and have 4 blocks reach and mak it 3 blocks height

    public void Release(Level level, LivingEntity entity) {
        System.out.println("Shadow foot");
        if (!(entity instanceof Player player) || level.isClientSide()) {
            return;
        }

        HitResult hitResult = entity.pick(1000, 0, false);
        if (hitResult.getType() != HitResult.Type.ENTITY) {
            return;
        }

        EntityHitResult position = ((EntityHitResult) hitResult);


    }

    public int getUseDuration(ItemStack stack, LivingEntity Entity) {
        return Integer.MAX_VALUE;
    }
}
