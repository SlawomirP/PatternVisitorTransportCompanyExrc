package patternVisitor.transportable;

import patternVisitor.visitors.TransportVisitor;

public interface Transportable {

    void accept(TransportVisitor transportVisitor);
}
