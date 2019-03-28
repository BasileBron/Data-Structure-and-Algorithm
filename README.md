# Data-Structure-and-Algorithm

##Fundamental question about algorithms

- What is it supposed to do ?

- Does it really do what it is supposed to do ?

- How efficiently does it do it ?

##Loop and Structure of iteration

```
for( INITIALISATION ; CONDITION ; UPDATE ) {
	REPEATED PROCESS
}
```
Exemple :

```
for( i = 0, sum = 0 ; i < 20 ; i++ ) {
	sum += a[ i ];
}
```
###Invariant
The invariant don’t change. it **is true as long as the iterations goes on**, because it is the reason it goes on.

I regard the invariant as the **condition of the loop**.

A loop invariant is a property that is true before and after each iteration.

##Lists, Recursion, Stacks, Queues

###Abstract Data Type

|Data Structure| Linked lists | Doubly Linked lists | Stacks | Queues |
|------------- |--------------|---------------------|--------|--------|
|Constructor   | EmptyList() MakeList() | EmptyList() MakeList() Left(element,list) MakeListRight(element,list) | EmptyStack push(element, stack)| EmptyQueues push(element, queues)
condition | isEmpty(list) | isEmpty(list) | isEmpty(stack)|isEmpty(queues
 selector| first(list) rest(list) | firstLeft(list) restLeft(list) firstRight(list) restRight(list) |top(stack) pop(stack) | top(queues) pop(queues)
mutator | replaceFirst(x,l) replaceRest(r,l)
*data structure without mutator create à new structure when changes are needed.*

###Searching

|Linear Search | Binary Search|
|--------------|--------------|
|![alt text](https://2.bp.blogspot.com/-HbIqsxVbYzg/WelyE3i34zI/AAAAAAAAJbo/SM7c1bcVDXwmcMjRWIsXmh4OVca6GOEmQCLcBGAs/s640/Linear-Search.png)| ![alt text](https://www.computerhope.com/jargon/b/binary-search.jpg)|
|O(n)   | O(log n)

![alt text](https://cdn-images-1.medium.com/max/1400/1*5ZLci3SuR0zM_QlZOADv8Q.jpeg)

##Tree

|Tree part|   Height|Node  |Leaf|
|---------|---------|------|----|
|Equation |**Heaight of a tree** can be approximately calculated using the number of node **s**. ```h ≈ log_2 * s```|**maximum number of node** can be calculated with the height of the tree: ```s(h) = 2^(h+1) -1``` **number of node at a level h** of a tree is : ```2^h```|**Maximum number of leaf** based on the number of nodes. ```n/2```|
|Math example| Height of a tree with **8 nodes** will be: ```log_2*8```|the first part of the equation ```2^(h+1)``` calculate how much node would be on the next level of the tree since h is the last level of a tree. So the conclusion is that the next level is equal to the sum of all the node +1.|max number of leaf of a tree with 6 nodes will be: ```6/2 = 3``` The number of internal node of a tree of height 2 will be: ```2² = 4```

###Different kind of tree

![alt text](treekind.jpg)

###Balancing

coming soon

##Priority Queues and Heap Trees
##Sorting
| comparison based                                                                      | Non-comparison based    |
| ------------------------------------------------------------------------------------- | ----------------------- |
| Bubble sort, Selection Sort, Insertion sort, Treesort, Heapsort, Quicksort, Mergesort | Bin, Bucket, Radix Sort |
|                                                                                       |                         |
