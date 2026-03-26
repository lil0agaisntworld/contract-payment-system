package application;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractPaymentService;
import model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");

        System.out.println("Numero: ");
        Integer contractNumber = sc.nextInt();
        sc.nextLine();

        System.out.println("Data (dd/MM/yyyy): ");
        LocalDate contractDate = LocalDate.parse(sc.nextLine(), fmt);

        System.out.println("Valor do contrato: ");
        Double contractValue = sc.nextDouble();

        System.out.println("Entre com o numero de parcelas: ");
        Integer installment = sc.nextInt();

        Contract ct = new Contract(contractNumber, contractValue, contractDate);

        ContractPaymentService service = new ContractPaymentService(new PaypalService());
        service.processContract(ct, installment);
        System.out.println("Parcelas:");
        for (Installment i : ct.getInstallments()){
            System.out.println(i.getDueDate() + " - $" + i.getAmount());
        }

    }
}
