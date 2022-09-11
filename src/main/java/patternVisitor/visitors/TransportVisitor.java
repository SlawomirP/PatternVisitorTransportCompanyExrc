package patternVisitor.visitors;

import patternVisitor.objects.Animal;
import patternVisitor.objects.Person;
import patternVisitor.objects.Shipment;

public interface TransportVisitor {

    void visit(Animal animal);
    void visit(Person person);
    void visit(Shipment shipment);
}
