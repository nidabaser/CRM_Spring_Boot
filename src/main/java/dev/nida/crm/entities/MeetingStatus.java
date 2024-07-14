package dev.nida.crm.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "meeting_status")
public class MeetingStatus extends BaseEntity {

    @Enumerated(EnumType.STRING)
    @Column(name = "status_name")
    private StatusName name; // bu satır da değiştirlecek

    public enum StatusName {
        PLANNED,
        REALISED,
        CANCELLED
    }
}
