public class APITester {
   public static void main(String[] args) {
      String stringJSON = "{\r\n" 
         + "\"Name\" : \"Mahesh\"," 
         + "\"RollNO\" : \"32\"\r\n" 
         + "}";  
   
      System.out.println(stringJSON);
      String textBlockJSON = """ {"name" : "Mahesh", \ "RollNO" : "32" } """;
      System.out.println(textBlockJSON);
	  
	   System.out.println("Contains: " + textBlockJSON.contains("Mahesh"));
	   System.out.println("indexOf: " + textBlockJSON.indexOf("Mahesh"));
	   System.out.println("Length: " + textBlockJSON.length());
   } 
}