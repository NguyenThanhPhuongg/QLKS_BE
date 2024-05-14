package org.example.quanlykhachsan.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TypeRoomRequest {
    private String typeRoomName;

    private Integer maxPerson;

    private Boolean status;
}
