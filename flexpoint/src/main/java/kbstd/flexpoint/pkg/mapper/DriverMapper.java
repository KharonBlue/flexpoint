package kbstd.flexpoint.pkg.mapper;

import kbstd.flexpoint.pkg.model.entity.Driver;
import kbstd.flexpoint.pkg.model.request.DriverRequest;

public class DriverMapper {

  public Driver map(DriverRequest driverRequest) {
    return Driver.builder()
        .id(driverRequest.getId())
        .fullName(driverRequest.getFullName())
        .phoneNumber(driverRequest.getPhoneNumber())
        //put LicenseMapper to map the License
        //.license(null)
        .build();
  }

  public Driver update(DriverRequest driverRequest, Driver driver) {
    driver.setFullName(driverRequest.getFullName());
    driver.setPhoneNumber(driverRequest.getPhoneNumber());
    //driver.setLicense();
    return driver;
  }
}
