package org.stupen.tasks.web.mappers;

import org.stupen.tasks.domain.user.User;
import org.stupen.tasks.web.dto.user.UserDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper extends Mappable<User, UserDto> {
}
