import org.junit.Test;

public class StringVsStringBuffer {

	// https://github.com/junit-team/junit4/wiki/timeout-for-tests
	// http://openjdk.java.net/projects/code-tools/jmh/
	@Test
	public void testWithStringBuffer() {
		StringBuffer s3 = new StringBuffer("Value1");
		String s2 = "Value2";
		for (int i = 0; i < 100000; ++i) {
			s3.append(s2);
		}
		System.out.println(s3);
	}

	@Test
	public void testWithString() {
		String s3 = "Value1";
		String s2 = "Value2";
		for (int i = 0; i < 100000; ++i) {
			s3 = s3 + s2;
		}
		System.out.println(s3);
	}

}
