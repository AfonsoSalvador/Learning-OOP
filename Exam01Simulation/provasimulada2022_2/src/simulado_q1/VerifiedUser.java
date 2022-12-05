package simulado_q1;

import java.time.LocalDateTime;

public class VerifiedUser extends User{
    private LocalDateTime verificationDate;

    public VerifiedUser(String twitterID, UserBase base) {
        super(twitterID,base);
        this.verificationDate = LocalDateTime.now();
    }

    public LocalDateTime getVerificationDate() {
        return verificationDate;
    }

    @Override
    public String toString() {
        return (super.toString() + "\n\tVerification Date: " + getVerificationDate());
    }

    

}
