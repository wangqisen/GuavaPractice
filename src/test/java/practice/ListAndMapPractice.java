package practice;

import com.google.common.collect.*;
import org.junit.Test;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by wangqisen on 16/3/16.
 */
public class ListAndMapPractice {

    @Test
    public void testList(){
        List<String> arrList= Lists.newArrayList();
        List<String> linkedList=Lists.newLinkedList(1,2,3);
        Set<String> hashSet= Sets.newHashSet();

        Integer[] intArray= ObjectArrays.newArray(Integer.class,5);
    }

    @Test
    public void testMap(){
        Map<String,String> first= Maps.newHashMap();

        //key,value,key,value
        Map<String,String> second= ImmutableMap.of("ON","TRUE","OFF","FALSE");

    }

    @Test
    public void testSet(){
        ImmutableSet<String> first=ImmutableSet.of("1","2","3");
        ImmutableSet<String> second=ImmutableSet.copyOf(first);
        ImmutableSet<String> third=ImmutableSet.<String>builder().addAll(second).add("4").build();
    }
}
