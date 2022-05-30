### Why Generics

- Stronger type checks at compile time
- Enables to implement generic algorithms
- Elimination of casts
- Use of wildcards to increase API flexibility
	- Extends
	- Super

### Covariance and Contravariance
	
- Covariance: accept subtypes - read only
- Contravariance: accept supertypes - write only

ArrayList<Integer> integerList = new ArrayList<>();
ArrayList<Number> numberList = integerList; // Not ok 
ArrayList<Integer> otherIntegerList = integerList; // Ok

with 

ArrayList<Integer> integerList = new ArrayList<>();
ArrayList<? super Integer> numberList = integerList; // Ok

The question mark "?" refers to a wildcard which represents an unknown type. It can be lower-bounded, which restricts the unknown type
to be a specific type or its supertype.

Therefore, ? super Integer translates to "any type that is an Integer type or its supertype"

We can also use upper-bounded  wildcard, which restricts the unknown type to be a specific type or its subtype,

