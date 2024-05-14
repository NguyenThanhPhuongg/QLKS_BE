package org.example.quanlykhachsan.controller;

import lombok.RequiredArgsConstructor;
import org.example.quanlykhachsan.request.TypeRoomRequest;
import org.example.quanlykhachsan.response.TypeRoomResponse;
import org.example.quanlykhachsan.service.TypeRoomService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/typeRoom")
@RequiredArgsConstructor
@CrossOrigin("*")
public class TypeRoomController {
    private final TypeRoomService typeRoomService;
    @GetMapping("/getAll")
    public ResponseEntity<?> getAll(){
        List<TypeRoomResponse> list = typeRoomService.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }

    @PostMapping("/save")
    public ResponseEntity<?> save( @RequestBody TypeRoomRequest typeRoomRequest){
        String result = typeRoomService.save(typeRoomRequest);
        String jsonResult = "{\"result\": \"" + result + "\"}";
        return ResponseEntity.status(HttpStatus.CREATED)
                .contentType(MediaType.APPLICATION_JSON)
                .body(jsonResult);
    }
    @GetMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable int id){
        String result = typeRoomService.delete(id);
        String jsonResult = "{\"result\": \"" + result + "\"}";
        return ResponseEntity.status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(jsonResult);
    }
    @GetMapping("/detail/{id}")
    public ResponseEntity<?> detail(@PathVariable int id){
        TypeRoomResponse typeRoomResponse = typeRoomService.detail(id);
        return ResponseEntity.status(HttpStatus.OK).body(typeRoomResponse);
    }
    @PostMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable int id, @RequestBody TypeRoomRequest typeRoomRequest){
        String result = typeRoomService.update(id,typeRoomRequest);
        String jsonResult = "{\"result\": \"" + result + "\"}";
        return ResponseEntity.status(HttpStatus.CREATED)
                .contentType(MediaType.APPLICATION_JSON)
                .body(jsonResult);
    }
}
