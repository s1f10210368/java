import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class ContentManagerTest {

    @Test
    public void testPostValidContent() throws InvalidPostException {
        ContentManager contentManager = new ContentManager();
        contentManager.post("Valid Title", "Valid Content");

        List<Entry> contents = contentManager.getContent();
        assertEquals(1, contents.size());

        Entry entry = contents.get(0);
        assertEquals("Valid Title", entry.getTitle());
        assertEquals("Valid Content", entry.getContent());
    }

    @Test(expected = InvalidPostException.class)
    public void testPostNullTitle() throws InvalidPostException {
        ContentManager contentManager = new ContentManager();
        contentManager.post(null, "Valid Content");
    }

    @Test(expected = InvalidPostException.class)
    public void testPostEmptyTitle() throws InvalidPostException {
        ContentManager contentManager = new ContentManager();
        contentManager.post("", "Valid Content");
    }

    @Test(expected = InvalidPostException.class)
    public void testPostLongTitle() throws InvalidPostException {
        ContentManager contentManager = new ContentManager();
        contentManager.post("Title is too long", "Valid Content");
    }

    @Test(expected = InvalidPostException.class)
    public void testPostTitleWithNewline() throws InvalidPostException {
        ContentManager contentManager = new ContentManager();
        contentManager.post("Title\nwithNewline", "Valid Content");
    }

    @Test(expected = InvalidPostException.class)
    public void testPostNullContent() throws InvalidPostException {
        ContentManager contentManager = new ContentManager();
        contentManager.post("Valid Title", null);
    }

    @Test(expected = InvalidPostException.class)
    public void testPostEmptyContent() throws InvalidPostException {
        ContentManager contentManager = new ContentManager();
        contentManager.post("Valid Title", "");
    }
}
