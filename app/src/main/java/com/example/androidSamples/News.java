package com.example.androidSamples;

import java.io.Serializable;

public class News implements Serializable {


    private String editor;
    private Integer editorImage;
    private Integer eventImage;
    private String headline;
    private String linkToDetail;
    private String publishedDate;

    public News() {
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public Integer getEditorImage() {
        return editorImage;
    }

    public void setEditorImage(Integer editorImage) {
        this.editorImage = editorImage;
    }

    public Integer getEventImage() {
        return eventImage;
    }

    public void setEventImage(Integer eventImage) {
        this.eventImage = eventImage;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getLinkToDetail() {
        return linkToDetail;
    }

    public void setLinkToDetail(String linkToDetail) {
        this.linkToDetail = linkToDetail;
    }


    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publisherDate) {
        this.publishedDate = publisherDate;
    }
}
