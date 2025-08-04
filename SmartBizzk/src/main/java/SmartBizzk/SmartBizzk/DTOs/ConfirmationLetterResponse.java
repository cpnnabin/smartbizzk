package SmartBizzk.SmartBizzk.DTOs;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ConfirmationLetterResponse {
    private CompanyInfo companyInfo;
    private String letterDate;
    private Long partyId;
    private String financialYear;
    private SenderInfo senderInfo;

    private double openingBalance;
    private double salesTaxable;
    private double salesVat;
    private double salesTotal;
    private double purchaseTaxable;
    private double purchaseVat;
    private double purchaseTotal;
    private double closingBalance;
}
