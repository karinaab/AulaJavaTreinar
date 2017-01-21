package br.com.treinar.aula07.colletion;
import java.util.*;
public class CollectionsDemo {

   public static void main(String[] args) {
      // ArrayList 
      List a1 = new ArrayList();
      a1.add("Zara");
      a1.add("Mahnaz");
      a1.add("Ayan");
      System.out.println(" ArrayList Elements");
      System.out.print("\t" + a1);
      
   // ArrayList Generic (aceita apenas um tipo determinado tipo de váriavel)
   // Evita casting 
      List<String> a2 = new ArrayList<>();
      a2.add("Zara");
      a2.add("Mahnaz");
      a2.add("Ayan");
      //a2.add(10);  => não compilaria esta linha, porque o numero 10 não é String.
      System.out.println(" ArrayList Elements");
      System.out.print("\t" + a1);

      // LinkedList
      List l1 = new LinkedList();
      l1.add("Zara");
      l1.add("Mahnaz");
      l1.add("Ayan");
      System.out.println();
      System.out.println(" LinkedList Elements");
      System.out.print("\t" + l1);

      // HashSet
      Set s1 = new HashSet(); 
      s1.add("Zara");
      s1.add("Mahnaz");
      s1.add("Ayan");
      System.out.println();
      System.out.println(" Set Elements");
      System.out.print("\t" + s1);

      // HashMap
      //Cave, Valor
      Map m1 = new HashMap(); 
      m1.put("Zara", "8");
      m1.put("Mahnaz", "31");
      m1.put("Ayan", "12");
      m1.put("Daisy", "14");
      System.out.println();
      System.out.println(" Map Elements");
      System.out.print("\t" + m1);
      
   // HashMap com determinação de tipo na chave e no valor.
   //Cave, Valor
      Map<Integer, Object> m2 = new HashMap<>(); 
      m2.put(8, "Zara");
      m2.put(32, "Pessoa");
      //m2.put("Ayan", "12"); => não compilaria esta linha, porque o Ayan não é um Integer.
      m2.put(3, "14");
      System.out.println();
      System.out.println(" Map Elements");
      System.out.print("\t" + m1);
   }
}