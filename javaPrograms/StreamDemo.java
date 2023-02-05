package javaPrograms;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {

	public StreamDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List<String> s1=new ArrayList<String>();
		s1.add("ABCDEFG");
		s1.add("HIJKLMNOP");
		s1.add("LMNOPQ");
		s1.add("QRST");
		s1.add("UVW");
		s1.add("WX&Y&Z");
		s1.stream().filter(s->s.length()>5&&s.length()<8).forEach(s->System.out.println(s));
	}
}
