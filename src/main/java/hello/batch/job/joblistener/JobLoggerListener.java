package hello.batch.job.joblistener;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class JobLoggerListener implements JobExecutionListener {

    private static String BEFORE_MESSAGE ="{} Job is Running";
    private static String AFTER_MESSAGE ="{} Job is Done. ";
    @Override
    public void beforeJob(JobExecution jobExecution) {

    }

    @Override
    public void afterJob(JobExecution jobExecution) {

    }
}
