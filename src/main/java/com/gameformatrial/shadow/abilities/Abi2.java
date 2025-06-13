package com.gameformatrial.shadow.abilities;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;

public class Abi2 {
    // Here we gona make the first ability Shadow foot. Its make 5 slashes bij the player foot and have 4 blocks reach and mak it 3 blocks height

    public void Release(Level level, LivingEntity entity) {
        System.out.println("Shadow Slash");
        if (!(entity instanceof Player player) || level.isClientSide()) {
            return;
        }

        HitResult hitResult = entity.pick(1000, 0, false);
        if (hitResult.getType() != HitResult.Type.ENTITY) {
            return;
        }

        EntityHitResult position = ((EntityHitResult) hitResult);

        ResourceLocation soundLocation = ResourceLocation.withDefaultNamespace("");
        SoundEvent soundEvent = SoundEvent.createVariableRangeEvent(soundLocation);
        level.playSound(null, position.getEntity(), soundEvent, SoundSource.AMBIENT, 10.0f, 1.0f);
    }

    public int getUseDuration(ItemStack stack, LivingEntity Entity) {
        return Integer.MAX_VALUE;
    }
}
