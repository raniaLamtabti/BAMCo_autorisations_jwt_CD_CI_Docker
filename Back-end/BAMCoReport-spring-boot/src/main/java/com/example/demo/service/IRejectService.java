package com.example.demo.service;

import com.example.demo.dto.ProfileMemberDTO;
import com.example.demo.dto.RejectDTO;
import com.example.demo.entities.ProfileMember;
import com.example.demo.entities.Reject;
import com.example.demo.service.generic.ServiceGeneric;

public interface IRejectService extends ServiceGeneric<Reject, RejectDTO> {
}
