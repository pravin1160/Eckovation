public class JavaWelcome {
    int modelYear;
    String modelName;
    public JavaWelcome(int year, String name) {
        modelYear = year;
        modelName = name;
      }
      public static void main(String[] args) {
        JavaWelcome myCar = new JavaWelcome(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
      }
  
    
}
