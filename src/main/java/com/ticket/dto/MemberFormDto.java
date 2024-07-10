package com.ticket.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class MemberFormDto {

//    member - member_code(pk), name, age, nickname, phone, email, id, pwd, address, role

    @NotEmpty(message = "이름을 입력해주세요")
    private String name;

    private int age;

    private String nickname;

    @NotBlank(message = "휴대폰 번호를 입력해주세요")
    private String phone;

    @NotEmpty(message = "이메일을 입력해주세요")
    @Email(message = "이메일 형식으로 입력해주세요")
    private String email;

    @NotEmpty(message = "비밀번호를 입력해주세요")
    @Length(min = 8, max = 16, message = "비밀번호는 8자 이상, 16자 이하로 입력해주세요")
    private String password;

    @NotEmpty(message = "주소를 입력해주세요")
    private String address;

}
