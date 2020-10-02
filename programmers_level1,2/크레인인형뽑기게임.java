class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < moves.length; i++) {
			int idx = moves[i]-1;
			for (int j = 0; j < board.length; j++) {
				if (board[j][idx] != 0) {
					if (stack.isEmpty()) {
						stack.add(board[j][idx]);
						board[j][idx] = 0;
					} else {
						if (stack.peek() == board[j][idx]) {
							stack.pop();
							answer+=2;
						}
						else stack.add(board[j][idx]);
						board[j][idx] = 0;
					}
					break;
				}
			}
		}
        return answer;
    }
}
