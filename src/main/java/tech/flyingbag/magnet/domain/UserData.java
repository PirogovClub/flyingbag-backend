package tech.flyingbag.magnet.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "users")
@NoArgsConstructor
public class UserData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    @Getter
    private int id;

    @Getter
    @Setter
    @Column(name = "first_name")
    private String first_name;

    @Getter
    @Setter
    @Column(name = "last_name")
    private String last_name;

    @Getter
    @Setter
    @Column(name = "middle_name")
    private String middle_name;

    @Getter
    @Setter
    @Column(name = "nick_name")
    private String nick_name;

    @Getter
    @Setter
    @Column(name = "email")
    private String email;

    public UserData update(UserData updateTo) {
        this.setEmail(updateTo.getEmail() == null ? this.getEmail() : updateTo.getEmail());
        this.setFirst_name(updateTo.getFirst_name() == null ? this.getFirst_name() : updateTo.getFirst_name());
        this.setLast_name(updateTo.getLast_name() == null ? this.getLast_name() : updateTo.getLast_name());
        this.setEmail(updateTo.getEmail() == null ? this.getEmail() : updateTo.getEmail());
        this.setMiddle_name(updateTo.getMiddle_name() == null ? this.getMiddle_name() : updateTo.getMiddle_name());
        this.setNick_name(updateTo.getNick_name() == null ? this.getNick_name() : updateTo.getNick_name());

        return this;
    }
}




