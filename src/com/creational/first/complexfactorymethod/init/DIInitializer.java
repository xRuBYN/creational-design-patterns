package com.creational.first.complexfactorymethod.init;

import com.creational.first.complexfactorymethod.CsvReportGenerator;
import com.creational.first.complexfactorymethod.PdfReportGenerator;
import com.creational.first.complexfactorymethod.ReportGenerator;
import com.creational.first.complexfactorymethod.XmlReportGenerator;
import java.util.ArrayList;
import java.util.List;

public class DIInitializer {
  public static List<ReportGenerator> reportGeneratorList = new ArrayList<>();

  static {
    reportGeneratorList.add(new XmlReportGenerator());
    reportGeneratorList.add(new PdfReportGenerator());
    reportGeneratorList.add(new CsvReportGenerator());
  }
}
