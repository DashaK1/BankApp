public class BankAppMain {
    public static void main(String[] args) {
        Manager manager = new Manager("John Smith",1,"09.09.1977"," Jerusalem");
        Accountant accountant1 = new Accountant("Marry Jones",2,"07.08.2000","Chicago");
        Accountant accountant2 = new Accountant("Jessica Smith",3,"12.03.2001","New York");
        Accountant accountant3 = new Accountant("Bob Black",4,"22.03.1980","Denver");
        Accountant accountant4 = new Accountant("Amanda Williams ",5,"17.08.1986","Washington");
        Accountant accountant5 = new Accountant("Angelina Miller",6,"05.06.1987","Boston");
        Clerk clerk1 = new Clerk("Ivan Petrov",7,"05.08.1999","Moscow");
        Clerk clerk2 = new Clerk("Anna Davis",8,"12.06.1997","Seattle");
        Clerk clerk3 = new Clerk("Matt Brown",9,"05.11.2000","Atlanta");

        System.out.println(manager.toString());
        System.out.println(accountant2.toString());
        System.out.println(clerk2.toString());

        manager.fireEmployee("Ivan Petrov");
        accountant1.createReport("John Snow");
        clerk1.makeCall("Petr Ivanov");




    }
}
