package com.joezeo.joefgame.potal.service;

import com.joezeo.joefgame.common.dto.PaginationDTO;
import com.joezeo.joefgame.potal.dto.TopicDTO;
import com.joezeo.joefgame.dao.pojo.Topic;

public interface TopicService {

    PaginationDTO<TopicDTO> listPage(Integer page, Integer size, String condition, String tab);

    PaginationDTO<TopicDTO> listPage(Long userid, Integer page, Integer size);

    TopicDTO queryById(Long id);

    void createOrUpdate(Topic topic);

    void incVie(Long id);

    boolean isExist(Long id);

    TopicDTO likeTopic(Long topicid, Long userid);

    TopicDTO unlikeTopic(Long topicid, Long userid);
}