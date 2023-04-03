package com.creational.first.abstractfactory;

import com.creational.first.abstractfactory.domain.Mob;
import com.creational.first.abstractfactory.domain.Tower;
import com.creational.first.abstractfactory.factory.FireLevel;
import com.creational.first.abstractfactory.factory.IceLevel;
import com.creational.first.abstractfactory.factory.LevelFactory;
import com.creational.first.abstractfactory.utils.Menu;
import java.util.Scanner;

public class GameApp {

  public static void main(String[] args) {
    LevelFactory levelFactory;
    Mob mob;
    Tower tower;

    Scanner scanner = new Scanner(System.in);
    String type;
    while (true) {
      Menu.create();
      type = scanner.nextLine();
      switch (type.toUpperCase()) {
        case "FIRE" -> {
          levelFactory = new FireLevel();
          mob = levelFactory.createMob();
          tower = levelFactory.createTower();
          tower.build();
          mob.spawn();
        }
        case "ICE" -> {
          levelFactory = new IceLevel();
          mob = levelFactory.createMob();
          tower = levelFactory.createTower();
          tower.build();
          mob.spawn();
        }
        default -> System.out.println("Level is in development...");
      }
    }


  }

}
