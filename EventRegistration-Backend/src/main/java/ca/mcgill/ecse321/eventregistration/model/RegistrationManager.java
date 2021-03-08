package ca.mcgill.ecse321.eventregistration.model;

 import java.util.*;
import java.sql.Date;
import java.sql.Time;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.persistence.Entity;

@Entity
public class RegistrationManager {

    private List<Registration> registrations;

    @OneToMany(cascade = {CascadeType.ALL})
    public List<Registration> getRegistrations()
    {
        return this.registrations;
    }
    public void setRegistrations (List<Registration> registrations){
        this.registrations=registrations;
    }


    private List<Person> participants;
    @OneToMany(cascade = {CascadeType.ALL})
    public List<Person> getParticipants()
    {
        return this.participants;
    }
    public void setParticipants (List<Person> participants){
        this.participants=participants;
    }


    private List<Event> events;
    @OneToMany(cascade = {CascadeType.ALL})
    public List<Event> getEvents()
    {
        return this.events;
    }
    public void setEvents (List<Event> events){
        this.events=events;
    }

}


