package SmartBizzk.SmartBizzk.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "party_ledger")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PartyLedger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String partyName;

    private String transactionType; // SALE, PURCHASE, PAYMENT_IN, PAYMENT_OUT, etc.

    private Double amount;

    private LocalDate transactionDate;

    private String remarks;
}
