package patternVisitor.visitors;

import patternVisitor.objects.Animal;
import patternVisitor.objects.Person;
import patternVisitor.objects.Shipment;

public class NameTransportVisitor implements TransportVisitor {
    @Override
    public void visit(Animal animal) {
        System.out.println(animal.getKind());
    }

    @Override
    public void visit(Person person) {
        System.out.println(person.getFirstName() + " " + person.getLastName());
    }

    @Override
    public void visit(Shipment shipment) {
        System.out.println(shipment.getPrefix() + ", serial number: " + shipment.getSerialNumber());
    }
}
