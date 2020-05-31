package Testcases.whitbread_brewersfayer_autotests;

import java.io.IOException;
import java.io.InputStream;

import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;

import org.testng.annotations.Test;

import com.thoughtworks.selenium.condition.ConditionRunner.Context;
//below script is to connect portal SSID directly.

public class Portal_SSID_Connect_Script {

	@Test
	public void test1() throws InterruptedException {
		try {

			Process p = Runtime.getRuntime().exec("C:\\Users\\mdonagapura\\Desktop\\work.bat");

			Thread.sleep(9000);
			InputStream is = p.getInputStream();
			int i = 0;
			StringBuffer sb = new StringBuffer();
			while ((i = is.read()) != -1)

				sb.append((char) i);
			System.out.println(sb.toString());

			String sp1 = sb.toString();
			System.out.println(" sp1 value is" + sp1);

			boolean s = sb.toString().equalsIgnoreCase("Connection request was completed successfully.");

			System.out.println(" s value is" + s);

			Thread.sleep(6000);

			if (s) {
				System.out.println(" s value is 2" + s);
				Thread.sleep(9000);

				Process p2 = Runtime.getRuntime().exec("C:\\Users\\mdonagapura\\Desktop\\work1.bat");
				Thread.sleep(6000);
				InputStream ips = p2.getInputStream();
				int k = 0;
				StringBuffer sb2 = new StringBuffer();
				while ((k = is.read()) != -1)

					sb2.append((char) k);
				System.out.println(sb2.toString());
				System.out.println("entered else block");
				System.out.println("nothing");
			}
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
