package testbuilder;

import model.LoginInputsModel;
import staticdata.UserNamesAndPasswords;

public class GetLoginModel {
    public static LoginInputsModel loginWithFirstUserNameModel(){
        String password = UserNamesAndPasswords.USER_PASSWORD;
        LoginInputsModel loginInputsModel = LoginInputsModel
                .builder()
                .email(UserNamesAndPasswords.USER_NAME_ONE)
                .password(password)
                .build();
        return loginInputsModel;
    }

    public static LoginInputsModel loginWithTwoUserNameModel(){
        String password = UserNamesAndPasswords.USER_PASSWORD;
        LoginInputsModel loginInputsModel = LoginInputsModel
                .builder()
                .email(UserNamesAndPasswords.USER_NAME_TWO)
                .password(password)
                .build();
        return loginInputsModel;
    }

    public static LoginInputsModel loginWithThreeUserNameModel(){
        String password = UserNamesAndPasswords.USER_PASSWORD;
        LoginInputsModel loginInputsModel = LoginInputsModel
                .builder()
                .email(UserNamesAndPasswords.USER_NAME_THREE)
                .password(password)
                .build();
        return loginInputsModel;
    }

    public static LoginInputsModel loginWithFourUserNameModel(){
        String password = UserNamesAndPasswords.USER_PASSWORD;
        LoginInputsModel loginInputsModel = LoginInputsModel
                .builder()
                .email(UserNamesAndPasswords.USER_NAME_FOUR)
                .password(password)
                .build();
        return loginInputsModel;
    }
}
