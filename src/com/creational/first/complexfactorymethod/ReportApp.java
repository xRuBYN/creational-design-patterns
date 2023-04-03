package com.creational.first.complexfactorymethod;

import java.util.Scanner;

public class ReportApp {

  public static void main(String[] args) {
    ReportGeneratorService reportGeneratorService = new ReportGeneratorService();
    Scanner scanner = new Scanner(System.in);
    String type;
    while (true) {
      type = scanner.nextLine();
      System.out.println(
          reportGeneratorService.buildReportGenerator(ReportType.valueOf(type.toUpperCase()))
              .generate());
    }
  }
}
