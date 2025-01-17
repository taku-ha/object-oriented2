package sample;

public class Bus extends Car{

    int price;

    @Override
    public void stepOnAccele() {
        super.stepOnAccele();

        price += 30;
        System.out.println("料金は" + price + "円です");
    }
}
