package ss4_lop_va_doi_tuong.bai_tap.StopWatch;

public class StopWatch {
    private long startTime, endTime;

    public StopWatch() {
    }

    public long getStart (){
       return startTime = System.currentTimeMillis();
    }
    public long getEnd (){
      return  endTime = System.currentTimeMillis();
    }

    public long getElapsedTime(){
        return  endTime - startTime ;
    }

}
