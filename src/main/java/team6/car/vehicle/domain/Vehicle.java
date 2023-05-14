package team6.car.vehicle.domain;

import lombok.*;
import org.springframework.lang.Nullable;
import team6.car.device.domain.Device;
import team6.car.member.domain.Member;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="Vehicle")
@Table(name="vehicle_info")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicle_id;
    @Column(name="vehicle_number")
    private String vehicle_number;
    @Column(name="vehicle_model")
    private String vehicle_model;
    @Column(name="vehicle_color")
    private String vehicle_color;

    @Column(name="vehicle_departuretime")
    private LocalDateTime vehicle_departuretime;
    @Column(name="no_departure")
    private Boolean No_departure;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="member_id") //FK
    private Member member;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="device_id") //FK
    private Device device;
}
