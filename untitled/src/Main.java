


import java.sql.SQLOutput;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.*;
@FunctionalInterface
interface Ano
{
     int a=8;
     void math1(int a);
     //void math2();

}
class AnoImplementation implements Ano{

     @Override
     public void math1(int a) {

     }
}

class Static
{
     int a;
     static int b;
     static
     {
          b=6;
     }
     Static(int a)
     {
          this.a=a;
     }
}

class Test
{
     static int i=2;
     Test()
     {
          System.out.println("Inside default constructor of test");
     }
     void testMethod()
     {
          System.out.println("Inside method of parent test");
     }
     static
     {
          int j=2;
          System.out.println("Inside static block of test");
     }
}
class TestChild extends Test
{
     @Override
     void testMethod() {
          System.out.println("Inside test method of TestChild");
     }
     void doMyParentKnowMe()
     {
          System.out.println("Yes they do know me");
     }
}

interface Inter
{
     void show();
}

class InterExtand implements Inter
{
     @Override
     public void show()
     {
          System.out.println("In InterExtand class");
     }
}

//Inner Class
class Outer
{
     int a;
     class Inner
     {
          void print()
          {
               System.out.println("Inner Class");
          }
     }
}

//Inheritance
class sup
{
     sup()
     {
          System.out.println("super constructor");
     }
     void show()
     {
          System.out.println("In super class");
     }
}
class sub extends sup
{
     sub()
     {
          System.out.println("sub constructor");
     }
     void show()
     {
          System.out.println("In sub class");
     }
}
//Comparable
class laptop implements Comparable<laptop>
{
     String brand;
     int ram;
     int price;

     public laptop()
     {
          System.out.println("Inside default constructor");
     }

     public laptop(String brand, int ram, int price) {
          this.brand = brand;
          this.ram = ram;
          this.price = price;
     }

     public laptop(int i) {
          System.out.println("Inside param constructor");
     }

     public String getBrand() {
          return brand;
     }

     public void setBrand(String brand) {
          this.brand = brand;
     }

     public int getRam() {
          return ram;
     }

     public void setRam(int ram) {
          this.ram = ram;
     }

     public int getPrice() {
          return price;
     }

     public void setPrice(int price) {
          this.price = price;
     }

     @Override
     public String toString() {
          return "laptop{" +
                  "brand='" + brand + '\'' +
                  ", ram=" + ram +
                  ", price=" + price +
                  '}';
     }

     @Override
     public int compareTo(laptop obj) {
          if(this.brand.compareTo(obj.brand)>0)
               return 1;
          else
               return -1;
     }
}
class Gen<T1>
{
     int a;
     T1 t;

     public int getA() {
          return a;
     }

     public void setA(int a) {
          this.a = a;
     }

     public Gen(int a, T1 t) {
          this.a = a;
          this.t = t;
     }

     public T1 getT() {
          return t;
     }

     public void setT(T1 t) {
          this.t = t;
     }
}

@FunctionalInterface
interface functional
{
     void show();
    static void showone()
     {

     }
}
public class Main{

/*     static <T> T logic(T ...x)
     {
          T sum = (T)new Object();
          Operators + (T)
          for(int i=0;i<x.length;i++)
          {
              sum= sum + x[i];
          }
          return sum;
     }*/

     //Varargs
     static int sum(int... a)
     {
          int sum=0;
          for(int x : a)
               sum+=x;
          return sum;
     }

