package com.tmgr.mapper;

import com.tmgr.dto.TaskDTO;
import com.tmgr.model.Task;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface TaskMapper {
    TaskMapper INSTANCE = Mappers.getMapper(TaskMapper.class);

    @Mapping(target = "userId", source = "user.id")
    TaskDTO toDTO(Task task);
    Task toEntity(TaskDTO taskDTO);
}
