package practice;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import org.junit.*;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by wangqisen on 2016/3/15.
 */
public class JoinerPractice {

    //合并字符串
    @Test
    public void testJoiner(){
        String str1= Joiner.on(";").skipNulls().join(Arrays.asList("a","b",null,"c"));
        Assert.assertEquals(str1, "a;b;c");
    }

    //分割字符串
    public void testSplitter(){
        Iterable<String> tokens= Splitter.on(',').split("one,two,three");
        Assert.assertEquals(3,Arrays.asList(tokens).size());
    }
}
