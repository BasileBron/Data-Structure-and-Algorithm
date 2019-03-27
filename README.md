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

Data Structure| Linked lists | Doubly Linked lists | Stacks | Queues |
------------- | -------------|-----------|---------|-------
Constructor | EmptyList() MakeList() | EmptyList() MakeList() Left(element,list) MakeListRight(element,list) | EmptyStack push(element, stack)| EmptyQueues push(element, queues)
condition | isEmpty(list) | isEmpty(list) | isEmpty(stack)|isEmpty(queues
 selector| first(list) rest(list) | firstLeft(list) restLeft(list) firstRight(list) restRight(list) |top(stack) pop(stack) | top(queues) pop(queues)
mutator | replaceFirst(x,l) replaceRest(r,l)
*data structure without mutator create à new structure when changes are needed.*

###Searching

Binary | Searching
-------|----------
O(n)   | O(log n)
