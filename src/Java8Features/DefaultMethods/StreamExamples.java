package Java8Features.DefaultMethods;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {

    public static void main(String[] args) {


        // stream provides a way to process collections in a functional, declarative and pipeline manner
        // A stream is created from a data source:like list.stream(), arrays.stream()
        // intermediate operations can be performed on data using map(), filer(), distinct() etc
        //terminal operations are collect(), reduce(), count()

        List<Integer> numbers = Arrays.asList(2,4,6,8,10,11,12,14,15);

        boolean containsPrime = numbers.stream().anyMatch(StreamExamples::isPrime);

        System.out.println(containsPrime);

        // merge 2 sorted lists
        List<Integer> list1 = Arrays.asList(1,2, 3, 5, 7, 9);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10);
        List<Integer> mergedList = Stream.concat(list1.stream(), list2.stream()).sorted().collect(Collectors.toList());
        System.out.println(mergedList);


        // find longest string in a list of strings
            List<String> strings = Arrays
                        .asList("apple", "banana", "cherry", "date", "grapefruit");

        Optional<String> longestString = strings.stream().max(Comparator.comparingInt(String::length));
        System.out.println(longestString);

        // Find the intersection of two lists using Java streams

        List<Integer> intersection = list1.stream().filter(list2::contains).collect(Collectors.toList());
        System.out.println(intersection);

        // remove duplicates from list
        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5);
        List<Integer> uniElem = numbersWithDuplicates.stream().distinct().collect(Collectors.toList());
        System.out.println(uniElem);

        //Given a list of transactions, find the sum of transaction amounts for each day
        List<Transaction> transactions = Arrays.asList(
                new Transaction("2022-01-01", 100),
                new Transaction("2022-01-01", 200),
                new Transaction("2022-01-02", 300),
                new Transaction("2022-01-02", 400),
                new Transaction("2022-01-03", 500)
        );

        Map<String, Integer> sumByDay = transactions.stream().
                collect(Collectors.groupingBy(Transaction::getDate, Collectors.summingInt(Transaction::getAmount)));
        System.out.println(sumByDay);

        // kth smallest element
        int[] array = {4, 2, 7, 1, 5, 3, 6};
        int k=3;
        int kthSmallest = Arrays.stream(array).sorted().skip(k-1).findFirst().orElse(-1);
        System.out.println(kthSmallest);

        // find frequency of each word in java
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry",
                    "banana", "apple");
        Map<String, Long> wordFrequency = words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(wordFrequency);

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Map<Boolean, List<Integer>> partitioned = nums.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        List<Integer> evenNumbers = partitioned.get(true);
        List<Integer> oddNumbers = partitioned.get(false);

        System.out.println("even numbers "+ evenNumbers);
        System.out.println("odd numbers "+ oddNumbers);

    }

    public static boolean isPrime(int number){

        if(number < 1){
            return false;
        }

        for(int i=2; i< number; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;

    }

    static class Transaction{

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }

        String date;
        int amount;

        Transaction(String date, int amount){
            this.date = date;
            this.amount = amount;
        }

    }
}
