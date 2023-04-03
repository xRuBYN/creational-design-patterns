package com.creational.first.complexfactorymethod;

public class CsvReportGenerator implements ReportGenerator {

  @Override
  public String generate() {
    return "Generate csv report";
  }

  @Override
  public ReportType getReportType() {
    return ReportType.CSV;
  }
}
