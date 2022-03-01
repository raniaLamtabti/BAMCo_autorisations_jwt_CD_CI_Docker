package com.example.demo.service.impl;


import com.example.demo.dto.TestDTO;
import com.example.demo.entities.Test;
import com.example.demo.service.ITestService;
import com.example.demo.service.generic.ServiceGenericImpl;
import org.springframework.stereotype.Service;

@Service
public class TestService extends ServiceGenericImpl<Test, TestDTO> implements ITestService {


    private static final Class<Test> entityClass = Test.class;
    private static final Class<TestDTO> dtoClass = TestDTO.class;
    public TestService() {
        super( entityClass, dtoClass);
    }
}
