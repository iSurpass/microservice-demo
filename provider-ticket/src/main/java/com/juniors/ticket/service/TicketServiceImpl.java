package com.juniors.ticket.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author Juniors
 */
@Component
@Service // 将服务发布出去
public class TicketServiceImpl implements TicketService{

    @Override
    public String getTicket() {

        return "JUNIORS SUCCESS";
    }
}
