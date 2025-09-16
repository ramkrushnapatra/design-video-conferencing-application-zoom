package service;

import model.User;

public interface VideoConferenceState {
    void joinMeeting(VideoConference videoConference, User participants);
    void leaveMeeting(VideoConference videoConference, User participants);

}
