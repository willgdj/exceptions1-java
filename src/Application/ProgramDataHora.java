package Application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ProgramDataHora {
    public static void main(String[] args) {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        LocalDate d04 = LocalDate.parse("2023-02-18");
        LocalDateTime d05 = LocalDateTime.parse("2023-02-18T01:30:26");
        Instant d06 = Instant.parse("2023-02-18T01:30:26Z");
        LocalDate d08 = LocalDate.parse("20/02/2022", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/02/2022 01:30", fmt2);

        LocalDate r1 = LocalDate.ofInstant(d06,ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06,ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06,ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06,ZoneId.of("Portugal"));

        LocalDate d10 = LocalDate.of(2022,7,20);
        LocalDateTime d11 = LocalDateTime.of(2022,7,20,1,30);

        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt6 = DateTimeFormatter.ISO_DATE_TIME;



        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04.format(fmt3));
        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("d04 = " + fmt3.format(d04));
        System.out.println("d05 = " + d05);
        System.out.println("d05 = " + d05.format(fmt3));
        System.out.println("d05 = " + d05.format(fmt4));
        System.out.println("d05 = " + d05.format(fmt6));
        System.out.println("d06 = " + d06);
        System.out.println("d06 = " + fmt5.format(d06));
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);

        System.out.println("R1 = " + r1);
        System.out.println("R2 = " + r2);
        System.out.println("R3 = " + r3);
        System.out.println("R4 = " + r4);

        System.out.println("do4 dia = " +d04.getDayOfMonth());
        System.out.println("do4 dia = " +d04.getMonth());
        System.out.println("do4 dia = " +d04.getDayOfWeek());
        System.out.println("do4 dia = " +d04.getDayOfYear());
        System.out.println("do4 mês = " +d04.getMonthValue());

        System.out.println("do5 hora = " +d05.getHour() + " " + d05.getMinute() + " " + d05.getSecond());



    }
}
