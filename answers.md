1. 
```java
public static String flip() {
    if (Math.random() < 0.6666)
        return "heads";
    else
        return "tails";
}
```



2. 
```java
public static boolean arePermutations(int[] arr1, int[] arr2) {

    for (int i = 0; i < arr1.length; i++) {
        boolean containsCurrentElement = false;
        for (int j = 0; j < arr2.length; j++) {
            if (arr1[i] == arr2[j])
                containsCurrentElement = true;  
        }
        if (!containsCurrentElement)
            return false;
    }

    return true;
}
```



3. 
Suppose that the initial contents of the values array in Shuffler.java are {1, 2, 3, 4}.
For what sequence of random integers would the efficient selection shuffle change values to
contain {4, 3, 2, 1}?

if you start with an array of values {1, 2, 3, 4}, there are actually many ways to end up with to end up with {4, 3, 2, 1} with a sequence of four swaps:

0       1 2 3 4

              ^

1       4 2 3 1

            ^

0       4 3 2 1

          ^

1       3 4 2 1

        ^    

        4 3 2 1


0101
after the 01, the values are already 4321, so the 01 is just there to preserve it



heres another way:

2       1 2 3 4

              ^

1       1 2 4 3

            ^

3       1 4 2 3

          ^

3       1 3 2 4

        ^    

        4 3 2 1


2133
the first move is just random, but after that you just choose the index of whichever number
needs to be at the current spot



I'll use the same method again:

1       1 2 3 4

              ^

3       1 4 3 2

            ^

3       1 4 2 3

          ^

3       1 3 2 4

        ^    

        4 3 2 1
        

I just chose a random index to start off with, 1, then I swapped the current index with the
index of whatever number should be at the current index

So, as you can see, there are many answers to this question.