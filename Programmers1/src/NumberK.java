import java.lang.reflect.*;
import java.util.*;

public class NumberK {

	public int[] solution(int[] array, int[][] commands) {
		// 1.array�� �Ϻ� �߶󳻼� array2 �����
		int[] array2 = new int[50];
		int i = 0;
		while(i<array.length) {			
			array2 = Arrays.copyOfRange(array, commands[i][0], commands[i][1]); 
			i++;
			return array2;
		}
		
		// 2.array2 �������� �����ϱ�
		Arrays.sort(array2); 

		// 3.commands���� array2���� ���� k��° ���� �迭�� �ֱ�
		for(int j=0;j<array2.length;j++){
			int[] anwer = Array.get(commands, commands[j][2]);
			
		}


		int[] answer = {};
		return answer;
	}


	public static void main(String[] args) {
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		NumberK n = new NumberK();
		n.solution(array, commands);
	}

}