     public static void main(String[] args) {
/*          Ano obj = new Ano() {
               @Override
               public void math1() {
                    System.out.println("method1");
               }

               @Override
               public void math2() {
                    System.out.println("method2");
               }
          };*/
 /*         Ano obj = (n)->{
            for(int i=0;i<n;i++)
                 System.out.println("Lambda created");
          };
          obj.math1(6);*/
/*          ArrayList<Integer> arrayList = new ArrayList<Integer>();
          arrayList.add(78);
          arrayList.add(67);

          int v =  arrayList.get(1);
          System.out.println(v);*/

          //Anonymous Class
/*          Ano obj = new Ano() {
               @Override
               public void math1(int a) {
                    System.out.println(a);
               }

               @Override
               public void math2() {
                    System.out.println("math2");
               }
          };
          obj.math1(34);*/

          //Lambda Expression
/*          Ano obj2 = (a)->{
               System.out.println("Lambda expression created " + a);
          };
          obj2.math1(56);*/

        //Generics (almost same as c++ templates)
      /*    Gen<String> obj3 = new Gen(34,"string");
          String str = obj3.getT();
          System.out.println(str);*/

/*          String str="Original";
          str="Duplicate";
          System.out.println(str);
          System.out.println(str.length());
          System.out.println(str.toLowerCase());
          System.out.println(str.toUpperCase());
          System.out.println(str.substring(2));
          System.out.println(str.charAt(2));*/

        /*  Main obj = new Main();

          System.out.println(obj.logic(6,8));
*/
          //Comparable
          List<laptop> list = new ArrayList<laptop>();
          list.add(new laptop("hp",4,45678));
          list.add(new laptop("dell",21,34356));
          list.add(new laptop("lenevo",12,54257));

/*          Collections.sort(list);
          for(laptop l : list)
               System.out.println(l);*/
          //Another way by passing comparator logic.
          Comparator<laptop> comp = (obj1, obj2) -> {
               if(obj1.price>obj2.price)
                    return 1;
               else return -1;
          };

          Collections.sort(list,comp);
          for(laptop l : list)
               System.out.println(l);
          long i=3434343434l;
          Static obj1 = new Static(4);
          Static obj2 = new Static(7);
          System.out.println(obj1.b);

          //Inner Class

          Outer obj = new Outer();
          Outer.Inner innerObject = obj.new Inner();
          innerObject.print();

          //Jagged Arrays
          int a[][]={{1,2},{2,3},{1,2,3}};
          for(int j=0;j<a.length;j++)
          {
               for(int k=0;k<a[j].length;k++)
                    System.out.println(a[j][k]);
          }

          //Varargs
          System.out.println(sum(1,2,34,4,5,6));

          //Inheritance
          sub obj3 = new sub();

          List<Integer> l = new ArrayList<Integer>();

          laptop l1 = new laptop("lenevo",6,67858);
          laptop l2=null;
          laptop l3=null;
          //System.out.println(l2.equals(l3));

          laptop ll= new laptop();
          int x= Test.i;
          System.out.println("\n\n");
          Test t1 =new TestChild();
          if(t1.getClass()==Test.class)
          ((TestChild) t1).doMyParentKnowMe();

          Map<String , Integer> map = new HashMap<>();
          String mobileNumber="ashutosh.rathor@patym.com";
          System.out.println(mobileNumber.matches("^[a-zA-z0-9+._-]+@[a-zA-z+.]+[.][a-zA-z+.]+[a-zA-Z]+$"));

          Date date = new Date();
          String strDateFormat = "hh:mm:ss a";
          DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
          String formattedDate= dateFormat.format(date);
          System.out.println("Current time of the day using Date - 12 hour format: " + formattedDate);
          Inter ref = new InterExtand();
          ref.show();
          Map<String ,Inter>m;
          sup s = new sub();
          if(s instanceof  sub)
               System.out.println("s is instance of super also");
          String s2="ABC";
          String s3="ABC";
          String s4=new String("ABC");
          String s5=new String("ABC");
          if(s2==s3)
               System.out.println("Strings are equal.");
          else
               System.out.println("Strings are not equal.");
          if(s4.equals(s5))
               System.out.println("Strings are equal.");
          else
               System.out.println("Strings are not equal.");

          String mobileNumber1="99";

          System.out.println(mobileNumber1.matches("^[0-9]{10}$"));

          String password="!@#$%^&*()_+j";
          System.out.println(password.matches("^[A-Za-z0-9\\s$&+?@#.^*()%!_-]{8,16}+$"));

          String hash="Ea";
          String hash1="FB";
          System.out.println(hash.hashCode() +" "+hash1.hashCode());
          System.out.println(hash.equals(hash1));
          Map<String,Integer> m1 = new HashMap<>();
          m1.put(hash,1);
          m1.put(hash1,2);
          System.out.println(m1.size());
          Set<String >hashSet = new HashSet<>();
          Set<String >treeSet = new TreeSet<>();
          hashSet.add(hash);
          hashSet.add(hash1);
          treeSet.add(hash1);
          treeSet.add(hash1);
          System.out.println(treeSet.size());
          for(String s1:treeSet)
               System.out.println(s1);
          System.out.println(hashSet.size()+" "+hashSet.hashCode());
          hashSet.add(null);
          hashSet.add(null);
          Set<String >linkedHashSet=new LinkedHashSet<>();
          linkedHashSet.add(hash);
          linkedHashSet.add(hash1);
          linkedHashSet.add(hash);
          for(String iterator:linkedHashSet)
               System.out.println(iterator);


          System.out.println(l1);
          System.out.println(l1.hashCode());


     }

}
