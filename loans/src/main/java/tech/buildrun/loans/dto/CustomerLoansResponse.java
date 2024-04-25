package tech.buildrun.loans.dto;

import java.util.List;

public record CustomerLoansResponse(String customer, List<LoansResponse> loans) {
}
