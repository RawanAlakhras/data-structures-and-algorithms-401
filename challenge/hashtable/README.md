# HashTable

* Hashtables are a data structure that utilize key value pairs. This means every Node or Bucket has both a key, and a value.

## Challenge

* Implement a Hashtable Class with the following methods:
  * add
  * get
  * contains
  * hash

## Approach & Efficiency

* add method:
  * Time O(1)
  * Space O(1)
* get method :
  * Time O(n)
  * Space O(1)
* contains method:
  * Time O(n)
  * Space O(1)
* hash()
  * Time O(n)
  * Space O(1)

## API

* The class should contain the following methods:

* add method:
  * Arguments: key, value
  * Returns: nothing
  * This method should hash the key, and add the key and value pair to the table, handling collisions as needed.

* get method
  * Arguments: key
  * Returns: Value associated with that key in the table

* contains method:
  * Arguments: key
  * Returns: Boolean, indicating if the key exists in the table already.

* hash()
  * Arguments: key
  * Returns: Index in the collection for that key
