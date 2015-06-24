# table-reader

To run this project:

1. Open TestCenterTableToCSV.java
2. change url value to your url. 
   currently it is: 
   String url="http://localhost:8234/sample.html";
3. Now run TestCenterTableToCSV => main() as java application.
    According to below line it will generate a data.csv in Root folder of the project.
    CSVFileWriter.writeToFile("data.csv", CSVBuilder.buildCSVRows(table));
    I have attached a sample data.csv also.

