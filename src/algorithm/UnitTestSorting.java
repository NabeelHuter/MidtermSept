package algorithm;


import org.testng.Assert;

public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {
        int[] unSortedArray = {6, 9, 2, 5, 1, 0, 4};
        int[] sortedArray = {0, 1, 2, 4, 5, 6, 9};

        Sort sort = new Sort();

        sort.selectionSort(unSortedArray);

        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
            System.out.println("Array was Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }

        sort.insertionSort(unSortedArray);

        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
            System.out.println("Array was Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }
        sort.bubbleSort(unSortedArray);

        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
            System.out.println("Array was Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }

        sort.heapSort(unSortedArray);

        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
            System.out.println("Array was Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }
        sort.bucketSort(unSortedArray);

        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
            System.out.println("Array was Sorted");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        //sort.quickSort(unSortedArray);

        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
            System.out.println("Array was Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }

        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
            System.out.println("Array was Sorted");
        }catch(Exception ex) {
            ex.getMessage();
        }

        sort.shellSort(unSortedArray);

        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
            System.out.println("Array was Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }


    }
}