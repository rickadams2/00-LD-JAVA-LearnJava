package ho0210;

public class Dog {
String name; 
int age;
String[] fetchedItems = {"bone", "stick", "ball"}; 
private int fetchCounter = 0; 

public Dog(String name, int age){
    this.name = name; 
    this.age = age; 
}

public void bark() {
    System.out.println(" Bark ");
}
public int getDogYears() {
// aname dat 1 hond jaar, 7 mensen jaren is. 
return this.age * 7; 
}
public void fetch(){
    this.fetchCounter = (this.fetchCounter +1) % 3; 
    String item = this.fetchedItems[this.fetchCounter]; 
    System.out.println(name + " fetched a " + item + ".");
}
}