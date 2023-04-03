package com.creational.first.complexfactorymethod;

public class PdfReportGenerator implements ReportGenerator{

  @Override
  public String generate() {
    return "Generate pdf report";
  }

  @Override
  public ReportType getReportType() {
    return ReportType.PDF;
  }
}
