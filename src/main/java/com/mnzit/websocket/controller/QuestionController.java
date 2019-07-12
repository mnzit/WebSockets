/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mnzit.websocket.controller;

import java.security.Principal;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Mnzit
 */
@Controller
public class QuestionController {

    @MessageMapping("/questions")
    public String processQuestion(String question, Principal principal) {
        return question.toUpperCase() + " by " + principal.getName();
    }
}
