package model.services;

public class PaypalService implements OnlinePaymentService{

    public Double interest(Double amount, Integer months){
        return ((amount * 0.01 * months) + amount);
    }
    public Double paymentFee(Double amount){
        return (amount * 0.02) + amount;
    }
}
