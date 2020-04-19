package com.udea.analisis.rtf.constants;

public class ValidatorConstants {
    //Validators
    public static final String REGEX_EMAIL =
            "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    public static final int MIN_SIZE_EMAIL = 5;
    public static final int MAX_SIZE_EMAIL = 50;
    public static final int MIN_SIZE_PRESTADOR=5;
    public static final int MAX_SIZE_PRESTADOR=20;
    public static final int MIN_SIZE_RSOCIAL=5;
    public static final int MAX_SIZE_RSOCIAL=50;
    public static final int MIN_SIZE_DIRECCION=5;
    public static final int MAX_SIZE_DIRECCION=24;
    public static final int MIN_SIZE_SERVICIO=5;
    public static final int MAX_SIZE_SERVICIO=20;
    public static final int MIN_SIZE_SEDES=5;
    public static final int MAX_SIZE_SEDES=30;
    public static final int MIN_SIZE_NAME = 5;
    public static final int MAX_SIZE_NAME = 50;
    public static final int MIN_SIZE_PASSWORD = 8;
    public static final int MAX_SIZE_PASSWORD = 15;

    //Messages
    public static final String BAD_FORMAT_EMAIL_MESSSAGE = "Email bad format";
    public static final String BAD_SIZE_EMAIL_MESSSAGE = "email must be between 5 and 20 characters";
    public static final String BAD_SIZE_DIRECCION_MESSSAGE = "Direccion must be between 5 and 24 characters";
    public static final String BAD_SIZE_PRESTADOR_MESSSAGE = "Prestador must be between 5 and 20 characters";
    public static final String BAD_SIZE_SERVICIO_MESSSAGE = "Servicio must be between 5 and 20 characters";
    public static final String BAD_SIZE_SEDES_MESSSAGE = "Sedes must be between 15 and 5 characters";
    public static final String BAD_SIZE_PASSWORD_MESSAGE = "password must be between 8 and 15 characters";
    public static final String BAD_SIZE_NAME_MESSSAGE = "name must be between 5 and 20 characters";

}
