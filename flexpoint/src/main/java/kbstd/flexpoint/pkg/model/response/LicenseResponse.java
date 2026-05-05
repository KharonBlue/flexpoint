package kbstd.flexpoint.pkg.model.response;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LicenseResponse {

  private Long id;
  private String category;
  private int number;
  private Date expiration;
}
