package by.htp.library.domain;

public class Book {
	
private String brief;
private String author;
private int publishDate;

public Book(String brief, int publishDate, String author){
	this.brief = brief;
	this.publishDate = publishDate;
	this.author = author;
}

public String getBrief() {
	return brief;
}

public void setBrief(String brief) {
	this.brief = brief;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public int getPublishDate() {
	return publishDate;
}

public void setPublishDate(int publishDate) {
	this.publishDate = publishDate;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((author == null) ? 0 : author.hashCode());
	result = prime * result + ((brief == null) ? 0 : brief.hashCode());
	result = prime * result + publishDate;
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Book other = (Book) obj;
	if (author == null) {
		if (other.author != null)
			return false;
	} else if (!author.equals(other.author))
		return false;
	if (brief == null) {
		if (other.brief != null)
			return false;
	} else if (!brief.equals(other.brief))
		return false;
	if (publishDate != other.publishDate)
		return false;
	return true;
}

@Override
public String toString() {
	return "Book [brief=" + brief + ", author=" + author + ", publishDate=" + publishDate + "]";
}

}
