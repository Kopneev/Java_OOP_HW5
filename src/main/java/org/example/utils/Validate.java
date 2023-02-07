package org.example.utils;

public class Validate {
    public void checkNumber (String telephone) throws Exception {
        if(!telephone.substring(0,1).equals("+")){
            throw new PhoneException("Телефон должен начинаться с знака +");
        }
        else if (telephone.length()!=12){
            throw new PhoneException("Длина должна содержать 11 цифр");
        }
    }
}
