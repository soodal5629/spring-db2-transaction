package hello.springtx.order;

// 결제 잔고가 부족할 때 발생한느 비즈니로 예외(체크 예외) => 롤백X
public class NotEnoughMoneyException extends Exception {

    public NotEnoughMoneyException(String message) {
        super(message);
    }
}
