/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.controller;

import edu.ijse.dto.CategoryDto;
import edu.ijse.model.CategoryModel;
import java.util.ArrayList;
import java.util.Locale.Category;

/**
 *
 * @author User
 */
public class CategoryController {
     private CategoryModel categoryModel;

    public CategoryController() throws Exception{
        this.categoryModel = new CategoryModel();
    }

    public String saveCategory(CategoryDto categoryDto) throws Exception{
        String resp = categoryModel.saveCategory(categoryDto);
        return resp;
    }

    public ArrayList<CategoryDto> getAllCategory() throws Exception{
        ArrayList<CategoryDto> categoryDtos = categoryModel.getAllCategory();
        return categoryDtos;
    }

    public CategoryDto searchCategory(String CatId) throws Exception{
        CategoryDto categoryDto = categoryModel.getCategory(CatId);
        return categoryDto;
    }

    public String deleteCategory(String catId) throws Exception{
        String resp = categoryModel.deleteCategory(catId);
        return resp;
    }
    
    public String updateCategory(CategoryDto categoryDto) throws Exception {
        String resp = categoryModel.updateCategory(categoryDto);
        return resp;
    }
}
