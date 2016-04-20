package com.booking.date;

import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
// @SpringApplicationConfiguration(classes = Application.class)
public class CreateRegularWeekExample {

    /*@Test
    public void test() {
        int hour = 9;
        int minute = 30;

        BookedTime time = new BookedTime(LocalTime.of(hour, minute), TimeStatus.FREE);
        List<BookedTime> times = Lists.newArrayList(time);
        BookedDay value = new BookedDay(times);
        //@formatter:off
        Map<DayOfWeek, BookedDay> days = ImmutableMap.<DayOfWeek, BookedDay>builder()
                .put(DayOfWeek.MONDAY, value)
                .build();
        //@formatter:on
        RegularWeek regularWeek = new RegularWeek(days);
        assertThat(regularWeek.getDay(DayOfWeek.MONDAY).getTimes().size(), is(1));
    }*/
}
