package defpackage;

import com.reader.piper.PiperNcnn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v  reason: default package */
/* loaded from: classes3.dex */
public final class v implements xyb {
    public static final b45 v = new b45(c4b.a, xy5.a, 1);
    public final ii2 a;
    public final m41 b;
    public final mfb c;
    public gw8 d;
    public String e;
    public int f;
    public double g;
    public bp9 h;
    public List i;
    public int j;
    public long k;
    public String l;
    public List m;
    public int n;
    public boolean o;
    public boolean p;
    public int q;
    public final k97 r;
    public iya s;
    public final sw7 t;
    public final mu9 u;

    public v(ii2 ii2Var) {
        this.a = ii2Var;
        sw2 sw2Var = ab3.a;
        this.b = k27.a(zz6.a.f);
        this.c = new mfb(new i(0));
        this.e = "";
        this.g = 1.0d;
        hq7 hq7Var = wl3.b;
        this.k = 0L;
        this.l = "";
        this.n = -1;
        this.o = true;
        this.r = new k97(10);
        this.t = new sw7();
        this.u = new mu9(this);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(5:(2:3|(9:5|6|7|8|(1:(1:(1:(6:13|14|15|(1:17)(1:21)|18|19)(2:22|23))(4:24|25|26|(3:28|18|19)(3:29|(5:32|15|(0)(0)|18|19)|31)))(1:33))(1:43)|34|35|(3:37|26|(0)(0))|31))|34|35|(0)|31)|47|6|7|8|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
        r12 = r0;
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
        if (r14.o(r7) == r10) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0079 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:15:0x0031, B:39:0x0097, B:41:0x009c, B:42:0x009f, B:22:0x0044, B:32:0x0075, B:34:0x0079, B:35:0x007c), top: B:49:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007c A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:15:0x0031, B:39:0x0097, B:41:0x009c, B:42:0x009f, B:22:0x0044, B:32:0x0075, B:34:0x0079, B:35:0x007c), top: B:49:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009c A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:15:0x0031, B:39:0x0097, B:41:0x009c, B:42:0x009f, B:22:0x0044, B:32:0x0075, B:34:0x0079, B:35:0x007c), top: B:49:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:15:0x0031, B:39:0x0097, B:41:0x009c, B:42:0x009f, B:22:0x0044, B:32:0x0075, B:34:0x0079, B:35:0x007c), top: B:49:0x0025 }] */
    /* JADX WARN: Type inference failed for: r12v0, types: [v] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v1, types: [qw7] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v8, types: [qw7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable A(defpackage.v r12, java.lang.String r13, defpackage.n42 r14) {
        /*
            boolean r0 = r14 instanceof defpackage.m
            if (r0 == 0) goto L14
            r0 = r14
            m r0 = (defpackage.m) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            m r0 = new m
            r0.<init>(r12, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r7.d
            int r0 = r7.f
            r8 = 0
            r1 = 3
            r2 = 2
            r3 = 1
            r9 = 0
            n82 r10 = defpackage.n82.a
            if (r0 == 0) goto L52
            if (r0 == r3) goto L48
            if (r0 == r2) goto L40
            if (r0 != r1) goto L3a
            gw8 r12 = r7.c
            qw7 r13 = r7.b
            defpackage.hre.r(r14)     // Catch: java.lang.Throwable -> L36
            goto L97
        L36:
            r0 = move-exception
            r12 = r0
            goto Lac
        L3a:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r12)
            return r9
        L40:
            qw7 r13 = r7.b
            java.lang.String r0 = r7.a
            defpackage.hre.r(r14)     // Catch: java.lang.Throwable -> L36
            goto L75
        L48:
            qw7 r13 = r7.b
            java.lang.String r0 = r7.a
            defpackage.hre.r(r14)
            r14 = r13
            r13 = r0
            goto L64
        L52:
            defpackage.hre.r(r14)
            sw7 r14 = r12.t
            r7.a = r13
            r7.b = r14
            r7.f = r3
            java.lang.Object r0 = r14.o(r7)
            if (r0 != r10) goto L64
            goto L95
        L64:
            r7.a = r13     // Catch: java.lang.Throwable -> La9
            r7.b = r14     // Catch: java.lang.Throwable -> La9
            r7.f = r2     // Catch: java.lang.Throwable -> La9
            java.lang.Object r0 = r12.G(r7)     // Catch: java.lang.Throwable -> La9
            if (r0 != r10) goto L71
            goto L95
        L71:
            r11 = r0
            r0 = r13
            r13 = r14
            r14 = r11
        L75:
            gw8 r14 = (defpackage.gw8) r14     // Catch: java.lang.Throwable -> L36
            if (r14 != 0) goto L7c
            byte[] r12 = new byte[r8]     // Catch: java.lang.Throwable -> L36
            goto La5
        L7c:
            java.lang.String r2 = H(r0)     // Catch: java.lang.Throwable -> L36
            int r3 = r12.f     // Catch: java.lang.Throwable -> L36
            double r4 = r12.g     // Catch: java.lang.Throwable -> L36
            boolean r6 = r12.o     // Catch: java.lang.Throwable -> L36
            r7.a = r9     // Catch: java.lang.Throwable -> L36
            r7.b = r13     // Catch: java.lang.Throwable -> L36
            r7.c = r14     // Catch: java.lang.Throwable -> L36
            r7.f = r1     // Catch: java.lang.Throwable -> L36
            r1 = r14
            java.lang.Object r14 = r1.c(r2, r3, r4, r6, r7)     // Catch: java.lang.Throwable -> L36
            if (r14 != r10) goto L96
        L95:
            return r10
        L96:
            r12 = r1
        L97:
            short[] r14 = (short[]) r14     // Catch: java.lang.Throwable -> L36
            int r0 = r14.length     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L9f
            byte[] r12 = new byte[r8]     // Catch: java.lang.Throwable -> L36
            goto La5
        L9f:
            int r12 = r12.e     // Catch: java.lang.Throwable -> L36
            byte[] r12 = defpackage.zj1.b(r14, r12)     // Catch: java.lang.Throwable -> L36
        La5:
            r13.q(r9)
            return r12
        La9:
            r0 = move-exception
            r12 = r0
            r13 = r14
        Lac:
            r13.q(r9)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v.A(v, java.lang.String, n42):java.io.Serializable");
    }

    public static final Object B(v vVar, String str, u uVar) {
        byte[] bArr;
        k97 k97Var = vVar.r;
        k97Var.getClass();
        Object h = k97Var.a.h(str);
        j jVar = h;
        if (h == null) {
            j jVar2 = new j();
            vVar.D(jVar2, str);
            k97Var.a(str, jVar2);
            jVar = jVar2;
        }
        j jVar3 = jVar;
        cza czaVar = jVar3.a;
        if (jVar3.b && ((bArr = (byte[]) czaVar.getValue()) == null || bArr.length == 0)) {
            vVar.D(jVar3, str);
        }
        return z1d.C(new mx(czaVar, 4), uVar);
    }

    public static void C(StringBuilder sb) {
        if (sb.length() == 0 || k4b.k0(sb) == ' ') {
            return;
        }
        sb.append(' ');
    }

    public static String H(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            switch (charAt) {
                case Token.GETPROP /* 33 */:
                case Token.INSTANCEOF /* 58 */:
                case Token.LOCAL_LOAD /* 59 */:
                case Token.ENUM_INIT_KEYS /* 63 */:
                case 8230:
                case 12290:
                case 65281:
                case 65306:
                case 65307:
                case 65311:
                    break;
                case Token.GETPROPNOWARN /* 34 */:
                case Token.GETELEM /* 39 */:
                case 8216:
                case 8217:
                case 8220:
                case 8221:
                case 12300:
                case 12301:
                case 12302:
                case 12303:
                case Token.GETELEM_SUPER /* 40 */:
                case Token.SETELEM /* 41 */:
                case Token.SEMI /* 91 */:
                case Token.RB /* 93 */:
                case Token.EXPORT /* 123 */:
                case Token.IF /* 125 */:
                case 8211:
                case 8212:
                case 12304:
                case 12305:
                case 12308:
                case 12309:
                case 65288:
                case 65289:
                    C(sb);
                    continue;
                case Token.NUMBER /* 45 */:
                    Character c0 = k4b.c0(i - 1, str);
                    Character c02 = k4b.c0(i + 1, str);
                    if (c0 != null && c02 != null && Character.isLetterOrDigit(c0.charValue()) && Character.isLetterOrDigit(c02.charValue())) {
                        sb.append('-');
                        continue;
                    } else {
                        C(sb);
                    }
                case 12289:
                case 65292:
                    sb.append(',');
                    continue;
                default:
                    if (nqe.y(charAt)) {
                        C(sb);
                        continue;
                    } else {
                        sb.append(Character.toLowerCase(charAt));
                    }
            }
            while (sb.length() > 0 && k4b.k0(sb) == ' ') {
                sb.deleteCharAt(sb.length() - 1).getClass();
            }
            if (sb.length() <= 0 || k4b.k0(sb) != '.') {
                sb.append('.');
            }
        }
        while (sb.length() > 0 && k4b.k0(sb) == ' ') {
            sb.deleteCharAt(sb.length() - 1).getClass();
        }
        return sb.toString();
    }

    public static final void z(v vVar) {
        List list;
        if (!vVar.p && (list = vVar.i) != null) {
            if (vVar.j < list.size() - 1) {
                int i = vVar.j + 1;
                vVar.j = i;
                vVar.J(i);
                return;
            }
            bp9 bp9Var = vVar.h;
            if (bp9Var != null) {
                bp9Var.n();
            }
        }
    }

    public final void D(j jVar, String str) {
        z87.v(this.b, ab3.a, null, new l(jVar, this, str, (m42) null, 0), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [gs9] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    public final List E() {
        ?? gs9Var;
        try {
            gk2 gk2Var = this.a.b;
            gk2Var.getClass();
            fk2 fk2Var = fk2.a;
            mm mmVar = (mm) gk2Var.a;
            ck2 ck2Var = new ck2(gk2Var, 1);
            mmVar.getClass();
            List<ak2> c = new xla(-1015933738, new String[]{"DbAiTtsModel"}, mmVar, "DbAiTtsModel.sq", "getAll", "SELECT DbAiTtsModel.id, DbAiTtsModel.name, DbAiTtsModel.language, DbAiTtsModel.sampleRate, DbAiTtsModel.numSpeakers, DbAiTtsModel.speakers, DbAiTtsModel.sizeBytes, DbAiTtsModel.gender, DbAiTtsModel.modelType, DbAiTtsModel.modelFormat, DbAiTtsModel.createAt, DbAiTtsModel.updateAt\nFROM DbAiTtsModel\nORDER BY createAt DESC", ck2Var).c();
            gs9Var = new ArrayList(tl1.s(c, 10));
            for (ak2 ak2Var : c) {
                String str = ak2Var.a;
                String str2 = ak2Var.b;
                String str3 = ak2Var.c;
                int i = ak2Var.d;
                int i2 = ak2Var.e;
                Map map = (Map) v46.a.a(v, ak2Var.f);
                ls3 ls3Var = ls3.a;
                if (map instanceof gs9) {
                    map = ls3Var;
                }
                kh5 kh5Var = m9.b;
                String str4 = ak2Var.h;
                kh5Var.getClass();
                m9 i3 = kh5.i(str4);
                long j = ak2Var.g;
                hq7 hq7Var = ab.b;
                String str5 = ak2Var.i;
                hq7Var.getClass();
                gs9Var.add(new t9(str, str2, str3, i, i2, map, i3, j, hq7.i(str5), ak2Var.j));
            }
        } catch (Throwable th) {
            gs9Var = new gs9(th);
        }
        boolean z = gs9Var instanceof gs9;
        ks3 ks3Var = gs9Var;
        if (z) {
            ks3Var = ks3.a;
        }
        return ks3Var;
    }

    public final af F() {
        return (af) this.c.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
    /* JADX WARN: Type inference failed for: r5v3, types: [gw8, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(defpackage.n42 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.n
            if (r0 == 0) goto L13
            r0 = r8
            n r0 = (defpackage.n) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            n r0 = new n
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.c
            int r1 = r0.e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L31
            if (r1 != r2) goto L2b
            gw8 r1 = r0.b
            java.lang.String r0 = r0.a
            defpackage.hre.r(r8)
            goto La4
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r3
        L31:
            defpackage.hre.r(r8)
            gw8 r8 = r7.d
            if (r8 == 0) goto L3d
            boolean r1 = r8.f
            if (r1 == 0) goto L3d
            return r8
        L3d:
            java.lang.String r8 = r7.e
            boolean r1 = defpackage.k4b.j0(r8)
            if (r1 == 0) goto L47
            goto Lc1
        L47:
            java.util.List r1 = r7.E()
            java.util.Iterator r1 = r1.iterator()
        L4f:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L65
            java.lang.Object r4 = r1.next()
            r5 = r4
            t9 r5 = (defpackage.t9) r5
            java.lang.String r5 = r5.a
            boolean r5 = defpackage.c16.i(r5, r8)
            if (r5 == 0) goto L4f
            goto L66
        L65:
            r4 = r3
        L66:
            t9 r4 = (defpackage.t9) r4
            if (r4 != 0) goto L6b
            goto Lc1
        L6b:
            m66 r1 = defpackage.pe4.a
            hn8 r1 = defpackage.ie2.u(r1)
            java.lang.String r5 = "tts"
            hn8 r1 = defpackage.hn8.f(r1, r5)
            java.lang.String r5 = "models"
            hn8 r1 = defpackage.hn8.f(r1, r5)
            hn8 r1 = defpackage.hn8.f(r1, r8)
            ab r5 = r4.i
            r5.getClass()
            gw8 r5 = new gw8
            r5.<init>()
            r5.d = r2
            r6 = 22050(0x5622, float:3.0899E-41)
            r5.e = r6
            r0.a = r8
            r0.b = r5
            r0.e = r2
            java.lang.Object r0 = r5.a(r4, r1, r0)
            n82 r1 = defpackage.n82.a
            if (r0 != r1) goto La0
            return r1
        La0:
            r1 = r0
            r0 = r8
            r8 = r1
            r1 = r5
        La4:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto Lc2
            bp9 r7 = r7.h
            if (r7 == 0) goto Lc1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to load model: "
            r8.<init>(r1)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            r7.q(r2, r8)
        Lc1:
            return r3
        Lc2:
            r7.d = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v.G(n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
        if (r14 == r5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
        if (r14 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable I(java.lang.String r13, defpackage.n42 r14) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v.I(java.lang.String, n42):java.io.Serializable");
    }

    public final void J(int i) {
        iya iyaVar = this.s;
        if (iyaVar != null) {
            iyaVar.cancel(null);
        }
        sw2 sw2Var = ab3.a;
        this.s = z87.v(this.b, ru2.c, null, new u(this, i, null, 0), 2);
    }

    @Override // defpackage.xyb
    public final pvc a(ryb rybVar) {
        String str = rybVar.a;
        boolean j0 = k4b.j0(str);
        pvc pvcVar = pvc.a;
        if (j0) {
            return pvcVar;
        }
        Object obj = null;
        if (!c16.i(str, this.e)) {
            gw8 gw8Var = this.d;
            if (gw8Var != null) {
                gw8Var.f = false;
                s26 s26Var = gw8Var.a;
                if (s26Var != null) {
                    ((PiperNcnn) s26Var.b).stop();
                }
                gw8Var.a = null;
                gw8Var.b = null;
                gw8Var.c = null;
            }
            this.d = null;
            this.r.b();
        }
        this.e = str;
        Iterator it = E().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (c16.i(((t9) next).a, str)) {
                obj = next;
                break;
            }
        }
        t9 t9Var = (t9) obj;
        return pvcVar;
    }

    @Override // defpackage.xyb
    public final void b(int i) {
        this.n = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [gs9] */
    @Override // defpackage.xyb
    public final Object c(m42 m42Var) {
        mv6 mv6Var;
        Object obj;
        mv6 mv6Var2;
        String str;
        String str2 = this.e;
        Iterator it = E().iterator();
        while (true) {
            mv6Var = null;
            if (it.hasNext()) {
                obj = it.next();
                if (c16.i(((t9) obj).a, str2)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        t9 t9Var = (t9) obj;
        if (t9Var == null) {
            return ks3.a;
        }
        String str3 = t9Var.c;
        str3.getClass();
        String j = rs8.j(str3, '_', '-');
        if (j.length() == 0 || j.equalsIgnoreCase("und")) {
            j = null;
        }
        if (j != null) {
            try {
                mv6Var2 = new mv6(xve.c(j));
            } catch (Throwable th) {
                mv6Var2 = new gs9(th);
            }
            if (!(mv6Var2 instanceof gs9)) {
                mv6Var = mv6Var2;
            }
            mv6Var = mv6Var;
        }
        if (mv6Var != null) {
            str = mv6Var.b();
        } else {
            str = str3;
        }
        return tl1.A(new tyb(str3, str));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    @Override // defpackage.xyb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r5, defpackage.m42 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.q
            if (r0 == 0) goto L13
            r0 = r6
            q r0 = (defpackage.q) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L1a
        L13:
            q r0 = new q
            n42 r6 = (defpackage.n42) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            defpackage.hre.r(r6)
            goto L4b
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.hre.r(r6)
            java.lang.String r6 = r4.e
            boolean r6 = defpackage.k4b.j0(r6)
            if (r6 != 0) goto L7f
            int r6 = r5.length()
            if (r6 != 0) goto L40
            goto L7f
        L40:
            r0.c = r2
            java.io.Serializable r6 = r4.I(r5, r0)
            n82 r5 = defpackage.n82.a
            if (r6 != r5) goto L4b
            return r5
        L4b:
            java.util.List r6 = (java.util.List) r6
            r5 = 3
            java.util.List r5 = defpackage.sl1.v0(r6, r5)
            java.util.Iterator r5 = r5.iterator()
        L56:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L7f
            java.lang.Object r6 = r5.next()
            uyb r6 = (defpackage.uyb) r6
            java.lang.String r0 = r6.a
            k97 r1 = r4.r
            r1.getClass()
            j97 r2 = r1.a
            java.lang.Object r2 = r2.h(r0)
            if (r2 != 0) goto L56
            j r2 = new j
            r2.<init>()
            java.lang.String r6 = r6.a
            r4.D(r2, r6)
            r1.a(r0, r2)
            goto L56
        L7f:
            pvc r4 = defpackage.pvc.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v.d(java.lang.String, m42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    @Override // defpackage.xyb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.m42 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.r
            if (r0 == 0) goto L13
            r0 = r5
            r r0 = (defpackage.r) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L1a
        L13:
            r r0 = new r
            n42 r5 = (defpackage.n42) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            defpackage.hre.r(r5)
            goto L49
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.hre.r(r5)
            int r5 = r4.j
            if (r5 <= 0) goto L51
            int r5 = r5 + (-1)
            r4.j = r5
            af r5 = r4.F()
            r0.c = r2
            r5.e()
            pvc r5 = defpackage.pvc.a
            n82 r0 = defpackage.n82.a
            if (r5 != r0) goto L49
            return r0
        L49:
            int r5 = r4.j
            r4.J(r5)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L51:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v.f(m42):java.lang.Object");
    }

    @Override // defpackage.xyb
    public final Object g(float f, n42 n42Var) {
        double d = 1.0d;
        if (f > nae.e) {
            d = 1.0d / f;
        }
        if (d != this.g) {
            this.g = d;
            this.r.b();
        }
        return pvc.a;
    }

    @Override // defpackage.xyb
    public final Object h(tyb tybVar, m42 m42Var) {
        Object obj;
        String str = this.e;
        Iterator it = E().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (c16.i(((t9) obj).a, str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        t9 t9Var = (t9) obj;
        if (t9Var == null) {
            return ks3.a;
        }
        Map map = t9Var.f;
        if (!map.isEmpty()) {
            List<Map.Entry> u0 = sl1.u0(map.entrySet(), new kn4(7));
            ArrayList arrayList = new ArrayList(tl1.s(u0, 10));
            for (Map.Entry entry : u0) {
                arrayList.add(new wyb(String.valueOf(((Number) entry.getValue()).intValue()), (String) entry.getKey(), false));
            }
            return arrayList;
        }
        int i = t9Var.e;
        ArrayList arrayList2 = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList2.add(new wyb(String.valueOf(i2), "", false));
        }
        return arrayList2;
    }

    @Override // defpackage.xyb
    public final Object i(float f, n42 n42Var) {
        F().e = f;
        return pvc.a;
    }

    @Override // defpackage.xyb
    public final void j(List list) {
        list.getClass();
        this.m = list;
    }

    @Override // defpackage.xyb
    public final Object k(n42 n42Var) {
        return new syb(1, false, 500, true, false, 3.0f, 1.0f, false, false, "");
    }

    @Override // defpackage.xyb
    public final Boolean l(rpc rpcVar) {
        return Boolean.valueOf(F().a());
    }

    @Override // defpackage.xyb
    public final Object m(m42 m42Var) {
        List<t9> E = E();
        ArrayList arrayList = new ArrayList(tl1.s(E, 10));
        for (t9 t9Var : E) {
            arrayList.add(new ryb(t9Var.a, t9Var.b));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    @Override // defpackage.xyb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(defpackage.m42 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.o
            if (r0 == 0) goto L13
            r0 = r5
            o r0 = (defpackage.o) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L1a
        L13:
            o r0 = new o
            n42 r5 = (defpackage.n42) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            defpackage.hre.r(r5)
            goto L56
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.hre.r(r5)
            java.util.List r5 = r4.i
            if (r5 != 0) goto L38
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L38:
            int r1 = r4.j
            int r5 = r5.size()
            int r5 = r5 - r2
            if (r1 >= r5) goto L5e
            int r5 = r4.j
            int r5 = r5 + r2
            r4.j = r5
            af r5 = r4.F()
            r0.c = r2
            r5.e()
            pvc r5 = defpackage.pvc.a
            n82 r0 = defpackage.n82.a
            if (r5 != r0) goto L56
            return r0
        L56:
            int r5 = r4.j
            r4.J(r5)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L5e:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v.o(m42):java.lang.Object");
    }

    @Override // defpackage.xyb
    public final void p(boolean z) {
        if (z != this.o) {
            this.r.b();
        }
        this.o = z;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:(5:11|12|13|(1:15)|16)(2:19|20))(1:21))(1:27)|22|(1:24)|16))|31|6|7|(0)(0)|22|(0)|16) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
        if (r7 == r5) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
        if (r4 == r5) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
        r0 = new defpackage.gs9(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b A[Catch: all -> 0x002e, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x002e, blocks: (B:12:0x002a, B:25:0x005b), top: B:34:0x0024 }] */
    @Override // defpackage.xyb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(defpackage.m42 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.s
            if (r0 == 0) goto L13
            r0 = r7
            s r0 = (defpackage.s) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L1a
        L13:
            s r0 = new s
            n42 r7 = (defpackage.n42) r7
            r0.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r0.a
            int r1 = r0.c
            r2 = 2
            r3 = 1
            pvc r4 = defpackage.pvc.a
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L37
            if (r1 != r2) goto L30
            defpackage.hre.r(r7)     // Catch: java.lang.Throwable -> L2e
            goto L67
        L2e:
            r7 = move-exception
            goto L69
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            r6 = 0
            return r6
        L37:
            defpackage.hre.r(r7)
            goto L52
        L3b:
            defpackage.hre.r(r7)
            r7 = 0
            r6.p = r7
            af r7 = r6.F()
            r0.c = r3
            boolean r7 = r7.a()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            if (r7 != r5) goto L52
            goto L66
        L52:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L5b
            goto L79
        L5b:
            af r7 = r6.F()     // Catch: java.lang.Throwable -> L2e
            r0.c = r2     // Catch: java.lang.Throwable -> L2e
            r7.d()     // Catch: java.lang.Throwable -> L2e
            if (r4 != r5) goto L67
        L66:
            return r5
        L67:
            r0 = r4
            goto L6e
        L69:
            gs9 r0 = new gs9
            r0.<init>(r7)
        L6e:
            java.lang.Throwable r7 = defpackage.hs9.a(r0)
            if (r7 == 0) goto L79
            int r7 = r6.j
            r6.J(r7)
        L79:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v.q(m42):java.lang.Object");
    }

    @Override // defpackage.xyb
    public final Object r(float f, kqc kqcVar) {
        if (this.l.length() > 0) {
            String str = this.l;
            return u(str, (int) (f * str.length()), this.k, kqcVar);
        }
        return pvc.a;
    }

    @Override // defpackage.xyb
    public final Object s(tyb tybVar, n42 n42Var) {
        tybVar.getClass();
        return pvc.a;
    }

    @Override // defpackage.xyb
    public final Object t(n42 n42Var) {
        this.p = true;
        iya iyaVar = this.s;
        if (iyaVar != null) {
            iyaVar.cancel(null);
        }
        F().e();
        return pvc.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    @Override // defpackage.xyb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.String r7, int r8, long r9, defpackage.n42 r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof defpackage.t
            if (r0 == 0) goto L13
            r0 = r11
            t r0 = (defpackage.t) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            t r0 = new t
            r0.<init>(r6, r11)
        L18:
            java.lang.Object r11 = r0.c
            int r1 = r0.e
            r2 = 0
            pvc r3 = defpackage.pvc.a
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L33
            if (r1 != r5) goto L2d
            int r8 = r0.b
            v r7 = r0.a
            defpackage.hre.r(r11)
            goto L5e
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r2
        L33:
            defpackage.hre.r(r11)
            java.lang.String r11 = r6.e
            boolean r11 = defpackage.k4b.j0(r11)
            if (r11 == 0) goto L48
            bp9 r6 = r6.h
            if (r6 == 0) goto L47
            java.lang.String r7 = "No model loaded"
            r6.q(r5, r7)
        L47:
            return r3
        L48:
            r6.p = r4
            r6.l = r7
            r6.k = r9
            r0.a = r6
            r0.b = r8
            r0.e = r5
            java.io.Serializable r11 = r6.I(r7, r0)
            n82 r7 = defpackage.n82.a
            if (r11 != r7) goto L5d
            return r7
        L5d:
            r7 = r6
        L5e:
            java.util.List r11 = (java.util.List) r11
            r7.i = r11
            java.util.List r7 = r6.i
            if (r7 == 0) goto L96
            java.util.Iterator r7 = r7.iterator()
            r9 = r4
        L6b:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L83
            java.lang.Object r10 = r7.next()
            uyb r10 = (defpackage.uyb) r10
            int r11 = r10.b
            int r10 = r10.c
            if (r8 > r10) goto L80
            if (r11 > r8) goto L80
            goto L84
        L80:
            int r9 = r9 + 1
            goto L6b
        L83:
            r9 = -1
        L84:
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r9)
            int r8 = r7.intValue()
            if (r8 < 0) goto L90
            r2 = r7
        L90:
            if (r2 == 0) goto L96
            int r4 = r2.intValue()
        L96:
            r6.j = r4
            r6.J(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v.u(java.lang.String, int, long, n42):java.lang.Object");
    }

    @Override // defpackage.xyb
    public final void v(bp9 bp9Var) {
        this.h = bp9Var;
        F().b = this.u;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    @Override // defpackage.xyb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(defpackage.n42 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.k
            if (r0 == 0) goto L13
            r0 = r6
            k r0 = (defpackage.k) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            k r0 = new k
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            pvc r2 = defpackage.pvc.a
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L2e
            if (r1 != r4) goto L28
            defpackage.hre.r(r6)
            goto L4a
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            return r3
        L2e:
            defpackage.hre.r(r6)
            r5.p = r4
            iya r6 = r5.s
            if (r6 == 0) goto L3a
            r6.cancel(r3)
        L3a:
            af r6 = r5.F()
            r0.c = r4
            android.media.MediaPlayer r6 = r6.a
            r6.release()
            n82 r6 = defpackage.n82.a
            if (r2 != r6) goto L4a
            return r6
        L4a:
            gw8 r6 = r5.d
            if (r6 == 0) goto L62
            r0 = 0
            r6.f = r0
            s26 r0 = r6.a
            if (r0 == 0) goto L5c
            java.lang.Object r0 = r0.b
            com.reader.piper.PiperNcnn r0 = (com.reader.piper.PiperNcnn) r0
            r0.stop()
        L5c:
            r6.a = r3
            r6.b = r3
            r6.c = r3
        L62:
            r5.d = r3
            r5.i = r3
            k97 r5 = r5.r
            r5.b()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v.w(n42):java.lang.Object");
    }

    @Override // defpackage.xyb
    public final Object x(wyb wybVar, n42 n42Var) {
        int i;
        Integer S = r4b.S(wybVar.a);
        if (S != null) {
            i = S.intValue();
        } else {
            i = 0;
        }
        if (i != this.f) {
            this.r.b();
        }
        this.f = i;
        return pvc.a;
    }

    @Override // defpackage.xyb
    public final Object y(n42 n42Var) {
        this.p = true;
        iya iyaVar = this.s;
        if (iyaVar != null) {
            iyaVar.cancel(null);
        }
        af F = F();
        if (F.a()) {
            F.a.pause();
        }
        return pvc.a;
    }

    @Override // defpackage.xyb
    public final void e(List list) {
    }

    @Override // defpackage.xyb
    public final void n(int i) {
    }
}
