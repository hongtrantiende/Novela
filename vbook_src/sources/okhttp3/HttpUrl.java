package okhttp3;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.url._UrlKt;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class HttpUrl {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final List f;
    public final String g;
    public final String h;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class Builder {
        public String a;
        public String d;
        public ArrayList g;
        public String h;
        public String b = "";
        public String c = "";
        public int e = -1;
        public final ArrayList f = tl1.C("");

        public static ArrayList c(String str) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int f0 = k4b.f0(str, '&', i, 4);
                if (f0 == -1) {
                    f0 = str.length();
                }
                int f02 = k4b.f0(str, '=', i, 4);
                if (f02 != -1 && f02 <= f0) {
                    arrayList.add(str.substring(i, f02));
                    arrayList.add(str.substring(f02 + 1, f0));
                } else {
                    arrayList.add(str.substring(i, f0));
                    arrayList.add(null);
                }
                i = f0 + 1;
            }
            return arrayList;
        }

        public final HttpUrl a() {
            ArrayList arrayList;
            String str;
            String str2 = this.a;
            String str3 = null;
            if (str2 != null) {
                String c = _UrlKt.c(0, this.b, 0, 7);
                String c2 = _UrlKt.c(0, this.c, 0, 7);
                String str4 = this.d;
                if (str4 != null) {
                    int i = this.e;
                    if (i == -1) {
                        String str5 = this.a;
                        str5.getClass();
                        i = Companion.a(str5);
                    }
                    ArrayList arrayList2 = this.f;
                    ArrayList arrayList3 = new ArrayList(tl1.s(arrayList2, 10));
                    int size = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList2.get(i2);
                        i2++;
                        arrayList3.add(_UrlKt.c(0, (String) obj, 0, 7));
                    }
                    ArrayList arrayList4 = this.g;
                    if (arrayList4 != null) {
                        arrayList = new ArrayList(tl1.s(arrayList4, 10));
                        int size2 = arrayList4.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            Object obj2 = arrayList4.get(i3);
                            i3++;
                            String str6 = (String) obj2;
                            if (str6 != null) {
                                str = _UrlKt.c(0, str6, 0, 3);
                            } else {
                                str = null;
                            }
                            arrayList.add(str);
                        }
                    } else {
                        arrayList = null;
                    }
                    String str7 = this.h;
                    if (str7 != null) {
                        str3 = _UrlKt.c(0, str7, 0, 7);
                    }
                    return new HttpUrl(str2, c, c2, str4, i, arrayList3, arrayList, str3, toString());
                }
                vs.k("host == null");
                return null;
            }
            vs.k("scheme == null");
            return null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:118:0x01e8, code lost:
            if (r8 < 65536) goto L145;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0072, code lost:
            if (r13 == ':') goto L4;
         */
        /* JADX WARN: Removed duplicated region for block: B:100:0x01aa  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x01ce  */
        /* JADX WARN: Removed duplicated region for block: B:126:0x0210  */
        /* JADX WARN: Removed duplicated region for block: B:129:0x0229  */
        /* JADX WARN: Removed duplicated region for block: B:182:0x0318  */
        /* JADX WARN: Removed duplicated region for block: B:215:0x01c6 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00b6  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0134  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0139  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b(okhttp3.HttpUrl r18, java.lang.String r19) {
            /*
                Method dump skipped, instructions count: 852
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.b(okhttp3.HttpUrl, java.lang.String):void");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (this.b.length() > 0 || this.c.length() > 0) {
                sb.append(this.b);
                if (this.c.length() > 0) {
                    sb.append(':');
                    sb.append(this.c);
                }
                sb.append('@');
            }
            String str2 = this.d;
            if (str2 != null) {
                if (k4b.W(str2, ':')) {
                    sb.append('[');
                    sb.append(this.d);
                    sb.append(']');
                } else {
                    sb.append(this.d);
                }
            }
            int i = this.e;
            if (i != -1 || this.a != null) {
                if (i == -1) {
                    String str3 = this.a;
                    str3.getClass();
                    i = Companion.a(str3);
                }
                String str4 = this.a;
                if (str4 == null || i != Companion.a(str4)) {
                    sb.append(':');
                    sb.append(i);
                }
            }
            ArrayList arrayList = this.f;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                sb.append('/');
                sb.append((String) arrayList.get(i2));
            }
            if (this.g != null) {
                sb.append('?');
                ArrayList arrayList2 = this.g;
                arrayList2.getClass();
                ry5 D = dce.D(dce.F(0, arrayList2.size()), 2);
                int i3 = D.a;
                int i4 = D.b;
                int i5 = D.c;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        String str5 = (String) arrayList2.get(i3);
                        String str6 = (String) arrayList2.get(i3 + 1);
                        if (i3 > 0) {
                            sb.append('&');
                        }
                        sb.append(str5);
                        if (str6 != null) {
                            sb.append('=');
                            sb.append(str6);
                        }
                        if (i3 == i4) {
                            break;
                        }
                        i3 += i5;
                    }
                }
            }
            if (this.h != null) {
                sb.append('#');
                sb.append(this.h);
            }
            return sb.toString();
        }
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        public static int a(String str) {
            str.getClass();
            if (str.equals("http")) {
                return 80;
            }
            if (str.equals("https")) {
                return 443;
            }
            return -1;
        }
    }

    public HttpUrl(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = arrayList2;
        this.g = str5;
        this.h = str6;
    }

    public final String a() {
        if (this.c.length() == 0) {
            return "";
        }
        String str = this.h;
        return str.substring(k4b.f0(str, ':', this.a.length() + 3, 4) + 1, k4b.f0(str, '@', 0, 6));
    }

    public final String b() {
        String str = this.h;
        int f0 = k4b.f0(str, '/', this.a.length() + 3, 4);
        return str.substring(f0, _UtilCommonKt.d(str, f0, str.length(), "?#"));
    }

    public final ArrayList c() {
        String str = this.h;
        int f0 = k4b.f0(str, '/', this.a.length() + 3, 4);
        int d = _UtilCommonKt.d(str, f0, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (f0 < d) {
            int i = f0 + 1;
            int c = _UtilCommonKt.c(str, '/', i, d);
            arrayList.add(str.substring(i, c));
            f0 = c;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f == null) {
            return null;
        }
        String str = this.h;
        int f0 = k4b.f0(str, '?', 0, 6) + 1;
        return str.substring(f0, _UtilCommonKt.c(str, '#', f0, str.length()));
    }

    public final String e() {
        if (this.b.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.h;
        return str.substring(length, _UtilCommonKt.d(str, length, str.length(), ":@"));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof HttpUrl) && ((HttpUrl) obj).h.equals(this.h)) {
            return true;
        }
        return false;
    }

    public final Builder f() {
        ArrayList arrayList;
        Builder builder = new Builder();
        String str = this.a;
        builder.a = str;
        builder.b = e();
        builder.c = a();
        builder.d = this.d;
        int a = Companion.a(str);
        int i = this.e;
        if (i == a) {
            i = -1;
        }
        builder.e = i;
        ArrayList arrayList2 = builder.f;
        arrayList2.clear();
        arrayList2.addAll(c());
        String d = d();
        String str2 = null;
        if (d != null) {
            arrayList = Builder.c(_UrlKt.a(d, 0, 0, " \"'<>#", 83));
        } else {
            arrayList = null;
        }
        builder.g = arrayList;
        if (this.g != null) {
            String str3 = this.h;
            str2 = str3.substring(k4b.f0(str3, '#', 0, 6) + 1);
        }
        builder.h = str2;
        return builder;
    }

    public final String g() {
        Builder builder;
        try {
            builder = new Builder();
            builder.b(this, "/...");
        } catch (IllegalArgumentException unused) {
            builder = null;
        }
        builder.getClass();
        builder.b = _UrlKt.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", Token.EXPORT);
        builder.c = _UrlKt.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", Token.EXPORT);
        return builder.a().h;
    }

    public final URI h() {
        String str;
        String str2;
        String str3;
        Builder f = f();
        ArrayList arrayList = f.f;
        String str4 = f.d;
        if (str4 != null) {
            str = s21.n("[\"<>^`{|}]", str4, "");
        } else {
            str = null;
        }
        f.d = str;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.set(i, _UrlKt.a((String) arrayList.get(i), 0, 0, "[]", 99));
        }
        ArrayList arrayList2 = f.g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str5 = (String) arrayList2.get(i2);
                if (str5 != null) {
                    str3 = _UrlKt.a(str5, 0, 0, "\\^`{|}", 67);
                } else {
                    str3 = null;
                }
                arrayList2.set(i2, str3);
            }
        }
        String str6 = f.h;
        if (str6 != null) {
            str2 = _UrlKt.a(str6, 0, 0, " \"#<>\\^`{|}", 35);
        } else {
            str2 = null;
        }
        f.h = str2;
        String builder = f.toString();
        try {
            return new URI(builder);
        } catch (URISyntaxException e) {
            try {
                Pattern compile = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                compile.getClass();
                String replaceAll = compile.matcher(builder).replaceAll("");
                replaceAll.getClass();
                URI create = URI.create(replaceAll);
                create.getClass();
                return create;
            } catch (Exception unused) {
                fb4.l(e);
                return null;
            }
        }
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        return this.h;
    }
}
