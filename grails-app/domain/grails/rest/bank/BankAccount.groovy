package grails.rest.bank


class BankAccount {

	String accountNumber;
	BigDecimal openingBalance;
	BigDecimal currentBalance;
	String accountOwner;
	boolean isCancel;
	String accountType;
	Date accountOpeningDateTime;
	
    static constraints = {
    }
}
