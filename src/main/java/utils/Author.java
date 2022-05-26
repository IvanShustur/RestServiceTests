package utils;

import java.util.Objects;

public class Author  {
    private Long authorId;

        private Name authorName;

public static class Name {
    private String first;
    private String second;

    public Name(String first, String second) {
        this.first = first;
        this.second = second;
    }

    public Name() {
    }

    public String getSecond() {
        return second;
    }

    public String getFirst() {
        return first;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Name)) return false;
        Name name = (Name) o;
        return getFirst().equals(name.getFirst()) && getSecond().equals(name.getSecond());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirst(), getSecond());
    }

    @Override
    public String toString() {
        return "Name{" +
                "first='" + first + '\'' +
                ", second='" + second + '\'' +
                '}';
    }
}

    private String nationality;

    private Birth birth;

private static class Birth {
    private String date;
    private String country;
    private String city;

    public Birth(String date, String country, String city) {
        this.date = date;
        this.country = country;
        this.city = city;
    }

    public Birth() {
    }

    public String getDate() {
        return date;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Birth)) return false;
        Birth birth = (Birth) o;
        return getDate().equals(birth.getDate()) && getCountry().equals(birth.getCountry()) && getCity().equals(birth.getCity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDate(), getCountry(), getCity());
    }

    @Override
    public String toString() {
        return "Birth{" +
                "date='" + date + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

    private String authorDescription;

    public Author (Long authorId, Name authorName, String nationality, Birth birth, String authorDescription) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.nationality = nationality;
        this.birth = birth;
        this.authorDescription = authorDescription;
    }

    public Author() {
    }

    public Long getAuthorId() {
        return authorId;
    }

    public Name getAuthorName() {
        return authorName;
    }

    public String getNationality() {
        return nationality;
    }

    public Birth getBirth() {
        return birth;
    }

    public String getAuthorDescription() {
        return authorDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return getAuthorId().equals(author.getAuthorId()) && getAuthorName().equals(author.getAuthorName()) && getNationality().equals(author.getNationality()) && getBirth().equals(author.getBirth()) && getAuthorDescription().equals(author.getAuthorDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAuthorId(), getAuthorName(), getNationality(), getBirth(), getAuthorDescription());
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorId=" + authorId +
                ", authorName=" + authorName +
                ", nationality='" + nationality + '\'' +
                ", birth=" + birth +
                ", authorDescription='" + authorDescription + '\'' +
                '}';
    }
}
