
public class Organisation {
private String oName;
private long noOfEmployees;
public Organisation(String oName, long noOfEmployees) {
	super();
	this.oName = oName;
	this.noOfEmployees = noOfEmployees;
}
public String getoName() {
	return oName;
}
public void setoName(String oName) {
	this.oName = oName;
}
public long getNoOfEmployees() {
	return noOfEmployees;
}
public void setNoOfEmployees(long noOfEmployees) {
	this.noOfEmployees = noOfEmployees;
}
@Override
public String toString() {
	return "Organisation [oName=" + oName + ", noOfEmployees=" + noOfEmployees + "]";
}


}
