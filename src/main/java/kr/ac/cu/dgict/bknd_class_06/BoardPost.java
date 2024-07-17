package kr.ac.cu.dgict.bknd_class_06;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@NoArgsConstructor
public class BoardPost {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false, length=50)
    private String email;

    @Column(nullable=false, length=20, updatable=false)
    private String author;

    @Column(nullable=false)
    @Setter
    private String subject;

    @Column(nullable=false, columnDefinition="LONGTEXT")
    @Setter
    private String content;

    @Column(nullable=false, updatable=false)
    @CreationTimestamp
    private LocalDateTime createAt;

    @Column(nullable=false)
    @UpdateTimestamp
    private LocalDateTime updateAt;
}
