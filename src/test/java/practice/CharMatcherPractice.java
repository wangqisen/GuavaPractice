package practice;

import com.google.common.base.CharMatcher;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by wangqisen on 16/3/16.
 */
public class CharMatcherPractice {

    @Test
    public void testCharMatcher(){
        Assert.assertEquals(CharMatcher.JAVA_DIGIT.replaceFrom("java123",'*'),"java***");
        Assert.assertEquals(CharMatcher.JAVA_DIGIT.or(CharMatcher.JAVA_LOWER_CASE).retainFrom("Java123"),"ava123");
    }
}
