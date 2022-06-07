package generics;

class Gen<T> {

	T ob; // an object of type T is declared

	Gen(T o) { // Constructor
		ob = o;

	}

	public T getOb() {
		return ob;

	}

}
