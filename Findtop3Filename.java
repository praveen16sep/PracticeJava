package com.program.java8Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Findtop3Filename {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<FileData> listFile=Arrays.asList(new FileData("File1", (long) 1024),
		new FileData("File2", (long)1020),
		new FileData("File3", (long)2000), 
		new FileData("File4", (long)20000), 
		new FileData("File5", (long)4000),
		new FileData("File6", (long)5000));

List<String> top3files=listFile.stream().sorted(Comparator.comparingLong(FileData :: getFileSize).reversed())
                        .limit(3).map(FileData :: getFileName)
                        .collect(Collectors.toList());
System.out.println(top3files);

Map<String, Integer> map=new HashMap();
map.put("File1",102);
map.put("File2",100);
map.put("File3",220);
map.put("File4",1020);
map.put("File5",4020);
map.put("File6",320);

 int total=map.values().stream().mapToInt(Integer :: intValue).sum();
 
 List<Map.Entry<String, Integer>> topfiles=map.entrySet().stream().
		 sorted(Map.Entry.<String, Integer> comparingByValue(Comparator.reverseOrder()))
		 .limit(3).collect(Collectors.toList());
 
 topfiles.forEach(e->System.out.println(e.getKey()+ " = "+e.getValue()));
		

	}

}


 class FileData {
	public String fileName;
	public Long fileSize;
	
	public FileData(String fileName, Long fileSize)
	{
		this.fileName=fileName;
		this.fileSize=fileSize;
	}

	public String getFileName()
	{
		return fileName;
	}
	public Long getFileSize()
	{
		return fileSize;
	}

}