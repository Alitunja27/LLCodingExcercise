package codingExercise.services;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import codingExercise.domains.Company;
import codingExercise.domains.Scans;
import codingExercise.repositories.AgreementRepository;

public class AgreementService {
		
	public void addScans () { 	 												//add scans from an agreement
		Company myCompany =  new Company(null, null);
		Company counterPartyCompany = new Company(null, null);
		Scans newScan = new Scans(null, null, null);
		for(int i=0;i<AgreementRepository.agreementRepositoryList.size();i++) { //for: to find the companies in agreement (agreement ReposirtoryList) so we can add a new scan
			if(AgreementRepository.agreementRepositoryList.get(i).getMyComany().equals(myCompany) 
					&& AgreementRepository.agreementRepositoryList.get(i).getCounterpartyCompany().equals(counterPartyCompany)) {
				AgreementRepository.agreementRepositoryList.get(i).getScansList().add(newScan);
			}
		}
		
	}
	
	@SuppressWarnings("resource")
	public void deleteScans () {  																														//remove scans from an agreement
		Company myCompany =  new Company(null, null);
		Company counterPartyCompany = new Company(null, null);
		for(int i=0;i<AgreementRepository.agreementRepositoryList.size();i++) { //for: to find the companies in agreement (agreement ReposirtoryList) so we can show the Scans to delete it
			if(AgreementRepository.agreementRepositoryList.get(i).getMyComany().equals(myCompany) 
					&& AgreementRepository.agreementRepositoryList.get(i).getCounterpartyCompany().equals(counterPartyCompany)) {
				System.out.println("Wich one of this Scans you want to delete?" + AgreementRepository.agreementRepositoryList.get(i).getScansList());  	//Show the Scans List
				System.out.println("Please write the fileName:");
				String scanFileNameToBeDeleted = new Scanner(System.in).nextLine();																		//Read the file to be deleted
				for(int j=0;j<AgreementRepository.agreementRepositoryList.get(i).getScansList().size();j++) {											//Finding the file to be deleted in the scan List
					if(AgreementRepository.agreementRepositoryList.get(i).getScansList().get(j).getFileName().equalsIgnoreCase(scanFileNameToBeDeleted)) {
						AgreementRepository.agreementRepositoryList.get(i).getScansList().remove(j);
					}
				}
			}
		}
				
	}
	
	public void findScanInContract () {  			//Given a contract and a text fragment, check if the text is found in any of the contract
													//scans.
		Company myCompany =  new Company(null, null);
		Company counterPartyCompany = new Company(null, null);
		String textFragment = new String();
		for(int i=0;i<AgreementRepository.agreementRepositoryList.size();i++) {															//Finding the specific agreement
			if(AgreementRepository.agreementRepositoryList.get(i).getMyComany().equals(myCompany) 
					&& AgreementRepository.agreementRepositoryList.get(i).getCounterpartyCompany().equals(counterPartyCompany)) {
				for(int j=0;j<AgreementRepository.agreementRepositoryList.get(i).getScansList().size();j++) {							//Searching in the scansText the TextFragment
					Boolean textCheck = AgreementRepository.agreementRepositoryList.get(i).getScansList().get(j).getFileText().toUpperCase().contains(textFragment.toUpperCase()); //Checking the TextFRagment in the scanText
					if(textCheck==true) {
						System.out.println("This text: " + textFragment + "is in this agreement scan fileName " + AgreementRepository.agreementRepositoryList.get(i).getScansList().get(j).getFileName());
					}
				}
			}
		}
	}
	
	public void getPageCount() {					//Given a contract, get the total page count based on the scans contained in the contract.
		Company myCompany =  new Company(null, null);
		Company counterPartyCompany = new Company(null, null);
		for(int i=0;i<AgreementRepository.agreementRepositoryList.size();i++) {																	//Finding the specific agreement
			if(AgreementRepository.agreementRepositoryList.get(i).getMyComany().equals(myCompany) 
					&& AgreementRepository.agreementRepositoryList.get(i).getCounterpartyCompany().equals(counterPartyCompany)) {
				Integer pageCounter = 0;
				for(int j=0;j<AgreementRepository.agreementRepositoryList.get(i).getScansList().size();j++) {
					pageCounter = pageCounter + AgreementRepository.agreementRepositoryList.get(i).getScansList().get(j).getFilePageCount();	//adding the page contained in the scans files
				}
				System.out.println("This agreement have: " + pageCounter + " pages");
			}
		}
	}
		
	
	public void findFileListName () {				//Given a list of contracts and a company id: get a list of the file names from all the scans
													//contained in contracts where the company acting as “My Company” matches the input
													//id.
		String myCompanyId = new String();
		List<String> fileNameList = new ArrayList<>();
		for(int i=0;i<AgreementRepository.agreementRepositoryList.size();i++) {																	//Finding the specific agreement
			if(AgreementRepository.agreementRepositoryList.get(i).getMyComany().getId().toUpperCase().contains(myCompanyId.toUpperCase())){		//searching the Id as myCompany in the List of agreements
				for(int j=0;j<AgreementRepository.agreementRepositoryList.get(i).getScansList().size();j++) {
					fileNameList.add(AgreementRepository.agreementRepositoryList.get(i).getScansList().get(j).getFileName());					//Adding the fileName to the fileNameList
				}
			}	
		}
		System.out.println("File name List containing this Id: " + myCompanyId + " List: " + fileNameList);
	}
	
	public void mapCounterpartyIDAgreements () {	//Given a list of contracts, group them by counterparty company and return a map
													//structure so that the key is counterparty id and the value is the list of contracts for that
													//company.
		
	}
	

}
