package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i53  reason: default package */
/* loaded from: classes3.dex */
public final class i53 extends rmc {
    public final String R;
    public final String S;
    public final n64 T;
    public final wl6 U;
    public final g33 V;
    public final yf3 W;
    public final klc X;
    public final cza Y;
    public final s02 Z;
    public List a0;
    public final HashMap b0;
    public final ArrayList c0;
    public final HashMap d0;
    public final cza e0;
    public boolean f0;
    public w26 g0;
    public boolean h0;

    public i53(String str, String str2, n64 n64Var, wl6 wl6Var, g33 g33Var, yf3 yf3Var, klc klcVar) {
        super(klcVar);
        this.R = str;
        this.S = str2;
        this.T = n64Var;
        this.U = wl6Var;
        this.V = g33Var;
        this.W = yf3Var;
        this.X = klcVar;
        this.Y = dza.a(new v43(true, null, null, null, 0, false, false, "", null, false, "", false, false));
        this.Z = new s02();
        this.a0 = ks3.a;
        this.b0 = new HashMap();
        this.c0 = new ArrayList();
        this.d0 = new HashMap();
        this.e0 = dza.a(null);
        I();
        hk1 a = jdd.a(this);
        sw2 sw2Var = ab3.a;
        ru2 ru2Var = ru2.c;
        f(a, ru2Var, new oi(this, (m42) null, 21));
        f(jdd.a(this), ru2Var, new of(this, (m42) null, 3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0280, code lost:
        if (r6 == null) goto L179;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x043c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x025c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object D(defpackage.i53 r77, java.lang.Integer r78, java.lang.Boolean r79, java.lang.Boolean r80, java.util.List r81, defpackage.n42 r82) {
        /*
            Method dump skipped, instructions count: 1085
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i53.D(i53, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.util.List, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
        if (r1 == r10) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object E(defpackage.i53 r18, defpackage.n42 r19) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i53.E(i53, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0394 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0234  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F(defpackage.i53 r36, defpackage.n42 r37) {
        /*
            Method dump skipped, instructions count: 940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i53.F(i53, n42):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Type inference failed for: r39v0, types: [i53, rmc] */
    /* JADX WARN: Type inference failed for: r40v2, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object G(defpackage.i53 r39, defpackage.n42 r40) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i53.G(i53, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0088, code lost:
        if (r1 == false) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Type inference failed for: r21v0, types: [i53, rmc] */
    /* JADX WARN: Type inference failed for: r7v6, types: [bw7] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0060 -> B:12:0x0030). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object H(defpackage.i53 r21, defpackage.n42 r22) {
        /*
            r0 = r21
            r1 = r22
            boolean r2 = r1 instanceof defpackage.h53
            if (r2 == 0) goto L17
            r2 = r1
            h53 r2 = (defpackage.h53) r2
            int r3 = r2.C
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.C = r3
            goto L1c
        L17:
            h53 r2 = new h53
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.e
            int r3 = r2.C
            r4 = 1
            if (r3 == 0) goto L3f
            if (r3 != r4) goto L38
            v43 r3 = r2.d
            java.util.HashMap r5 = r2.c
            java.lang.Object r6 = r2.b
            bw7 r7 = r2.a
            defpackage.hre.r(r1)
        L30:
            r20 = r5
            r5 = r3
            r3 = r20
            r20 = r7
            goto L63
        L38:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r0)
            r0 = 0
            return r0
        L3f:
            defpackage.hre.r(r1)
            cza r1 = r0.Y
            if (r1 == 0) goto L8a
            r7 = r1
        L47:
            java.lang.Object r6 = r7.getValue()
            r3 = r6
            v43 r3 = (defpackage.v43) r3
            java.util.HashMap r5 = r0.d0
            r2.a = r7
            r2.b = r6
            r2.c = r5
            r2.d = r3
            r2.C = r4
            java.lang.Object r1 = r0.r(r2)
            n82 r8 = defpackage.n82.a
            if (r1 != r8) goto L30
            return r8
        L63:
            java.lang.Object r1 = r3.get(r1)
            r14 = r1
            k23 r14 = (defpackage.k23) r14
            r18 = 0
            r19 = 7935(0x1eff, float:1.112E-41)
            r1 = r6
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            v43 r3 = defpackage.v43.a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r7 = r20
            cza r7 = (defpackage.cza) r7
            boolean r1 = r7.l(r1, r3)
            if (r1 == 0) goto L47
        L8a:
            pvc r0 = defpackage.pvc.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i53.H(i53, n42):java.lang.Object");
    }

    public final void I() {
        hk1 a = jdd.a(this);
        sw2 sw2Var = ab3.a;
        f(a, ru2.c, new a53(this, (m42) null));
    }

    @Override // defpackage.rmc
    public final void y() {
        hk1 a = jdd.a(this);
        sw2 sw2Var = ab3.a;
        f(a, ru2.c, new d53(this, null, 0));
    }
}
