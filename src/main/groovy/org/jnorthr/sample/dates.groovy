// see: https://www.mkyong.com/java/java-date-and-calendar-examples/ 
import java.util.Calendar.*
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//import java.sql.Date;

SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");

Calendar calendar = new GregorianCalendar(2016,8,28);
System.out.println("Date : " + sdf.format(calendar.getTime())); // Date : 2016 Sep 28

//add one month
calendar.add(Calendar.MONTH, 1);
System.out.println("Date : " + sdf.format(calendar.getTime())); // Date : 2016 Oct 28

//subtract 10 days
calendar.add(Calendar.DAY_OF_MONTH, -10);
System.out.println("Date : " + sdf.format(calendar.getTime())); // Date : 2016 Oct 18

// parse date using pattern
// see: http://www.java2s.com/Tutorial/Java/0040__Data-Type/SimpleDateFormat.htm
String pattern = "dd/MM/yyyy";
java.util.Date date1; 
SimpleDateFormat format = new SimpleDateFormat(pattern);
try {
      date1 = format.parse("12/08/2016");
      System.out.println(date1); // Fri Aug 12 00:00:00 CEST 2016
    } 
catch (ParseException e) {
      e.printStackTrace();
}

// Example 1.2 Ð Convert String to Date.
SimpleDateFormat sdf2 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
String dateInString = "31-08-2016 23:40:56";
Date date2 = sdf2.parse(dateInString);
System.out.println(date2); //Wed Aug 31 23:40:56 CEST 2016

// Get current date time
SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
Date date3 = new Date();
System.out.println(dateFormat.format(date3));  // 2016/08/21 23:51:21

// convert calendar to date
Calendar calendar4 = Calendar.getInstance();
Date date4 =  calendar4.getTime();
println "date4="+date4;

// 
SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
Calendar calendar5 = new GregorianCalendar(2016,7,21); // month is base-zero ?
System.out.println("calendar5="+sdf5.format(calendar5.getTime()));        

int year       = calendar5.get(Calendar.YEAR);
int month      = calendar5.get(Calendar.MONTH); // Jan = 0, dec = 11
int dayOfMonth = calendar5.get(Calendar.DAY_OF_MONTH);
int dayOfWeek  = calendar5.get(Calendar.DAY_OF_WEEK);
int weekOfYear = calendar5.get(Calendar.WEEK_OF_YEAR);
int weekOfMonth= calendar5.get(Calendar.WEEK_OF_MONTH);

int hour       = calendar5.get(Calendar.HOUR);        // 12 hour clock
int hourOfDay  = calendar5.get(Calendar.HOUR_OF_DAY); // 24 hour clock
int minute     = calendar5.get(Calendar.MINUTE);
int second     = calendar5.get(Calendar.SECOND);
int millisecond= calendar5.get(Calendar.MILLISECOND);
println ""
System.out.println(sdf5.format(calendar5.getTime()));

System.out.println("year \t\t: " + year);
System.out.println("month \t\t: " + month);
System.out.println("dayOfMonth \t: " + dayOfMonth);
System.out.println("dayOfWeek \t: " + dayOfWeek);
System.out.println("weekOfYear \t: " + weekOfYear);
System.out.println("weekOfMonth \t: " + weekOfMonth);

System.out.println("hour \t\t: " + hour);
System.out.println("hourOfDay \t: " + hourOfDay);
System.out.println("minute \t\t: " + minute);
System.out.println("second \t\t: " + second);
System.out.println("millisecond \t: " + millisecond);

//update a date
println "\nupdate a date as :"
calendar5.set(Calendar.YEAR, 2014);
calendar5.set(Calendar.MONTH, 11);
calendar5.set(Calendar.MINUTE, 33);

System.out.println("#2. " + sdf5.format(calendar5.getTime()));

//subtract 10 days
println "subtract 10 days:"
calendar5.add(Calendar.DAY_OF_MONTH, -10);
System.out.println("Date : " + sdf5.format(calendar5.getTime()));

// Convert Date to Calendar.
SimpleDateFormat sdf6 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
String dateInString6 = "22-07-2016 10:20:56";
Date date6 = sdf6.parse(dateInString6);

Calendar calendar6 = Calendar.getInstance();
calendar.setTime(date6);
println "\ndate6:"+date6; // date6:Fri Jul 22 10:20:56 CEST 2016

println "calendar6 ="+calendar6.toString();
//calendar6 =java.util.GregorianCalendar[time=1471817176071,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Europe/Paris",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=184,lastRule=java.util.SimpleTimeZone[id=Europe/Paris,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2016,MONTH=7,WEEK_OF_YEAR=35,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=235,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=6,SECOND=16,MILLISECOND=71,ZONE_OFFSET=3600000,DST_OFFSET=3600000]

println "\n---------"

public java.sql.Date convertJavaDateToSqlDate(java.util.Date date) {
    return new java.sql.Date(date.getTime());
}

// improved accuracy with Timestamp but need to use getTime() to preserve milleseconds
public java.sql.Timestamp cvt(java.util.Date utilDate) {
    return new java.sql.Timestamp(utilDate.getTime())
}

// ----------------------------------------
// how to sort dates ?
        List<Date> myList = new ArrayList<>();
        myList.add(date6);
        myList.add(date4);
        myList.add(date3);
        myList.add(date2);
        myList.add(date1);
        myList.add(new Date(2015-1900, 01, 01));
        myList.add(new Date(2013-1900, 01, 01));
        myList.add(new Date(2013-1900, 01, 02));
        myList.add(new Date(2012-1900, 10, 01));
        myList.add(new Date(2012-1900, 11, 01));
        myList.add(new Date(2015-1900, 01, 10));

        // need to add a Comparator
        Collections.sort(myList, new Comparator<Date>()
        {
            @Override
            public int compare(Date o1, Date o2) 
            {
                return o1.compareTo(o2);
            }
        });
                
        int i = 1;
        myList.each{e-> 
            print "i="+i+"; "+sdf5.format(e);  
            print ";    java.sql.Timestamp="+cvt(e)
            println ";    java.sql.Date="+convertJavaDateToSqlDate(e);
            i++;
        };
        

println '--- the end ---'