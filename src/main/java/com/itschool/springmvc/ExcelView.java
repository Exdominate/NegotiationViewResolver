package com.itschool.springmvc;


import com.itschool.springmvc.model.Pizza;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.web.servlet.view.document.AbstractExcelView;

public class ExcelView extends AbstractExcelView {
  @Override
  protected void buildExcelDocument(Map<String, Object> model,
      HSSFWorkbook workbook, HttpServletRequest request,
      HttpServletResponse response) throws Exception {

    Pizza pizza = (Pizza) model.get("pizza");

    HSSFSheet sheet = workbook.createSheet("sheet 1");
    CellStyle style = workbook.createCellStyle();
    style.setFillForegroundColor(IndexedColors.GREY_40_PERCENT.index);

    Row row = null;
    Cell cell = null;
    int rowCount = 0;
    int colCount = 0;

    // Create header cells
    row = sheet.createRow(rowCount++);

    cell = row.createCell(colCount++);
    cell.setCellStyle(style);
    cell.setCellValue("Name");

    cell = row.createCell(colCount++);
    cell.setCellStyle(style);
    cell.setCellValue("Flavor");

    cell = row.createCell(colCount++);
    cell.setCellStyle(style);
    cell.setCellValue("Toppings");

    // Create data cells
    row = sheet.createRow(rowCount++);
    colCount = 0;
    row.createCell(colCount++).setCellValue(pizza.getName());
    row.createCell(colCount++).setCellValue(pizza.getFlavor());

    StringBuffer toppings = new StringBuffer("");
    for (String topping : pizza.getToppings()) {
      toppings.append(topping);
      toppings.append(" ");
    }
    row.createCell(colCount++).setCellValue(toppings.toString());

    for (int i = 0; i < 3; i++)
      sheet.autoSizeColumn(i, true);

  }
}