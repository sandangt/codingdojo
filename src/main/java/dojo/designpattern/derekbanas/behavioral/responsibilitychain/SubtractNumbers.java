package dojo.designpattern.derekbanas.behavioral.responsibilitychain;

public class SubtractNumbers implements Chain {

    private Chain nextInChain;

    @Override
    public void setNextChain(Chain next) {
        this.nextInChain = next;
    }

    @Override
    public void calculate(Numbers request) {
        if ("sub".equals(request.getCalculationWanted())) {
            var result = request.getNumber1() - request.getNumber2();
            String resultStr = "%d - %d = %d".formatted(request.getNumber1(), request.getNumber2(), result);
            System.out.println(resultStr);
        } else {
            forwardOrEnd(request);
        }
    }

    @Override
    public Chain getNextInChain() {
        return this.nextInChain;
    }
}
