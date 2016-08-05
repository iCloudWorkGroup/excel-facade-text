package com.excel.facade;


import acmr.excel.pojo.ExcelBook;

import com.excel.model.Cell;
import com.excel.model.CellUpdateType;
import com.excel.model.CellFormate.CellFormate;
import com.excel.model.comment.Comment;


public interface TextFacade {
	/**
	 * 创建单元格
	 * 
	 */
	public void createCell(ExcelBook excel, int sheetId, String rowAlais,String colAlais);
	
	/**
	 * 设置文本内容
	 * 
	 * @param cell
	 * @param excelBook
	 */
	public void data(Cell cell, ExcelBook excelBook) ;
	/**
	 * 更新单元格
	 * 
	 * @param type
	 *            单元格类型枚举值
	 * @param cell
	 *            单元格
	 */
	public void updateCells(CellUpdateType type, Cell cell, ExcelBook excelBook) ;
	/**
	 * 单元格格式
	 * @param type
	 * @param cellFormate
	 * @param excelBook
	 */
	public void setCellFormate(CellFormate cellFormate, ExcelBook excelBook) ;
	/**
	 * 设置文本注释
	 * 
	 * @param excelBook
	 * @param comment
	 */

	public void setComment(ExcelBook excelBook, Comment comment) ;
}
