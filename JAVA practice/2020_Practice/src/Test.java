import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.xhtmlrenderer.pdf.ITextFontResolver;
import org.xhtmlrenderer.pdf.ITextRenderer;

import com.lowagie.text.pdf.BaseFont;

public class Test {

	public static void main(String[] args) {
		
		Set<String> items = new HashSet<String>();
		List<String> str = Arrays.asList("A","B","B","C");
		str.stream().filter(value -> !items.add(value))
        .collect(Collectors.toSet());
		
		StringBuilder builder = new StringBuilder();
//		builder.append("Hi");
//		builder.append("Gopal");
		
		print();

//		try {
//			String inputFile = "/Users/i500953/Downloads/SIPM-1007/B4PDF.html";
//			String url = new File(inputFile).toURI().toURL().toString();
//			System.out.println("Input file: "+inputFile + " URL "+url);
//			String outputFile = "/Users/i500953/Downloads/SIPM-1007/B4PDF.pdf";
//			OutputStream os = new FileOutputStream(outputFile);
//			ITextRenderer renderer = new ITextRenderer();
//			renderer.getFontResolver().addFont("/Users/i500953/ariba/git2/ariba/ond/S4/sourcing/eventui/ariba/sourcing/rfxui/arialuni.ttf",
//					BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
//			renderer.setDocument(url);
//			renderer.layout();
//			renderer.createPDF(os);	
//			os.close();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
	}

	private static void print() {
		List<Employee> lst = new ArrayList<Employee>();
		lst.add(new Employee(new Address(new City("Dehradun"))));
		lst.add(new Employee(null));
		lst.add(new Employee(new Address(new City("Jaipur"))));
		lst.add(new Employee(new Address(new City("Delhi"))));
		lst.add(new Employee(new Address(new City("Jaipur"))));
		String citiesCommaSeparated = String.join(",", returnDuplicates(lst));
		System.out.println(citiesCommaSeparated);
		
		
	}

	private static Set<String> returnDuplicates(List<Employee> employeeList) {
		Set<String> items = new HashSet<String>();
		return employeeList.stream()
			   .map(emp -> emp.getAddress())
			   .filter(addr -> null != addr)
			   .map(addr -> addr.getCity())
			   .map(city -> city.getName())
			   .collect(Collectors.toList())
	           .stream().filter(value -> !items.add(value))
	           .collect(Collectors.toSet());
	}

}
