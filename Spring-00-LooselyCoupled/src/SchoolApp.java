import implementation.Mentor;
import service.FullTimeMentor;
import service.MentorAccount;
import service.PartTimeMentor;

public class SchoolApp {
    public static void main(String[] args) {
         FullTimeMentor fullTimeMentor = new FullTimeMentor();
        PartTimeMentor partTimeMentor = new PartTimeMentor();
        MentorAccount mentor = new MentorAccount(partTimeMentor);
        MentorAccount mentor1 = new MentorAccount(fullTimeMentor);
        mentor1.manageAccount();
        mentor.manageAccount();
    }
}
