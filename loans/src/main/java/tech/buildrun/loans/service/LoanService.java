package tech.buildrun.loans.service;

import org.springframework.stereotype.Service;
import tech.buildrun.loans.domain.Loan;
import tech.buildrun.loans.domain.LoanType;
import tech.buildrun.loans.dto.CustomerLoansRequest;
import tech.buildrun.loans.dto.CustomerLoansResponse;
import tech.buildrun.loans.dto.LoanResponse;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoanService {

    public CustomerLoansResponse checkLoanAvailability(CustomerLoansRequest loansRequest) {

        var customer = loansRequest.toCustomer();
        var loan = new Loan(customer);

        List<LoanResponse> loans = new ArrayList<>();

        if (loan.isPersonalLoanAvailable()) {
            loans.add(new LoanResponse(LoanType.PERSONAL, loan.getPersonalLoanInterestRate()));
        }

        if (loan.isPersonalLoanAvailable()) {
            loans.add(new LoanResponse(LoanType.GUARANTEED, loan.getGuaranteedLoanInterestRate()));
        }

        if (loan.isPersonalLoanAvailable()) {
            loans.add(new LoanResponse(LoanType.CONSIGNMENT, loan.getConsignmentLoanInterestRate()));
        }

        return new CustomerLoansResponse(loansRequest.name(), loans);
    }
}
