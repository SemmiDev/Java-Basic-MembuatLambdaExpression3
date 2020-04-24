package menggunakanlambdaexpression3;

import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MenggunakanLambdaExpression3 {

    public static void main(String[] args) {
      
        Predicate<String> predicate2 = MenggunakanLambdaExpression3::isNotNull;
        // cara pemanggilannya sama dengan cara memanggul objek seperti yg biasa
        System.out.println(predicate2.test("a")); // true
        System.out.println(predicate2.test("a")); // true
        System.out.println(predicate2.test(null)); // false
        
        
        
//      Predicate<String> predicate = (value) -> value.isEmpty();
        Predicate<String> predicate5 = String::isEmpty; 
        
            
            
//      BiPredicate<String, String> predicate3 = (value1, value2) -> MenggunakanLambdaExpression3.isEquals(value1, value2);
        BiPredicate<String, String> predicate6 = (value1,value2) -> value1.equals(value2);
        System.out.println(predicate6.test("sam","SAM")); // false
        System.out.println(predicate6.test("sam","sam")); // true
        System.out.println(predicate6.test("SAM","SAM")); // true
        
        
        String hello = "Hello";
//      Function<String, String> function = (value) -> hello.concat(value);
        Function<String, String> function2 = hello::concat;
        
//      Consumer<String> consumer = (value) -> System.out.println(value);
        Consumer<String> consumer2 = System.out::println;
        consumer2.accept("Hello Sam");
        consumer2.accept("Hello Dev");
        consumer2.accept("Hello SammiDev");
        
        Function<String, String> fBesar = (value) -> value.toUpperCase(); // semua huruf besar
        System.out.println(fBesar.apply("sam"));
        System.out.println(fBesar.apply("dev"));
        System.out.println(fBesar.apply("sammidev"));
        
        Function<String, String> f = (value) -> value.toLowerCase(); // semua huruf besar
        System.out.println(f.apply("SAM"));
        System.out.println(f.apply("DEV"));
        System.out.println(f.apply("SAMMIDEV"));
        
        
        Supplier<String> supplier = () -> "Sam is a Programamer";
        System.out.println(supplier.get());
        
        
//        Supplier<String> supplierr = () -> "samsamsam";
//        printLambda(supplierr);
        printLambda(() -> "Sammi");
        
    }
    
    public static void printLambda(Supplier<String> supplier){
        System.out.println(supplier.get());
    }
    
    public static boolean isNotNull(String value){
        return value != null;
    }
    
    public static boolean test(String value1, String value2){
        return value1.equals(value2);
    }
}
 
