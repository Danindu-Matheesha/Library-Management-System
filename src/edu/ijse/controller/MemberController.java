/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.controller;

import edu.ijse.dto.MemberDto;
import edu.ijse.model.MemberModel;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class MemberController {
     private MemberModel memberModel;

    public MemberController() throws Exception{
        this.memberModel = new MemberModel();
    }

    public String saveMember(MemberDto memberDto) throws Exception{
        String resp = memberModel.saveMember(memberDto);
        return resp;
    }

    public ArrayList<MemberDto> getAllMember() throws Exception{
        ArrayList<MemberDto> memberDtos = memberModel.getAllMember();
        return memberDtos;
    }

    public MemberDto searchMember(String MemberId) throws Exception{
        MemberDto memberDto = memberModel.getMember(MemberId);
        return memberDto;
    }

    public String deleteMember(String memberId) throws Exception{
        String resp = memberModel.deleteMember(memberId);
        return resp;
    }
    
    public String updateMember(MemberDto memberDto) throws Exception {
        String resp = memberModel.updateMember(memberDto);
        return resp;
    }
}
