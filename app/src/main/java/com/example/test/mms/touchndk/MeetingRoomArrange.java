package com.example.test.mms.touchndk;

public class MeetingRoomArrange {
    public static void main(String args[]){

        MeetingRoomArrange meetingRoomArrange = new MeetingRoomArrange();
        meetingRoomArrange.arrangeRoom(5,2,8);
        meetingRoomArrange.arrangeRoom(2,3,6);
        meetingRoomArrange.arrangeRoom(3,3,14);
    }

    public void arrangeRoom(int row,int column,int users){
        if(row == 0 && column == 0)
            return;
        int count = 0;

        column = column  ;
        int columnAvai = column*2;
        int rowAvai = 1;

        if(row>2){
            row = row - 2;
            rowAvai = row * 2;
        }
        int painPoint = columnAvai+rowAvai;
        System.out.println("For row "+row+" Column " + column +" users "+users+" of Paint point are  ->"+ painPoint);

    }
}
}
