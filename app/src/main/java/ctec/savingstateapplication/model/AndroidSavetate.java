package ctec.savingstateapplication.model;

import android.app.Application;
/**
 * Created by Brock Hostetter on 10/14/15.
 */
public class AndroidSavetate
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

