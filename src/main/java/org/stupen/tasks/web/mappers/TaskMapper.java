package org.stupen.tasks.web.mappers;

import org.stupen.tasks.domain.task.Task;
import org.stupen.tasks.web.dto.task.TaskDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TaskMapper extends Mappable<Task, TaskDto> {
}
