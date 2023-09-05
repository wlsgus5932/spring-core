package hello.core.order;

public interface OrderService {
    Order createOrder(Long Id, String itemName, int itemPrice);

}
