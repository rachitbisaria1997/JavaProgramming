package Java8Features.DefaultMethods;

import  java.util.*;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamArrayProblems {

    public static void fetchSecondSmallest(int [] arr){

        int secondsmall = Arrays.stream(arr).distinct().sorted().skip(1).findFirst().orElseThrow(() -> new IllegalArgumentException("array doesnt contains second smallest element"));

        System.out.println(secondsmall);

    }

    public static void fetchCommonElements(int [] arr1, int[] arr2){

        List<Integer> commonELements = Arrays.stream(arr1).filter(num -> Arrays.stream(arr2).anyMatch(arr2Number -> arr2Number == num))
                                        .boxed().collect(Collectors.toList());

        System.out.println("common elements in array are "+ commonELements);

    }

    public static void reverseArray(int arr []){

        IntStream.range(0, arr.length / 2).forEach(
          i -> {
              int temp = arr[i];
              arr[i] = arr[arr.length - i- 1];
              arr[arr.length - 1] = temp;
          }
        );

        System.out.println("reversed array is "+ Arrays.toString(arr));



    }

    public static void fetchLengthLongString(String[] strings){

        int maxLength = Arrays.stream(strings).mapToInt(string -> string.length()).max().orElse(0);

        System.out.println("length of longest string is "+ maxLength);

    }



    public static void main(String[] args) {

        int [] nums = {5,2,8,3,1,2};

        fetchSecondSmallest(nums);

        System.out.println("-----------------------------");

        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {4,5,6,7,8};

        fetchCommonElements(arr1, arr2);

        int arr[] =  {1,2,3,4,5};
        reverseArray(arr);

        String[] str = {"rachit", "bittu"};
        fetchLengthLongString(str);

        //nums > 5

        List<Integer> numbers = Arrays.asList(1,2,3,5,6,7,8,9);
        List<Integer> result = numbers.stream().filter(n -> n > 5).collect(Collectors.toList());
        System.out.println(result);

        // transform list of strings into uppercase versions

        List<String> words = Arrays.asList("apple", "dns");
        List<String> upperResult = words.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperResult);

        //flatmap
        List<List<String>> listOfLists = Arrays.asList(Arrays.asList("one", "two"), Arrays.asList("three", "four"));

        List<String> newResult = listOfLists.stream().flatMap(Collection::stream).collect(Collectors.toList());

        System.out.println(newResult);

        // sort in reverse order
        List<Integer> reverseNums = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseNums);

        //
        List<String> somewords = Arrays.asList("apple", "banana", "cherry");
        List<String> peekresult = somewords.stream().peek(word -> System.out.println("original :" + word))
                                                .map(String::toUpperCase)
                                                .collect(Collectors.toList());
        System.out.println(peekresult);


        List<Integer> reducednums = Arrays.asList(1,2,3,4,5,6);
        Optional<Integer> redResult = reducednums.stream().reduce((a, b) -> a *b);
        // another way int resRes = reducednums.stream().reduce(0, (a,b) -> a + b);
        System.out.println(redResult);

        // check if all nums are positive
        List<Integer> newNums = Arrays.asList(1,2,3,4,5);
        boolean rresult = newNums.stream().allMatch(n -> n > 0);
        System.out.println(rresult);

        List<Integer> nNums = Arrays.asList(1,2,3,4,5);
        boolean eresult = nNums.stream().noneMatch(n -> n < 0);
        System.out.println(eresult);

        // use joining

        String wresult = somewords.stream().collect(Collectors.joining(":"));
        System.out.println(wresult);

        // use partition by to partition stream into 2 groups
        List<Integer> snums = Arrays.asList(1,2,3,4,5,6);
        Map<Boolean, List<Integer>> nresult = snums.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(nresult);

        // customers whose lifetime spending exceeds a threshold of 10000

//        Map<Boolean, List<Customer>> customerPartition = customerList.stream()
//                .collect(Collectors.partitioningBy(customer -> customer.getTotalSpend() > 10000));
//
//        System.out.println(customerPartition);

        // counting method
        long count = words.stream().collect(Collectors.counting());
        System.out.println(count);

        // use summarizing int
        List<Integer> kunms = Arrays.asList(1,2,3,4,5);
        IntSummaryStatistics statistics = kunms.stream().collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println(statistics);
        System.out.println(statistics.getCount());

        // map each word to its length
        List<Integer> wlength = words.stream().collect(Collectors.mapping(String::length, Collectors.toList()));
        System.out.println(wlength);
        //[5,3]

        // use joining
        String nResult = words.stream().collect(Collectors.joining(","));
        System.out.println(nResult);
        // Apple, Dns

        // use group by
        Map<Integer, Long> groupedByLength = words.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(groupedByLength);
        // {3=1, 5=1}

        // use collectingAndThen
//        List<String> customerEmails = customerList.stream()
//                .collect(Collectors.collectingAndThen(Collectors.toSet(), set -> set.stream().map(Customer::getEmail).collect(Collectors.toList())));
//
//                System.out.println(customerEmails);


        // collect all unique product names from a list of orders. map each order to list of products, map each product to its name
        // than collect all names into a set
//        Set<String> uniqueProducts = orderList.stream().flatMap(order -> order.getProducts().stream())
//                                                        .collect(Collectors.mapping(Product::getName, Collectors.toSet()));

        System.out.println(uniqueProducts);

        int totalLength = words.stream().collect(Collectors.mapping(String::length, Collectors.summingInt(Integer::intValue)));
        // find sum of all the words length
        System.out.println(totalLength);

        // toMap convert elements of stream into a map

        Map<String, Integer> map = words.stream().collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println(map);

        // create a map where each order ID is linked to total amount
        Map<Long, Integer> orderAmountmap = orderList.stream().collect(Collectors.toMap(Order::getId, Order::getTotalAmpunt));

        System.out.println(orderAmountmap);

        // create a concurrent hashmap
        // it is thread safe method
        ConcurrentMap<String, Integer> cmap = orderList.stream().collect(Collectors.toConcurrentMap(Order::getId, Order::getTotalAmpunt));

        System.out.println(cmap);

        // use of reducing
        int totalRevenure = orderList.stream().map(Order::getTotalAmount).collect(Collectors.reducing(0, Integer::sum));

        System.out.println(totalRevenure);
    }

}
