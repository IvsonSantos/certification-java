package simulate;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Target;

//@FunctionalInterface
//@Inherited
//@interface
public interface InterfaceAnotada {

    public abstract int breed();
    // line n2
    //@Override
    public default InterfaceAnotada callPet(){
        return this;
    }
    // line n3
    //@Target(ElementType.METHOD)
    @Deprecated(forRemoval=true)
    void speak();
}
