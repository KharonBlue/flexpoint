package kbstd.flexpoint.pkg.model.request;

import lombok.Data;

@Data
public class DriverRequest {
  private Long id;
  private String fullName;
  private int phoneNumber;
  private LicenseRequest licenseRequest;
}
