# KLHB-FED-26-15-13
# Farmers' Market Price & Sales Tracker
Console-Based Java Application for Recording Market Prices and Sales

## Project Overview
This repository contains the design, source code, and project status documents for the Farmers' Market Price & Sales Tracker, developed as part of the academic project work at KLH University. The current version is a beginner-level Java console application that uses methods and arrays to add products, update prices, record sales, and display sales totals. The project will be extended in later stages with classes, file handling, and a MySQL database.

---

## Team Members & Registration Numbers
* **M.HARSHITH KUMAR** – 2620030453
* **BINIL BINO** – 2620080106

## Institutional Details
* **Department:**  Department of Computer Science and Engineering (CSE)
* **University:** KLH University
* **Academic Year:** 2026–2027
* **Project Code:** KLHB-FED-26-15-13
* **Faculty Guide:** *SREERAM MURTHY*

---

## Abstract
Vendors at a farmers' market usually write product prices and daily sales in notebooks. Prices change often, stock is not updated after each sale, and it is difficult to find the total amount collected at the end of the day. This project implements a simple, low-cost software tracker in Java. The program stores product name, unit, price, and stock, allows the vendor to change a price, records a sale only when enough stock is available, reduces stock after a successful sale, and prints the total sales amount. The first version uses methods and arrays so that it matches the topics completed in class. Later versions will add object-oriented classes, file storage, and database connectivity.

---

## Repository Directory Structure
* `/src` – Contains the Java source program.
  * `FarmersMarketApp.java`
* `/reports` – Contains project status and presentation files.
  * `KLHB-FED-26-15-13_Project_Status_Week1.docx`
* Root files
  * `README.md` – Project description and run instructions
  * `.gitignore` – Files that should not be uploaded (compiled `.class` files, IDE folders)

---

## Features Implemented
1. Add a new product (name, unit, price, stock).
2. View all products in a table format.
3. Update the selling price of a product.
4. Record a sale and automatically reduce stock.
5. View the list of sales made in the current run.
6. Display the total sales amount.
7. Sample products loaded at start (Tomato, Onion, Milk, Eggs).

## Planned Extensions
* Convert arrays into `Product` and `Sale` classes.
* Save and load data from a text file.
* Connect the application to MySQL using JDBC.
* Add a Swing desktop interface.

---

## Setup and Execution Instructions
1. **Prerequisites:**
   * Install **JDK 25** or a newer JDK.
   * Optional: NetBeans, IntelliJ IDEA, or Eclipse.
2. **Opening the Source File:**
   * Clone or download this repository.
   * Open `src/FarmersMarketApp.java` in a text editor or Java IDE.
3. **Compile and Run (terminal):**
   * Go to the project folder and run:

```bash
javac src/FarmersMarketApp.java
java -cp src FarmersMarketApp
