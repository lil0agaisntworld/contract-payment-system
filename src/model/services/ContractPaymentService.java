package model.services;

import model.entities.Contract;
import model.entities.Installment;

import java.time.LocalDate;
public class ContractPaymentService {

    private OnlinePaymentService paymentService;


    public ContractPaymentService(OnlinePaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processContract(Contract contract, Integer months){

        Double division = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++){

            LocalDate actualMonth = contract.getDate().plusMonths(i);

            Double installmentValue = paymentService.interest(division, i);
            Double paymentFeeValue = paymentService.paymentFee(installmentValue);



            contract.getInstallments().add(new Installment(actualMonth, paymentFeeValue));
        }
    }
}
