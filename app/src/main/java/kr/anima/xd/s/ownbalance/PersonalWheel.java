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
    // cf. solra system
    // 목적 / 목표( 계측가능한) / 목표를 위한 목록(리스트) / 리스트의 행위를 했는가, 못 했는가
    // 하지 않았다면, 사용자에게 어떤 방식으로 알려줄 것 인가
    // 뱃지 알림 등의 기본 설정 외 앱 내에서 이루어지는 효과들

    // 사용자가 확인해야하는 현황
    // 1. 목적 달성 현황
    // 2. 목표 달성 현황
    // 3. 각 목표를 달성함으로써 사용자의 상태 변화량 확인
    // 4. 나 외의 다른 사람들은 어떤 목적을 어떤 목표로 이루어가는가?
    // 4-1. 내가 이루고자 하는 목적을 먼저 이룬 타인의 방식은 어떠한가?

    // 1. 오늘의 리스트
    // 2. 나의 현황(목적, 목표 등 달성현황)
    // 3. 추가
    // 4. 정보공유
    // 5. 내 계정 설정

    // Mission - Task

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
