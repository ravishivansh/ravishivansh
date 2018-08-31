package com.javabykiran.keywordFrmework;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class KeyWordExecution {
	public void runReflectionMethod(String strClassName, String strMethodName, Object[] inputArgs) {
		System.out.println(1);
		Class params[] = new Class[inputArgs.length];
		try {
			Class cls = Class.forName(strClassName);// A aa=A.class;
			System.out.println(2);
			Object _instance = cls.newInstance();// A aa=new A();
			System.out.println(3);
			Method myMethod = cls.getDeclaredMethod(strMethodName, params);
			System.out.println(4);
			myMethod.invoke(_instance, inputArgs);
			System.out.println(5);
		} catch (Exception e) {
			System.err.format(strClassName + ":- Class not found%n");
		}
	}

	public static void main(String[] args) {
		KeyWordExecution exeKey = new KeyWordExecution();
		ReadExcel excelSheet = new ReadExcel();
		System.out.println(1);
		excelSheet.openSheet("testCaseSheet.xls");
		System.out.println(2);
		System.out.println(excelSheet.getRowCount());
		for (int row = 1; row < excelSheet.getRowCount(); row++) {
			ArrayList<Object> myParamList = new ArrayList<Object>();
			String methodName = excelSheet.getValueFromCell(0, row);
			for (int col = 1; col < excelSheet.getColumnCount(); col++) {
				System.out.println("cols >> " + col);
				System.out.println("rows >> " + row);
				if (!excelSheet.getValueFromCell(col, row).isEmpty()
						& !excelSheet.getValueFromCell(col, row).equals("null")) {
					myParamList.add(excelSheet.getValueFromCell(col, row));
				}
			}
			System.out.println("myParamList >> " + myParamList);
			Object[] paramListObject = new String[myParamList.size()];
			paramListObject = myParamList.toArray(paramListObject);
			System.out.println(methodName);
			System.out.println(paramListObject);
			exeKey.runReflectionMethod("com.javabykiran.keywordFrmework.KeyWordExample", methodName, paramListObject);
		}
	}
}
