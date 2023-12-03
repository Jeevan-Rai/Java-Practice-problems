import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
class Test {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Object> map = new ConcurrentHashMap<>();
        ConcurrentHashMap<String, Object> map2 = new ConcurrentHashMap<>();
        List<ConcurrentHashmap<String, Object>> mapList = new ArrayList<>();
        map.put("1", "one");
        map2.put("1", map);
        System.out.println(map2);
    }
}