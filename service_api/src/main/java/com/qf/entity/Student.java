package com.qf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable {
   private Integer id;
   private String name;
   private Integer age;
   private Integer banJiId;
   private String banjiName;
}
