/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dto;

/**
 *
 * @author User
 */
public class CategoryDto {
    private String CatId;
    private String Name;
    private String Description;

    public CategoryDto() {
    }

    public CategoryDto(String CatId, String Name, String Description) {
        this.CatId = CatId;
        this.Name = Name;
        this.Description = Description;
    }

    /**
     * @return the CatId
     */
    public String getCatId() {
        return CatId;
    }

    /**
     * @param CatId the CatId to set
     */
    public void setCatId(String CatId) {
        this.CatId = CatId;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * @param Description the Description to set
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    @Override
    public String toString() {
        return "CategoryDto{" + "CatId=" + CatId + ", Name=" + Name + ", Description=" + Description + '}';
    }   
}
