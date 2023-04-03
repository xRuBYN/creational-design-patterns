package com.creational.first.abstractfactory.domain.ice;

import com.creational.first.abstractfactory.domain.Mob;

public class IceMob extends Mob {

  public IceMob() {
    damage = "Ice damage";
  }

  @Override
  public void spawn() {
    System.out.println("Spawn ice mob");
  }
}
