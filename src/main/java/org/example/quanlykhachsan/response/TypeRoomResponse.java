package org.example.quanlykhachsan.response;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TypeRoomResponse {

    private Integer idTypeRoom;

    private String typeRoomName;

    private Integer maxPerson;

    private Boolean status;
}
