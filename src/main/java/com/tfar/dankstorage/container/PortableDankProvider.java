package com.tfar.dankstorage.container;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.Nullable;

public class PortableDankProvider implements INamedContainerProvider {

  public final int tier;
  public PortableDankProvider(int tier){
    this.tier = tier;
  }

  @Override
  public ITextComponent getDisplayName() {
    return new TranslationTextComponent("test");
  }

  @Nullable
  @Override
  public Container createMenu(int i, PlayerInventory playerInventory, PlayerEntity playerEntity) {
    switch (tier) {
      case 1:
      default:
        return new DankContainers.PortableDankContainer1(i, playerEntity.world, playerInventory, playerEntity);
      case 2:
        return new DankContainers.PortableDankContainer2(i, playerEntity.world, playerInventory, playerEntity);
      case 3:
        return new DankContainers.PortableDankContainer3(i, playerEntity.world, playerInventory, playerEntity);
      case 4:
        return new DankContainers.PortableDankContainer4(i, playerEntity.world, playerInventory, playerEntity);
      case 5:
        return new DankContainers.PortableDankContainer5(i, playerEntity.world, playerInventory, playerEntity);
      case 6:
        return new DankContainers.PortableDankContainer6(i, playerEntity.world, playerInventory, playerEntity);
      case 7:
        return new DankContainers.PortableDankContainer7(i, playerEntity.world, playerInventory, playerEntity);
    }
  }
}
