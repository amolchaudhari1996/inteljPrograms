package inheritance.example.animal;

public class Dog extends Animal{
    //own behaviour
    private void bark(){
        System.out.println("Dog "+ getId()+" is barking");
    }

    @Override
    public void sound() {
        bark();
    }
}
