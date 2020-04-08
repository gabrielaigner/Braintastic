package at.braintastic.braintasticendpoint.entity;

import javax.persistence.*;

@Entity
@Table(name = "BT_Session", schema = "braintasticdb")
public class Session {
    @Id
    private long id;

    @ManyToOne
    private User user;

    public Session(){}
    public Session(User user){
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public User getUser() { return user; }

    public void setUser(User user) { this.user = user; }
}