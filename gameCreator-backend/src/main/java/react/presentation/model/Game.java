package react.presentation.model;

import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Date;

@Entity
@EqualsAndHashCode
public class Game {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = true)
    @Temporal(TemporalType.DATE)
    private Date dateOfCreation;

    @Column(nullable=false)
    private String type;

    @Column(nullable=true)
    private String description;

    @Column(nullable=false)
    private String emailOfCreator;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmailOfCreator() {
        return emailOfCreator;
    }

    public void setEmailOfCreator(String emailOfCreator) {
        this.emailOfCreator = emailOfCreator;
    }
}
