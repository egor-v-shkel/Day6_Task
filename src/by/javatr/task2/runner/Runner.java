package by.javatr.task2.runner;

import by.javatr.task2.util.Sort;
import print.PrintToConsole;

import java.util.Arrays;

//��� ��������������� ������������� ������ (jagged array). 
// ����������� �������� "�����������" ����������, ����� �������,
// ����� ���� ����������� ����������� ������ �������:
// � ������� ����������� (��������) ���� ��������� ����� �������;
// � ������� ����������� (��������) ������������ ��������� ����� �������;
// � ������� ����������� (��������) ����������� ��������� ����� �������.
//��� ���������� ������ ������ Array �� ������������! �������� ���������� �������� ������ ����.

public class Runner {

	public static void main(String[] args) {
		int[][] jaggedArray = {
			new int[] {11, 3, 54, 71, 9, 789, 112},
			new int[] {0, 26, 4, 65},
			new int[] {11, 22},
			new int[] {1,28, 2, 156, 15, 19, 896}
			};
		
		//����������� ������ �������: � ������� ����������� ���� ��������� ����� �������;
		int[] arrayOfSums = Sort.bubbleSortSumsOfRowElementsDecr(jaggedArray);
		PrintToConsole.println(Arrays.toString(arrayOfSums));	
		
		//����������� ������ �������: � ������� �������� ������������ ��������� ����� �������;
		arrayOfSums = Sort.bubbleSortSumsOfRowElementsInc(jaggedArray);
		PrintToConsole.println(Arrays.toString(arrayOfSums));
		
		//����������� ������ �������: � ������� �����������  ������������ ��������� ����� �������;
		int[] arrayOfMaxElements = Sort.bubbleSortMaxElementsDecr(jaggedArray);
		PrintToConsole.println(Arrays.toString(arrayOfMaxElements));
		
		//����������� ������ �������: � ������� �������� ������������ ��������� ����� �������;
		arrayOfMaxElements = Sort.bubbleSortMaxElementsInc(jaggedArray);
		PrintToConsole.println(Arrays.toString(arrayOfMaxElements));
		
		//����������� ������ �������: � ������� ����������� ����������� ��������� ����� �������;
		int[] arrayOfMinElements = Sort.bubbleSortMinElementsDecr(jaggedArray);
		PrintToConsole.println(Arrays.toString(arrayOfMinElements));
				
		//����������� ������ �������: � ������� �������� ����������� ��������� ����� �������;
		arrayOfMinElements = Sort.bubbleSortMinElementsInc(jaggedArray);
		PrintToConsole.println(Arrays.toString(arrayOfMinElements));
	}
}
