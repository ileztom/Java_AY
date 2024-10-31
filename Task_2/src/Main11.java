interface PaymentSystem {
    void pay();
    void refund();
}

class CreditCard implements PaymentSystem {
    @Override
    public void pay() {
        System.out.println("Оплата кредитной картой.");
    }

    @Override
    public void refund() {
        System.out.println("Возврат средств на кредитную карту.");
    }
}

class PayPal implements PaymentSystem {
    @Override
    public void pay() {
        System.out.println("Оплата через PayPal.");
    }

    @Override
    public void refund() {
        System.out.println("Возврат средств через PayPal.");
    }
}