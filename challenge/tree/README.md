# Trees

Tree is a non-linear data structure that uses connected nodes to represen hierarch data and have a root node that have 0 or more children up to 2 children and that applies to every child node.

## Challenge

implement Binary tree and Binary Search tree.

### Node

Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.

### Binary Tree

* Create a Binary Tree class
* Define a method for each of the depth first traversals:
  * pre order
  * in order
  * post order which returns an array of the values, ordered appropriately.

### Binary Search Tree

* Create a Binary Search Tree class
* This class should be a sub-class (or your languages equivalent) of the Binary Tree Class, with the following additional methods:
* Add
  * Arguments: value
  * Return: nothing
  * Adds a new node with that value in the correct location in the binary search tree.
* Contains
  * Argument: value
  * Returns: boolean indicating whether or not the value is in the tree at least once.

## Approach & Efficiency

* The Big O time complexity for inserting a new node is O(n).
* The Big O space complexity for a node insertion is O(n).
* The Big O time complexity for Serch node is O(n).
* The Big O space complexity for a node Search is O(n).

## API

* add
   1. Start from the root.
   2. Compare the element to be inserted with the root node. If it is less than root, then traverse the left subtree or traverse the right subtree.
   3. Traverse the subtree till the end of the desired subtree. Insert the node in the appropriate subtree as a leaf node.

* Contains
    1. Compare the element to be searched with the root node.
    2. If the key (element to be searched) = root, return root node.
    3. Else if key < root, traverse the left subtree.
    4. Else traverse right subtree.
    5. Repetitively compare subtree elements until the key is found or the end of the tree is reached.

# Challenge #16

Find the maximum value stored in the tree

## Whiteboard Process

![Whiteboard Process](maxNumber.png)
## Approach & Efficiency

* The Big O time complexity for find max number is O(n).
* The Big O space complexity for find max number is O(1).

## Solution

* set max number equal to value of root node .
* traverse the given tree and for every node return maximum in node???s left subtree
* traverse the given tree and for every node return maximum in node???s right subtree
* commper between maximum in node???s left subtree and maximum in node???s right subtree then return max between it.

# Challenge #17

Write a function called breadth first that can Traverse the input tree using a Breadth-first approach and return list of traversing node.

## Whiteboard Process

![Whiteboard Process](tree-breadth-first.png)

## Approach & Efficiency

* The Big O time complexity for Traversing is O(n).
* The Big O space complexity for Traversing is O(n).

## Solution

* create new queue to store root node
* iterate over queue element
* store first element of queue in a node and remove it from the queue and store it in arraylist .
* check if the removed node has a left nod and store it in a queue.
* check if the removed node has a right node and store it in queue.
* return the arraylist .  