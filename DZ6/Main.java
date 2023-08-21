package DZ6;

import java.util.*;
public class Main {
    public static TreeMap<String, Client> mapCl;
    public static TreeMap<Integer, Account> mapAcc;

    public static HashMap<Accounts, Clients> accountsClients = new HashMap<>();

    public static void main(String[] args) {
        //TreeMap
        Client client1 = new Client("Иванов И.И.", 20, "1,2,3");
        Client client2 = new Client("Петров П.П.", 31, "5,6,7");
        Client client3 = new Client("Сидоров С.С", 23, "8,9,10");
        Client client4 = new Client("Константинов К.К.", 28, "11,12,13");


        Account account1 = new Account(1, "Иванов И.И");
        Account account2 = new Account(2, "Иванов И.И");
        Account account3 = new Account(5, "Петров П.П.");
        Account account4 = new Account(7, "Петров П.П.");
        Account account5 = new Account(12, "Константинов К.К.");
        Account account6 = new Account(11, "Константинов К.К.");
        Account account7 = new Account(13, "Константинов К.К.");
        Account account8 = new Account(9, "Сидоров С.С.");

        mapCl = new TreeMap<>(Comparator.naturalOrder());
        mapAcc = new TreeMap<>(Comparator.naturalOrder());

        mapCl.put("Иванов И.И.", client1);
        mapCl.put("Петров П.П.", client2);
        mapCl.put("Сидоров С.С", client3);
        mapCl.put("Константинов К.К.", client4);


        mapAcc.put(1, account1);
        mapAcc.put(2, account2);
        mapAcc.put(5, account3);
        mapAcc.put(7, account4);
        mapAcc.put(12, account5);
        mapAcc.put(11, account6);
        mapAcc.put(13, account7);
        mapAcc.put(9, account8);

        Client client = mapCl.get("Константинов К.К.");
        System.out.println(client.listOFaccount);

        Account account = mapAcc.get(12);
        System.out.println(account.clientName);

        //HashMap
        Clients clients1 = new Clients("Иванов И.И.", 20);
        Clients clients2 = new Clients("Петров П.П.", 31);
        Clients clients3 = new Clients("Сидоров С.С.", 23);
        Clients clients4 = new Clients("Константинов К.К.", 28);


        Accounts accounts1 = new Accounts(1, clients1);
        Accounts accounts2 = new Accounts(2, clients1);
        Accounts accounts3 = new Accounts(5, clients2);
        Accounts accounts4 = new Accounts(7, clients2);
        Accounts accounts5 = new Accounts(12, clients4);
        Accounts accounts6 = new Accounts(11, clients4);
        Accounts accounts7 = new Accounts(13, clients4);
        Accounts accounts8 = new Accounts(9, clients3);

        accountsClients.put(accounts1, clients1);
        accountsClients.put(accounts2, clients1);
        accountsClients.put(accounts3, clients2);
        accountsClients.put(accounts4, clients2);
        accountsClients.put(accounts5, clients4);
        accountsClients.put(accounts6, clients4);
        accountsClients.put(accounts7, clients4);
        accountsClients.put(accounts8, clients3);

        findClients(accounts1);
        findClients(accounts2);
        findClients(accounts3);
        findClients(accounts4);
        findClients(accounts5);
        findClients(accounts6);
        findClients(accounts7);
        findClients(accounts8);

        findAcc(clients1);
        findAcc(clients2);
        findAcc(clients3);
        findAcc(clients4);


    }

    public static void findClients(Accounts accounts) {
        Clients clients = new Clients(accountsClients.get(accounts).clientName, accountsClients.get(accounts).clientAge);
        System.out.println("Счет ==>  " + accounts.accountNumber + " Клиент ==>  " + clients.clientName + "  Возраст ==>  " + clients.clientAge);

    }

    public static void findAcc(Clients clients) {
        Set<Map.Entry<Accounts, Clients>> entSet = accountsClients.entrySet();
        System.out.println("Клиент ==> " + clients.clientName + ", возраст ==>  " + clients.clientAge + " Счета ==>  ");
        for (Map.Entry<Accounts, Clients> pair : entSet) {
            if (clients.clientName.equals(pair.getValue().clientName) && clients.clientAge.equals(pair.getValue().clientAge)) {
                System.out.println(pair.getKey().accountNumber);
            }
        }
    }
}
