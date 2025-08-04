package SmartBizzk.SmartBizzk.DTOs;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ConfirmationLetterRequest {
    private Long partyId;
    private String financialYear;
    private String letterDate;
    private SenderInfo senderInfo;
    private CompanyInfo companyInfo;
}
