package com.example.demo.service;

import com.example.demo.dto.TestDTO;
import com.example.demo.entities.Groups;
import com.example.demo.entities.Test;
import com.example.demo.service.generic.ServiceGeneric;

public interface ITestService extends ServiceGeneric<Test,TestDTO> {
}
