package assignment7;

public class q2 {
	public String reverseWords(String s) {
		StringBuilder sb = new StringBuilder();
		String[] strs = s.trim().split("\\s+");
		System.out.println(strs.length);

		for (int i = strs.length - 1; i >= 0; i--) {
			String str = strs[i];
			sb.append(str);
			if (i != 0)
				sb.append(" ");
		}
		return sb.toString();
	}
}
