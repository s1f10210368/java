
public class ContentManager {
    private List<Entry> contents = new ArrayList<Entry>();

    public ContentManager() {
    }

    public List<Entry> getContent() {
        return contents;
    }

    public void post(String title, String content) throws InvalidPostException {
        if (title == null || title.isEmpty() || title.length() > 10 || title.contains("\n")) {
            throw new InvalidPostException();
        }

        if (content == null || content.isEmpty()) {
            throw new InvalidPostException();
        }

        contents.add(new Entry(title, content));
    }
}
