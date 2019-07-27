import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class TiHuan {

	public static void main(String[] args) {
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(new FileReader("E:\\java测试\\替换测试\\替换名前.txt"));
			String len = br.readLine();
			System.out.println(len);
			len = len.replace("{name}", "偶偶").replace("{type}", "狗").replace("{master}", "小米");
			System.out.println(len);
			fw = new FileWriter("E:\\java测试\\替换测试\\替换名前.txt", true);
			bw = new BufferedWriter(fw);
			bw.newLine();
			bw.write(len);
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
				if (br != null)
					br.close();
				if (fw != null)
					fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
