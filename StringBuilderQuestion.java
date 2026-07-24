public class StringBuilderQuestion{
    /*
    Declare a StringBuilder object initialized with the string "Pony"
    Use the appropriate method to replace the character at index 0 ('P') with 'T' so it becomes "Tony"
    Use the appropriate method to add the string " Stark" to the very end of your StringBuilder object
    Use the appropriate method to insert the character '@' right after "Tony" (which would be at index 4)
    Finally, use the appropriate method to delete the '@' character you just inserted, bringing the string back to "Tony Stark"
    */
   public static void main(String[] args) {
       StringBuilder sb = new StringBuilder("Pony");
       
       sb.setCharAt(0, 'T');
       sb.append(" Stark");
       sb.insert(4, '@');
       sb.delete(4, 5);

       System.out.println(sb);
   }
}