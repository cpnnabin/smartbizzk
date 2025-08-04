package SmartBizzk.SmartBizzk.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "confirmation_letters")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ConfirmationLetter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long partyId;
    private String financialYear;
    private String letterDate;

    private String senderName;
    private String senderDesignation;

    private String companyName;
    private String companyAddress;
    private String companyPhone;
    private String companyVatNo;
    private String companyRegNo;

    private double openingBalance;
    private double salesTaxable;
    private double salesVat;
    private double salesTotal;
    private double purchaseTaxable;
    private double purchaseVat;
    private double purchaseTotal;
    private double closingBalance;
}
