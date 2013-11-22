package com.example.jsfdemo.web;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

// moj walidator
@FacesValidator("numberValidator")
public class NumberValidator implements Validator {

        @Override
        public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {

                String numberofcd = (String) value;

                // czy sn jest dluzszy nic 4 znaki
                if (numberofcd.length() < 4) {
                        FacesMessage message = new FacesMessage();
                        message.setDetail("Numer płyty musi być dłuższy niż 4 znaki.");
                        message.setSummary("Numer płyty musi być dłuższy niż 4 znaki.");
                        message.setSeverity(FacesMessage.SEVERITY_ERROR);
                        throw new ValidatorException(message);
                }
        }
}
