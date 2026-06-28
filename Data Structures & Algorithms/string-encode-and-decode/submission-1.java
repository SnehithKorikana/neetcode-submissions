class Solution {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str + "_|_");
        }
        // System.out.println("encoded:" + sb);
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<String>();
        int len = str.length();
        int subStrIndex = 0;
        for (int i = 0; i < len; i++) {
            // System.out.println("itr: " + i );
            if (str.charAt(i) == '_') {
                // System.out.print("index1: " + i );
                if (len > i + 1 && str.charAt(i + 1) == '|') {
                    if (len > i + 2 && str.charAt(i + 2) == '_') {
                        strs.add(str.substring(subStrIndex, i));
                        // System.out.print(str.charAt(i) + " " + str.charAt(i + 1) + " " + str.charAt(i + 2) );
                        subStrIndex = i + 3;
                        i = i + 2;
                    }
                }
            }
        }
        return strs;
    }
}
