package tech.buildrun.loans.dto;

public record CustomerLoansRequest(Integer age,
                                   String cpf,
                                   String name,
                                   Double income,
                                   String location
) {
}
