package go;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class folderExplorer {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"welcome to the basic website sample of go buster \nhere you can able to find the the similarity between the goBuster and this noBuseter tool"
						+ "\nlets go in to it enter url first as of now entair url means alonge with header 'https://' \nand wordlist file path completed path ");

		//String url = "https://app.fireflink.com/";
		System.out.println("\n\n\nenter url");
		 String url=sc.next();
		System.out.println("\nenter wordlist path");
		//String path = "C:\\Users\\DELL\\OneDrive\\Desktop\\folder.txt";
		 String path=sc.next();
		fetchwordByword(url, path);

	}

	private static void fetchwordByword(String url, String path) throws Exception {

		File file = new File(path);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		
		while ((st = br.readLine()) != null) {
			System.out.println(st);
			verifyLink(url, st);
		}
	}

	public static void verifyLink(String u, String w) {
		String url = u + w;
		// System.out.println(url);
		try {
			URL link = new URL(url);
		//	System.out.println("1");
			HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
		//	System.out.println("1");
			httpURLConnection.setConnectTimeout(5000); // Set connection timeout to 3 seconds
		//	System.out.println("1");
			httpURLConnection.connect();
		//	System.out.println("1");
			if (httpURLConnection.getResponseCode() < 400) {
				System.out.print("/"+w + "    ");
				System.out.println(url + " - " + httpURLConnection.getResponseMessage());
			} else {
			//	System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link  "+ httpURLConnection.getResponseCode());
			}
		} catch (Exception e) {
			//System.out.println(e.getMessage());
			//System.out.println(url + " - " + "is a broken linkz ");
		}
	}
}
