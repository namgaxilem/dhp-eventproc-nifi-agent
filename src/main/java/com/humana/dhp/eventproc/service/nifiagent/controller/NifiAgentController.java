package com.humana.dhp.eventproc.service.nifiagent.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
public class NifiAgentController {

    @PostMapping("/v1/nifi-agent")
    @PreAuthorize("hasAuthority('SCOPE_Obo.NifiAgent')")
    public ResponseEntity<String> getNifiAgent(@RequestBody Object body) {
        return new ResponseEntity<>("/v1/nifi-agent -> this is data from nifi agent" + body, HttpStatus.OK);
    }
}
