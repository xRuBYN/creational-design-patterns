package com.creational.first.abstractfactory.domain.ice;

import com.creational.first.abstractfactory.domain.Tower;

public class IceTower extends Tower {

  public IceTower() {
    wight = 50;
  }

  @Override
  public void build() {
    System.out.println("Build ice tower");
  }
}
