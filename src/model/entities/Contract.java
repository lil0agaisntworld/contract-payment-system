package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    private Integer number;
    private LocalDate date;
    private Double totalValue;
    private List<Installment> installments = new ArrayList<>();

    public Contract(Integer number, Double totalValue, LocalDate date) {
        this.number = number;
        this.totalValue = totalValue;
        this.date = date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public Integer getNumber() {
        return number;
    }

    public LocalDate getDate() {
        return date;
    }

    public List<Installment> getInstallments() {
        return installments;
    }
}
