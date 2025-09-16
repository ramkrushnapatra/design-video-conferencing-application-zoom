import model.Meeting;
import model.User;
import service.InProgressState;
import service.VideoConference;
import java.util.Date;

public class VideoConferenceApp {
    public static void main(String[]args){
        User user = new User(1,"ram","ram@yopmail.com");
        Meeting meeting = new Meeting(1, new Date());
        meeting.addParticipants(user);

        VideoConference videoConference = new VideoConference(meeting);
        videoConference.join(user);
        videoConference.leave(user);

        videoConference.changeState(new InProgressState());
        videoConference.join(user);
        videoConference.leave(user);
    }
}
