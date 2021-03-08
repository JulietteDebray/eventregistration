package ca.mcgill.ecse321.eventregistration.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Registration {
    private Person participant;
    
    // dont need cascade to all bc 1 registration should be only for 1, not all
    // i think it's only for OneToMany: cascade all: 1 parental class propagating operations to several children classes
    // (because of the consummation association (unidirectional association))
    @ManyToOne
    public Person getParticipant(){
        return this.participant;
    }
    public void setParticipant (Person aParticipant){
        this.participant=aParticipant;
    }

    private Event event;
    @ManyToOne
    public Event getEvent() { return this.event; }
    public void setEvent (Event anEvent){
        this.event=anEvent;
    }

    private Integer id;
    public void setId(Integer anId){
        this.id=anId;
    }

    @Id
    public Integer getId(){
        return this.id;
    }
}
