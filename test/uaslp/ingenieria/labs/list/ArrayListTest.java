package uaslp.ingenieria.labs.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest
{
    @Test
    public void whenANewListIsCreated_ThenListIsEmpty()
    {
        ArrayList<Integer> lista = new ArrayList<>();
        assertEquals(0,lista.getSize());
    }

    @Test
    public void CheckList_WhenAddElement()
    {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(20);

        assertEquals(1,lista.getSize());
        assertEquals(20,lista.get(0));
    }
    @Test
    public void CheckList_WhenDeleteElement()
    {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(20);
        lista.add(21);
        lista.add(22);

        assertEquals(3,lista.getSize());
        assertEquals(22,lista.get(2));

        lista.delete(2);

        assertEquals(2,lista.getSize());
        assertEquals(null,lista.get(2));

    }

    @Test
    public void CheckList_whenDeleteElementIndexEquals4(){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);


        assertThrows(IndexOutOfBoundsException.class, ()->list.delete(4));
    }
    @Test
    public void CheckIterator(){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.getIterator();
        assertTrue(iterator.hasNext());
        assertEquals(1, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(2, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(3, iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void CheckReverseIterator(){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> reverseIterator = list.getReverseIterator();


        assertTrue(reverseIterator.hasNext());
        assertEquals(3, reverseIterator.next());
        assertTrue(reverseIterator.hasNext());
        assertEquals(2, reverseIterator.next());
        assertTrue(reverseIterator.hasNext());
        assertEquals(1, reverseIterator.next());
        assertFalse(reverseIterator.hasNext());
    }

    @Test
    public void CheckList_whenElementIndexEquals3(){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);

        assertThrows(IndexOutOfBoundsException.class, ()->list.get(3));
    }

}
