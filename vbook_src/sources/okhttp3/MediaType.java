package okhttp3;

import java.util.ArrayList;
import java.util.Locale;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class MediaType {
    public static final gm9 b = new gm9("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final gm9 c = new gm9(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    public final String a;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        public static MediaType a(String str) {
            String str2;
            String str3;
            str.getClass();
            b27 e = MediaType.b.e(0, str);
            if (e != null) {
                Locale locale = Locale.ROOT;
                String lowerCase = ((String) ((z17) e.a()).get(1)).toLowerCase(locale);
                lowerCase.getClass();
                String lowerCase2 = ((String) ((z17) e.a()).get(2)).toLowerCase(locale);
                lowerCase2.getClass();
                ArrayList arrayList = new ArrayList();
                int i = e.b().b;
                while (true) {
                    int i2 = i + 1;
                    if (i2 < str.length()) {
                        b27 e2 = MediaType.c.e(i2, str);
                        if (e2 != null) {
                            a27 a27Var = e2.c;
                            x17 b = a27Var.b(1);
                            if (b != null) {
                                str2 = b.a;
                            } else {
                                str2 = null;
                            }
                            if (str2 == null) {
                                i = e2.b().b;
                            } else {
                                x17 b2 = a27Var.b(2);
                                if (b2 != null) {
                                    str3 = b2.a;
                                } else {
                                    str3 = null;
                                }
                                if (str3 == null) {
                                    x17 b3 = a27Var.b(3);
                                    b3.getClass();
                                    str3 = b3.a;
                                } else if (k4b.B0(str3, '\'') && k4b.Y(str3, '\'') && str3.length() > 2) {
                                    str3 = str3.substring(1, str3.length() - 1);
                                }
                                arrayList.add(str2);
                                arrayList.add(str3);
                                i = e2.b().b;
                            }
                        } else {
                            throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + str.substring(i2) + "\" for: \"" + str + '\"').toString());
                        }
                    } else {
                        return new MediaType(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
                    }
                }
            } else {
                vs.m(eub.n('\"', "No subtype found for: \"", str));
                return null;
            }
        }
    }

    public MediaType(String str, String str2, String str3, String[] strArr) {
        str.getClass();
        strArr.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof MediaType) && c16.i(((MediaType) obj).a, this.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
