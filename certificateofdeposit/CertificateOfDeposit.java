package certificateofdeposit;

import java.util.*;

public class CertificateOfDeposit {
    private int certNum;
    private String lastName;
    private double bal;
    private Calendar issueDate;
    private Calendar maturityDate;
    CertificateOfDeposit newCertificate;
    
    public CertificateOfDeposit(int certificateNum, String name, double balance, int year, int month, int date){
        certNum = certificateNum;
        lastName = name;
        bal = balance;
        
        issueDate = new GregorianCalendar(2016, 9, 8);
    }
    
    public CertificateOfDeposit(){
    }

    public int getCertNum() {
        return certNum;
    }

    public void setCertNum(int certNum) {
        this.certNum = certNum;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBal() {
        return bal;
    }

    public void setBal(double bal) {
        this.bal = bal;
    }

    public Calendar getIssueDate() {
        return issueDate;
    }

    public void setIssueDate() {
        int year = issueDate.get(Calendar.YEAR);
        int month = issueDate.get(Calendar.MONTH);
        int day = issueDate.get(Calendar.DAY_OF_MONTH);
        
        this.issueDate = issueDate;
    }

    public Calendar getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate() {
        this.maturityDate = maturityDate;
    }
    
    public Calendar calculateMaturityDate(){
        setIssueDate();
        maturityDate.add(Calendar.YEAR, 1);
        
        return maturityDate;
    }
    
    public CertificateOfDeposit createCertificate(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter certificate number");
        certNum = input.nextInt();
        
        input.nextLine();
        
        System.out.println("Enter last name");
        lastName = input.nextLine();
        
        System.out.println("Enter account balance");
        bal = input.nextDouble();
        
        return newCertificate;
    }
    
    @Override
    public String toString(){
        
        return "The certificate number " + certNum + " which belongs to " + lastName
                + ", and has the balance $" + bal + " was issued on " + issueDate
                + ", and has a maturity date of " + maturityDate;
    }
    
}