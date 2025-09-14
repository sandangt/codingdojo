package dojo.designpattern.derekbanas.behavioral.responsibilitychain;

public class TestCalcChain {

    public static void main(String[] args) {
        Chain chainCal1 = new AddNumbers();
        Chain chainCal2 = new AddNumbers();
        Chain chainCal3 = new MultNumbers();
        Chain chainCal4 = new SubtractNumbers();

        chainCal1.setNextChain(chainCal2);
        chainCal2.setNextChain(chainCal3);
        chainCal3.setNextChain(chainCal4);

        Numbers request = new Numbers(2,4,"add");

        chainCal1.calculate(request);

    }

}
