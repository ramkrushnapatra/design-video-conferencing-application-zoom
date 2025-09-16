package service;

import model.Meeting;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class VideoConference {
    private Meeting meeting;
    private List<User> participants;
    private VideoConferenceState state;

    public VideoConference(Meeting meeting) {
        this.meeting = meeting;
        this.participants = new ArrayList<>();
        this.state =  new InitializedState();
    }

    public void join(User participants){
        state.joinMeeting(this,participants);
    }

    public void leave(User participants){
        state.leaveMeeting(this,participants);
    }

    public void changeState(VideoConferenceState state){
        this.state = state;
    }

    public void addParticipants(User participants){
        this.participants.add(participants);
    }

    public void leaveParticipants(User participants){
        this.participants.remove(participants);
    }


}
