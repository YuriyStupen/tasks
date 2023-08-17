package org.stupen.tasks.web.mappers;

import org.stupen.tasks.domain.task.TaskImage;
import org.stupen.tasks.web.dto.task.TaskImageDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TaskImageMapper extends Mappable<TaskImage, TaskImageDto> {
}
