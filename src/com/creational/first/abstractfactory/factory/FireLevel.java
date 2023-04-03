package com.creational.first.abstractfactory.factory;

import com.creational.first.abstractfactory.domain.fire.FireMob;
import com.creational.first.abstractfactory.domain.fire.FireTower;
import com.creational.first.abstractfactory.domain.Mob;
import com.creational.first.abstractfactory.domain.Tower;

public class FireLevel implements LevelFactory {

  @Override
  public Tower createTower() {
    return new FireTower();
  }

  @Override
  public Mob createMob() {
    return new FireMob();
  }
}
