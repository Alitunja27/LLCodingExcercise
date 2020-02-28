package codingExercise.domains;

public class Scans {

	private String fileName, fileText;
	private Integer filePageCount;
	public Scans(String fileName, String fileText, Integer filePageCount) {
		super();
		this.fileName = fileName;
		this.fileText = fileText;
		this.filePageCount = filePageCount;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileText() {
		return fileText;
	}
	public void setFileText(String fileText) {
		this.fileText = fileText;
	}
	public Integer getFilePageCount() {
		return filePageCount;
	}
	public void setFilePageCount(Integer filePageCount) {
		this.filePageCount = filePageCount;
	}
	
	
	
}
