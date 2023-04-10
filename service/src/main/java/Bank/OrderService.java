package Bank;

public class OrderService implements PaymentService{
	private PaymentService paymentService;
    Order o;
    
	public OrderService(Order o) {
		super();
		this.o = o;
	}

	public PaymentService getPaymentService() {
		return paymentService;
	}

	public void setPaymentService(PaymentService paymentService) {
		this.paymentService = paymentService;
	}
	public void processPayment() {
		System.out.println("orderId : "+o.orderId+"\n"+"customerId : "+o.customerId+"\n"+"order date : "+o.orderDate+"\n"+"total amount : "+o.totalAmount);
	}
	public void placeOrder() {
		System.out.println("your order is placed");
		
		
	}
	public void cancelOrder() {
		System.out.println("your order is cancelled");
	}

}
