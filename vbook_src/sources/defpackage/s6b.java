package defpackage;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s6b  reason: default package */
/* loaded from: classes.dex */
public final class s6b implements o8b {
    public static final Pattern d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    public static final Pattern e = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder a = new StringBuilder();
    public final ArrayList b = new ArrayList();
    public final km8 c = new km8();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
        if (r22.equals("{\\an9}") != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
        if (r22.equals("{\\an7}") != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
        if (r22.equals("{\\an6}") != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
        if (r22.equals("{\\an4}") != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
        if (r22.equals("{\\an3}") != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
        if (r22.equals("{\\an1}") != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008c, code lost:
        if (r22.equals("{\\an9}") != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0093, code lost:
        if (r22.equals("{\\an8}") != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009a, code lost:
        if (r22.equals("{\\an7}") != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009c, code lost:
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b1, code lost:
        if (r22.equals("{\\an3}") != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b8, code lost:
        if (r22.equals("{\\an2}") != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bf, code lost:
        if (r22.equals("{\\an1}") != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c1, code lost:
        r3 = 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.td2 a(android.text.Spanned r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s6b.a(android.text.Spanned, java.lang.String):td2");
    }

    public static long b(Matcher matcher, int i) {
        long j;
        String group = matcher.group(i + 1);
        if (group != null) {
            j = Long.parseLong(group) * 3600000;
        } else {
            j = 0;
        }
        String group2 = matcher.group(i + 2);
        group2.getClass();
        long parseLong = (Long.parseLong(group2) * 60000) + j;
        String group3 = matcher.group(i + 3);
        group3.getClass();
        long parseLong2 = (Long.parseLong(group3) * 1000) + parseLong;
        String group4 = matcher.group(i + 4);
        if (group4 != null) {
            parseLong2 += Long.parseLong(group4);
        }
        return parseLong2 * 1000;
    }

    @Override // defpackage.o8b
    public final void k(byte[] bArr, int i, int i2, n8b n8bVar, h12 h12Var) {
        ArrayList arrayList;
        String n;
        String str;
        s6b s6bVar = this;
        long j = n8bVar.b;
        km8 km8Var = s6bVar.c;
        km8Var.K(bArr, i + i2);
        km8Var.M(i);
        Charset I = km8Var.I();
        if (I == null) {
            I = StandardCharsets.UTF_8;
        }
        long j2 = -9223372036854775807L;
        if (j != -9223372036854775807L && n8bVar.a) {
            arrayList = new ArrayList();
        } else {
            arrayList = null;
        }
        while (true) {
            String n2 = km8Var.n(I);
            if (n2 == null) {
                break;
            } else if (!n2.isEmpty()) {
                try {
                    Integer.parseInt(n2);
                    n = km8Var.n(I);
                } catch (NumberFormatException unused) {
                    st0.w("SubripParser", "Skipping invalid index: ".concat(n2));
                }
                if (n == null) {
                    st0.w("SubripParser", "Unexpected end");
                    break;
                }
                Matcher matcher = d.matcher(n);
                if (matcher.matches()) {
                    long b = b(matcher, 1);
                    long b2 = b(matcher, 6);
                    StringBuilder sb = s6bVar.a;
                    sb.setLength(0);
                    long j3 = j2;
                    ArrayList arrayList2 = s6bVar.b;
                    arrayList2.clear();
                    for (String n3 = km8Var.n(I); !TextUtils.isEmpty(n3); n3 = km8Var.n(I)) {
                        if (sb.length() > 0) {
                            sb.append("<br>");
                        }
                        String trim = n3.trim();
                        StringBuilder sb2 = new StringBuilder(trim);
                        Matcher matcher2 = e.matcher(trim);
                        int i3 = 0;
                        while (matcher2.find()) {
                            String group = matcher2.group();
                            arrayList2.add(group);
                            int start = matcher2.start() - i3;
                            int length = group.length();
                            sb2.replace(start, start + length, "");
                            i3 += length;
                            j = j;
                        }
                        sb.append(sb2.toString());
                    }
                    long j4 = j;
                    Spanned fromHtml = Html.fromHtml(sb.toString());
                    int i4 = 0;
                    while (true) {
                        if (i4 < arrayList2.size()) {
                            str = (String) arrayList2.get(i4);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            }
                            i4++;
                        } else {
                            str = null;
                            break;
                        }
                    }
                    if (j4 != j3 && b2 < j4) {
                        if (arrayList != null) {
                            arrayList.add(new wd2(b, b2 - b, qs5.r(a(fromHtml, str))));
                        }
                    } else {
                        h12Var.accept(new wd2(b, b2 - b, qs5.r(a(fromHtml, str))));
                    }
                    s6bVar = this;
                    j2 = j3;
                    j = j4;
                } else {
                    st0.w("SubripParser", "Skipping invalid timing: ".concat(n));
                    s6bVar = this;
                }
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                h12Var.accept((wd2) obj);
            }
        }
    }

    @Override // defpackage.o8b
    public final int m() {
        return 1;
    }
}
