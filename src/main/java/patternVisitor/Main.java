package patternVisitor;

import patternVisitor.objects.Animal;
import patternVisitor.objects.Person;
import patternVisitor.objects.Shipment;
import patternVisitor.transportable.Transportable;
import patternVisitor.visitors.NameTransportVisitor;
import patternVisitor.visitors.PriceTransportVisitor;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Dog", 30);
        Person person = new Person("Dawid", "Nowak", true);
        Shipment shipment = new Shipment("PL", "4325452", false);

        List<Transportable> transportables = Arrays.asList(animal, person, shipment);

        NameTransportVisitor nameTransportVisitor = new NameTransportVisitor();
        PriceTransportVisitor priceTransportVisitor = new PriceTransportVisitor();

        transportables.stream()
                .forEach(object -> object.accept(nameTransportVisitor));

        transportables.stream()
                .forEach(object -> object.accept(priceTransportVisitor));
    }
}
