package org.example.quanlykhachsan.service;

import lombok.RequiredArgsConstructor;
import org.example.quanlykhachsan.entity.TypeRoom;
import org.example.quanlykhachsan.repository.TypeRoomRepository;
import org.example.quanlykhachsan.request.TypeRoomRequest;
import org.example.quanlykhachsan.response.TypeRoomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TypeRoomService {

    private final TypeRoomRepository typeRoomRepository;

    public List<TypeRoomResponse> getAll(){
        List<TypeRoom> listTypesRoom = typeRoomRepository.findAll();
        List<TypeRoomResponse> listTypeRoomResponse = new ArrayList<>();
        for (TypeRoom typeRoom : listTypesRoom){
            TypeRoomResponse typeRoomResponse = new TypeRoomResponse();
            typeRoomResponse.setIdTypeRoom(typeRoom.getIdTypeRoom());
            typeRoomResponse.setTypeRoomName(typeRoom.getTypeRoomName());
            typeRoomResponse.setMaxPerson(typeRoom.getMaxPerson());
            typeRoomResponse.setStatus(typeRoom.getStatus());
            listTypeRoomResponse.add(typeRoomResponse);
        }
        return listTypeRoomResponse;
    }

    public String save(TypeRoomRequest typeRoomRequest){
        try{
            if(typeRoomRepository.existsByTypeRoomName(typeRoomRequest.getTypeRoomName())){
                return "Tên loại phòng đã tồn tại";
            }
            TypeRoom typeRoom = new TypeRoom();
            typeRoom.setTypeRoomName(typeRoomRequest.getTypeRoomName());
            typeRoom.setMaxPerson(typeRoomRequest.getMaxPerson());
            typeRoom.setStatus(true);
            typeRoomRepository.save(typeRoom);
            return "Thêm loại phòng thành công";
        }catch (Exception e){
            return "loi"+e.getMessage();
        }
    }
    public String delete(int id){
        try{
            if(typeRoomRepository.existsByIdTypeRoom(id)){
                typeRoomRepository.deleteById(id);
                return "Xóa phòng thành công";
            }
            return "Phòng không tồn tại";
        }catch (Exception e){
            return "loi" + e.getMessage();
        }
    }

    public TypeRoomResponse detail(int id){
        try{
            if(typeRoomRepository.existsByIdTypeRoom(id)){
                TypeRoom typeRoom = typeRoomRepository.findById(id).get();
                TypeRoomResponse response = new TypeRoomResponse();
                response.setIdTypeRoom(typeRoom.getIdTypeRoom());
                response.setTypeRoomName(typeRoom.getTypeRoomName());
                response.setMaxPerson(typeRoom.getMaxPerson());
                response.setStatus(typeRoom.getStatus());
                return response;
            }else{
                return null;
            }
        }catch (Exception e){
            return null;
        }
    }
    public String update(int id,TypeRoomRequest typeRoomRequest){
        try{
            if(typeRoomRepository.existsByIdTypeRoom(id)){
                TypeRoom typeRoom = typeRoomRepository.findById(id).get();
                if(typeRoomRequest.getStatus() != null){
                    typeRoom.setStatus(typeRoomRequest.getStatus());
                }else {
                    typeRoom.setStatus(typeRoom.getStatus());
                }
                typeRoom.setTypeRoomName(typeRoomRequest.getTypeRoomName());
                typeRoom.setMaxPerson(typeRoomRequest.getMaxPerson());
                typeRoom.setStatus(true);
                typeRoomRepository.save(typeRoom);
                return "Cập nhật loại phòng thành công";
            }
            return "Loại phòng không tồn tại";
        }catch (Exception e){
            return "loi"+e.getMessage();
        }
    }

}
