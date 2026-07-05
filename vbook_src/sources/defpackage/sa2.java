package defpackage;

import android.util.Base64;
import android.util.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.mozilla.javascript.ES6Iterator;
import org.mozilla.javascript.NativeSymbol;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sa2  reason: default package */
/* loaded from: classes.dex */
public final class sa2 {
    public static final n07 a;

    static {
        f46 f46Var = new f46();
        g80 g80Var = g80.a;
        f46Var.b(qa2.class, g80Var);
        f46Var.b(xa0.class, g80Var);
        m80 m80Var = m80.a;
        f46Var.b(pa2.class, m80Var);
        f46Var.b(gb0.class, m80Var);
        j80 j80Var = j80.a;
        f46Var.b(x92.class, j80Var);
        f46Var.b(hb0.class, j80Var);
        k80 k80Var = k80.a;
        f46Var.b(w92.class, k80Var);
        f46Var.b(ib0.class, k80Var);
        c90 c90Var = c90.a;
        f46Var.b(oa2.class, c90Var);
        f46Var.b(gc0.class, c90Var);
        b90 b90Var = b90.a;
        f46Var.b(na2.class, b90Var);
        f46Var.b(fc0.class, b90Var);
        l80 l80Var = l80.a;
        f46Var.b(y92.class, l80Var);
        f46Var.b(kb0.class, l80Var);
        w80 w80Var = w80.a;
        f46Var.b(ma2.class, w80Var);
        f46Var.b(mb0.class, w80Var);
        n80 n80Var = n80.a;
        f46Var.b(ga2.class, n80Var);
        f46Var.b(nb0.class, n80Var);
        p80 p80Var = p80.a;
        f46Var.b(ea2.class, p80Var);
        f46Var.b(ob0.class, p80Var);
        s80 s80Var = s80.a;
        f46Var.b(da2.class, s80Var);
        f46Var.b(sb0.class, s80Var);
        t80 t80Var = t80.a;
        f46Var.b(ca2.class, t80Var);
        f46Var.b(ub0.class, t80Var);
        q80 q80Var = q80.a;
        f46Var.b(aa2.class, q80Var);
        f46Var.b(qb0.class, q80Var);
        e80 e80Var = e80.a;
        f46Var.b(s92.class, e80Var);
        f46Var.b(ab0.class, e80Var);
        d80 d80Var = d80.a;
        f46Var.b(r92.class, d80Var);
        f46Var.b(bb0.class, d80Var);
        r80 r80Var = r80.a;
        f46Var.b(ba2.class, r80Var);
        f46Var.b(rb0.class, r80Var);
        o80 o80Var = o80.a;
        f46Var.b(z92.class, o80Var);
        f46Var.b(pb0.class, o80Var);
        f80 f80Var = f80.a;
        f46Var.b(t92.class, f80Var);
        f46Var.b(cb0.class, f80Var);
        u80 u80Var = u80.a;
        f46Var.b(fa2.class, u80Var);
        f46Var.b(wb0.class, u80Var);
        v80 v80Var = v80.a;
        f46Var.b(ha2.class, v80Var);
        f46Var.b(yb0.class, v80Var);
        x80 x80Var = x80.a;
        f46Var.b(ia2.class, x80Var);
        f46Var.b(zb0.class, x80Var);
        a90 a90Var = a90.a;
        f46Var.b(la2.class, a90Var);
        f46Var.b(dc0.class, a90Var);
        y80 y80Var = y80.a;
        f46Var.b(ka2.class, y80Var);
        f46Var.b(bc0.class, y80Var);
        z80 z80Var = z80.a;
        f46Var.b(ja2.class, z80Var);
        f46Var.b(cc0.class, z80Var);
        h80 h80Var = h80.a;
        f46Var.b(v92.class, h80Var);
        f46Var.b(db0.class, h80Var);
        i80 i80Var = i80.a;
        f46Var.b(u92.class, i80Var);
        f46Var.b(eb0.class, i80Var);
        f46Var.d = true;
        a = new n07(f46Var, 20);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [tb0, java.lang.Object] */
    public static ub0 a(JsonReader jsonReader) {
        ?? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals("offset")) {
                        c = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals(NativeSymbol.TYPE_NAME)) {
                        c = 1;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals("file")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    obj.d = jsonReader.nextLong();
                    obj.f = (byte) (obj.f | 2);
                    break;
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        obj.b = nextString;
                        break;
                    } else {
                        xk5.k("Null symbol");
                        return null;
                    }
                case 2:
                    obj.a = jsonReader.nextLong();
                    obj.f = (byte) (obj.f | 1);
                    break;
                case 3:
                    obj.c = jsonReader.nextString();
                    break;
                case 4:
                    obj.e = jsonReader.nextInt();
                    obj.f = (byte) (obj.f | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return obj.a();
    }

    public static cb0 b(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (!nextName.equals("key")) {
                if (!nextName.equals(ES6Iterator.VALUE_PROPERTY)) {
                    jsonReader.skipValue();
                } else {
                    str2 = jsonReader.nextString();
                    if (str2 == null) {
                        xk5.k("Null value");
                        return null;
                    }
                }
            } else {
                str = jsonReader.nextString();
                if (str == null) {
                    xk5.k("Null key");
                    return null;
                }
            }
        }
        jsonReader.endObject();
        if (str != null && str2 != null) {
            return new cb0(str, str2);
        }
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            sb.append(" key");
        }
        if (str2 == null) {
            sb.append(" value");
        }
        vs.k(s21.o("Missing required properties:", sb));
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [za0, java.lang.Object] */
    public static ab0 c(JsonReader jsonReader) {
        ?? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1516200806:
                    if (nextName.equals("buildIdMappingForArch")) {
                        c = 0;
                        break;
                    }
                    break;
                case 110987:
                    if (nextName.equals("pid")) {
                        c = 1;
                        break;
                    }
                    break;
                case 111312:
                    if (nextName.equals("pss")) {
                        c = 2;
                        break;
                    }
                    break;
                case 113234:
                    if (nextName.equals("rss")) {
                        c = 3;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c = 4;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c = 5;
                        break;
                    }
                    break;
                case 722137681:
                    if (nextName.equals("reasonCode")) {
                        c = 6;
                        break;
                    }
                    break;
                case 723857505:
                    if (nextName.equals("traceFile")) {
                        c = 7;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = '\b';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    obj.i = d(jsonReader, new vm1(10));
                    break;
                case 1:
                    obj.a = jsonReader.nextInt();
                    obj.j = (byte) (obj.j | 1);
                    break;
                case 2:
                    obj.e = jsonReader.nextLong();
                    obj.j = (byte) (obj.j | 8);
                    break;
                case 3:
                    obj.f = jsonReader.nextLong();
                    obj.j = (byte) (obj.j | 16);
                    break;
                case 4:
                    obj.g = jsonReader.nextLong();
                    obj.j = (byte) (obj.j | 32);
                    break;
                case 5:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        obj.b = nextString;
                        break;
                    } else {
                        xk5.k("Null processName");
                        return null;
                    }
                case 6:
                    obj.c = jsonReader.nextInt();
                    obj.j = (byte) (obj.j | 2);
                    break;
                case 7:
                    obj.h = jsonReader.nextString();
                    break;
                case '\b':
                    obj.d = jsonReader.nextInt();
                    obj.j = (byte) (obj.j | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return obj.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x023e, code lost:
        r2 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0243, code lost:
        if (r3 != null) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0245, code lost:
        r2.append(" rolloutId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x024a, code lost:
        if (r4 != null) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x024c, code lost:
        r2.append(" variantId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0251, code lost:
        defpackage.vs.k(defpackage.s21.o("Missing required properties:", r2));
     */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, ac0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List d(android.util.JsonReader r22, defpackage.vm1 r23) {
        /*
            Method dump skipped, instructions count: 1058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sa2.d(android.util.JsonReader, vm1):java.util.List");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0295, code lost:
        if (r5 != null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0297, code lost:
        r0.append(" name");
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x029c, code lost:
        if (r6 != null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x029e, code lost:
        r0.append(" code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x02a5, code lost:
        if ((r4 & 1) != 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x02a7, code lost:
        r0.append(" address");
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x02ac, code lost:
        defpackage.vs.k(defpackage.s21.o("Missing required properties:", r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x02b3, code lost:
        return r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x02e3, code lost:
        r0 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x02e8, code lost:
        if (r25 != 0) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x02ea, code lost:
        r0.append(" signal");
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x02ef, code lost:
        if (r26 != null) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x02f1, code lost:
        r0.append(" binaries");
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x02f6, code lost:
        defpackage.vs.k(defpackage.s21.o("Missing required properties:", r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x02fd, code lost:
        return r19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, lb0] */
    /* JADX WARN: Type inference failed for: r2v15, types: [xb0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.mb0 e(android.util.JsonReader r29) {
        /*
            Method dump skipped, instructions count: 1336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sa2.e(android.util.JsonReader):mb0");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
        if (r3.equals("reason") == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.qb0 f(android.util.JsonReader r12) {
        /*
            r12.beginObject()
            r0 = 0
            r1 = 0
            r2 = r0
            r8 = r2
            r4 = r1
            r5 = r4
            r6 = r5
            r7 = r6
        Lb:
            boolean r3 = r12.hasNext()
            r9 = 1
            if (r3 == 0) goto L91
            java.lang.String r3 = r12.nextName()
            r3.getClass()
            int r10 = r3.hashCode()
            r11 = -1
            switch(r10) {
                case -1266514778: goto L4d;
                case -934964668: goto L44;
                case 3575610: goto L39;
                case 91997906: goto L2e;
                case 581754413: goto L23;
                default: goto L21;
            }
        L21:
            r9 = r11
            goto L57
        L23:
            java.lang.String r9 = "overflowCount"
            boolean r3 = r3.equals(r9)
            if (r3 != 0) goto L2c
            goto L21
        L2c:
            r9 = 4
            goto L57
        L2e:
            java.lang.String r9 = "causedBy"
            boolean r3 = r3.equals(r9)
            if (r3 != 0) goto L37
            goto L21
        L37:
            r9 = 3
            goto L57
        L39:
            java.lang.String r9 = "type"
            boolean r3 = r3.equals(r9)
            if (r3 != 0) goto L42
            goto L21
        L42:
            r9 = 2
            goto L57
        L44:
            java.lang.String r10 = "reason"
            boolean r3 = r3.equals(r10)
            if (r3 != 0) goto L57
            goto L21
        L4d:
            java.lang.String r9 = "frames"
            boolean r3 = r3.equals(r9)
            if (r3 != 0) goto L56
            goto L21
        L56:
            r9 = r0
        L57:
            switch(r9) {
                case 0: goto L7d;
                case 1: goto L78;
                case 2: goto L6b;
                case 3: goto L66;
                case 4: goto L5e;
                default: goto L5a;
            }
        L5a:
            r12.skipValue()
            goto Lb
        L5e:
            int r8 = r12.nextInt()
            r2 = r2 | 1
            byte r2 = (byte) r2
            goto Lb
        L66:
            qb0 r7 = f(r12)
            goto Lb
        L6b:
            java.lang.String r4 = r12.nextString()
            if (r4 == 0) goto L72
            goto Lb
        L72:
            java.lang.String r12 = "Null type"
            defpackage.xk5.k(r12)
            return r1
        L78:
            java.lang.String r5 = r12.nextString()
            goto Lb
        L7d:
            vm1 r3 = new vm1
            r6 = 15
            r3.<init>(r6)
            java.util.List r6 = d(r12, r3)
            if (r6 == 0) goto L8b
            goto Lb
        L8b:
            java.lang.String r12 = "Null frames"
            defpackage.xk5.k(r12)
            return r1
        L91:
            r12.endObject()
            if (r2 != r9) goto La1
            if (r4 == 0) goto La1
            if (r6 != 0) goto L9b
            goto La1
        L9b:
            qb0 r3 = new qb0
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        La1:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            if (r4 != 0) goto Lad
            java.lang.String r0 = " type"
            r12.append(r0)
        Lad:
            if (r6 != 0) goto Lb4
            java.lang.String r0 = " frames"
            r12.append(r0)
        Lb4:
            r0 = r2 & 1
            if (r0 != 0) goto Lbd
            java.lang.String r0 = " overflowCount"
            r12.append(r0)
        Lbd:
            java.lang.String r0 = "Missing required properties:"
            java.lang.String r12 = defpackage.s21.o(r0, r12)
            defpackage.vs.k(r12)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sa2.f(android.util.JsonReader):qb0");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [vb0, java.lang.Object] */
    public static wb0 g(JsonReader jsonReader) {
        ?? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 110987:
                    if (nextName.equals("pid")) {
                        c = 0;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1694598382:
                    if (nextName.equals("defaultProcess")) {
                        c = 2;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    obj.b = jsonReader.nextInt();
                    obj.e = (byte) (obj.e | 1);
                    break;
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        obj.a = nextString;
                        break;
                    } else {
                        xk5.k("Null processName");
                        return null;
                    }
                case 2:
                    obj.d = jsonReader.nextBoolean();
                    obj.e = (byte) (obj.e | 4);
                    break;
                case 3:
                    obj.c = jsonReader.nextInt();
                    obj.e = (byte) (obj.e | 2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return obj.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r0v1, types: [wa0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v40, types: [fb0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v52, types: [jb0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v56, types: [ec0, java.lang.Object] */
    public static xa0 h(JsonReader jsonReader) {
        char c;
        char c2;
        char c3;
        boolean z;
        char c4;
        Charset charset = qa2.a;
        ?? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1907185581:
                    if (nextName.equals("appQualitySessionId")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -401988390:
                    if (nextName.equals("firebaseAuthenticationToken")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 1047652060:
                    if (nextName.equals("firebaseInstallationId")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    jsonReader.beginObject();
                    List list = null;
                    String str = null;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        if (!nextName2.equals("files")) {
                            if (!nextName2.equals("orgId")) {
                                jsonReader.skipValue();
                            } else {
                                str = jsonReader.nextString();
                            }
                        } else {
                            list = d(jsonReader, new vm1(11));
                            if (list == null) {
                                xk5.k("Null files");
                                return null;
                            }
                        }
                    }
                    jsonReader.endObject();
                    if (list != null) {
                        obj.k = new db0(list, str);
                        continue;
                    } else {
                        vs.k("Missing required properties: files");
                        return null;
                    }
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        obj.a = nextString;
                        break;
                    } else {
                        xk5.k("Null sdkVersion");
                        return null;
                    }
                case 2:
                    obj.g = jsonReader.nextString();
                    break;
                case 3:
                    obj.l = c(jsonReader);
                    break;
                case 4:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 != null) {
                        obj.h = nextString2;
                        break;
                    } else {
                        xk5.k("Null buildVersion");
                        return null;
                    }
                case 5:
                    obj.f = jsonReader.nextString();
                    break;
                case 6:
                    String nextString3 = jsonReader.nextString();
                    if (nextString3 != null) {
                        obj.b = nextString3;
                        break;
                    } else {
                        xk5.k("Null gmpAppId");
                        return null;
                    }
                case 7:
                    String nextString4 = jsonReader.nextString();
                    if (nextString4 != null) {
                        obj.d = nextString4;
                        break;
                    } else {
                        xk5.k("Null installationUuid");
                        return null;
                    }
                case '\b':
                    obj.e = jsonReader.nextString();
                    break;
                case '\t':
                    obj.c = jsonReader.nextInt();
                    obj.m = (byte) (obj.m | 1);
                    break;
                case '\n':
                    String nextString5 = jsonReader.nextString();
                    if (nextString5 != null) {
                        obj.i = nextString5;
                        break;
                    } else {
                        xk5.k("Null displayVersion");
                        return null;
                    }
                case 11:
                    ?? obj2 = new Object();
                    obj2.f = false;
                    obj2.m = (byte) (obj2.m | 2);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        switch (nextName3.hashCode()) {
                            case -2128794476:
                                if (nextName3.equals("startedAt")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1907185581:
                                if (nextName3.equals("appQualitySessionId")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1618432855:
                                if (nextName3.equals("identifier")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1606742899:
                                if (nextName3.equals("endedAt")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1335157162:
                                if (nextName3.equals("device")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1291329255:
                                if (nextName3.equals("events")) {
                                    c2 = 5;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3556:
                                if (nextName3.equals("os")) {
                                    c2 = 6;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 96801:
                                if (nextName3.equals("app")) {
                                    c2 = 7;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3599307:
                                if (nextName3.equals("user")) {
                                    c2 = '\b';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 286956243:
                                if (nextName3.equals("generator")) {
                                    c2 = '\t';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1025385094:
                                if (nextName3.equals("crashed")) {
                                    c2 = '\n';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2047016109:
                                if (nextName3.equals("generatorType")) {
                                    c2 = 11;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                            case 0:
                                obj2.d = jsonReader.nextLong();
                                obj2.m = (byte) (obj2.m | 1);
                                break;
                            case 1:
                                obj2.c = jsonReader.nextString();
                                break;
                            case 2:
                                obj2.b = new String(Base64.decode(jsonReader.nextString(), 2), qa2.a);
                                break;
                            case 3:
                                obj2.e = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 4:
                                ?? obj3 = new Object();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName4 = jsonReader.nextName();
                                    nextName4.getClass();
                                    switch (nextName4.hashCode()) {
                                        case -1981332476:
                                            if (nextName4.equals("simulator")) {
                                                c3 = 0;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case -1969347631:
                                            if (nextName4.equals("manufacturer")) {
                                                c3 = 1;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 112670:
                                            if (nextName4.equals("ram")) {
                                                c3 = 2;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 3002454:
                                            if (nextName4.equals("arch")) {
                                                c3 = 3;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 81784169:
                                            if (nextName4.equals("diskSpace")) {
                                                c3 = 4;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 94848180:
                                            if (nextName4.equals("cores")) {
                                                c3 = 5;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 104069929:
                                            if (nextName4.equals("model")) {
                                                c3 = 6;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 109757585:
                                            if (nextName4.equals("state")) {
                                                c3 = 7;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 2078953423:
                                            if (nextName4.equals("modelClass")) {
                                                c3 = '\b';
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        default:
                                            c3 = 65535;
                                            break;
                                    }
                                    switch (c3) {
                                        case 0:
                                            obj3.f = jsonReader.nextBoolean();
                                            obj3.j = (byte) (obj3.j | 16);
                                            break;
                                        case 1:
                                            String nextString6 = jsonReader.nextString();
                                            if (nextString6 != null) {
                                                obj3.h = nextString6;
                                                break;
                                            } else {
                                                xk5.k("Null manufacturer");
                                                return null;
                                            }
                                        case 2:
                                            obj3.d = jsonReader.nextLong();
                                            obj3.j = (byte) (obj3.j | 4);
                                            break;
                                        case 3:
                                            obj3.a = jsonReader.nextInt();
                                            obj3.j = (byte) (obj3.j | 1);
                                            break;
                                        case 4:
                                            obj3.e = jsonReader.nextLong();
                                            obj3.j = (byte) (obj3.j | 8);
                                            break;
                                        case 5:
                                            obj3.c = jsonReader.nextInt();
                                            obj3.j = (byte) (obj3.j | 2);
                                            break;
                                        case 6:
                                            String nextString7 = jsonReader.nextString();
                                            if (nextString7 != null) {
                                                obj3.b = nextString7;
                                                break;
                                            } else {
                                                xk5.k("Null model");
                                                return null;
                                            }
                                        case 7:
                                            obj3.g = jsonReader.nextInt();
                                            obj3.j = (byte) (obj3.j | 32);
                                            break;
                                        case '\b':
                                            String nextString8 = jsonReader.nextString();
                                            if (nextString8 != null) {
                                                obj3.i = nextString8;
                                                break;
                                            } else {
                                                xk5.k("Null modelClass");
                                                return null;
                                            }
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                obj2.j = obj3.a();
                                break;
                            case 5:
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(e(jsonReader));
                                }
                                jsonReader.endArray();
                                obj2.k = Collections.unmodifiableList(arrayList);
                                break;
                            case 6:
                                ?? obj4 = new Object();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    switch (nextName5.hashCode()) {
                                        case -911706486:
                                            if (nextName5.equals("buildVersion")) {
                                                z = false;
                                                break;
                                            }
                                            z = true;
                                            break;
                                        case -293026577:
                                            if (nextName5.equals("jailbroken")) {
                                                z = true;
                                                break;
                                            }
                                            z = true;
                                            break;
                                        case 351608024:
                                            if (nextName5.equals("version")) {
                                                z = true;
                                                break;
                                            }
                                            z = true;
                                            break;
                                        case 1874684019:
                                            if (nextName5.equals("platform")) {
                                                z = true;
                                                break;
                                            }
                                            z = true;
                                            break;
                                        default:
                                            z = true;
                                            break;
                                    }
                                    switch (z) {
                                        case false:
                                            String nextString9 = jsonReader.nextString();
                                            if (nextString9 != null) {
                                                obj4.c = nextString9;
                                                break;
                                            } else {
                                                xk5.k("Null buildVersion");
                                                return null;
                                            }
                                        case true:
                                            obj4.d = jsonReader.nextBoolean();
                                            obj4.e = (byte) (obj4.e | 2);
                                            break;
                                        case true:
                                            String nextString10 = jsonReader.nextString();
                                            if (nextString10 != null) {
                                                obj4.b = nextString10;
                                                break;
                                            } else {
                                                xk5.k("Null version");
                                                return null;
                                            }
                                        case true:
                                            obj4.a = jsonReader.nextInt();
                                            obj4.e = (byte) (obj4.e | 1);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                obj2.i = obj4.a();
                                break;
                            case 7:
                                jsonReader.beginObject();
                                String str2 = null;
                                String str3 = null;
                                String str4 = null;
                                String str5 = null;
                                String str6 = null;
                                String str7 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName6 = jsonReader.nextName();
                                    nextName6.getClass();
                                    switch (nextName6.hashCode()) {
                                        case -1618432855:
                                            if (nextName6.equals("identifier")) {
                                                c4 = 0;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -519438642:
                                            if (nextName6.equals("developmentPlatform")) {
                                                c4 = 1;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 213652010:
                                            if (nextName6.equals("developmentPlatformVersion")) {
                                                c4 = 2;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 351608024:
                                            if (nextName6.equals("version")) {
                                                c4 = 3;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 719853845:
                                            if (nextName6.equals("installationUuid")) {
                                                c4 = 4;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 1975623094:
                                            if (nextName6.equals("displayVersion")) {
                                                c4 = 5;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        default:
                                            c4 = 65535;
                                            break;
                                    }
                                    switch (c4) {
                                        case 0:
                                            str7 = jsonReader.nextString();
                                            if (str7 == null) {
                                                xk5.k("Null identifier");
                                                return null;
                                            }
                                            break;
                                        case 1:
                                            str5 = jsonReader.nextString();
                                            break;
                                        case 2:
                                            str6 = jsonReader.nextString();
                                            break;
                                        case 3:
                                            str2 = jsonReader.nextString();
                                            if (str2 == null) {
                                                xk5.k("Null version");
                                                return null;
                                            }
                                            break;
                                        case 4:
                                            str4 = jsonReader.nextString();
                                            break;
                                        case 5:
                                            str3 = jsonReader.nextString();
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                if (str7 != null && str2 != null) {
                                    obj2.g = new hb0(str7, str2, str3, str4, str5, str6);
                                    break;
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    if (str7 == null) {
                                        sb.append(" identifier");
                                    }
                                    if (str2 == null) {
                                        sb.append(" version");
                                    }
                                    vs.k(s21.o("Missing required properties:", sb));
                                    return null;
                                }
                                break;
                            case '\b':
                                jsonReader.beginObject();
                                String str8 = null;
                                while (jsonReader.hasNext()) {
                                    if (jsonReader.nextName().equals("identifier")) {
                                        str8 = jsonReader.nextString();
                                        if (str8 == null) {
                                            xk5.k("Null identifier");
                                            return null;
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                if (str8 != null) {
                                    obj2.h = new gc0(str8);
                                    break;
                                } else {
                                    vs.k("Missing required properties: identifier");
                                    return null;
                                }
                            case '\t':
                                String nextString11 = jsonReader.nextString();
                                if (nextString11 != null) {
                                    obj2.a = nextString11;
                                    break;
                                } else {
                                    xk5.k("Null generator");
                                    return null;
                                }
                            case '\n':
                                obj2.f = jsonReader.nextBoolean();
                                obj2.m = (byte) (obj2.m | 2);
                                break;
                            case 11:
                                obj2.l = jsonReader.nextInt();
                                obj2.m = (byte) (obj2.m | 4);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    obj.j = obj2.a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return obj.a();
    }

    public static xa0 i(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            xa0 h = h(jsonReader);
            jsonReader.close();
            return h;
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }
}
