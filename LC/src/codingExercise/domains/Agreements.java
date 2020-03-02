package codingExercise.domains;

import java.util.List;

public class Agreements {
	
	private Company myComany, counterpartyCompany;
	
	private List<Scans> scansList;

	public Agreements(Company myComany, Company counterpartyCompany, List<Scans> scansList) {
		super();
		this.myComany = myComany;
		this.counterpartyCompany = counterpartyCompany;
		this.scansList = scansList;
	}

	public Company getMyComany() {
		return myComany;
	}

	public void setMyComany(Company myComany) {
		this.myComany = myComany;
	}

	public Company getCounterpartyCompany() {
		return counterpartyCompany;
	}

	public void setCounterpartyCompany(Company counterpartyCompany) {
		this.counterpartyCompany = counterpartyCompany;
	}

	public List<Scans> getScansList() {
		return scansList;
	}

	public void setScansList(List<Scans> scansList) {
		this.scansList = scansList;
	}
	
	

}
