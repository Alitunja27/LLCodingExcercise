package codingExercise.repositories;

import java.util.ArrayList;
import java.util.List;

import codingExercise.domains.Company;

public class CompanyRepository {
	
	static List<Company> companyRepositoryList = new ArrayList<>();
	
	public static void addDataToCompanyRepository () {
		companyRepositoryList.add(new Company("san","Santander"));
		companyRepositoryList.add(new Company("bbva","Banco Bilbao Vizcaya Argentaria"));
		companyRepositoryList.add(new Company("kutxa","Kutxa Bank"));
		companyRepositoryList.add(new Company("sbd","Banc Sabadell"));
	}

}
