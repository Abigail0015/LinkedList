package uaslp.ingenieria.labs.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTest
{
    @Test
    public void whenANewListIsCreated_ThenListIsEmpty()
    {
        ArrayList<Integer> lista = new ArrayList<>();
        assertEquals(0,lista.getSize());
    }
    @Test
    public void  whenANewListIsCreated_sizeIsZero()
    {
        int size;

        ArrayList<Integer> lista = new ArrayList<>();
        size = lista.getSize();
        assertEquals(0,size);
    }

}
