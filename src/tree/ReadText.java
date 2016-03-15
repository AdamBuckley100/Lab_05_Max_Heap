package tree;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadText {

	public static void main(String[] args) {
		try {
			File file = new File("SpanishWords.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			// add line by line to heap:
			Heap<String> heap = new Heap<String>();
			//StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				// \\s+ means all types of white space and any amount
				// my splitArrays has: the two+ tokens in it starting from 0 to no. of single words-1.
				String[] splitArrays = line.split("\\s+");
				heap.insert(splitArrays[0]);
				System.out.println(splitArrays[0]);
			}
			fileReader.close();
			System.out.println("Contents of file:");
			System.out.println(heap.size());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	while (!hp.isEmpty())
	{
		int mac = heap.delete();
		System.out.println(max + " " + heap);
	}
}
}
