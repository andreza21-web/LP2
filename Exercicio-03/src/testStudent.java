public class testStudent {
     public static void main(String[] args) throws Exception {
      
      Student student = new Student("JavaDeveloper", "rua 12345", "Java", 2021, 2.0);

        System.out.println("name: " + student.getName());
        System.out.println("adress: " + student.getAdress());
        System.out.println("Program: " + student.getProgram());
        System.out.println("year: " + student.getYear());
        System.out.println("free: " + student.getFree());

        student.setProgram("java"); 
        student.setYear(2021); 
        student.setFree(2.0); 

        System.out.println(student.toString());
    }
}
