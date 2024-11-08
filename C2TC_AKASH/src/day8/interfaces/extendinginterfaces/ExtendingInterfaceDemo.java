package day8.interfaces.extendinginterfaces;
public class ExtendingInterfaceDemo implements ChildInterface {
	// Override ChildInterface method
	public void print() { 
		System.out.println("print method");
	}

	// Override InterfaceOne method
	public void show() {
		System.out.println("show Method");
	}
@SuppressWarnings("unused")
public static void main(String[] args) {
	ExtendingInterfaceDemo ei =new ExtendingInterfaceDemo();
	ei.print();
	ei.show();
	}

}
