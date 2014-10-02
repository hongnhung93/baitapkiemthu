package triagle;
import junit.framwork.Assert;
import org.junit.Test;
public class triagle_Test{
    @Test
    public void testcase1() throws Exeption{
        Triagle t = new Triangle(1,2,4);
        int expected = -1;
        int actual=t.CheckTriangle();
        Assert.assertEquals(expected, actual);
        }
    @Test
    public void testcase2() throws Exeption{
        Triagle t = new Triangle(4,1,2);
        int expected = -1;
        int actual=t.CheckTriangle();
        Assert.assertEquals(expected, actual);
        }
    @Test
    public void testcase3() throws Exeption{
        Triagle t = new Triangle(1,4,2);
        int expected = -1;
        int actual=t.CheckTriangle();
        Assert.assertEquals(expected, actual);
        }
    @Test
    public void testcase4() throws Exeption{
        Triagle t = new Triangle(5,5,5);
        int expected = -1;
        int actual=t.CheckTriangle();
        Assert.assertEquals(expected, actual);
        }
    @Test
    public void testcase5() throws Exeption{
        Triagle t = new Triangle(2,2,3);
        int expected = -1;
        int actual=t.CheckTriangle();
        Assert.assertEquals(expected, actual);
        }
    @Test
    public void testcase6() throws Exeption{
        Triagle t = new Triangle(2,3,2);
        int expected = 1;
        int actual=t.CheckTriangle();
        Assert.assertEquals(expected, actual);
        }
    @Test
    public void testcase7() throws Exeption{
        Triagle t = new Triangle(3,2,2);
        int expected = 1;
        int actual=t.CheckTriangle();
        Assert.assertEquals(expected, actual);
        }
    @Test
    public void testcase8() throws Exeption{
        Triagle t = new Triangle(3,4,5);
        int expected = 0;
        int actual=t.CheckTriangle();
        Assert.assertEquals(expected, actual);
        }
