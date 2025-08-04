package SmartBizzk.SmartBizzk.service;

import SmartBizzk.SmartBizzk.DTOs.*;
import SmartBizzk.SmartBizzk.entity.ConfirmationLetter;
import SmartBizzk.SmartBizzk.entity.Party;
import SmartBizzk.SmartBizzk.repo.ConfirmationLetterRepository;
import SmartBizzk.SmartBizzk.repo.PartyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ConfirmationLetterService {

    private final PartyRepository partyRepository;
    private final ConfirmationLetterRepository confirmationLetterRepository;

    public ConfirmationLetterResponse generateLetter(ConfirmationLetterRequest request) {
        Party party = partyRepository.findById(request.getPartyId())
                .orElseThrow(() -> new RuntimeException("Party not found"));

        // Just dummy transaction data for now, can be replaced with real logic
        double openingBalance = 0;
        double salesTaxable = 2363610.00;
        double salesVat = 307269.30;
        double salesTotal = 2670879.30;
        double purchaseTaxable = 0;
        double purchaseVat = 0;
        double purchaseTotal = 0;
        double closingBalance = 0;

        ConfirmationLetter letter = ConfirmationLetter.builder()
                .partyId(party.getId())
                .financialYear(request.getFinancialYear())
                .letterDate(request.getLetterDate())
                .senderName(request.getSenderInfo().getName())
                .senderDesignation(request.getSenderInfo().getDesignation())
                .companyName(request.getCompanyInfo().getName())
                .companyAddress(request.getCompanyInfo().getAddress())
                .companyPhone(request.getCompanyInfo().getPhone())
                .companyVatNo(request.getCompanyInfo().getVatNo())
                .companyRegNo(request.getCompanyInfo().getRegNo())
                .openingBalance(openingBalance)
                .salesTaxable(salesTaxable)
                .salesVat(salesVat)
                .salesTotal(salesTotal)
                .purchaseTaxable(purchaseTaxable)
                .purchaseVat(purchaseVat)
                .purchaseTotal(purchaseTotal)
                .closingBalance(closingBalance)
                .build();

        confirmationLetterRepository.save(letter);

        return ConfirmationLetterResponse.builder()
                .companyInfo(request.getCompanyInfo())
                .letterDate(request.getLetterDate())
                .partyId(party.getId())
                .financialYear(request.getFinancialYear())
                .senderInfo(request.getSenderInfo())
                .openingBalance(openingBalance)
                .salesTaxable(salesTaxable)
                .salesVat(salesVat)
                .salesTotal(salesTotal)
                .purchaseTaxable(purchaseTaxable)
                .purchaseVat(purchaseVat)
                .purchaseTotal(purchaseTotal)
                .closingBalance(closingBalance)
                .build();
    }
}
