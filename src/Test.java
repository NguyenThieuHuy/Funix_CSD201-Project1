import java.util.*;

/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
    Integer[] intArray = new Integer[]{1, 2, 3, 4, 5};
    String[] nameArray = new String[]{"Bill", "Connor", "Joe", "John", "Mark"}; // Array is already sorted lexicographically

    List<Integer> intList = new ArrayList<>(Arrays.asList(intArray));
    List<String> nameList = new ArrayList<>(Arrays.asList(nameArray));
    System.out.println(Collections.binarySearch(intList, 2));
    System.out.println(Collections.binarySearch(nameList, "Robin"));

    //__________________________________________________//

    Integer[] intArray0 = new Integer[]{1, 2, 3, 4, 5};
    String[] nameArray0 = new String[]{"John", "Mark", "Joe", "Bill", "Connor"};

    System.out.println(ArrayUtils.contains(intArray0, 3));
    System.out.println(ArrayUtils.contains(nameArray0, "John"));

    //__________________________________________________//

    Integer[] intArray1 = new Integer[]{1, 2, 3, 4, 5};
    String[] nameArray1 = new String[]{"John", "Mark", "Joe", "Bill", "Connor"};

    List<Integer> intList1 = new ArrayList<>(Arrays.asList(intArray1));
    List<String> nameList1 = new ArrayList<>(Arrays.asList(nameArray1));

    System.out.println(intList1.contains(12));
    System.out.println(nameList1.contains("John"));

    //__________________________________________________//

    Integer[] intArray2 = new Integer[]{1, 2, 3, 4, 5};
    String[] nameArray2 = new String[]{"John", "Mark", "Joe", "Bill", "Connor"};

    System.out.println(ArrayUtils.contains(intArray2, 3));
    System.out.println(ArrayUtils.contains(nameArray2, "John"));

    //__________________________________________________//

    Integer[] arr = new Integer[]{1, 2, 3, 4, 5};

    System.out.println(Arrays.stream(arr).anyMatch(x -> x == 3));
    String[] arr1 = new String[]{"John", "Mark", "Joe", "Bill", "Connor"};

    String searchString = "Michael";

    boolean doesContain = Arrays.stream(arr1)
            .anyMatch(x -> x.equals(searchString));

    System.out.println(doesContain);
    }
    
}

