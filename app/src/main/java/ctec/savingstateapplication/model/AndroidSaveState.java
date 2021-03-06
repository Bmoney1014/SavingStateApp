package ctec.savingstateapplication.model;

import ctec.savingstateapplication.model.AndroidSaveState;
import android.app.Application;
import android.widget.Button;
import android.widget.CheckBox;
/**
 * Created by Brock Hostetter on 10/14/15.
 */
public class AndroidSaveState
{
    private String userName;
    private boolean isTired;
    private int age;

    public AndroidSaveState()
    {
        this.userName = "default";
        this.isTired = false;
        this.age = 0;
    }

    //Getters and Setters
    public String getUserName()
    {
        return userName;
    }

    public Boolean getIsTired()
    {
        return isTired;
    }

    public int getAge()
    {
        return age;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public void setIsTired(boolean isTired)
    {
        this.isTired = isTired;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}

