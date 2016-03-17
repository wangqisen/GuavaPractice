package practice;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.Table;
import junit.framework.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.Map;

/**
 * Created by wangqisen on 16/3/17.
 */
public class TableAndBiMapPractice {

    //Map with two keys
    @Test
    public void testTable(){
        Table<Integer,Integer,String> table= HashBasedTable.create();

        table.put(0,1,"ele1");
        table.put(0,2,"ele2");
        table.put(1,1,"ele3");

        Map<Integer,String> map=table.row(0);
        Assert.assertEquals(2,(int)Collections.max(map.keySet()));
    }

    @Test
    public void testBiMap(){
        BiMap<Integer,String> biMap= HashBiMap.create();
        biMap.put(1,"1");
        biMap.put(2,"2");
        biMap.put(3,"3");
        Assert.assertEquals("1",biMap.get(1));
        Assert.assertEquals(1,(int)biMap.inverse().get("1"));
    }
}
