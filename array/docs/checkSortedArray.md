# Check array is sorted or not
Write a program to chack the given array is sorted or not?

## Algoriths
*Step 1:* Start
*Step 2:* Input an array from user
*Step 3:* Initialize a boolean variable 'isSorted' as true
*Step 4:* Repeat step 5 till array.length
*Step 5:* Check if an element of the array is less than previous element
        - if it is true, assign isSorted as false (isSorted = false)
        - break the loop
        - return isSorted
    *Screen shot*
        - ![checkSorted method screen-shot] (../screenshot/chek_sorted_array.png)    
*Step 6:* Print result
        - if isSorted is true, print "Array is sorted"
        - if isSorted is false, print "Array is not sorted"
*Step 7:* Exit