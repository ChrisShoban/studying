public class TextCompressor {

	public String longestRepeat(String sourceText) {
		String best = "";
		for(int i = 0; i < sourceText.length(); i++) {
			for(int j = i + 1; j < sourceText.length(); j++) {
				String first = sourceText.substring(i, j);
				String second = sourceText.substring(j);
				System.out.println("first = " + first + " | second = " + second);
				if(second.contains(first)) {
					if(first.length() > best.length()) {
						best = first;
					}
				}
			}
		}
		return best;
	}

}
