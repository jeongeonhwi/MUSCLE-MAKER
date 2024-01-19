package com.ssafy.musclemaker.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
//Token 정보를 response할 때 사용할 클래스
public class TokenDto {
    private String token;
}
