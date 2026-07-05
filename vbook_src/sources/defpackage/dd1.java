package defpackage;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dd1  reason: default package */
/* loaded from: classes.dex */
public abstract class dd1 {
    public static final mfb a = new mfb(new mf0(28));

    static {
        new mfb(new mf0(29));
        new mfb(new cd1(0));
        new mfb(new cd1(1));
        new mfb(new cd1(2));
    }

    public static Charset a(String str) {
        String lowerCase = r4b.N(r4b.N(str, false, "-", ""), false, "_", "").toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String str2 = (String) ((Map) yc1.a.getValue()).get(lowerCase);
        if (str2 == null) {
            String str3 = (String) ((Map) yc1.b.getValue()).get(lowerCase);
            if (str3 != null) {
                str = str3;
            }
        } else {
            str = str2;
        }
        Charset forName = Charset.forName(str);
        forName.getClass();
        return forName;
    }
}
