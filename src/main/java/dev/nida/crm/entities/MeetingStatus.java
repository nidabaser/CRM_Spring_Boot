package dev.nida.crm.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "meeting_status")
public class MeetingStatus extends BaseEntity {

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;

    public enum Status {
        PLANNED,
        REALISED,
        CANCELLED
    }
}
