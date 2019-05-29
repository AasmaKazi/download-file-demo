package com.fileDownload.demoDownloadFile.view;
import com.fileDownload.demoDownloadFile.domain.Emlopyee;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

public class EmployeeExcelView extends AbstractExcelView {
    @Override
    protected void buildExcelDocument(Map<String, Object> model, HSSFWorkbook workbook, HttpServletRequest request,
                                      HttpServletResponse response) throws Exception {

        HSSFSheet excelSheet = workbook.createSheet("empList");
        setExcelHeader(excelSheet);

        List empList = (List) model.get("empList");
//        setExcelRows(excelSheet,empList);

    }

    public void setExcelHeader(HSSFSheet excelSheet) {
        HSSFRow excelHeader = excelSheet.createRow(0);
        excelHeader.createCell(0).setCellValue("Id");
        excelHeader.createCell(1).setCellValue("Name");
        excelHeader.createCell(2).setCellValue("Email");
        excelHeader.createCell(3).setCellValue("Address");
        excelHeader.createCell(4).setCellValue("ContactNumber");
        excelHeader.createCell(5).setCellValue("salary");

    }

//    public void setExcelRows(HSSFSheet excelSheet, List empList){
//        int record = 1;
//        for (Emlopyee emp : empList) {
//            HSSFRow excelRow = excelSheet.createRow(record++);
//            excelRow.createCell(0).setCellValue(emp.getId());
//            excelRow.createCell(1).setCellValue(emp.getName());
//            excelRow.createCell(2).setCellValue(emp.getEmail());
//            excelRow.createCell(3).setCellValue(emp.getAddress());
//            excelRow.createCell(4).setCellValue(emp.getContactNumber());
//            excelRow.createCell(4).setCellValue(emp.getSalary());
//
    //    }
   // }
}
