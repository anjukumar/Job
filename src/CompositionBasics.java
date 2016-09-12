//CompositionBasics.java
public class CompositionBasics {
public static void main(String[] args) {
Person bobby = new Person();
Education edu = new Education();
System.out.println(bobby.getSalary());
System.out.println(edu.toString());
}
}