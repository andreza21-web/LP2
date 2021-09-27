public class testPerson {
     public static void main(String[] args) throws Exception {
      
       Person person = new Person("Andreza/Lidiane", "rua 12345");

        System.out.println("Author: " + person.getName());
        System.out.println("email: " + person.getAdress());
       
        person.setAdress("rua 12345");
        System.out.println(person.toString());
    }
}
