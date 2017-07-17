package kr.anima.xd.s.ownbalance;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by alfo6-10 on 7/10/2017.
 */

public class PersonalWheel {

//    Spirituality  정신
//    Finances      재정
//    Business      사업
//    Health        건강
//    Environment   환경
//    Relationships 관계
//    Education     교육
//    Appearance    외모
//    Emotional     감정

// ??



    public PersonalWheel() {


    }


    class Project{

        String title;
        String note;
        String sYear, sMonth, sDay, sHour, sMin; // 시작
        String eYear, eMonth, eDay, eHour, eMin; // 끝

        String location;

        Boolean isLoop=true; // 반복여부
        Boolean isAlram=false; // 알람여부

        int loop; // 반복기간 : 매일, N일 간격, 일주일마다, 매월

        public Project() {

            title="Project Title";
            note="None";

        }


    } // class Project


}
