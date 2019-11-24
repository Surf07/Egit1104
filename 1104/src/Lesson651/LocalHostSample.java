package Lesson651;//429


import java.net.InetAddress;

public class LocalHostSample {
	public static void main(String args[]) {

		try {

			InetAddress ia = InetAddress.getLocalHost();
			String ip = ia.getHostAddress();
			String hostname = ia.getHostName();

			System.out.println("IPアドレス:" +ip);
			System.out.println("ホスト名:" + hostname);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
