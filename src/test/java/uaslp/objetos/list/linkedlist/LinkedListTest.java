package uaslp.objetos.list.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.exception.NotNullValuesAllowedException;
import uaslp.objetos.list.exception.NotValidIndexException;

public class LinkedListTest {

    @Test
    public void givenANewList_whenGetSize_thenResultIsZero(){
        LinkedList<String> list = new LinkedList<>();

        int sizeOfList= list.getSize();

        Assertions.assertEquals(0,sizeOfList, "Size of list after creation must be zero");
    }



    @Test
    public void givenANewList_whenGetAt_thenExceptionIsThrown(){
        LinkedList<String> list = new LinkedList<>();

        try {
            list.getAt(0);
            Assertions.fail("An exception should be thrown getting element zero");
            }catch(NotValidIndexException ex) {
        }

    }




    @Test
    public void givenANewList_whenAddAnElement_thenSizeIsOne() throws NotNullValuesAllowedException, NotValidIndexException {
        LinkedList<String> list = new LinkedList<>();

        list.addAtFront("Hola");

        int size= list.getSize();

        Assertions.assertEquals(1,size);
        Assertions.assertEquals("Hola", list.getAt(0));
    }

    @Test
    public void givenANewListWith1Element_whenAddAtFrontAnElement_thenSizeIsTwo() throws NotNullValuesAllowedException, NotValidIndexException {
        LinkedList<String> list = new LinkedList<>();

        list.addAtFront("Hola");

        list.addAtFront("Mundo");

        int size= list.getSize();

        Assertions.assertEquals(2,size);
        Assertions.assertEquals("Mundo", list.getAt(0));
        Assertions.assertEquals("Hola", list.getAt(1));
    }

    @Test
    public void givenANewList_whenAddAtTailAnElement_thenSizeIsOne() throws NotNullValuesAllowedException, NotValidIndexException {
        LinkedList<String> list = new LinkedList<>();

        list.addAtTail("Hola");

        int size= list.getSize();

        Assertions.assertEquals(1,size);
        Assertions.assertEquals("Hola", list.getAt(0));
    }

    @Test
    public void givenANewListWith1Element_whenAddAtTailAnElement_thenSizeIsTwo() throws NotNullValuesAllowedException, NotValidIndexException {
        LinkedList<String> list = new LinkedList<>();

        list.addAtTail("Hola");

        list.addAtTail("Mundo");

        int size= list.getSize();

        Assertions.assertEquals(2,size);
        Assertions.assertEquals("Hola", list.getAt(0));
        Assertions.assertEquals("Mundo", list.getAt(1));
    }

    @Test
    public void givenAListWithOneElement_whenRemove_thenSizeIsZero() throws NotValidIndexException, NotNullValuesAllowedException {
        LinkedList<String> list = new LinkedList<>();

        list.addAtFront("Hola");

        list.remove(0);

        int size = list.getSize();

        Assertions.assertEquals(0,size);

    }

    @Test
    public void givenAListWithTwoElements_whenRemoveIndex1_thenSizeIsOne() throws NotValidIndexException, NotNullValuesAllowedException {
        LinkedList<String> list = new LinkedList<>();

        list.addAtFront("Hola");
        list.addAtTail("Mundo");

        list.remove(1);

        int size = list.getSize();

        Assertions.assertEquals(1,size);
        Assertions.assertEquals("Hola", list.getAt(0));

    }

    @Test
    public void givenAListWithTwoElements_whenRemoveIndex0_thenSizeIsOne() throws NotValidIndexException, NotNullValuesAllowedException {
        LinkedList<String> list = new LinkedList<>();

        list.addAtFront("Hola");
        list.addAtTail("Mundo");

        list.remove(0);

        int size = list.getSize();

        Assertions.assertEquals(1,size);
        Assertions.assertEquals("Mundo", list.getAt(0));

    }

    @Test
    public void givenAListWithTwoElements_whenRemoveIndex3_thenNotValidIndexExceptionIsThrown() throws NotValidIndexException, NotNullValuesAllowedException {
        LinkedList<String> list = new LinkedList<>();

        list.addAtFront("Hola");
        list.addAtTail("Mundo");

        Assertions.assertThrows(NotValidIndexException.class,()->list.remove(3));

    }

