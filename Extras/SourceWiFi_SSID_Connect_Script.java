package Testcases.whitbread_brewersfayer_autotests;

import java.io.IOException;
import java.io.InputStream;

import org.testng.annotations.Test;

public class SourceWiFi_SSID_Connect_Script {

	@Test(alwaysRun=true)
	public void test1() {
		try {
              
			Process p = Runtime.getRuntime().exec("C:\\Users\\mdonagapura\\Desktop\\work1.bat");
			try {
				Thread.sleep(10000);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			InputStream is = p.getInputStream();
			int i = 0;
			StringBuffer sb = new StringBuffer();
			while ((i = is.read()) != -1)

				sb.append((char) i);
			System.out.println(sb.toString());

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
