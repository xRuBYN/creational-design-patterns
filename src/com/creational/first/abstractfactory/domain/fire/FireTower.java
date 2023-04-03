package com.creational.first.abstractfactory.domain.fire;

import com.creational.first.abstractfactory.domain.Tower;

public class FireTower extends Tower {

  public FireTower() {
    wight = 100;
  }

  @Override
  public void build() {
    System.out.println("Build a fire tower");
  }
}
