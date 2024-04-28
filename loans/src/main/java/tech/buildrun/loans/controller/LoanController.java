package tech.buildrun.loans.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tech.buildrun.loans.dto.CustomerLoansRequest;
import tech.buildrun.loans.dto.CustomerLoansResponse;
import tech.buildrun.loans.service.LoanService;

@RestController
public class LoanController {

    @Autowired
    private LoanService loanService;

    @PostMapping(value = "/customer-loans")
    public ResponseEntity<CustomerLoansResponse> customerLoans(@RequestBody @Valid CustomerLoansRequest loansRequest) {
        var response = loanService.checkLoanAvailability(loansRequest);
        return ResponseEntity.ok(response);
    }
}
