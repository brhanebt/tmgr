package com.tmgr.mapper;

import com.tmgr.dto.CommentDTO;
import com.tmgr.model.Comment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CommentMapper {
    CommentMapper INSTANCE = Mappers.getMapper(CommentMapper.class);

    @Mapping(target = "user", source = "user")
    @Mapping(target = "taskId", source = "task.id")
    CommentDTO toDTO(Comment comment);

    @Mapping(target = "user", source = "user")
    @Mapping(target = "task.id", source = "taskId")
    Comment toEntity(CommentDTO commentDTO);
}
