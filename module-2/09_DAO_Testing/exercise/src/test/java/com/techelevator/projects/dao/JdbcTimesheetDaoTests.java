package com.techelevator.projects.dao;

import com.techelevator.projects.model.Timesheet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.*;

public class JdbcTimesheetDaoTests extends BaseDaoTests {

    private static final Timesheet TIMESHEET_1 = new Timesheet(1, 1, 1,
            LocalDate.parse("2021-01-01"), 1.0, true, "Timesheet 1");
    private static final Timesheet TIMESHEET_2 = new Timesheet(2, 1, 1,
            LocalDate.parse("2021-01-02"), 1.5, true, "Timesheet 2");
    private static final Timesheet TIMESHEET_3 = new Timesheet(3, 2, 1,
            LocalDate.parse("2021-01-01"), 0.25, true, "Timesheet 3");
    private static final Timesheet TIMESHEET_4 = new Timesheet(4, 2, 2,
            LocalDate.parse("2021-02-01"), 2.0, false, "Timesheet 4");

    private JdbcTimesheetDao dao;


    @Before
    public void setup() {
        dao = new JdbcTimesheetDao(dataSource);
    }

    @Test
    public void getTimesheetById_with_valid_id_returns_correct_timesheet() {
        Timesheet timesheet = dao.getTimesheetById(1);
        assertEquals(TIMESHEET_1.getTimesheetId(), timesheet.getTimesheetId());

    }

    @Test
    public void getTimesheetById_with_invalid_id_returns_null_timesheet() {
        Timesheet timesheet = dao.getTimesheetById(5);
        assertNull(timesheet);
    }

    @Test
    public void getTimesheetsByEmployeeId_with_valid_employee_id_returns_list_of_timesheets_for_employee() {
        List <Timesheet> timesheets = dao.getTimesheetsByEmployeeId(2);
        assertEquals(2, timesheets.size());
    }

    @Test
    public void getTimesheetsByProjectId_with_valid_id_returns_list_of_all_timesheets_for_project() {
        List <Timesheet> timesheets= dao.getTimesheetsByProjectId(1);
        assertEquals(1, timesheets.size());
    }

    @Test
    public void createTimesheet_creates_timesheet() {
       Timesheet TIMESHEET_5 = new Timesheet(3, 2, 1,
               LocalDate.parse("2021-01-01"), 3.0, true, "Timesheet 5");
       Timesheet createdTimesheet5 = dao.createTimesheet(TIMESHEET_5);
       assertEquals(TIMESHEET_5.getTimesheetId(), createdTimesheet5.getTimesheetId());
    }

    @Test
    public void updateTimesheet_updates_timesheet() {
        Timesheet timesheet = TIMESHEET_1;
        timesheet.setDescription("1 Timesheet");
        dao.updateTimesheet(timesheet);
        Timesheet retrivedTimeSheet = dao.getTimesheetById(1);
        assertEquals(retrivedTimeSheet.getDescription(), timesheet.getDescription());
    }

    @Test
    public void deleteTimesheetById_deletes_timesheet() {
        Timesheet timesheet = TIMESHEET_2;
        dao.deleteTimesheetById(timesheet.getTimesheetId());
        Timesheet deletedTimesheet = dao.getTimesheetById(2);
        assertNull(deletedTimesheet);
    }

    @Test
    public void getBillableHours_returns_correct_total() {
        double bilable = dao.getBillableHours(1, 1);
        assertEquals(2.5, bilable, 0.01);
    }

    private void assertTimesheetsMatch(Timesheet expected, Timesheet actual) {
        Assert.assertEquals(expected.getTimesheetId(), actual.getTimesheetId());
        Assert.assertEquals(expected.getEmployeeId(), actual.getEmployeeId());
        Assert.assertEquals(expected.getProjectId(), actual.getProjectId());
        Assert.assertEquals(expected.getDateWorked(), actual.getDateWorked());
        Assert.assertEquals(expected.getHoursWorked(), actual.getHoursWorked(), 0.001);
        Assert.assertEquals(expected.isBillable(), actual.isBillable());
        Assert.assertEquals(expected.getDescription(), actual.getDescription());
    }

}
