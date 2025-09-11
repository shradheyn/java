package collectionsdemo;

/**
* author: Shradhey.Naudiyal
* date: Sep 8, 2025
* time: 3:59:49 PM
* project: Corejava
*/

public class Sample<T> { //parameterized class/generic class/generic T-type
	private T data; //generic variable declaration

	public Sample(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
