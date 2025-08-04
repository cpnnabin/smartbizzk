package SmartBizzk.SmartBizzk.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String supplierName;
    private LocalDate purchaseDate;

    private String itemName;
    private Integer quantity;
    private Double totalCost;
}