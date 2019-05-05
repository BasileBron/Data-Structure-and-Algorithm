# Data-Structure-and-Algorithm

![Binary search](https://github.com/BasileBron/Data-Structure-and-Algorithm/blob/master/img/banner.png?raw=true)

This repository was made during the reading of the [lecture notes](http://www.cs.bham.ac.uk/~jxb/DSA/dsa.pdf) revised each year by **Jhon Bullinara** and originally written by **Martin Escardo** and revised by **Manfred Kerber**. All are members of the School of Computer Science, University of Birmingham, UK.

The lecture notes are 120 page long, this is a condensed version for the peoples that need a quick approach of the field or people that are already familiar and need quick reminder.

One of the greatest on-line resource on this subject is this youtube [playlist](https://www.youtube.com/watch?v=IgeJmTKQlKs&list=PLpPXw4zFa0uKKhaSz87IowJnOTzh9tiBk&index=2)

## Complexity

The purpose of complexity is to predict the execution time and the memory used by  algorithms. It allow us to compare them and take the one that suit our need.

Efficiency of an algorithm is based on:
  - Execution time.
  - space/memory used.

### Notations
![Complexity graph](https://github.com/BasileBron/Data-Structure-and-Algorithm/blob/master/img/complexity_notations.PNG?raw=true)

When we talk about complexity in computer science there is some things that you have to keep in mind:
* All constant/fixed values are dropped.
(i.g 7 and 5 are constant in 4x-7 = 5)
* We ignore the bases of the logs.

Generally the goal is to use more memory to gain time in execution. But it sometimes vary depending on the situation.

### Complexity graph
![Complexity graph](https://github.com/BasileBron/Data-Structure-and-Algorithm/blob/master/img/complexity.jpeg?raw=true)
____________________________________________________________________________
## Lists, Stacks, Queues

| Stacks                             | Queues                            |
|:---------------------------------- |:--------------------------------- |
| **F**irst **I**n **F**irst **O**ut | **F**irst **I**n **L**ast **O**ut |

### Abstract Data Type

|Data Structure| Linked lists | Doubly Linked lists | Stacks | Queues |
|------------- |--------------|---------------------|--------|--------|
|Constructor   | EmptyList() MakeList() | EmptyList() MakeList() Left(element,list) MakeListRight(element,list) | EmptyStack push(element, stack)| EmptyQueues push(element, queues)
condition | isEmpty(list) | isEmpty(list) | isEmpty(stack)|isEmpty(queues
 selector| first(list) rest(list) | firstLeft(list) restLeft(list) firstRight(list) restRight(list) |top(stack) pop(stack) | top(queues) pop(queues)
mutator | replaceFirst(x,l) replaceRest(r,l)||||

*data structure without mutator create à new structure when changes are needed.*

### Searching

|Linear Search | Binary Search|
|--------------|--------------|
|![Linear serach](https://github.com/BasileBron/Data-Structure-and-Algorithm/blob/master/img/Linear-Search.png?raw=true)| ![Binary search](https://github.com/BasileBron/Data-Structure-and-Algorithm/blob/master/img/binary-search.jpg?raw=true)|
|O(n)   | O(log n)

__________________________________________________________________________________
## Tree

|Tree part|   Height|Node  |Leaf|
|---------|---------|------|----|
|Equation |**Heaight of a tree** can be approximately calculated using the number of node **s**. ```h ≈ log_2 * s```|**maximum number of node** can be calculated with the height of the tree: ```s(h) = 2^(h+1) -1``` **number of node at a level h** of a tree is : ```2^h```|**Maximum number of leaf** based on the number of nodes. ```n/2```|
|Math example| Height of a tree with **8 nodes** will be: ```log_2*8```|the first part of the equation ```2^(h+1)``` calculate how much node would be on the next level of the tree since h is the last level of a tree. So the conclusion is that the next level is equal to the sum of all the node +1.|max number of leaf of a tree with 6 nodes will be: ```6/2 = 3``` The number of internal node of a tree of height 2 will be: ```2² = 4```

### Different kind of tree

![Different kind of tree](https://github.com/BasileBron/Data-Structure-and-Algorithm/blob/master/img/tree-kind.png?raw=true)

### Balancing

![Balancing](https://github.com/BasileBron/Data-Structure-and-Algorithm/blob/master/img/balanced1.JPG?raw=true)

### AVL tree

An AVL tree is a binary tree search where the subtraction of (the left longest path - longest right path is strictly <= 1)

## Priority Queues and Heap Trees
### Sorting
| comparison based                                                                      | Non-comparison based    |
| ------------------------------------------------------------------------------------- | ----------------------- |
| Bubble sort, Selection Sort, Insertion sort, Treesort, Heapsort, Quicksort, Mergesort | Bin, Bucket, Radix Sort |
__________________________________________________________________________________
## Red Black Trees

The **6 rules** of the red black Tree

1) Every node is **red or black**.
2) Root node is always **black**.
3) New insertion are always **red**.
4) Every path from root - leaf has the same number of **black** nodes.
5) No path can have two **consecutive RED** nodes.
6) Nulls are black

red black tree class:

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

### Chaining

Chaining is often compared with bucket. chaining is like having multiple buckets that represent  

We can allowed lambda to be larger than 1 however we still want to keep it low to avoid loss of efficiency

### Rehashing

First of all, why do we need Rehashing? imagine that your load factor has become one and that you have to resize your array.

If your hash function is value % table size your are not going to end up on the right place we you search you items !

that is why you need to reinsert everything with the new hash function.

### Open addressing
The open addressing method has all the hash keys stored in a fixed length table. We use a hash function to determine the base address of a key and then use a specific rule to handle a collision. Each location in the table is either empty, occupied or deleted. **Empty** is the default state of all spaces in the table before any data is ever stored. **Occupied** means that there is currently a key-value pair stored in the location. **Deleted** means there was once a value stored in the space, but it has been marked deleted. Although deleted positions are treated the same as empty positions for the insert operations, those deleted positions are treated as occupied when doing data retrieval.

Below are the basic process of inserting a new key (k) using open addressing:

1. Compute the position in the table where k should be stored.

2. If the position is empty or deleted, store k in that position.

3. If the position is occupied, compute an alternative position based on some defined hash function.

The alternative position can be calculated using: linear probing, quadratic probing or double hashing. Next, we will demonstrate these three techniques and discuss important differences.

[source of this paragraph.](https://study.com/academy/lesson/open-addressing-uses-methods-pros-cons.html)
### Conflict management

#### Linear probing

Linear probing is a form of open addressing technique.It allow us to manage collision in hashtable.
When a collision occur we look on the index n+1 and go cell by cell until a empty one is found to store our key

(in order for this to work you need to allays have an empty slot to avoid infinite loop).
#### Quadratic probing

Quadratic probing use the same process but search each n+4 cell.
#### Double hashing
Double hashing is also the same process but instead of jumping each 1 or 4 cell we jump each **n** cell. To calculate **n** we use a second hash function.

The second hash function is only used if a collision occur.
__________________________________________________________________________________
## Graph

Graph are often useful to represent informations in a more general graphical form than considered so far.

| Vocabulary                | description                                                                                                            |
|:------------------------- |:---------------------------------------------------------------------------------------------------------------------- |
| Nodes / Vertices / Points | Equivalent of tree nodes                                                                                 |
| Edges / Lines / Links     | Links between the nodes                                                                                                |
| Directed Graph            | Edges have a direction and can be in both way like roads                                                               |
| Undirected Graph          | In Undirected graph we assume that the edge is going in both directions                                                |
| Simple graph              | No self loop (edge connected at  both ends the same vertex)and no more than one edge connecting every pair of vertices |
| Arcs                      | Lines on a directed graph                                                                                              |
| Weighted graph            | Mean that the edges have labels (usually real number)                                                                  |
| weakly connected graph    | Each pair of vertices are connected in both ways                                                                       |
| Weakly connected graph    | At least one pair of vertices aren't connected or connected only in one way                                            |

### Array implementation / Adjacency matrix

![undirected graph](https://github.com/BasileBron/Data-Structure-and-Algorithm/blob/master/img/undirectedgraph.png?raw=true)
![matrix adjacency](https://github.com/BasileBron/Data-Structure-and-Algorithm/blob/master/img/adjacencymatrix.png?raw=true)

This is really explicit, however we can easily notice the problematic of this implementation, which is the amount of cell required. we would need an array with 10000 cell for a graph with only 100 vertices.

Also a graph with only a few edge would mainly filled the array with zeros...

pros:
- insertion and deletion are quick and easy
cons :
- Take a lot of space.
- Take space even when there is no edges.
- Symmetrical (Two time the same data).

### Mixed implementation

To solved the problematic above we can use a one-dimensional array that points to a linked list of neighbours for each vertex name, connection weight and pointer to the next triple.

![Graph Mixed implementation](https://github.com/BasileBron/Data-Structure-and-Algorithm/blob/master/img/mixed.png?raw=true)

cons :
- Symmetrical (Two time the same data).

### Pointer-based implementation

![ Graph pointer-based implementation](https://github.com/BasileBron/Data-Structure-and-Algorithm/blob/master/img/pointerBased.png?raw=true)

### Dijkstra's Algorithm

"Dijkstra's algorithm will keep an array **D** of distances indexed by the vertices. **D[z]** will hold the distance of the shortest path from **s to z** on the planarity."

# Quick Recap

* Arrays -----------------------------------------------------------------------------
	* Pros:
		1. Access to an array element is fast since we can compute its location quickly.

	* Cons:
		1. If we want to insert or delete an element, we have to shift subsequent elements which slows our computation down.
		2. We need a large enough block of memory to hold our array.
		3. Easily corrupted (One can easily inset data in middle)


* Linked Lists ------------------------------------------------------------------------
	* Pros:
		1. Inserting and deleting data does not require us to move/shift subsequent data elements.

	* Cons:
		1. If we want to access a specific element, we need to traverse the list from the head of the list to find it which can take longer than an array access.
		2. Linked lists require more memory.
		3. Easily corrupted (One can easily inset data in middle)

* Stack--------------------------------------------------------------------------------
	* Pros:
		1. Helps manage the data in particular way (LIFO) which is not possible with Linked list and array.
		2. When function is called the local varriables are stored in stack and destroyed once returned. Stack is used when varriable is not used outside the function.
		So, it gives control over how memory is allocated and deallocated
		3. Stack frees you from the burden of remembering to cleanup(read delete) the object
		4. Not easily corrupted (No one can easily inset data in middle)

	* Cons:
		1. Stack memory is limited.
		2. Creating too many objects on the stack will increase the chances of stack overflow
		3. Random access not possible

* Queue ---------------------------------------------------------------------------------
	* Pros:
		1. Helps manage the data in particular way (FIFO). which is not possible with Linked list and array.
		2. Not easily corrupted (No one can easily inset data in middle)

	* Cons:
		1. Random access not possible

* Tree ---------------------------------------------------------------------------------
	* Pros:
		1. Searching is faster (with some ordering e.g., BST). we can search for a given key in moderate time (quicker than Linked List and slower than arrays).
		2. Insert/delete keys in moderate time (quicker than Arrays and slower than Unordered Linked Lists).

	* Cons:
		1. High overhead
		2. Large waste of unused links
		3. Predetermined limit on number of a node’s children

* Heap ---------------------------------------------------------------------------------
	* Pros:
		1. When the data in the variable is needed beyond the lifetime of the current function.
		2. It can offer the maximum memory an OS can provide

	* Cons:
		1. You must make sure to free the memory when you are done

* Graph ---------------------------------------------------------------------------------
	* Pros:
		1. Finding the path in efficient way

	* Cons:
		1. High overhead
		2. Large waste of unused links

[source](http://www.mylearning.in/2015/06/pros-and-cons-of-different-data.html)

![complexity of data structures](https://github.com/BasileBron/Data-Structure-and-Algorithm/blob/master/img/complexity_of_data_structures.png?raw=true)
# Test Question

* A is queue is a linear data
structure with certain
restriction on insertion and
deletion operations.

	*	What operation characterize the queue ADT? Your answer should name them and explain what they do.

		<details>
		  <summary>Answer</summary>

			Queues ADT are a collection of data with a "First In First Out" data structure.
			The first item added to the queue will be the first to go out of it(e.g a one-line road is a queue)			
		</details>
		__________________________________________________________________
	*	Sketch an array-based implementation of a queue data structure. Your answer should explain how the array is used to store the data items in the queue in order to.
		* Ensure best use of the available, fixed storage capacity.
		* Allow the storage capacity to be expanded when the number of items in the queue exceeds the array size.

		<details>
		  <summary>Answer</summary>
		  ![array based implementation](link)

		</details>
		__________________________________________________________________

	* What are the advantages and disadvantages of implementing a queue using a linked list rather than an array?
		<details>
			<summary>Answer</summary>

			Advantages :
			- It is not finite, there is no need to add new slot or define the size.
			- To add a new item you just have to link it to the last item on the list.

			Disadvantages :
			- Accessing item in the middle of the list or at the end is not as trivial as it is with array.				
		</details>
		__________________________________________________________________

* A binary heap tree is a data structure used to maintain order-sorted data.
	* Give a definition of a binary heap tree data structure, explaining any terms that you introduce.

	<details>
	<summary>Answer</summary>

	A binary heap tree is a tree that order its data based on there priority (i.e priority queue). They are stored in decreasing order. From the biggest value at the root to the lowest values at leafs.
	</details>
	__________________________________________________________________


	* Give a scheme for efficiently representing a binary heap tree using a single array.


	<details>
	<summary>Answer</summary>
  ![complexity of data structures](https://github.com/BasileBron/Data-Structure-and-Algorithm/blob/master/img/scheme.png?raw=true)
  Would be:
  | 1   | 2   | 3   | 4   | 5   | 6   | 7   |
  |:--- |:--- | --- | --- | --- | --- | --- |
  | A   | B   | C   | D   | E   | F   | G   |

	To defined the child of each node we use the index value. For example the index of the left child of the node index **ni** will be `ni*2` and `ni*2+1` for the right child index.
  C left child will be F because: 3*2 = 6
  its right child will be G because: 3*2+1 = 7

	</details>
	__________________________________________________________________


	* In the context of inserting a new data item into a binary heap, describe clearly what is meant by up heap bubbling and explain why it is necessary.

	<details>
	<summary>Answer</summary>

	We usually use up heap bubbling when we create the tree or insert a new element. for example when we insert a value **v** in the tree, we have to make sure that this value is were it is supposed to be i.e if **v** is actually inferior to his parent node and if it is not the case then they switch place. We have to do this until the we find a parent node greater than **v** or if **v** become the root node.

	Up heap bubbling is crucial because it allow us to keep the tree in decreasing order which is the point of this data structure if we want to keep its efficiency.

	</details>
	__________________________________________________________________

	* The time taken to insert a new node into a binary heap with **n** nodes is **O(log n)**. Explain why this is so.

	<details>
	<summary>Answer</summary>

	First of all let's precise that **O** is, Omega is the worst case scenario of the given algorithm. The worst case scenario of the insertion algorithm is actually not in the insertion itself but in the bubbling up algorithm that we need to run after each insertion. The insertion itself is of complexity 0(1). The worst case scenario of the bubbling up algorithm occur when every node value of the tree are inferior to the one inserted, because we need to compare the inserted value with each parent node that he have until he finally switch with the root node. base on this assumption we can conclude that the complexity O of the full insertion process in O(n).

	</details>
	__________________________________________________________________


	* Give pseudo code for an algorithm that uses a binary heap to sort a sequence S of data items. You can assume that the operations insert(e), wich insert an item **e** into the binary heap and removeMin(), wich removes and return the smallest element of the binary heap, are already defined.

	<details>
	<summary>Answer</summary>

	```
	for each s in S
		insert(data s in heap h)
	for (i = 0, i <= S lenght,i++ )
		S[s] = removeMin(heap h)
	```

	</details>
	__________________________________________________________________

* Consider the following arithmetic expression:

   `(3+(x*2)/(5-x))`

	 * Draw a binary expression tree to represent this expression.

	 <details>
	 <summary>Answer</summary>

	 ![binary tree expression](https://github.com/BasileBron/Data-Structure-and-Algorithm/blob/master/img/binary_tree_expression.png?raw=true)
	 </details>
	 __________________________________________________________________

	 * Consider a post-order traversal of the tree above, which print the data stored at each node, in turn as, as it is visited. Write down the expression that would result.

	 <details>
	 <summary>Answer</summary>

	 first of all lets define the different orders:

	 - in-order : left, parent, right
	 - pre-order : parent, left, right
	 - post-order : left, right, parent

	 visual exemple ![here](https://www.youtube.com/watch?v=4zVdfkpcT6U)

	 wich give us : `3+x2*+5x-/`
	 </details>
	 __________________________________________________________________

	 * Provide pseudo-code for a recursive algorithm that evaluates an arbitrary arithmetic expression represented by a binary expression tree.

	 <details>
	 <summary>Answer</summary>

	 such function will be based on the "in-order" tree traversal method.


	 `def in_order_traversal(root):
		if left_child(root):
				 result =+ in_order_traversal(left_child(root))
		result =+ root
		if right_child(root):
				 result =+ in_order_traversal(right_child(root))
		return result
    `
	 </details>
	 __________________________________________________________________

	 * You have been hired to write a 'phonebook' application for a small company. The phonebook stores name of the company employees and their associated phone-numbers. Given an employee names it should be possible to retrieve the employee's phone number. It should also be possible to add a name and associated number when a new employee joins the company; and to delete a name and number when the named employee leaves the company.

	  	* Explain how you might implement the phonebook application using a **doubly-linked list**, paying attention to the operation for getting the phone number for a given name and adding and deleting employee phone numbers.

			<details>
	 	 	<summary>Answer</summary>

			the answer below was my first answer, but i did an "interesting" mistake by misreading the question. I assumed that I needed to explain a way to implement the function in an alphabetical order. But there is absolutely no interest to do such thing in a doubly linked list, because to allow the list to be sorted the insertion and deletion function ends up being of complexity O(n) instead of O(1).
			It could be debatable whether or not it actually help the search function to be quicker, because assuming such conclusion means that a alphabetical order would be better than a random order to search a name. Which is not obvious at first sight and really depend of what kind of data is often search. long story short : **don't do that**.

			old answer :
			I would store the values in each cell in this format: "name, number"
				to search for an employee number based on his name we just have to go go throughout the list and compare the **n** first letters of each cell (**n** being the lenght of the name) with the given name. if a match occur return the full cell that matched.

			To insert a new employee in the doubly link list based on the given values (name, number and list), first this function check if the given list is not empty (otherwise we just return a new list with the given value). If not then use the alphabetical order to compare the cells with the given name to find the right spot to insert the new value.

			It is important to add that technically we don't insert the new item but create a new list which have the new item at the right place, because double linked list don't have mutator

			Deleting a cell based on a given name is possible by comparing the cells with the name in the same way as the search function but instead of returning the cell we return the new list constructed during each comparison and that ignore the cell that we wanned to delete.

	 	 	</details>
		 	__________________________________________________________________

			* Suppose the company becomes very successful and grows to the point where it has many thousands of employees. Is the implementation based on a doubly link list adequate? Give reasons for your answer.

			<details>
	 	 	<summary>Answer</summary>

			The complexity for **Insertion, Deletion, Search** is **O(n)** because we have to go troughs all the cells to execute each function.
			although this data structure is **easy to maintain and implement**, this is not efficient in terms of computation if we have a big amount of data to manage.
			</details>

    * Binary tree data structures find wide application in computing. Explain what is meant by the following terms, illustrating your answers using suitable diagrams.
      * A full binary tree
      <details>
      <summary>Answer</summary>

      ![binary tree](https://github.com/BasileBron/Data-Structure-and-Algorithm/blob/master/img/binary_tree.PNG?raw=true)
      </details>

      * A binary search tree
      <details>
      <summary>Answer</summary>

      ![binary search tree](https://github.com/BasileBron/Data-Structure-and-Algorithm/blob/master/img/binary_search_tree.PNG?raw=true)
      </details>

      * An AVL tree
      <details>
      <summary>Answer</summary>

      ![AVL tree](https://github.com/BasileBron/Data-Structure-and-Algorithm/blob/master/img/AVL_tree.PNG?raw=true)
      Binary data structure allowed us to do a binary search O(log n)
      </details>

    * A hash table is an efficient implementation of a searchable collection that stores entries of the form (k,v), where k is a key and v a value.
      * what is bucket array?
        <details>
        <summary>Answer</summary>

        A hashtable have to find way to store the data that encounter a conflict, a bucket array is one of the different ways of implementing a hashtable and managing conflicts.

        If an input have the same hash as an older input they are stored in the same column that correspond to the hash but will be stored in different row (i.e on top of one another).
        </details>

      * What is a hash function and what is it intended to do ? You should illustrate your answer by giving two different examples of hash functions that are used in practice.
        <details>
        <summary>Answer</summary>

        any function that can be used to map data of arbitrary size in a fixed size is hash function. Generally it allow us to obtained an arbitrary number based on the given data. the given number is then used as an ID to find the stored data
        </details>

      * Explain what is meant by a collision in the context of a hashtable and describe how collisions are handles using linear probing.
        <details>
        <summary>Answer</summary>

        hash function sometimes return the same value even with different data, that's when a conflict occur. Linear probing resolve this issue by storing data in the next available cell, It is arbitrary whether it goes on the left or the right. if it didn't find any available cell and hit the limit of the array then it loop on the other side of the array to continue the research. in order for this to work properly without looping an infinite amount of time, the array must never be full.  
        </details>

      * For a hashtable, what is the load factor and what does it tell us?
        <details>
        <summary>Answer</summary>

        Based on the answer above we can tell that the weakness of linear probing is that the more the array is filled the less efficient it becomes. that is why we need an indicator to tell us the percentage of cell that are full. this percantage is the load factor, also represented as lambda. 50% (i.g 0.5) is generally considered to be a good indicator whereas 80% create a big lack of efficiency.
        </details>

    * Consider the following edge-weighted graph G, where edge-weights represent some kind of cost.
      ![edge weight graph](https://github.com/BasileBron/Data-Structure-and-Algorithm/blob/master/img/edge_weight_graph.PNG?raw=true)

      * List the vertices of G that have degree > 1.
      <details>
      <summary>Answer</summary>

      N,M,O,R
      because they have more than one edge
      </details>

      * Describe a simple cycle in G and give its overall cost.
      <details>
      <summary>Answer</summary>

      P>N>M>O>R>Q>R>S

      4+3+6+7+1+1+3 = 25
      The cost of this cycle is 25
      </details>

      * show, using an appropriate diagram, how G may be represented using an adjacency matrix
      <details>
      <summary>Answer</summary>

      |     | M   | N   | O   | P   | Q   | R   | S   |
      |:--- |:--- | --- | --- | --- | --- | --- | --- |
      | M   | 0   | 3   | 6   | 0   | 0   | 0   | 0   |
      | N   | 3   | 0   | 2   | 5   | 0   | 0   | 0   |
      | O   | 6   | 2   | 0   | 0   | 0   | 7   | 0   |
      | P   | 0   | 5   | 0   | 0   | 0   | 0   | 0   |
      | Q   | 0   | 0   | 0   | 0   | 0   | 1   | 0   |
      | R   | 0   | 0   | 7   | 0   | 1   | 0   | 3   |
      | S   | 0   | 0   | 0   | 0   | 0   | 3   | 0   |


      </details>

      * Assuming that G is represented using an adjacency matrix, what is the computational complexity of removing a vertex from G and why?
      <details>
      <summary>Answer</summary>

      the complexity would be O(n^2) because
      </details>
