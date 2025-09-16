package service;

import model.User;

public class InitializedState implements VideoConferenceState{
    @Override
    public void joinMeeting(VideoConference videoConference, User participants){
        videoConference.addParticipants(participants);
        System.out.println("Initialize meeting,join meeting");
    }

    @Override
    public void leaveMeeting(VideoConference videoConference, User participants){
        videoConference.leaveParticipants(participants);
        System.out.println("Initialize meeting,leave meeting");
    }
}
