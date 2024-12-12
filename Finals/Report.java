package Finals;

public abstract class Report {
    protected String reportContent;

    public Report(String content) {
        this.reportContent = content;
    }

    public abstract void submitReport();

    // Nested class for AnonymousReport
    public static class AnonymousReport extends Report {
        public AnonymousReport(String content) {
            super(content);
        }

        @Override
        public void submitReport() {
            System.out.println("Anonymous Report submitted: " + reportContent);
        }
    }
}
