package org.spring.mvc.lesson47shop.exc;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.spring.mvc.lesson47shop.dto.ErrorDetailDto;

@AllArgsConstructor
@Getter
public class CommonException extends RuntimeException {

    private ErrorDetailDto detailDto;

}
