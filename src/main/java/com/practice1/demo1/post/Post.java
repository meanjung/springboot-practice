package com.practice1.demo1.post;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.practice1.demo1.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    @Id
    @GeneratedValue
    private Integer id;

    private String description;


    // User : Post -> 1 : N -> Main : Sub -> Parent : Child
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private User user;

}
