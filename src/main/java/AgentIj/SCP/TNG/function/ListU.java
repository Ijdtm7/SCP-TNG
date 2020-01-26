package AgentIj.SCP.TNG.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


@SuppressWarnings("unchecked")
public class ListU<E> extends ArrayList<E>
{
    public ListU(int size) {
        super(size);
    }


    @SuppressWarnings("unused")
    public ListU(E... elements) {
        this.addAll(Arrays.asList(elements));
    }

    @SuppressWarnings("unused")
    public ListU(Collection<? extends E> c) {
        addAll(c);
    }

    @Override
    public boolean add(E e) {
        if (!contains(e))
        {
            return super.add(e);
        }

        return false;
    }
}
