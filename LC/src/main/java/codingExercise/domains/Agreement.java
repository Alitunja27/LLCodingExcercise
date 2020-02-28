package codingExercise.domains;

import java.util.List;

public class Agreement {

	private Company myCompany,counterpartyCompany;
	private List<Scans> scans;
	
	public Agreement(Company myCompany, Company counterpartyCompany, List<Scans> scans) {
		super();
		this.myCompany = myCompany;
		this.counterpartyCompany = counterpartyCompany;
		this.scans = scans;
	}

	public Company getMyCompany() {
		return myCompany;
	}

	public void setMyCompany(Company myCompany) {
		this.myCompany = myCompany;
	}

	public Company getCounterpartyCompany() {
		return counterpartyCompany;
	}

	public void setCounterpartyCompany(Company counterpartyCompany) {
		this.counterpartyCompany = counterpartyCompany;
	}

	public List<Scans> getScans() {
		return scans;
	}

	public void setScans(List<Scans> scans) {
		this.scans = scans;
	}
}
