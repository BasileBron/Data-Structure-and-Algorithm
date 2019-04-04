# Data-Structure-and-Algorithm
/!\ Not finished yet, please report any mistakes or strange sentences formulation /!\


This repository was made during the reading of the [lecture notes](http://www.cs.bham.ac.uk/~jxb/DSA/dsa.pdf) revised each year by **Jhon Bullinara** and originally written by **Martin Escardo** and revised by **Manfred Kerber**. All are members of the School of Computer Science, University of Birmingham, UK.

The lecture notes are 120 page long, this is a condensed version for the peoples that need a quick approach of the field or people that are already familiar and need quick reminder.

One of the greatest on-line resource on this subject is this youtube ![playlist](https://www.youtube.com/watch?v=IgeJmTKQlKs&list=PLpPXw4zFa0uKKhaSz87IowJnOTzh9tiBk&index=2)

## Complexity

When we talk about complexity in computer there is some things that you have to keep in mind:

* We only care about input greater than
* all constant/fixed values are dropped
(i.g 7 and 5 are constant in 4x-7 = 5)
* ignore the base of logs
![Complexity graph](https://github.com/BasileBron/Data-Structure-and-Algorithm/blob/master/img/complexity.jpeg?raw=true)
____________________________________________________________________________
## Lists, Stacks, Queues

| Stacks             | Queues            |
|:------------------ |:----------------- |
| First In First Out | First In Last Out |

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

### Conflict management
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

### Array implementation

![undirected graph](https://github.com/BasileBron/Data-Structure-and-Algorithm/blob/master/img/undirectedgraph.png?raw=true)
![matrix adjacency](https://github.com/BasileBron/Data-Structure-and-Algorithm/blob/master/img/adjacencymatrix.png?raw=true)

This is really explicit, however we can easily notice the problematic of this implementation, which is the amount of cell required. we would need an array with 10000 cell for a graph with only 100 vertices.

Also a graph with only a few edge would mainly filled the array with zeros...

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

![source](http://www.mylearning.in/2015/06/pros-and-cons-of-different-data.html)

![complexity of data structures](https://github.com/BasileBron/Data-Structure-and-Algorithm/blob/master/img/complexity_of_data_structures.png?raw=true)
# Test Question

* A is queue is a linear data
structure with certain
restriction on insertion and
deletion operations.

	*	What operation caracterise the queue ADT? Your answer should name them and explain what they do.

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

	| 1   | 2   | 3   | 4   | 5   |
	|:--- |:--- | --- | --- | --- |
	| A   | B   | C   | D   | E   |

	To make the tree based on an array you need to

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

   ``` (3+(x*2)/(5-x)) ```

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

	 wich give us : ``` 3+x2*+5x-/ ```
	 </details>
	 __________________________________________________________________

	 * Provide pseudo-code for a recursive algorithm that evaluates an arbitrary arithmetic expression represented by a binary expression tree.

	 <details>
	 <summary>Answer</summary>

	 such function will be based on the "in-order" tree traversal method.


	 ```
	 def in_order_traversal(root):
			if left_child(root):
					 result =+ in_order_traversal(left_child(root))
			result =+ root
			if right_child(root):
					 result =+ in_order_traversal(right_child(root))
			return result
	 ```
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
			<summary>Answer</summary>

			![binary search tree](https://github.com/BasileBron/Data-Structure-and-Algorithm/blob/master/img/binary_search_tree.PNG?raw=true)
			</details>

			* An AVL tree
			<summary>Answer</summary>

			![AVL tree](https://github.com/BasileBron/Data-Structure-and-Algorithm/blob/master/img/AVL_tree.PNG?raw=true)
			</details>
			Binary data structure allowed us to do a binary search O(log n)
