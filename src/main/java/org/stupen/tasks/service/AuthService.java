package org.stupen.tasks.service;

import org.stupen.tasks.web.dto.auth.JwtRequest;
import org.stupen.tasks.web.dto.auth.JwtResponse;

public interface AuthService {

    JwtResponse login(JwtRequest loginRequest);

    JwtResponse refresh(String refreshToken);

}
