package kbstd.flexpoint.pkg.mapper;

import kbstd.flexpoint.pkg.model.entity.License;
import kbstd.flexpoint.pkg.model.request.LicenseRequest;
import kbstd.flexpoint.pkg.model.response.LicenseResponse;

public class LicenseMapper {

  public License map(LicenseRequest licenseRequest) {
    return License.builder()
        .number(licenseRequest.getNumber())
        .category(licenseRequest.getCategory())
        .expiration(licenseRequest.getExpiration())
        .build();
  }

  public License update(LicenseRequest licenseRequest, License license) {
    license.setCategory(licenseRequest.getCategory());
    license.setNumber(licenseRequest.getNumber());
    license.setExpiration(licenseRequest.getExpiration());
    return license;
  }

  public LicenseResponse mapResponse(License license){
    return LicenseResponse.builder()
        .id(license.getId())
        .number(license.getNumber())
        .category(license.getCategory())
        .expiration(license.getExpiration())
        .build();
  }
}
