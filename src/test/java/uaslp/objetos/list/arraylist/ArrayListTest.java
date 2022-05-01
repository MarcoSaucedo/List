package uaslp.objetos.list.arraylist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.exception.NotNullValuesAllowedException;
import uaslp.objetos.list.exception.NotSuchElementException;
import uaslp.objetos.list.exception.NotValidIndexException;

public class ArrayListTest {

    @Test
    public void givenANewArray_whenGetSize_thenResultIsZero(){
        ArrayList<String> array = new ArrayList<>();

        int sizeOfList= array.getSize();

        Assertions.assertEquals(0,sizeOfList, "Size of list after creation must be zero");
    }

    @Test
    public void givenANewArray_whenAddAtTailIsFull_thenIncreaseArraySize() throws NotNullValuesAllowedException{
        ArrayList<String> array = new ArrayList<>(2);

        array.addAtFront("Hola");
        array.addAtFront("Adios");

        array.addAtTail("Holaaaa");

        int sizeOfList = array.getSize();

        Assertions.assertEquals(3,sizeOfList, "Se espera un tamaño de 3");
        Assertions.assertEquals(array.getAt(0), "Adios");
        Assertions.assertEquals(array.getAt(1), "Hola");
        Assertions.assertEquals(array.getAt(2), "Holaaaa");

    }



   @Test
    public void givenANewArray_whenGetName_thenResultIsZero(){
        ArrayList<String> array = new ArrayList<>();

        array.getName();
        int sizeOfList= array.getSize();

        Assertions.assertEquals(0,sizeOfList, "Size of list after creation must be zero");
    }



    @Test
    public void givenANewArray_whenGetSize_thenResultIsSize(){
        ArrayList<String> array = new ArrayList<>();

        array.getSize();
        int sizeOfList= array.getSize();

        Assertions.assertEquals(0,sizeOfList, "Size of list after creation must be zero");
    }


    @Test
    public void givenANewArray_whenAddAnElement_thenSizeIsOne() throws NotNullValuesAllowedException, NotValidIndexException {
        ArrayList<String> array = new ArrayList<>();

        array.addAtFront("Hola");

        int size= array.getSize();

        Assertions.assertEquals(1,size);
        Assertions.assertEquals("Hola", array.getAt(0));
    }

    @Test
    public void givenANewArrayWith1Element_whenAddAtFrontAnElement_thenSizeIsTwo() throws NotNullValuesAllowedException, NotValidIndexException {
        ArrayList<String> array = new ArrayList<>();

        array.addAtFront("Hola");

        array.addAtFront("Mundo");

        int size= array.getSize();

        Assertions.assertEquals(2,size);
        Assertions.assertEquals("Mundo", array.getAt(0));
        Assertions.assertEquals("Hola", array.getAt(1));
    }

    @Test
    public void givenANewArray_whenAddAtTailAnElement_thenSizeIsOne() throws NotNullValuesAllowedException, NotValidIndexException {
        ArrayList<String> array = new ArrayList<>();

        array.addAtTail("Hola");

        int size= array.getSize();

        Assertions.assertEquals(1,size);
        Assertions.assertEquals("Hola", array.getAt(0));
    }

    @Test
    public void givenANewArrayWith1Element_whenAddAtTailAnElement_thenSizeIsTwo() throws NotNullValuesAllowedException, NotValidIndexException {
        ArrayList<String> array = new ArrayList<>();

        array.addAtTail("Hola");

        array.addAtTail("Mundo");

        int size= array.getSize();

        Assertions.assertEquals(2,size);
        Assertions.assertEquals("Hola", array.getAt(0));
        Assertions.assertEquals("Mundo", array.getAt(1));
    }

    @Test
    public void givenAArrayWithOneElement_whenRemove_thenSizeIsZero() throws NotValidIndexException, NotNullValuesAllowedException {
        ArrayList<String> array = new ArrayList<>();

        array.addAtFront("Hola");

        array.remove(0);

        int size = array.getSize();

        Assertions.assertEquals(0, size);

    }

    @Test
    public void givenAArrayWithTwoElements_whenRemoveIndex1_thenSizeIsOne() throws NotValidIndexException, NotNullValuesAllowedException {
        ArrayList<String> array = new ArrayList<>();

        array.addAtFront("Hola");
        array.addAtTail("Mundo");

        array.remove(1);

        int size = array.getSize();

        Assertions.assertEquals(1,size);
        Assertions.assertEquals("Hola", array.getAt(0));

    }

    @Test
    public void givenAArrayWithTwoElements_whenRemoveIndex0_thenSizeIsOne() throws NotValidIndexException, NotNullValuesAllowedException {
        ArrayList<String> array = new ArrayList<>();

        array.addAtFront("Hola");
        array.addAtTail("Mundo");

        array.remove(0);

        int size = array.getSize();

        Assertions.assertEquals(1,size);
        Assertions.assertEquals("Mundo", array.getAt(0));

    }



    @Test
    public void givenAArrayWith3Elements_whenRemoveElementAtTail_thenSizeIsTwo() throws NotValidIndexException, NotNullValuesAllowedException {
        ArrayList<String> array = new ArrayList<>();

        array.addAtFront("Adios");
        array.addAtTail("Mundo");
        array.addAtTail("Cruel");

        array.remove(2);

        int size = array.getSize();

        Assertions.assertEquals(2,size);
        Assertions.assertEquals("Adios", array.getAt(0));
        Assertions.assertEquals("Mundo", array.getAt(1));

    }

    @Test
    public void givenAArrayWithThreeElements_whenRemoveIndex1_thenSizeIsTwo() throws NotValidIndexException, NotNullValuesAllowedException {
        ArrayList<String> array = new ArrayList<>();

        array.addAtTail("Mundo");
        array.addAtTail("Cruel");
        array.addAtFront("Adios");

        array.remove(1);

        int size = array.getSize();

        Assertions.assertEquals(2,size);
        Assertions.assertEquals("Adios", array.getAt(0));
        Assertions.assertEquals("Cruel", array.getAt(1));

    }

    @Test
    public void givenAArrayWithThreeElements_whenRemoveAll_thenSizeIsZero() throws NotValidIndexException, NotNullValuesAllowedException {
        ArrayList<String> array = new ArrayList<>();

        array.addAtTail("Mundo");
        array.addAtTail("Cruel");
        array.addAtFront("Adios");

        array.removeAll();

        int size = array.getSize();

        Assertions.assertEquals(0,size);


    }

    @Test
    public void givenAArrayWithTwoElements_whenSetAtZero_thenElementIsModified() throws NotValidIndexException, NotNullValuesAllowedException {
        ArrayList<String> array = new ArrayList<>();

        array.addAtTail("Mundo");
        array.addAtFront("Adios");

        array.setAt(0,"Hola");

        int size = array.getSize();

        Assertions.assertEquals(2,size);
        Assertions.assertEquals("Hola", array.getAt(0));
        Assertions.assertEquals("Mundo", array.getAt(1));

    }

    @Test
    public void givenArraWith3Elements_whenGetIterator_thenIteratorWorksOverAllThreeElements() throws NotValidIndexException, NotNullValuesAllowedException, NotSuchElementException {
        ArrayList<String> array = new ArrayList<>();

        array.addAtFront("Adios");
        array.addAtTail("Mundo");
        array.addAtTail("Cruel");

        Iterator<String> iterator = array.getIterator();

        int size = array.getSize();

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


