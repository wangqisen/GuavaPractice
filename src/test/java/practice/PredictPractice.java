package practice;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.Lists;
import junit.framework.Assert;
import org.junit.Test;

import javax.annotation.Nullable;
import java.util.Collection;
import java.util.List;

/**
 * Created by wangqisen on 16/3/17.
 */
public class PredictPractice {


    public ImmutableMultiset<Integer> testPredict(){
        List<Integer> list= Lists.newArrayList(1,2,3,4);
        Collection<Integer> collection=Collections2.filter(list, new Predicate<Integer>() {
            public boolean apply(@Nullable Integer integer) {
                if(integer%2==0)
                    return true;
                else
                    return false;
            }
        });
        return ImmutableMultiset.copyOf(collection);
    }

    @Test
    public void testOptional(){
        Optional<ImmutableMultiset<Integer>> optional=Optional.fromNullable(testPredict());
        if(optional.isPresent()){
            for(Integer integer:optional.get()){
                Assert.assertEquals(0,integer%2);
            }
        }
    }

    @Test
    public void testFrom(){
        List<Integer> list=Lists.newArrayList(1,2,3,4);
        List<String> strList=Lists.transform(list, new Function<Integer,String>() {
            public String apply(Integer input) {
                return String.valueOf(input);
            }
        });
        Assert.assertEquals("1",strList.get(0));
    }
}
