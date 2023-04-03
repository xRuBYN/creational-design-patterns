package com.creational.first.abstractfactory.factory;

import com.creational.first.abstractfactory.domain.Mob;
import com.creational.first.abstractfactory.domain.Tower;

public interface LevelFactory {

  Tower createTower();

  Mob createMob();

}
