package service;

import model.User;

public class InProgressState implements VideoConferenceState{
    @Override
    public void joinMeeting(VideoConference videoConference, User participants){
        videoConference.addParticipants(participants);
        System.out.println("InProgress meeting,join meeting");
    }

    @Override
    public void leaveMeeting(VideoConference videoConference, User participants){
        videoConference.leaveParticipants(participants);
        System.out.println("InProgress meeting,leave meeting");
    }
}
