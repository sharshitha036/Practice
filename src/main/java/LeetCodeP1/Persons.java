package LeetCodeP1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Persons  implements Comparable<Persons>{
        private int id;
        private String firstname;
        private String lastname;

        public Persons(int id, String firstname, String lastname) {
            this.id = id;
            this.firstname = firstname;
            this.lastname = lastname;
        }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }

    @Override
        public int compareTo(Persons other) {
            return this.firstname.compareTo(other.firstname);
        }

        @Override
        public String toString() {
            return "Person{" + "Id=" + id + ", firstname='" + firstname + ", lastname='" + lastname + '\'' + '}';
        }

   /* static class LastNameComparator implements Comparator<Persons> {
        @Override
        public int compare(Persons s1, Persons s2) {
            return s1.getLastname().compareTo(s2.getLastname());
        }
    }*/

        public static void main(String[] args) {
            List<Persons> persons = new ArrayList<>();
            persons.add(new Persons(1, "Alice","Dan"));
            persons.add(new Persons(2, "Charlie","Antony"));
            persons.add(new Persons(3, "Bob","Chloe"));


           /* Collections.sort(persons,new Comparator<Persons>() {
                public int compare(Persons p1, Persons p2) {
                    return p1.getLastname().compareTo(p2.getLastname());
                }
            });*/

            Collections.sort(persons, Comparator.comparing(Persons::getFirstname));

            for (Persons person : persons) {
                System.out.println(person);
            }
        }
    }
