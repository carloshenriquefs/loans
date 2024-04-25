package tech.buildrun.loans.dto;

import tech.buildrun.loans.domain.LoanType;

public record LoansResponse(LoanType loanType, Integer interest_rate) {
}
