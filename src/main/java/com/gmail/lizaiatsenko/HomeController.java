package com.gmail.lizaiatsenko;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;


@Controller
public class HomeController {

    @InitBinder
    public void initBinder(WebDataBinder binder) {
    binder.registerCustomEditor(String.class,"name", new CustomPropertyEditorSupport());
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView getAdmissionForm() {
        ModelAndView model = new ModelAndView("AdmissionForm");
        return model;
    }

    @RequestMapping(value = "/AdmissionForm", method = RequestMethod.POST)
    public ModelAndView submitUserPage(@Validated @ModelAttribute("student1") Student student, BindingResult result) {

        if(result.hasErrors()){
            ModelAndView model = new ModelAndView("AdmissionForm");
            return model;
        }
        ModelAndView model = new ModelAndView("AdmissionSuccess");
        return model;
    }

    @ModelAttribute
    public void addingCommonObjects(Model modelHeader){
        modelHeader.addAttribute("headerMessage", "Hello to this wonderful world!");
    }
    @RequestMapping(value = "/failed", method = RequestMethod.GET)
    public ModelAndView failed() {
        return new ModelAndView("failed", "message", "Logging failed");

    }
}

