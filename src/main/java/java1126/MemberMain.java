package java1126;

import java.io.*;
import java.util.Base64;
import java.util.Objects;

public class MemberMain {
    public static void main(String[] args) {
        //1. 직렬화 과정
        Member member = new Member("chae", "lim", 1234);
        byte[] serializedMember;
        String Base64String = "";
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
                oos.writeObject(member);

                serializedMember = baos.toByteArray();
            }
//            System.out.println(Base64.getEncoder().encodeToString(serializedMember));
            Base64String = Base64.getEncoder().encodeToString(serializedMember);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //2. 역직렬화 과정
        byte[] reverseMember = Base64.getDecoder().decode(Base64String);
        try (ByteArrayInputStream bais = new ByteArrayInputStream(reverseMember)) {
            try (ObjectInputStream ois = new ObjectInputStream(bais)) {

                Object ObjectMember = ois.readObject();
                Member returnMember = (Member) ObjectMember;
                System.out.println(returnMember.toString());

            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            //생략.
        }
    }
}