package com.creational.first.complexfactorymethod;

import com.creational.first.complexfactorymethod.init.DIInitializer;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ReportGeneratorService {

  private final Map<ReportType, ReportGenerator> map;

  private final List<ReportGenerator> reports = DIInitializer.reportGeneratorList;

  public ReportGeneratorService() {
    map = reports.stream()
        .collect(Collectors.toMap(ReportGenerator::getReportType, Function.identity()));
  }

  public ReportGenerator buildReportGenerator(ReportType reportType) {
    ReportGenerator reportGenerator = map.get(reportType);
    if (Objects.isNull(reportGenerator)) {
      throw new FileTypeNotFoundException();
    }
    return reportGenerator;
  }
}
