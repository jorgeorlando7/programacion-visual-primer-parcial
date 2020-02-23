package certificateofdeposit;

import java.util.GregorianCalendar;

public class TestCertificateOfDeposit {
        public static void main(String[] args) {
            CertificateOfDeposit certificate1 = new CertificateOfDeposit(1, "k", 10, 2016, 9, 9);
            CertificateOfDeposit certificate2 = new CertificateOfDeposit();
            
            certificate1.createCertificate();
            certificate2.createCertificate();
            
            System.out.println("");
            System.out.println(certificate1);
            System.out.println("");
            System.out.println(certificate2);
    }

}