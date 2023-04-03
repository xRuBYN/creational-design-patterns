package com.creational.first.abstractfactory.domain.fire;

import com.creational.first.abstractfactory.domain.Mob;

public class FireMob extends Mob {

  public FireMob() {
    damage = "Fire damage";
  }

  @Override
  public void spawn() {
    System.out.println("Spawn fire mob");
  }
}
