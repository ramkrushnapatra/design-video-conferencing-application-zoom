package model;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Meeting {
    private Integer meetingId;
    private Date meetingStartDate;
    private List<User> users;

    public Meeting(Integer meetingId, Date meetingStartDate) {
        this.meetingId = meetingId;
        this.meetingStartDate = meetingStartDate;
        this.users = new ArrayList<>();
    }

    public List<User> getUsers() {
        return users;
    }

    public void addParticipants(User user){
        this.users.add(user);
    }

    public Integer getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(Integer meetingId) {
        this.meetingId = meetingId;
    }

    public Date getMeetingStartDate() {
        return meetingStartDate;
    }

    public void setMeetingStartDate(Date meetingStartDate) {
        this.meetingStartDate = meetingStartDate;
    }
}
