package uaslp.ingenieria.labs.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTest
{
    @Test
    public void whenANewLinkedListIsCreated_ThenLinkedListIsEmpty()
    {
        int size;
        LinkedList<Integer> linkedList = new LinkedList<>();
        size = linkedList.getSize();
        assertEquals(0,linkedList.getSize());
    }
    @Test
    public void addElementToLinkedList()
    {
        int element = 1;
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(element);

        assertEquals(element,linkedList.get(0));
    }

    @Test
    public void deleteFirstElementsFromLinkedList()
    {

        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.add(1);
        linkedList2.add(2);
        linkedList2.add(3);

        linkedList2.delete(0);

        assertEquals(2,linkedList2.getSize());
    }
    @Test
    public void deleteMiddleElementsFromLinkedList()
    {

        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.add(1);
        linkedList2.add(2);
        linkedList2.add(3);

        linkedList2.delete(1);

        assertEquals(2,linkedList2.getSize());
    }
    @Test
    public void deleteLastElementsFromLinkedList()
    {

        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.add(1);
        linkedList2.add(2);
        linkedList2.add(3);

        linkedList2.delete(2);

        assertEquals(2,linkedList2.getSize());
    }

    @Test
    public void deleteAllElementsFromLinkedList()
    {

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        linkedList.delete(2);
        linkedList.delete(1);
        linkedList.delete(0);

        assertEquals(0,linkedList.getSize());
    }


    @Test
    public void CheckLinkedListElementReverseIterator(){
        Character element = 0;
        LinkedList<Character> linkedList = new LinkedList<>();
        linkedList.add('a');

        Iterator<Character> it = linkedList.getReverseIterator();

        while(it.hasNext()){
            element = it.next();
        }

        assertEquals('a',element);
    }

    @Test
    public void CheckLinkedListElementIterator(){
        Character element = 'a';
        LinkedList<Character> linkedList = new LinkedList<>();
        linkedList.add('b');

        Iterator<Character> it = linkedList.getIterator();

        while(it.hasNext()){
            element = it.next();
        }

        assertEquals('b',element);
    }

    @Test
    public void listCountIsCorrect()
    {
        LinkedList<Integer> linkedList1 = new LinkedList<>();


        assertEquals(8,linkedList1.getListsCount());


    }
}
