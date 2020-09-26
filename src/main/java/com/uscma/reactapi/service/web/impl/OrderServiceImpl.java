package com.uscma.reactapi.service.web.impl;

import com.uscma.reactapi.domain.mapper.web.OrderMapper;
import com.uscma.reactapi.domain.model.web.OrderDTO;
import com.uscma.reactapi.service.web.OrderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author rp
 */
@Service
public class OrderServiceImpl implements OrderService {

    private final OrderMapper orderMapper;

    public OrderServiceImpl(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }

    @Override
    public PageInfo<OrderDTO> findByOrders(Integer page, Integer pageSize, String search) {
        PageHelper.startPage(page,pageSize);
        List<OrderDTO> orders;
        if (StringUtils.isEmpty(search)){
            orders = orderMapper.findByOrders();
        }else{
            orders = orderMapper.findByOrdersLike(search);
        }
        return new PageInfo<>(orders);
    }
}
