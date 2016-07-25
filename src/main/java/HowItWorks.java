import pl.marekg.*;

public class HowItWorks {
    public static void main(String[] args) {
        MutableClass mutableClass;
        mutableClass = new MutableClass();
        mutableClass.setFirstName("MMMM");
        mutableClass.setLastName("GGGG");
        mutableClass.setAge(25);

//        System.out.println(mutableClass.getFirstName()+" " +mutableClass.getLastName()+" " + +mutableClass.getAge());


          ImmutablePerson immutablePerson = new ImmutablePerson("AAA", "BBBB", 25);
//        System.out.println(immutablePerson);
//        System.out.println(immutablePerson.withAge(55));
//        System.out.println(immutablePerson.withFirstName("KKK"));

        System.out.println(mutableClass);
        mutableClass.setAge(33);
        System.out.println(mutableClass);
        System.out.println(immutablePerson);
        immutablePerson.withAge(66);
        System.out.println(immutablePerson);




    }


}
