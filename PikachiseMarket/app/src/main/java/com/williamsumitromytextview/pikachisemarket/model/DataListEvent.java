package com.williamsumitromytextview.pikachisemarket.model;

import com.williamsumitromytextview.pikachisemarket.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by william on 07/04/2017.
 */

public class DataListEvent {
    private static final String[] JudulEvent =
            {"Franchise Expo 2017",
                    "Meetup and Join The Franchise",
                    "How to conquer your franchise business",
                    "How to take over your Parent's Company",
                    "Franchisor debat !",
                    "Find Your Franchisee Now"};

    private static final String[] IsiEvent =
            {"Franchise Expo 2017 - Let's Work Together\nTicket dikenakan baiaya Rp. 1.200.000,- \nBook now motha fuca",
                    "Don't you give up, nah-nah-nah\nI won't give up, nah-nah-nah\nLet me love you\nLet me love you\nDon't you give up, nah-nah-nah",
                    "Say go through the darkest of days\nHeaven's a heartbreak away\nNever let you go, never let me down\nOh, it's been a hell of a ride\nDriving the edge of a knife\nNever let you go, never let me down",
                    "And now your song is on repeat\nAnd I'm dancin' on to your heartbeat\nAnd when you're gone, I feel incomplete\nSo if you want the truth",
                    "I just wanna be part of your symphony\nWill you hold me tight and not let go?\nSymphony\nLike a love song on the radio\nWill you hold me tight and not let go?",
                    "She said \"Where'd you wanna go?\nHow much you wanna risk?\nI'm not looking for somebody\nWith some superhuman gifts\nSome superhero\nSome fairytale bliss\nJust something I can turn to\nSomebody I can kiss"};

    private static final int[] GambarEvent = {R.drawable.event1, R.drawable.event2, R.drawable.event3, R.drawable.event4, R.drawable.event5, R.drawable.event6};
    private static final String[] ALAMATEVENT = {"Jl. Thamrin No. 34 A", "JW. Mariott", "Grand Angkasa", "Jl. Madong Lubis no. 12", "Jl. Singapoor No. 11z", "Jl. Mayashitan No. 123"};
    private static final String[] WAKTUEVENT = {"Senin, 9 April 2017, 20:00", "Selasa, 5 December 2017, 11:00", "Minggu, 21 May 2017, 08:30", "Minggu, 28 May 2017, 08:30", "Minggu, 28 May 2017, 08:30", "Minggu, 28 May 2017, 08:30"};

    public static List<ListEvent> getListEvent() {
        List<ListEvent> event = new ArrayList<>();
        for (int i = 0; i < JudulEvent.length; i++) {
            ListEvent listEvent = new ListEvent();
            listEvent.setGAMBAREVENT(GambarEvent[i]);
            listEvent.setJUDULEVENT(JudulEvent[i]);
            listEvent.setALAMATEVENT(ALAMATEVENT[i]);
            listEvent.setWAKTUEVENT(WAKTUEVENT[i]);
            listEvent.setISIEVENT(IsiEvent[i]);
            event.add(listEvent);
        }
        return event;
    }
}
