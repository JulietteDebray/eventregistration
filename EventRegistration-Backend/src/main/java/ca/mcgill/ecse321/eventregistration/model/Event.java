package ca.mcgill.ecse321.eventregistration.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Time;

@Entity
public class Event
{

    private String name;
    public void setName(String aName)
    {
        this.name = aName;
    }
    @Id
    public String getName()
    {
        return this.name;
    }


    private Date eventDate;
    public void setDate(Date aEventDate)
    {
        this.eventDate = aEventDate;
    }
    public Date getDate()
    {
        return this.eventDate;
    }


    private Time startTime;
    public void setStartTime(Time aStartTime)
    {
        this.startTime = aStartTime;
    }
    public Time getStartTime()
    {
        return this.startTime;
    }


    private Time endTime;
    public void setEndTime(Time aEndTime)
    {
        endTime = aEndTime;
    }
    public Time getEndTime()
    {
        return this.endTime;
    }

}