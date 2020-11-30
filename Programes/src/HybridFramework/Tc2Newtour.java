package HybridFramework;

import java.io.IOException;

import org.testng.annotations.Test;

import com.testing.DDFramework.Task2Neutours;

public class Tc2Newtour {
	Task2Neutours module2;
	@Test
	public void test() throws IOException, InterruptedException{
		module2=new Task2Neutours();
		module2.open();
		module2.registerlink();
	}
}
