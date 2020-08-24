class Patient extends Person {

	public String diagnostic;
	public String inTime;
	public String prevTime;
	Patient() {

	}
	public Patient(String diagnostic, String inTime, String prevTime) {
        super();
        this.diagnostic = diagnostic;
        this.inTime = inTime;
        this.prevTime = prevTime;
	}

	public String getDiagnostic() {
		return diagnostic;
	}
	public String getInTime() {
		return inTime;
	}
	public String getPrevTime() {
		return prevTime;
	}
	public void setDiagnostic() {
		this.diagnostic = diagnostic;
	}
	public void setInTime() {
		this.inTime = inTime;
	}
	public void setPrevTime() {
		this.prevTime = prevTime;
	}		
}
