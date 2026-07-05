package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.mozilla.javascript.ES6Iterator;
import org.mozilla.javascript.Token;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hf2  reason: default package */
/* loaded from: classes.dex */
public final class hf2 extends DefaultHandler implements an8 {
    public static final Pattern b = Pattern.compile("(\\d+)(?:/(\\d+))?");
    public static final Pattern c = Pattern.compile("CC([1-4])=.*");
    public static final Pattern d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    public static final int[] e = {2, 1, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2};
    public static final int[] f = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};
    public final XmlPullParserFactory a;

    public hf2() {
        try {
            this.a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e2) {
            cp8.p("Couldn't create XmlPullParserFactory instance", e2);
            throw null;
        }
    }

    public static long a(ArrayList arrayList, long j, long j2, int i, long j3) {
        int i2;
        if (i >= 0) {
            i2 = i + 1;
        } else {
            String str = a2d.a;
            i2 = (int) ((((j3 - j) + j2) - 1) / j2);
        }
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(new j5a(j, j2));
            j += j2;
        }
        return j;
    }

    public static void b(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() == 2) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (xmlPullParser.getEventType() == 2) {
                    i++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i--;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0190, code lost:
        if (r13 == 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01a3, code lost:
        if (r13 < 33) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008f, code lost:
        if (r13 == 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0093, code lost:
        r10 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00cc, code lost:
        if (r13.equals("fa01") == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(org.xmlpull.v1.XmlPullParser r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hf2.c(org.xmlpull.v1.XmlPullParser, java.lang.String):int");
    }

    public static long d(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return Float.parseFloat(attributeValue) * 1000000.0f;
    }

    public static ArrayList e(XmlPullParser xmlPullParser, ArrayList arrayList, boolean z) {
        int i;
        String str;
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i2 = 1;
        if (attributeValue != null) {
            i = Integer.parseInt(attributeValue);
        } else if (z) {
            i = 1;
        } else {
            i = Integer.MIN_VALUE;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        if (attributeValue2 != null) {
            i2 = Integer.parseInt(attributeValue2);
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String str2 = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str2 = xmlPullParser.getText();
            } else {
                b(xmlPullParser);
            }
        } while (!nxe.x(xmlPullParser, "BaseURL"));
        if (str2 != null && voe.m(str2)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = str2;
            }
            return uue.C(new mi0(str2, attributeValue3, i, i2));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            mi0 mi0Var = (mi0) arrayList.get(i3);
            String x = voe.x(mi0Var.a, str2);
            if (attributeValue3 == null) {
                str = x;
            } else {
                str = attributeValue3;
            }
            if (z) {
                i = mi0Var.c;
                i2 = mi0Var.d;
                str = mi0Var.b;
            }
            arrayList2.add(new mi0(x, str, i, i2));
        }
        return arrayList2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair f(org.xmlpull.v1.XmlPullParser r14) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hf2.f(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    public static int g(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (!TextUtils.isEmpty(attributeValue)) {
            if ("audio".equals(attributeValue)) {
                return 1;
            }
            if ("video".equals(attributeValue)) {
                return 2;
            }
            if ("text".equals(attributeValue)) {
                return 3;
            }
            if ("image".equals(attributeValue)) {
                return 4;
            }
            return -1;
        }
        return -1;
    }

    public static i23 h(XmlPullParser xmlPullParser, String str) {
        String str2 = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, ES6Iterator.VALUE_PROPERTY);
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        if (attributeValue3 != null) {
            str2 = attributeValue3;
        }
        do {
            xmlPullParser.next();
        } while (!nxe.x(xmlPullParser, str));
        return new i23(attributeValue, attributeValue2, str2);
    }

    public static long i(XmlPullParser xmlPullParser, String str, long j) {
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = a2d.e.matcher(attributeValue);
        if (matcher.matches()) {
            boolean isEmpty = TextUtils.isEmpty(matcher.group(1));
            String group = matcher.group(3);
            double d7 = 0.0d;
            if (group != null) {
                d2 = Double.parseDouble(group) * 3.1556908E7d;
            } else {
                d2 = 0.0d;
            }
            String group2 = matcher.group(5);
            if (group2 != null) {
                d3 = Double.parseDouble(group2) * 2629739.0d;
            } else {
                d3 = 0.0d;
            }
            double d8 = d2 + d3;
            String group3 = matcher.group(7);
            if (group3 != null) {
                d4 = Double.parseDouble(group3) * 86400.0d;
            } else {
                d4 = 0.0d;
            }
            double d9 = d8 + d4;
            String group4 = matcher.group(10);
            if (group4 != null) {
                d5 = Double.parseDouble(group4) * 3600.0d;
            } else {
                d5 = 0.0d;
            }
            double d10 = d9 + d5;
            String group5 = matcher.group(12);
            if (group5 != null) {
                d6 = Double.parseDouble(group5) * 60.0d;
            } else {
                d6 = 0.0d;
            }
            double d11 = d10 + d6;
            String group6 = matcher.group(14);
            if (group6 != null) {
                d7 = Double.parseDouble(group6);
            }
            long j2 = (long) ((d11 + d7) * 1000.0d);
            if (!isEmpty) {
                return -j2;
            }
            return j2;
        }
        return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
    }

    public static float j(XmlPullParser xmlPullParser, float f2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = b.matcher(attributeValue);
            if (matcher.matches()) {
                int parseInt = Integer.parseInt(matcher.group(1));
                String group = matcher.group(2);
                if (!TextUtils.isEmpty(group)) {
                    return parseInt / Integer.parseInt(group);
                }
                return parseInt;
            }
        }
        return f2;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: SSATransform
        java.lang.IndexOutOfBoundsException: bitIndex < 0: -120
        	at java.base/java.util.BitSet.get(BitSet.java:626)
        	at jadx.core.dex.visitors.ssa.LiveVarAnalysis.fillBasicBlockInfo(LiveVarAnalysis.java:65)
        	at jadx.core.dex.visitors.ssa.LiveVarAnalysis.runAnalysis(LiveVarAnalysis.java:36)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:55)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:41)
        */
    public static defpackage.ff2 k(org.xmlpull.v1.XmlPullParser r156, android.net.Uri r157) {
        /*
            Method dump skipped, instructions count: 5160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hf2.k(org.xmlpull.v1.XmlPullParser, android.net.Uri):ff2");
    }

    public static zg9 m(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        long j2 = -1;
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j = Long.parseLong(split[0]);
            if (split.length == 2) {
                j2 = (Long.parseLong(split[1]) - j) + 1;
            }
        } else {
            j = 0;
        }
        return new zg9(j, j2, attributeValue);
    }

    public static int n(String str) {
        if (str != null) {
            char c2 = 65535;
            switch (str.hashCode()) {
                case -2060497896:
                    if (str.equals("subtitle")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1724546052:
                    if (str.equals("description")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1580883024:
                    if (str.equals("enhanced-audio-intelligibility")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -1574842690:
                    if (str.equals("forced_subtitle")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -1408024454:
                    if (str.equals("alternate")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -1396432756:
                    if (str.equals("forced-subtitle")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 99825:
                    if (str.equals("dub")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 3343801:
                    if (str.equals("main")) {
                        c2 = 7;
                        break;
                    }
                    break;
                case 3530173:
                    if (str.equals("sign")) {
                        c2 = '\b';
                        break;
                    }
                    break;
                case 552573414:
                    if (str.equals("caption")) {
                        c2 = '\t';
                        break;
                    }
                    break;
                case 899152809:
                    if (str.equals("commentary")) {
                        c2 = '\n';
                        break;
                    }
                    break;
                case 1629013393:
                    if (str.equals("emergency")) {
                        c2 = 11;
                        break;
                    }
                    break;
                case 1855372047:
                    if (str.equals("supplementary")) {
                        c2 = '\f';
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                case 3:
                case 5:
                    return Token.CASE;
                case 1:
                    return 512;
                case 2:
                    return 2048;
                case 4:
                    return 2;
                case 6:
                    return 16;
                case 7:
                    return 1;
                case '\b':
                    return 256;
                case '\t':
                    return 64;
                case '\n':
                    return 8;
                case 11:
                    return 32;
                case '\f':
                    return 4;
            }
        }
        return 0;
    }

    public static int o(ArrayList arrayList) {
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (kve.c("http://dashif.org/guidelines/trickmode", ((i23) arrayList.get(i2)).a)) {
                i = 16384;
            }
        }
        return i;
    }

    public static k5a p(XmlPullParser xmlPullParser, k5a k5aVar) {
        long j;
        long j2;
        long j3;
        if (k5aVar != null) {
            j = k5aVar.b;
        } else {
            j = 1;
        }
        zg9 zg9Var = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j = Long.parseLong(attributeValue);
        }
        long j4 = j;
        long j5 = 0;
        if (k5aVar != null) {
            j2 = k5aVar.c;
        } else {
            j2 = 0;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j2 = Long.parseLong(attributeValue2);
        }
        long j6 = j2;
        if (k5aVar != null) {
            j3 = k5aVar.d;
        } else {
            j3 = 0;
        }
        if (k5aVar != null) {
            j5 = k5aVar.e;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue3 != null) {
            String[] split = attributeValue3.split("-");
            j3 = Long.parseLong(split[0]);
            j5 = (Long.parseLong(split[1]) - j3) + 1;
        }
        long j7 = j5;
        long j8 = j3;
        if (k5aVar != null) {
            zg9Var = k5aVar.a;
        }
        while (true) {
            xmlPullParser.next();
            if (nxe.y(xmlPullParser, "Initialization")) {
                zg9Var = m(xmlPullParser, "sourceURL", "range");
            } else {
                b(xmlPullParser);
            }
            zg9 zg9Var2 = zg9Var;
            if (nxe.x(xmlPullParser, "SegmentBase")) {
                return new k5a(zg9Var2, j4, j6, j8, j7);
            }
            zg9Var = zg9Var2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    public static h5a q(XmlPullParser xmlPullParser, h5a h5aVar, long j, long j2, long j3, long j4, long j5) {
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11 = 1;
        if (h5aVar != null) {
            j6 = h5aVar.b;
        } else {
            j6 = 1;
        }
        ArrayList arrayList = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j6 = Long.parseLong(attributeValue);
        }
        long j12 = j6;
        if (h5aVar != null) {
            j7 = h5aVar.c;
        } else {
            j7 = 0;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j7 = Long.parseLong(attributeValue2);
        }
        long j13 = j7;
        if (h5aVar != null) {
            j8 = h5aVar.e;
        } else {
            j8 = -9223372036854775807L;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j8 = Long.parseLong(attributeValue3);
        }
        long j14 = j8;
        if (h5aVar != null) {
            j11 = h5aVar.d;
        }
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j11 = Long.parseLong(attributeValue4);
        }
        long j15 = j11;
        if (j4 == -9223372036854775807L) {
            j9 = j3;
        } else {
            j9 = j4;
        }
        if (j9 == Long.MAX_VALUE) {
            j10 = -9223372036854775807L;
        } else {
            j10 = j9;
        }
        zg9 zg9Var = null;
        ArrayList arrayList2 = null;
        do {
            xmlPullParser.next();
            if (nxe.y(xmlPullParser, "Initialization")) {
                zg9Var = m(xmlPullParser, "sourceURL", "range");
            } else if (nxe.y(xmlPullParser, "SegmentTimeline")) {
                arrayList2 = s(xmlPullParser, j12, j2);
            } else if (nxe.y(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(m(xmlPullParser, "media", "mediaRange"));
            } else {
                b(xmlPullParser);
            }
        } while (!nxe.x(xmlPullParser, "SegmentList"));
        if (h5aVar != null) {
            if (zg9Var == null) {
                zg9Var = h5aVar.a;
            }
            if (arrayList2 == null) {
                arrayList2 = h5aVar.f;
            }
            if (arrayList == null) {
                arrayList = h5aVar.j;
            }
        }
        return new h5a(zg9Var, j12, j13, j15, j14, arrayList2, j10, arrayList, a2d.Q(j5), a2d.Q(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    public static i5a r(XmlPullParser xmlPullParser, i5a i5aVar, List list, long j, long j2, long j3, long j4, long j5) {
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        yx9 yx9Var;
        yx9 yx9Var2;
        long j12 = 1;
        if (i5aVar != null) {
            j6 = i5aVar.b;
        } else {
            j6 = 1;
        }
        zg9 zg9Var = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j6 = Long.parseLong(attributeValue);
        }
        long j13 = j6;
        if (i5aVar != null) {
            j7 = i5aVar.c;
        } else {
            j7 = 0;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j7 = Long.parseLong(attributeValue2);
        }
        long j14 = j7;
        if (i5aVar != null) {
            j8 = i5aVar.e;
        } else {
            j8 = -9223372036854775807L;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j8 = Long.parseLong(attributeValue3);
        }
        long j15 = j8;
        if (i5aVar != null) {
            j12 = i5aVar.d;
        }
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j12 = Long.parseLong(attributeValue4);
        }
        long j16 = j12;
        int i = 0;
        while (true) {
            if (i < list.size()) {
                i23 i23Var = (i23) list.get(i);
                if (kve.c("http://dashif.org/guidelines/last-segment-number", i23Var.a)) {
                    j9 = Long.parseLong(i23Var.b);
                    break;
                }
                i++;
            } else {
                j9 = -1;
                break;
            }
        }
        long j17 = j9;
        if (j4 == -9223372036854775807L) {
            j10 = j3;
        } else {
            j10 = j4;
        }
        if (j10 == Long.MAX_VALUE) {
            j11 = -9223372036854775807L;
        } else {
            j11 = j10;
        }
        if (i5aVar != null) {
            yx9Var = i5aVar.k;
        } else {
            yx9Var = null;
        }
        yx9 t = t(xmlPullParser, "media", yx9Var);
        if (i5aVar != null) {
            yx9Var2 = i5aVar.j;
        } else {
            yx9Var2 = null;
        }
        yx9 t2 = t(xmlPullParser, "initialization", yx9Var2);
        ArrayList arrayList = null;
        do {
            xmlPullParser.next();
            if (nxe.y(xmlPullParser, "Initialization")) {
                zg9Var = m(xmlPullParser, "sourceURL", "range");
            } else if (nxe.y(xmlPullParser, "SegmentTimeline")) {
                arrayList = s(xmlPullParser, j13, j2);
            } else {
                b(xmlPullParser);
            }
        } while (!nxe.x(xmlPullParser, "SegmentTemplate"));
        if (i5aVar != null) {
            if (zg9Var == null) {
                zg9Var = i5aVar.a;
            }
            if (arrayList == null) {
                arrayList = i5aVar.f;
            }
        }
        return new i5a(zg9Var, j13, j14, j16, j17, j15, arrayList, j11, t2, t, a2d.Q(j5), a2d.Q(j));
    }

    public static ArrayList s(XmlPullParser xmlPullParser, long j, long j2) {
        long parseLong;
        long j3;
        ArrayList arrayList = new ArrayList();
        long j4 = 0;
        long j5 = -9223372036854775807L;
        boolean z = false;
        int i = 0;
        do {
            xmlPullParser.next();
            if (nxe.y(xmlPullParser, "S")) {
                String attributeValue = xmlPullParser.getAttributeValue(null, "t");
                if (attributeValue == null) {
                    parseLong = -9223372036854775807L;
                } else {
                    parseLong = Long.parseLong(attributeValue);
                }
                if (z) {
                    int i2 = i;
                    j3 = parseLong;
                    j4 = a(arrayList, j4, j5, i2, j3);
                } else {
                    j3 = parseLong;
                }
                if (j3 != -9223372036854775807L) {
                    j4 = j3;
                }
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "d");
                if (attributeValue2 == null) {
                    j5 = -9223372036854775807L;
                } else {
                    j5 = Long.parseLong(attributeValue2);
                }
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "r");
                if (attributeValue3 == null) {
                    i = 0;
                } else {
                    i = Integer.parseInt(attributeValue3);
                }
                z = true;
            } else {
                b(xmlPullParser);
            }
        } while (!nxe.x(xmlPullParser, "SegmentTimeline"));
        if (z) {
            String str = a2d.a;
            a(arrayList, j4, j5, i, a2d.Y(j2, j, 1000L, RoundingMode.DOWN));
        }
        return arrayList;
    }

    public static yx9 t(XmlPullParser xmlPullParser, String str, yx9 yx9Var) {
        String str2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            arrayList.add("");
            int i = 0;
            while (i < attributeValue.length()) {
                int indexOf = attributeValue.indexOf("$", i);
                char c2 = 65535;
                if (indexOf == -1) {
                    arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(i));
                    i = attributeValue.length();
                } else if (indexOf != i) {
                    arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(i, indexOf));
                    i = indexOf;
                } else if (attributeValue.startsWith("$$", i)) {
                    arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + "$");
                    i += 2;
                } else {
                    arrayList3.add("");
                    int i2 = i + 1;
                    int indexOf2 = attributeValue.indexOf("$", i2);
                    String substring = attributeValue.substring(i2, indexOf2);
                    if (substring.equals("RepresentationID")) {
                        arrayList2.add(1);
                    } else {
                        int indexOf3 = substring.indexOf("%0");
                        if (indexOf3 != -1) {
                            str2 = substring.substring(indexOf3);
                            if (!str2.endsWith("d") && !str2.endsWith("x") && !str2.endsWith("X")) {
                                str2 = str2.concat("d");
                            }
                            substring = substring.substring(0, indexOf3);
                        } else {
                            str2 = "%01d";
                        }
                        switch (substring.hashCode()) {
                            case -1950496919:
                                if (substring.equals("Number")) {
                                    c2 = 0;
                                    break;
                                }
                                break;
                            case 2606829:
                                if (substring.equals("Time")) {
                                    c2 = 1;
                                    break;
                                }
                                break;
                            case 38199441:
                                if (substring.equals("Bandwidth")) {
                                    c2 = 2;
                                    break;
                                }
                                break;
                        }
                        switch (c2) {
                            case 0:
                                arrayList2.add(2);
                                break;
                            case 1:
                                arrayList2.add(4);
                                break;
                            case 2:
                                arrayList2.add(3);
                                break;
                            default:
                                vs.m("Invalid template: ".concat(attributeValue));
                                return null;
                        }
                        arrayList3.set(arrayList2.size() - 1, str2);
                    }
                    arrayList.add("");
                    i = indexOf2 + 1;
                }
            }
            return new yx9(12, arrayList, arrayList2, arrayList3);
        }
        return yx9Var;
    }

    @Override // defpackage.an8
    public final Object l(Uri uri, lg2 lg2Var) {
        try {
            XmlPullParser newPullParser = this.a.newPullParser();
            newPullParser.setInput(lg2Var, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return k(newPullParser, uri);
            }
            throw xm8.b("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e2) {
            if (e2.getDetail() instanceof IOException) {
                throw ((IOException) e2.getDetail());
            }
            throw xm8.b(null, e2);
        }
    }
}
