package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class IOUtils {

	/**
	 * 解析文件
	 * @param filePath  文件路径
	 * @param splitstring	切割 符号
	 * @return
	 */
	private static List<Object[]> readFile(String filePath,String splitstring) {
		try {
			File file  = new File(filePath);
			//按行读取
			BufferedReader br = new BufferedReader(new FileReader(file));
			String str = "";
			
			List<Object[]> list = new ArrayList<Object[]>();
			while((str = br.readLine())!= null){
				String[] split = str.split(splitstring);
				list.add(split);
			}
			br.close();
			return list;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
