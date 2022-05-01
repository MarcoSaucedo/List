package uaslp.objetos.list.hashset;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.exception.NotNullValuesAllowedException;
import uaslp.objetos.list.exception.NotSuchElementException;
import uaslp.objetos.list.exception.NotValidIndexException;

public class HashSetTest {
    @Test
    public void givenANewSet_whenGetSize_thenResultIsZero() {
        HashSet<String> set = new HashSet<>();

        int sizeOfSet = set.size();

        Assertions.assertEquals(0, sizeOfSet, "Size of set after creation must be 0");
    }



    @Test
    public void givenANewSet_whenAddAtFrontAnElement_thenSizeIsOne() throws NotValidIndexException, NotNullValuesAllowedException {
        HashSet<String> set = new HashSet<>();

        set.add("Hola");

        int sizeOfSet = set.size();

        Assertions.assertEquals(1, sizeOfSet);
        Assertions.assertTrue(set.contains("Hola"));


    }

    @Test
    public void givenANewListWith1Element_whenAddAtFrontAnElement_thenSizeIsTwo() throws NotNullValuesAllowedException, NotValidIndexException {
        HashSet<String> set = new HashSet<>();

        set.add("Hola");

        set.add("Mundo");

        int sizeOfSet = set.size();

        Assertions.assertEquals(2,sizeOfSet);
        Assertions.assertTrue(set.contains("Hola"));
        Assertions.assertTrue(set.contains("Mundo"));

    }

    @Test
    public void givenAListWithOneElement_whenRemove_thenSizeIsZero() throws NotValidIndexException, NotNullValuesAllowedException {
        HashSet<String> set = new HashSet<>();

        set.add("Hola");

        set.remove("Hola");

        int size = set.size();

        Assertions.assertEquals(0,size);
        Assertions.assertFalse(set.contains("Hola"));

    }




    @Test
    public void givenAListWith3Elements_whenGetIterator_thenIteratorWorksOverAllThreeElements() throws NotValidIndexException, NotNullValuesAllowedException, NotSuchElementException {
        HashSet<String> set = new HashSet<>();

        set.add("Adios");
        set.add("Mundo");
        set.add("Cruel");

        Iterator<String> iterator = set.iterator();

        int size = set.size();

        HashSet<String> iterations= new HashSet<>();

        Assertions.assertEquals(3,size);
        Assertions.assertNotNull(iterator);
        Assertions.assertTrue(iterator.hasNext());
        iterations.add(iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        iterations.add(iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        iterations.add(iterator.next());
        Assertions.assertFalse(iterator.hasNext());
        Assertions.assertEquals("Adios", iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Mundo", iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Cruel", iterator.next());
        Assertions.assertThrows(NotSuchElementException.class,iterator::next);


    }

    @Test
    public void Test_Reorganize() throws NotNullValuesAllowedException, NotValidIndexException, NotSuchElementException {
        //Given
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < 200; i++){
            set.add("I" + i);
        }
        //when
        Iterator<String> iterator = set.iterator();
        //Then
        int size = set.size();
        HashSet<String> iterations = new HashSet<>();
        Assertions.assertEquals(200, size);
        Assertions.assertNotNull(iterator);
        while (iterator.hasNext()){
            iterations.add(iterator.next());
        }
        for (int i = 0; i < 200; i++){
            Assertions.assertTrue(set.contains("I" + i));
        }
    }
}







