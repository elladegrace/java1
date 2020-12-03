package ch02;

public class NullExam {
	public static void main(String[] args) {
		String data=null;
		try {
		  System.out.println(data.length());
		}catch(NullPointerException e) {
			System.out.println("���ܹ߻�");
		}
		
		try {
		  System.out.println(args[1]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���ܹ߻�");
		}
		
		Animal animal = new Dog();
		try {
		Cat cat=(Cat)animal;
		}catch(ClassCastException e) {
			System.out.println("���ܹ߻�");
		}
	}
}
class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}