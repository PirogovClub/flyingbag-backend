package tech.flyingbag.magnet.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


@Entity
@Table(name = "phone_data")
@NoArgsConstructor
public class PhoneData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    @Getter
    private int id;

    @Column(name = "gyroscope_x")
    @Getter
    @Setter
    private BigDecimal gyroscope_x;
    @Column(name = "gyroscope_y")
    @Getter
    @Setter
    private BigDecimal gyroscope_y;
    @Column(name = "gyroscope_z")
    @Getter
    @Setter
    private BigDecimal gyroscope_z;

    @Column(name = "magnitometr_x")
    @Getter
    @Setter
    private BigDecimal magnitometr_x;
    @Column(name = "magnitometr_y")
    @Getter
    @Setter
    private BigDecimal magnitometr_y;
    @Column(name = "magnitometr_z")
    @Getter
    @Setter
    private BigDecimal magnitometr_z;


    @Column(name = "accelerometer_x")
    @Getter
    @Setter
    private BigDecimal accelerometer_x;
    @Column(name = "accelerometer_y")
    @Getter
    @Setter
    private BigDecimal accelerometer_y;
    @Column(name = "accelerometer_z")
    @Getter
    @Setter
    private BigDecimal accelerometer_z;


    @Column(name = "user_accelerometer_x")
    @Getter
    @Setter
    private BigDecimal user_accelerometer_x;

    @Column(name = "user_accelerometer_y")
    @Getter
    @Setter
    private BigDecimal user_accelerometer_y;
    @Column(name = "user_accelerometer_z")
    @Getter
    @Setter
    private BigDecimal user_accelerometer_z;

    @Column(name = "altitude")
    @Getter
    @Setter
    private BigDecimal altitude;
    @Column(name = "latitude")
    @Getter
    @Setter
    private BigDecimal latitude;
    @Column(name = "longitude")
    @Getter
    @Setter
    private BigDecimal longitude;
    @Column(name = "heading")
    @Getter
    @Setter
    private BigDecimal heading;
    @Column(name = "accuracy")
    @Getter
    @Setter
    private BigDecimal accuracy;

    @Column(name = "time")
    @Getter
    @Setter
    private Timestamp time;

    @Column(name = "local_time")
    @Getter
    @Setter
    private Timestamp local_time;

    @JoinColumn(name = "measurement_id",referencedColumnName="id")
    @Getter
    @Setter
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)

    private Measurements measurement_id;



}
