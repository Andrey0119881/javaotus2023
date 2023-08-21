package DZ6;

import java.util.Objects;

public class Clients {

    public String clientName;
    public Integer clientAge;


    public Clients(String clientName, Integer clientAge) {
        this.clientName = clientName;
        this.clientAge = clientAge;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clients clients = (Clients) o;
        return clientAge == clients.clientAge && clientName.equals(clients.clientName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientName, clientAge);
    }
}