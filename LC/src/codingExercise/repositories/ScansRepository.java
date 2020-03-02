package codingExercise.repositories;

import java.util.ArrayList;
import java.util.List;

import codingExercise.domains.Scans;

public class ScansRepository {
	
	static List<Scans> companyScansLists = new ArrayList<>();
	
	public static void addDataToCompanyScansList () {
		companyScansLists.add(new Scans ("documento1.pdf","Lorem ipsum dolor sit amet, consectetuer adipiscing elit",5));
		companyScansLists.add(new Scans ("documento2.pdf","Cum sociis natoque penatibus et magnis dis parturient montes",3));
		companyScansLists.add(new Scans ("documento3.pdf","Nullam dictum felis eu pede mollis pretium. Integer tincidunt",4));
		companyScansLists.add(new Scans ("documento4.pdf","Etiam iltricies nisi vel augue",1));
	}
}
