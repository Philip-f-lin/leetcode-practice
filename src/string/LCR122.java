package string;

public class LCR122 {
    /*假定一段路径记作字符串 path，其中以 "." 作为分隔符。
    现需将路径加密，加密方法为将 path 中的分隔符替换为空格 " "，
    请返回加密后的字符串。

    示例 1：

    输入：path = "a.aef.qerf.bb"

    输出："a aef qerf bb"*/
    public String pathEncryption(String path) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < path.length(); i++) {
            sb.append(path.charAt(i));
        }

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '.') {
                sb.replace(i, i + 1, " ");
            }
        }

        return sb.toString();

    }

}
