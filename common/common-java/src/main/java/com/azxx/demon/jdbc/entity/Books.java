package com.azxx.demon.jdbc.entity;

public class Books {
  private Long id;
  private String title;
  private Double price;
  private java.sql.Timestamp publishdate;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public java.sql.Timestamp getPublishdate() {
    return publishdate;
  }

  public void setPublishdate(java.sql.Timestamp publishdate) {
    this.publishdate = publishdate;
  }
}
