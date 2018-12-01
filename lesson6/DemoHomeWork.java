package lesson6;

import java.util.Date;

public class DemoHomeWork {
    public static void main(String[] args) {

        Order ord = new Order();
        ord.price = 100;
        ord.dateCreated = new Date();
        ord.isConfirmed = false;
        ord.city = "Dnepr";
        ord.country = "Ukraine";
        ord.type = "Buy";

        System.out.println(ord.dateConfirmed);
        System.out.println();
        ord.confirmOrder();


        System.out.println(ord.confirmOrder());
        System.out.println(ord.dateConfirmed);

    }

    public Order createOrder() {
        Order ord = new Order();
        ord.price = 100;
        ord.dateCreated = new Date();
        ord.isConfirmed = false;
        ord.city = "Dnepr";
        ord.country = "Ukraine";
        ord.type = "Buy";

        return ord;
    }

    public Order createOrderAndCallMethods(){
        Order ord = new Order();
        ord.price = 100;
        ord.dateCreated = new Date();
        ord.isConfirmed = true;
        ord.dateConfirmed = new Date();
        ord.city = "Kiev";
        ord.country = "Ukraine";
        ord.type = "SomeValue";

        ord.confirmOrder();
        ord.checkPrice();
        ord.isValidType();

        return ord;
    }
}