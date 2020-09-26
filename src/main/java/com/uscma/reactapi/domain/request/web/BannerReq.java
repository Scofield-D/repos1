package com.uscma.reactapi.domain.request.web;

import com.uscma.reactapi.domain.model.web.BannerDTO;
import lombok.Data;
import org.springframework.beans.BeanUtils;

/**
 * @author rp
 */
@Data
public class BannerReq {

    private Long id;

    private String url;

    private Boolean isLink;

    private String linkUrl;

    private Integer sort;

    private Boolean isShow;

    public BannerDTO transformToDTO() {
        BannerDTO dto = new BannerDTO();
        BeanUtils.copyProperties(this, dto);
        return dto;
    }
}
