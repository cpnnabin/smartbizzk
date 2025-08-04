package SmartBizzk.SmartBizzk.DTOs;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CompanyInfo {
    private String name;
    private String address;
    private String phone;
    private String vatNo;
    private String regNo;
}
