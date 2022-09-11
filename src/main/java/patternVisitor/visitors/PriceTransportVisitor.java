package patternVisitor.visitors;

import patternVisitor.objects.Animal;
import patternVisitor.objects.Person;
import patternVisitor.objects.Shipment;

public class PriceTransportVisitor implements TransportVisitor{
    @Override
    public void visit(Animal animal) {
        System.out.println("Price per kilometer animal: " + animal.getWeight() * 0.2);
    }

    @Override
    public void visit(Person person) {
        int price = 6;
        if(person.isRegularCustomer()){
            System.out.println("Price per kilometer person: " + price/2);
        }else {
            System.out.println("Price per kilometer person: " + price);
        }
    }

    @Override
    public void visit(Shipment shipment) {
        int price = 2;
        if(shipment.isLarge()){
            System.out.println("Price per kilometer shipment: " + price*3);
        }else {
            System.out.println("Price per kilometer shipment: " + price);
        }
    }
}
