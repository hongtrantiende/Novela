package defpackage;

import java.util.Map;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s99  reason: default package */
/* loaded from: classes.dex */
public abstract class s99 {
    public static final Map a = o17.s(new yk8(Integer.valueOf((int) Token.ASSIGN_ADD), "●"), new yk8(Integer.valueOf((int) Token.ASSIGN_SUB), "●"), new yk8(110, "■"), new yk8(Integer.valueOf((int) Token.ASSIGN_DIV), "□"), new yk8(Integer.valueOf((int) Token.ASSIGN_MOD), "□"), new yk8(Integer.valueOf((int) Token.ASSIGN_EXP), "□"), new yk8(114, "□"), new yk8(Integer.valueOf((int) Token.HOOK), "⬧"), new yk8(Integer.valueOf((int) Token.COLON), "⧫"), new yk8(Integer.valueOf((int) Token.OR), "◆"), new yk8(Integer.valueOf((int) Token.AND), "❖"), new yk8(Integer.valueOf((int) Token.INC), "⬥"), new yk8(Integer.valueOf((int) Token.COLONCOLON), "·"), new yk8(Integer.valueOf((int) Token.XML), "•"), new yk8(160, "·"), new yk8(Integer.valueOf((int) Token.XMLATTR), "⚪"), new yk8(Integer.valueOf((int) Token.XMLEND), "○"), new yk8(Integer.valueOf((int) Token.TO_OBJECT), "○"), new yk8(Integer.valueOf((int) Token.TO_DOUBLE), "◉"), new yk8(Integer.valueOf((int) Token.GET), "◎"), new yk8(Integer.valueOf((int) Token.LET), "▪"), new yk8(Integer.valueOf((int) Token.CONST), "◻"), new yk8(170, "✦"), new yk8(Integer.valueOf((int) Token.ARRAYCOMP), "★"), new yk8(Integer.valueOf((int) Token.LETEXPR), "✶"), new yk8(Integer.valueOf((int) Token.WITHEXPR), "✴"), new yk8(Integer.valueOf((int) Token.DEBUGGER), "✹"), new yk8(69, "☜"), new yk8(70, "☞"), new yk8(71, "☝"), new yk8(72, "☟"), new yk8(251, "✗"), new yk8(252, "✔"), new yk8(253, "☒"), new yk8(254, "☑"), new yk8(232, "➔"), new yk8(239, "⇦"), new yk8(240, "⇨"), new yk8(241, "⇧"), new yk8(242, "⇩"), new yk8(34, "✂"), new yk8(54, "⌛"), new yk8(74, "☺"), new yk8(78, "☠"), new yk8(82, "☼"), new yk8(84, "❄"), new yk8(88, "✠"), new yk8(89, "✡"));
    public static final Map b = o17.s(new yk8(983099, "↓"), new yk8(983791, "·"), new yk8(985172, "《"), new yk8(985173, "》"), new yk8(983258, "▸"), new yk8(985103, "━"), new yk8(985127, "■"));

    public static final String a(int i) {
        if (61472 <= i && i < 61696) {
            return (String) a.get(Integer.valueOf(i - 61440));
        } else if (983040 <= i && i < 985600) {
            return (String) b.get(Integer.valueOf(i));
        } else {
            return null;
        }
    }

    public static final String b(String str) {
        int i;
        str.getClass();
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            if (Character.isHighSurrogate(charAt) && (i = i2 + 1) < str.length() && Character.isLowSurrogate(str.charAt(i))) {
                String a2 = a((str.charAt(i) - 56320) + ((charAt - 55296) << 10) + Parser.ARGC_LIMIT);
                if (a2 != null) {
                    sb.append(a2);
                } else {
                    sb.append(charAt);
                    sb.append(str.charAt(i));
                }
                i2 += 2;
            } else {
                String a3 = a(charAt);
                if (a3 != null) {
                    sb.append(a3);
                } else {
                    sb.append(charAt);
                }
                i2++;
            }
        }
        return sb.toString();
    }
}
