package com.creational.first.abstractfactory.factory;

import com.creational.first.abstractfactory.domain.ice.IceMob;
import com.creational.first.abstractfactory.domain.ice.IceTower;
import com.creational.first.abstractfactory.domain.Mob;
import com.creational.first.abstractfactory.domain.Tower;

public class IceLevel implements LevelFactory {

  @Override
  public Tower createTower() {
    return new IceTower();
  }

  @Override
  public Mob createMob() {
    return new IceMob();
  }
}
