package dojo.designpattern.derekbanas.behavioral.responsibilitychain;

public interface Chain {

    void setNextChain(Chain next);

    void calculate(Numbers request);

    Chain getNextInChain();

    default void forwardOrEnd(Numbers request) {
        if (getNextInChain() == null) {
            System.out.println("End of chain");
            return;
        }
        getNextInChain().calculate(request);
    }

}
