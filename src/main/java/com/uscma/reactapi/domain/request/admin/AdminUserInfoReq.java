package com.uscma.reactapi.domain.request.admin;

import lombok.Data;

/**
 * @author rp
 */
@Data
public class AdminUserInfoReq {

    private String avatar;

    private String name;

    private String phone;
}
