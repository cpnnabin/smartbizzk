package SmartBizzk.SmartBizzk.controller;

import SmartBizzk.SmartBizzk.DTOs.ConfirmationLetterRequest;
import SmartBizzk.SmartBizzk.DTOs.ConfirmationLetterResponse;
import SmartBizzk.SmartBizzk.service.ConfirmationLetterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/confirmation-letter")
@RequiredArgsConstructor
public class ConfirmationLetterController {

    private final ConfirmationLetterService confirmationLetterService;

    @PostMapping
    public ResponseEntity<ConfirmationLetterResponse> generateLetter(@RequestBody ConfirmationLetterRequest request) {
        ConfirmationLetterResponse response = confirmationLetterService.generateLetter(request);
        return ResponseEntity.ok(response);
    }

}
