package com.quinexiaa;

public class Main {

    public static void main(String[] args) {
	// Assume the number of elements is n. Complexity is calculated accordingly.
        int[] intArray = new int[7];

        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = -14;
        intArray[3] = 34;
        intArray[4] = 26;
        intArray[5] = 76;
        intArray[6] = 90;

//Printing all the elements. Complexity O(n)
        System.out.println("Printing all the elements of an array: ");
        //================================================Operations to be performed========================================================//
        for(int i=0; i<intArray.length;i++){
            System.out.println("\t"+intArray[i]);
        }
        //==================================================================================================================================//

//Searching/Retrieving an element when index is not known. Complexity O(n)
        System.out.println("Searching/Retrieving an element when index is not known: ");
        //================================================Operations to be performed========================================================//
        int searchInt = -14;
        int index = -1;
        for(int i=0; i<intArray.length;i++){
            if(intArray[i]== searchInt){
                index = i;
                break;
            }
        }
        //==================================================================================================================================//

        System.out.println("\t"+searchInt+" is found at index "+ index);

//Retrieving an element when index is known. Time Complexity O(1)
        System.out.println("Retrieving an element when index is known: ");
        //================================================Operations to be performed========================================================//
        index = 5;
        System.out.println("\tElement at "+index+" is "+intArray[index]);
        //==================================================================================================================================//

//Add an element to a full array. Time Complexity O(n)
        System.out.println("Adding an element to a full array: ");
        //Procedure: Initialise a new array capable of holding the new element. Copy all the elements of the previous array to the new array.
        //================================================Operations to be performed========================================================//
        int elementToBeAdded = 6;
        int[] intArrayDuplicate = new int[intArray.length+1];
        for(int i=0; i<intArray.length; i++){
            intArrayDuplicate[i] = intArray[i];
        }
        intArrayDuplicate[intArray.length] = elementToBeAdded;
        //==================================================================================================================================//
        for(int i=0; i<intArrayDuplicate.length;i++){
            System.out.println("\t"+intArrayDuplicate[i]);
        }

//Add an element to the end of an array(has space). Time Complexity O(1).
        System.out.println("Adding an element to the end of an array(has space): ");
        //Lets assume that an array of length 8 is filled only for the first 6 elements.
        int[] partiallyFilledArray = new int[8];
        int filledUpto = 6;
        partiallyFilledArray[0] = 23;
        partiallyFilledArray[1] = 34;
        partiallyFilledArray[2] = 56;
        partiallyFilledArray[3] = 12;
        partiallyFilledArray[4] = -98;
        partiallyFilledArray[5] = 72;
        //Printing the current array
        System.out.println("\tPrinting the partially filled array: ");
        for(int i=0; i<intArrayDuplicate.length;i++){
            System.out.println("\t\t"+partiallyFilledArray[i]);
        }
        int elementToBeAddedAtLast = 67;
        //================================================Operations to be performed========================================================//
        partiallyFilledArray[filledUpto++] = elementToBeAddedAtLast;
        //==================================================================================================================================//
        //Printing the updated array
        System.out.println("\tPrinting the updated array: ");
        for(int i=0; i<intArrayDuplicate.length;i++) {
            System.out.println("\t\t" + partiallyFilledArray[i]);
        }
//Insert or update an element at a specific index. Time Complexity O(1).
        System.out.println("Insert or update an element at a specific index: ");
        int[] arr = {2, 4, 5, 6, 7, 9, 10};
        //================================================Operations to be performed========================================================//
        int elementToBeInserted = 56;
        int insertAtIndex = 4;
        arr[insertAtIndex] = elementToBeInserted;
        //==================================================================================================================================//
        System.out.println("\tPrinting after insertion: ");
        for(int i=0; i<arr.length;i++) {
            System.out.println("\t\t" + arr[i]);
        }
//Delete an element by setting it to null. Time Complexity O(1)
        System.out.println("Deleting an element by setting it to null: ");
        System.out.println("\tOur array looks like: ");
        for(int i=0; i<arr.length;i++) {
            System.out.println("\t\t" + arr[i]);
        }
        //================================================Operations to be performed========================================================//
        index = 3;
        arr[index] = 0;
        //==================================================================================================================================//
        System.out.println("\tOur updated array looks like: ");
        for(int i=0; i<arr.length;i++) {
            System.out.println("\t\t" + arr[i]);
        }
//Delete an element by shifting elements. Time Complexity O(n).
        System.out.println("Deleting an element by shifting elements: ");
        int[] arr2 = {2, 4, 5, 6, 7, 9, 10};
        System.out.println("\tOur array looks like: ");
        for(int i=0; i<arr2.length;i++) {
            System.out.println("\t\t" + arr2[i]);
        }
        //================================================Operations to be performed========================================================//
        int elementToBeDeleted = 2;
        int foundAt = -1;
        for(int i=0; i<arr2.length;i++){
            if(arr2[i]== elementToBeDeleted){
                foundAt = i;
                break;
            }
        }
        for(int i=foundAt;i<arr2.length-1;i++){
            arr2[i] = arr2[i+1];
        }
        arr2[arr2.length-1]=0;
        //==================================================================================================================================//
        System.out.println("\tOur updated array looks like: ");
        for(int i=0; i<arr2.length;i++) {
            System.out.println("\t\t" + arr2[i]);
        }
    }

}
