import org.junit.Test;
import static org.junit.Assert.*;
public class Test4 {
@Test
public void testConcatenate() {
 MyUnit myUnit = new MyUnit();
String result = myUnit.concatenate("one", "two");
assertEquals("one RR two", result); } 
@Test
public void testConcatenate22() {
 MyUnit myUnit = new MyUnit();
String result = myUnit.concatenate("one", "two");
assertEquals("one RR two", result); }}