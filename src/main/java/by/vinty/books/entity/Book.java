package by.vinty.books.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "book")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Book extends BaseEntity{
    @Column(name = "name")
    private String name;
    @Column(name = "author")
    private String author;
}
