public class testStaff {
  
     public static void main(String[] args) throws Exception {
      
      Staff staff = new Staff("andreza/lidiane", "rua 123","escola", 22);
        System.out.println("name: " + staff.getName());
        System.out.println("adress: " + staff.getAdress());
        System.out.println("School: " + staff.getSchool());
        System.out.println("Pay: " + staff.getPay());
    

      
        staff.setSchool("escola");
        staff.setPay(22);

        System.out.println(staff.toString());
  
     }
}
