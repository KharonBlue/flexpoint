package kbstd.flexpoint.pkg.model.request;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LicenseRequest {

  private Long id;
  private String category;
  private int number;
  private Date expiration;
}
