import java.lang.reflect.*;
import java.util.*;

public class NumberK {

	public int[] solution(int[] array, int[][] commands) {
		// 1.array의 일부 잘라내서 array2 만들기
		int[] array2 = new int[50];
		int i = 0;
		while(i<array.length) {			
			array2 = Arrays.copyOfRange(array, commands[i][0], commands[i][1]); 
			i++;
			return array2;
		}
		
		// 2.array2 오름차순 정렬하기
		Arrays.sort(array2); 

		// 3.commands에서 array2에서 뽑을 k번째 숫자 배열에 넣기
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
