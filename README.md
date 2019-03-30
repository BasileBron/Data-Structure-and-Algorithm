# Data-Structure-and-Algorithm

This repository was made during the reading of the [lecture notes](http://www.cs.bham.ac.uk/~jxb/DSA/dsa.pdf) revised each year by **Jhon Bullinara** and originally written by **Martin Escardo** and revised by **Manfred Kerber**. All are members of the School of Computer Science, University of Birmingham, UK.

The lecture notes are 120 page long, this is a condensed version for the peoples that need a quick approach of the field or people that are already familiar and need quick reminder.

## Fundamental question about algorithms

- What is it supposed to do ?

- Does it really do what it is supposed to do ?

- How efficiently does it do it ?

## Loop and Structure of iteration

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
### Invariant
The invariant don’t change. it **is true as long as the iterations goes on**, because it is the reason it goes on.

I regard the invariant as the **condition of the loop**.

A loop invariant is a property that is true before and after each iteration.

__________________________________________________________________________________
## Lists, Recursion, Stacks, Queues

### Abstract Data Type

|Data Structure| Linked lists | Doubly Linked lists | Stacks | Queues |
|------------- |--------------|---------------------|--------|--------|
|Constructor   | EmptyList() MakeList() | EmptyList() MakeList() Left(element,list) MakeListRight(element,list) | EmptyStack push(element, stack)| EmptyQueues push(element, queues)
condition | isEmpty(list) | isEmpty(list) | isEmpty(stack)|isEmpty(queues
 selector| first(list) rest(list) | firstLeft(list) restLeft(list) firstRight(list) restRight(list) |top(stack) pop(stack) | top(queues) pop(queues)
mutator | replaceFirst(x,l) replaceRest(r,l)
*data structure without mutator create à new structure when changes are needed.*

### Searching

|Linear Search | Binary Search|
|--------------|--------------|
|![alt text](https://github.com/BasileBron/Data-Structure-and-Algorithm/blob/master/img/Linear-Search.png?raw=true)| ![alt text](https://github.com/BasileBron/Data-Structure-and-Algorithm/blob/master/img/binary-search.jpg?raw=true)|
|O(n)   | O(log n)

![alt text](https://github.com/BasileBron/Data-Structure-and-Algorithm/blob/master/img/complexity.jpeg?raw=true)
__________________________________________________________________________________
## Tree

|Tree part|   Height|Node  |Leaf|
|---------|---------|------|----|
|Equation |**Heaight of a tree** can be approximately calculated using the number of node **s**. ```h ≈ log_2 * s```|**maximum number of node** can be calculated with the height of the tree: ```s(h) = 2^(h+1) -1``` **number of node at a level h** of a tree is : ```2^h```|**Maximum number of leaf** based on the number of nodes. ```n/2```|
|Math example| Height of a tree with **8 nodes** will be: ```log_2*8```|the first part of the equation ```2^(h+1)``` calculate how much node would be on the next level of the tree since h is the last level of a tree. So the conclusion is that the next level is equal to the sum of all the node +1.|max number of leaf of a tree with 6 nodes will be: ```6/2 = 3``` The number of internal node of a tree of height 2 will be: ```2² = 4```

### Different kind of tree

![alt text](https://github.com/BasileBron/Data-Structure-and-Algorithm/blob/master/img/tree-kind.png?raw=true)

### Balancing

coming soon

## Priority Queues and Heap Trees
### Sorting
| comparison based                                                                      | Non-comparison based    |
| ------------------------------------------------------------------------------------- | ----------------------- |
| Bubble sort, Selection Sort, Insertion sort, Treesort, Heapsort, Quicksort, Mergesort | Bin, Bucket, Radix Sort |
|                                                                                       |                         |
__________________________________________________________________________________
## Hash table

### Introduction to the concept
**Hash table are really efficient** but they **uses a lot of memory**. It is due to the fact that they basically store the data based on their values.

_(e.g Given a array **a** we will store the value **z** in the slot a[25] because Z is the 26th letter of the alphabet.)_

It sound efficient until you want to store long data, for example if you want to store words with a maximum of 10 letter your array must be 10^26 in other words : 100,000,000,000,000,000,000,000,000 or 100 Septillion.

That is why we don't actually use the values itself but the **hash** of the given value.

Basically an hash function is a function based on the given value, it will give the same result if you give the same value.

_If we want to store a shopping list of less than a 11 word then we just have to create an array of 10 and use the hash of each word to store them._

### Load factor of hash table

The load facto is defined by the percentage of filled slot in your table. A good load factor is generally around 50% the more it increase the more time it will take to manipulate the table.

__________________________________________________________________________________
## Graph

Graph are often useful to represent informations in a more general graphical form than considered so far.

| Vocabulary                | description                                                                                                            |
|:------------------------- |:---------------------------------------------------------------------------------------------------------------------- |
| Nodes / Vertices / Points | Header Two                                                                                                             |
| Edges / Lines / Links     | links between the nodes                                                                                                |
| Directed Graph            | Edges have a direction and can be in both way like roads                                                               |
| Undirected Graph          | in Undirected graph we assume that the edge is going in both directions                                                |
| Simple graph              | no self loop (edge connected at  both ends the same vertex)and no more than one edge connecting every pair of vertices |
| Arcs                      | lines on a directed graph                                                                                              |
| Weighted graph            | mean that the edges have labels (usually real number)                                                                  |
| weakly connected graph    | Each pair of vertices are connected in both ways                                                                       |
| Weakly connected graph    | at least one pair of vertices aren't connected or connected only in one way                                            |

### Array implementation of a graph

![alt text](https://github.com/BasileBron/Data-Structure-and-Algorithm/blob/master/img/undirectedgraph.png?raw=true)

![alt text](https://github.com/BasileBron/Data-Structure-and-Algorithm/blob/master/img/adjacencymatrix.png?raw=true)
