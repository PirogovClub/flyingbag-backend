package tech.flyingbag.magnet.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;


@Entity
@Table(name = "bme_sensors_data")
@NoArgsConstructor
public class SensorsData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    @Getter
    private int id;

    @Getter
    @Setter
    @Column(name = "sensor_id")
    private UUID sensorId;

    @Column(name = "pressure")
    @Getter
    @Setter
    private BigDecimal pressure;

    @Column(name = "temperature")
    @Getter
    @Setter
    private BigDecimal temperature;

    @Column(name = "humidity")
    @Getter
    @Setter
    private BigDecimal humidity;

    @JoinColumn(name = "measurement_id",referencedColumnName="id")
    @Getter
    @Setter
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Measurements measurement_id;

    @Column(name = "altitude")
    @Getter
    @Setter
    private BigDecimal altitude;

    @Column(name = "time")
    @Getter
    @Setter
    private Timestamp time;

    @Column(name = "location")
    @Getter
    @Setter
    private String location;


    @Column(name = "sensor_name")
    @Getter
    @Setter
    private String sensor_name;


}
