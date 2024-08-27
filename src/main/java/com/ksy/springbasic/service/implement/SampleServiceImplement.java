package com.ksy.springbasic.service.implement;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ksy.springbasic.dto.PostSample1RequestDto;
import com.ksy.springbasic.entity.SampleTable1Entity;
import com.ksy.springbasic.repository.SampleTable1Repository;
import com.ksy.springbasic.service.SampleService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SampleServiceImplement implements SampleService {

    private final SampleTable1Repository sampleTable1Repository;

    @Override
    public ResponseEntity<String> postSample1(PostSample1RequestDto dto) {

        // CREATE (SQL : INSERT)
        // 1. Entity 클래스의 인스턴스 생성
        String sampleId = dto.getSampleId();
        Integer sampleColumn = dto.getSampleColumn();

        SampleTable1Entity entity = new SampleTable1Entity(sampleId, sampleColumn);

        // 2. 생성한 인스턴스를 repository를 이용하여 저장
        sampleTable1Repository.save(entity);

        return ResponseEntity.status(HttpStatus.CREATED).body("성공");
    }
    
}
