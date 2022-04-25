package DBS;
// 데이터 베이스에서 받아온 데이터를 담는 용기(그릇) 클래스 = DTO
// 하나의 게시판의 글
public class BbsDTO {
    // 글 번호
    private int no;
    // 제목
    private String title;
    // 내용
    private String content;
    // 글쓴이
    private String author;
    // 날짜 시간
    private String datetime;

    // GetterSetter
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getDatetime() {
        return datetime;
    }
    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }
    
}
