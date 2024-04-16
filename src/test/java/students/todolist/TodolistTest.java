/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package students.todolist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Nathan
 */
public class TodolistTest {
 

    @Test
    public void testCheckUserNameCorrectFormat() {
        Todolist todolist = new Todolist();
        assertTrue(todolist.checkUserName("kyl_1")); // Test correct format
    }

    @Test
    public void testCheckUserNameIncorrectFormat() {
        Todolist todolist = new Todolist();
        assertFalse(todolist.checkUserName("kyle!!!!!!")); // Test incorrect format
    }

    @Test
    public void testPasswordComplexityValidPassword() {
        Todolist todolist = new Todolist();
        assertTrue(todolist.passwordComplexity("Ch&&se@ke99!")); // Test valid password
    }

    @Test
    public void testPasswordComplexityInvalidPassword() {
        Todolist todolist = new Todolist();
        assertFalse(todolist.passwordComplexity("password")); // Test invalid password
    }
}//