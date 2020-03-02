package codingExercise.repositories;

import java.util.ArrayList;
import java.util.List;

import codingExercise.domains.Agreements;
import codingExercise.domains.Company;
import codingExercise.domains.Scans;

public class AgreementRepository {
	
	static List<Agreements> agreementRepositoryList = new ArrayList<>();
	
	public static void addDataToAgreementRepositoryList () {
		
		Company company1 = CompanyRepository.companyRepositoryList.get(0);
		Company company2 = CompanyRepository.companyRepositoryList.get(1);
		Company company3 = CompanyRepository.companyRepositoryList.get(2);
		Company company4 = CompanyRepository.companyRepositoryList.get(3);
		Scans scan1 = CompanyScans.companyScansLists.get(0);
		Scans scan2 = CompanyScans.companyScansLists.get(1);
		Scans scan3 = CompanyScans.companyScansLists.get(2);
		Scans scan4 = CompanyScans.companyScansLists.get(3);
		List<Scans> scanList1 = new ArrayList<>();
		scanList1.add(scan1);
		scanList1.add(scan2);
		List<Scans> scanList2 = new ArrayList<>();
		scanList2.add(scan3);
		scanList2.add(scan4);
		
		Agreements agreement1 = new Agreements(company1,company2,scanList1);
		Agreements agreement2 = new Agreements(company3,company4,scanList2);
		agreementRepositoryList.add(agreement1);
		agreementRepositoryList.add(agreement2);
		
	}
}
