import java.util.*;
public class OutOfMemoryDemo {
public static void main(String[] args) {
List<int[]> big = new ArrayList<>();
while (true) {
big.add(new int[10_000_000]); 
}
}
}
