package tech.flyingbag.magnet.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "measurements")
@NoArgsConstructor
public class Measurements {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    @Getter
    private long id;


    @Getter
    @Setter
    @Column(name = "measurement_uuid")
    private UUID measurement_uuid;

    @JoinColumn(name = "user_id")
    @Getter
    @Setter
    @ManyToOne(fetch = FetchType.LAZY)
    private UserData user_id;

    @Column(name = "user_device_id")
    @Getter
    @Setter
    private int user_device_id;

}
