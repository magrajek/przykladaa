package pl.marekg;

/**
 * Created by marek on 7/25/16.
 */
public final class ImmutablePerson {

    final private String firstName;
    final private String lastName;
    final private Integer age;

    public ImmutablePerson(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

//    public ImmutablePerson withFirstName(String firstName) {
//        this.firstName = firstName;
// /       return this;
//    }
//
//  public ImmutablePerson withLastName(String lastName) {
//       this.lastName = lastName;
//       return this;

//   }


//   public ImmutablePerson withAge(Integer age) {
//       this.age = age;
//       return this;
//   }

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

}
