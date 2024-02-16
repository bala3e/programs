package javaprograms.practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Comparator.*;

public class StreamOperations {
    public List<String> number = Arrays.asList("Five","Six","Seven","Eight","Eight","Nine","Nine");
    public record Book(String name, double price) { }
    public void streamOperations(){

        //1.Even number
        List<Integer> evenNumber=IntStream.rangeClosed(1,10).boxed().filter(x->x%2==0).toList();
        System.out.println("Even Number"+evenNumber);

        //2.primeNumber
        List<Integer> primNumber=IntStream.rangeClosed(2, 10).filter(x -> isPrime(x)).boxed().collect(Collectors.toList());
        System.out.println("prim Number"+primNumber);
        //3.sorting - ascending
        List<String> numSorted=number.stream().sorted().collect(Collectors.toList());
        System.out.println(" number sorted "+numSorted);
        //3.sorting - descending
        List<String> numSortedReverse=number.stream().sorted(reverseOrder()).collect(Collectors.toList());//static import
        System.out.println(" number reverse sorted "+numSortedReverse);
        Book book = new Book("Core Java", 324.25);
        Book book1 = new Book("python", 200);
        Book book2 = new Book("c", 500);
        Book book3 = new Book("Go", 400);
        Book book4 = new Book("Go", 400);
        List<Book> bookList=Arrays.asList(book,book1,book2,book3,book4);
        //4.Default Collection sort based on name
        bookList.sort((b,b1)->b.name().compareTo(b1.name()));
        //5.sort by price in stream
        List<Book> bookListSortByPrice= bookList.stream().sorted(comparingDouble(Book::price)).collect(Collectors.toList());
        System.out.println("bookListSortByPrice : "+bookListSortByPrice);
        //6.sort by name in stream
        List<Book> bookListSortByName = bookList.stream().sorted(comparing(Book::name)).collect(Collectors.toList());
        System.out.println("bookListSortByName : "+bookListSortByName);
        //7.map - operation sample
        List<String>bookName = bookList.stream().map(b->b.name.toUpperCase()).toList();
        System.out.println("Book Name : "+bookName);
        //8.List to map
        Map<String,Double> mapBook=bookList.stream().collect(Collectors.toMap(b->b.name(), b1->b1.price(),(o,n)->n));
        System.out.println("mapBook:: "+mapBook);

        //9.Linked Hash Map Order BY.-sortbyvalue
        Map<String,Double> orderedMap = bookList.stream().collect(Collectors.toMap(b->b.name(), b1->b1.price(),(o,n)->n, LinkedHashMap::new)).
                entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(k->k.getKey(),v->v.getValue()));

        System.out.println("OrderedmapBook:: "+orderedMap);
        //10.GroupByName
        Map<String,List<Book>> groupByName=bookList.stream().collect(Collectors.groupingBy(b->b.name()));
        System.out.println("groupByName:: "+groupByName);
        //11.count of Element
        Map<String,Long> cntName= bookList.stream().collect(Collectors.groupingBy(b->b.name(),Collectors.counting()));
        System.out.println("cnt of Books:: "+cntName);
        //12.Count of Books
        List<Book> lstBook=bookList.stream().filter(x-> Collections.frequency(bookList,x)>1).toList();
        System.out.println("lstBook :: "+lstBook);

        //13.Find first -Repeated

        String numberRepeated = number.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().sorted(Map.Entry.comparingByValue())
                .filter(v -> v.getValue() > 1L).map(e -> e.getKey()).findFirst().get();
        System.out.println("Non Repeated :::: "+numberRepeated);

        //14.Find first -Non Repeated

        String numberNonRepeated = number.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().sorted(Map.Entry.comparingByValue())
                .filter(v -> v.getValue() == 1L).map(e -> e.getKey()).findFirst().get();
        System.out.println("Non Repeated :::: "+numberNonRepeated);

        //15Find unique in list

        List<String>uniqueNumber =number.stream().filter(cnt->Collections.frequency(number,cnt)==1).toList();
        System.out.println("uniqueNumber "+uniqueNumber);

        //16Find duplicate in list

        List<String>duplicate =number.stream().filter(cnt->Collections.frequency(number,cnt)>1).toList();
        System.out.println("duplicate "+duplicate);

        //17Find Cube.

        int [] a= {1,2,3,5,6};
        List<Integer> cube=Arrays.stream(a).boxed().map(i->i*i*i).toList();
        System.out.println("cube "+cube);

        //18.statistics
        IntSummaryStatistics intSummaryStatistics=Arrays.stream(a).boxed().collect(Collectors.summarizingInt(Integer::intValue));
        double avg=intSummaryStatistics.getAverage();
        int maxVal=intSummaryStatistics.getMax();
       int minVal= intSummaryStatistics.getMin();
        long sum=intSummaryStatistics.getSum();

        System.out.println("avg ="+avg);
        System.out.println("maxVal ="+maxVal);
        System.out.println("minVal ="+minVal);
        System.out.println("sum ="+sum);
//Reverse Int array

        int re[]=IntStream.rangeClosed(1,a.length).map(i->a[a.length-i]).toArray();
        for(int i:re){
            System.out.print(i+" ,");
        }

    }


    public void update(){
     Employee e = new Employee(1,"bala");
     Employee e1 = new Employee(2,"b");
     Employee e2 = new Employee(3,"ba");
     List<Employee> empLst = new ArrayList<>();
     empLst.add(e);
        empLst.add(e1);
        empLst.add(e2);

        List<Employee>eLST=empLst.stream().map(eTmp->{
            eTmp.setName(eTmp.changeStr(eTmp.name));
            return eTmp;
        }).toList();
        eLST.forEach(emp-> System.out.println(emp));


    }


    private static boolean isPrime(int number) {
        return number > 1 && IntStream
                .range(2, number)
                .noneMatch(i -> number % i == 0);
    }

    public static void main(String[] args) {
        StreamOperations so = new StreamOperations();
        so.streamOperations();
    }
}

class Employee{
    public int ID;
    public String name ;
    public Employee(int id,String name ){
        this.ID=id;
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String changeStr(String str){
        return str+"Ba";
    }
}


