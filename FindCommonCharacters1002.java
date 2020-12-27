package leetcode;

import java.util.List;
import java.util.ArrayList;

public class FindCommonCharacters1002 {

    public void FindCommonCharacters1002() {
        String A[] = {"cool", "lock", "cook"};
        List<String> lListLetters = new ArrayList();
        for (int i = 0; i < A[0].length(); i++) {
            boolean bControl = true;
            for (int j = 1; j < A.length; j++) {
                int iPositionGood = A[j].indexOf(A[0].charAt(i));
                if (iPositionGood != -1) {
                    StringBuffer sTemporalText = new StringBuffer(A[j]);
                    sTemporalText.replace(iPositionGood, iPositionGood + 1, "-");
                    A[j] = sTemporalText.toString();
                } else {
                    bControl = false;
                    break;
                }
            }
            if (bControl) {
                StringBuffer sCharacter = new StringBuffer();
                sCharacter.append(A[0].charAt(i));
                lListLetters.add(sCharacter.toString());
            }
        }
        for (String lListLetter : lListLetters) {
            System.out.println(lListLetter);
        }
    }
}
