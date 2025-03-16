public class Main {
    public static void main(String[] args) {

        Woman leyla = new Woman("Leyla", "Aliyeva", 1948);
        Man elvin = new Man("Elvin", "Mammadov", 1940);
        Family fam1 = new Family(leyla, elvin);

        //-------------------------------------------------------------------

        Woman narmin = new Woman("Narmin", "Hasanova", 1945);
        Man fazilIsmailov = new Man("Fazil", "Ismailov", 1941); // Updated name
        narmin.setIq(100);
        fazilIsmailov.setIq(70); // Updated name
        Family fam2 = new Family(narmin, fazilIsmailov);

        //--------------------------------------------------------------------

        String[][] orxanPlan = {
                {DayOfWeek.MONDAY.name(), "Hike to the mountain peak"},
                {DayOfWeek.WEDNESDAY.name(), "Attend a live jazz concert"},
                {DayOfWeek.FRIDAY.name(), "Host a barbecue party with friends"},
        };
        Man orxan = new Man("Orxan", "Hüseynov", 1975);
        orxan.setSchedule(orxanPlan);

        String[][] ayselPlan = {
                {DayOfWeek.MONDAY.name(), "Explore local art galleries"},
                {DayOfWeek.WEDNESDAY.name(), "Play a thrilling game of laser tag"},
                {DayOfWeek.FRIDAY.name(), "Dive into a book about ancient civilizations"},
                {DayOfWeek.SATURDAY.name(), "Dance at a beach party with a live DJ"}
        };
        Woman aysel = new Woman("Aysel", "Babayev", 1980, 90, ayselPlan);
        Man vusal = new Man("Vüsal", "Rzayev", 1978);
        fam2.addChild(aysel);
        fam2.addChild(vusal);
        fam2.addChild(orxan);
        fam2.bornChild();
        System.out.println(fam2);
        System.out.println("----------------------------");
        fam2.deleteChild(new Man("Vüsal", "Rzayev", 1978));
        System.out.println(fam2);
    }
}
