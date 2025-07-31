package SmartBizzk.SmartBizzk.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "payments_in")
public class PaymentIn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long partyId;

    private Double amount;

    private LocalDate dateEn;   // English date (Gregorian)

    private String dateNp;      // Nepali date as string

    private String remarks;
}