    @Test
    public void givenAListWithTwoElements_whenAddAtFrontNullValue_thenNotNullValuesAllowedExceptionIsThrown() throws NotValidIndexException, NotNullValuesAllowedException {
        LinkedList<String> list = new LinkedList<>();

        list.addAtFront("Hola");
        list.addAtTail("Mundo");

        Assertions.assertThrows(NotNullValuesAllowedException.class,()->list.addAtFront(null));

    }

    @Test
    public void givenAListWithTwoElements_whenAddAtTailNullValue_thenNotNullValuesAllowedExceptionIsThrown() throws NotValidIndexException, NotNullValuesAllowedException {
        LinkedList<String> list = new LinkedList<>();

        list.addAtFront("Hola");
        list.addAtTail("Mundo");

        Assertions.assertThrows(NotNullValuesAllowedException.class,()->list.addAtTail(null));

    }

    @Test
    public void givenAListWithTwoElements_whenSetAtNullValue_thenNotNullValuesAllowedExceptionIsThrown() throws NotValidIndexException, NotNullValuesAllowedException {
        LinkedList<String> list = new LinkedList<>();

        list.addAtFront("Hola");
        list.addAtTail("Mundo");

        Assertions.assertThrows(NotNullValuesAllowedException.class,()->list.setAt(0,null));

    }

    @Test
    public void givenAListWithTwoElements_whenSetAtIndex3_thenNotValidIndexExceptionIsThrown() throws NotValidIndexException, NotNullValuesAllowedException {
        LinkedList<String> list = new LinkedList<>();

        list.addAtFront("Hola");
        list.addAtTail("Mundo");

        Assertions.assertThrows(NotValidIndexException.class,()->list.setAt(3, "Valor"));

    }

    @Test
    public void givenAListWith3Elements_whenRemoveElementAtTail_thenSizeIsTwo() throws NotValidIndexException, NotNullValuesAllowedException {
        LinkedList<String> list = new LinkedList<>();

        list.addAtFront("Adios");
        list.addAtTail("Mundo");
        list.addAtTail("Cruel");

        list.remove(2);

        int size = list.getSize();

        Assertions.assertEquals(2,size);
        Assertions.assertEquals("Adios", list.getAt(0));
        Assertions.assertEquals("Mundo", list.getAt(1));

    }

    @Test
    public void givenAListWithThreeElements_whenRemoveIndex1_thenSizeIsTwo() throws NotValidIndexException, NotNullValuesAllowedException {
        LinkedList<String> list = new LinkedList<>();

        list.addAtTail("Mundo");
        list.addAtTail("Cruel");
        list.addAtFront("Adios");

        list.remove(1);

        int size = list.getSize();

        Assertions.assertEquals(2,size);
        Assertions.assertEquals("Adios", list.getAt(0));
        Assertions.assertEquals("Cruel", list.getAt(1));

    }

    @Test
    public void givenAListWithThreeElements_whenRemoveAll_thenSizeIsZero() throws NotValidIndexException, NotNullValuesAllowedException {
        LinkedList<String> list = new LinkedList<>();

        list.addAtTail("Mundo");
        list.addAtTail("Cruel");
        list.addAtFront("Adios");

        list.removeAll();

        int size = list.getSize();

        Assertions.assertEquals(0,size);


    }

    @Test
    public void givenAListWithTwoElements_whenSetAtZero_thenElementIsModified() throws NotValidIndexException, NotNullValuesAllowedException {
        LinkedList<String> list = new LinkedList<>();

        list.addAtTail("Mundo");
        list.addAtFront("Adios");

        list.setAt(0,"Hola");

        int size = list.getSize();

        Assertions.assertEquals(2,size);
        Assertions.assertEquals("Hola", list.getAt(0));
        Assertions.assertEquals("Mundo", list.getAt(1));

    }

    @Test
    public void givenAListWith3Elements_whenGetIterator_thenIteratorWorksOverAllThreeElements() throws NotValidIndexException, NotNullValuesAllowedException {
        LinkedList<String> list = new LinkedList<>();

        list.addAtFront("Adios");
        list.addAtTail("Mundo");
        list.addAtTail("Cruel");

        Iterator<String> iterator = list.getIterator();

        int size = list.getSize();

        Assertions.assertEquals(3,size);
        Assertions.assertNotNull(iterator);
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Adios", iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Mundo", iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Cruel", iterator.next());
        Assertions.assertFalse(iterator.hasNext());


    }
}
