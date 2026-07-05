package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xr0  reason: default package */
/* loaded from: classes3.dex */
public final class xr0 extends aab implements lu4 {
    public Object C;
    public Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xr0(pt3 pt3Var, jp5 jp5Var, Object obj, xe8 xe8Var, ox9 ox9Var, h97 h97Var, ov2 ov2Var, m42 m42Var) {
        super(2, m42Var);
        this.a = 7;
        this.d = pt3Var;
        this.e = jp5Var;
        this.c = obj;
        this.f = xe8Var;
        this.C = ox9Var;
        this.D = h97Var;
        this.E = ov2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
        if (r4 == r12) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a8, code lost:
        if (r0 == r12) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0091 A[Catch: all -> 0x0044, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0044, blocks: (B:11:0x003f, B:32:0x0091), top: B:61:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0123  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0106 -> B:53:0x010c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xr0.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x008b, code lost:
        if (r0.await(r13) != r4) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x004b -> B:12:0x004c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object p(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.b
            r1 = 0
            r2 = 2
            r3 = 1
            n82 r4 = defpackage.n82.a
            if (r0 == 0) goto L32
            if (r0 == r3) goto L21
            if (r0 != r2) goto L1b
            java.lang.Object r0 = r13.d
            gxa r0 = (defpackage.gxa) r0
            java.lang.Object r5 = r13.c
            m82 r5 = (defpackage.m82) r5
            defpackage.hre.r(r14)
            r7 = r0
            r14 = r5
            goto L4c
        L1b:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r13)
            return r1
        L21:
            java.lang.Object r0 = r13.e
            hz2 r0 = (defpackage.hz2) r0
            java.lang.Object r5 = r13.d
            gxa r5 = (defpackage.gxa) r5
            java.lang.Object r6 = r13.c
            m82 r6 = (defpackage.m82) r6
            defpackage.hre.r(r14)
            r14 = r6
            goto L7f
        L32:
            defpackage.hre.r(r14)
            java.lang.Object r14 = r13.c
            m82 r14 = (defpackage.m82) r14
            java.lang.Float r0 = new java.lang.Float
            r5 = 1036831949(0x3dcccccd, float:0.1)
            r0.<init>(r5)
            gxa r5 = new gxa
            r6 = 1058642330(0x3f19999a, float:0.6)
            r7 = 1128792064(0x43480000, float:200.0)
            r5.<init>(r6, r7, r0)
        L4b:
            r7 = r5
        L4c:
            r9 r5 = new r9
            java.lang.Object r0 = r13.f
            r6 = r0
            lq r6 = (defpackage.lq) r6
            java.lang.Object r0 = r13.E
            r8 = r0
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r0 = r13.C
            r9 = r0
            em8 r9 = (defpackage.em8) r9
            java.lang.Object r0 = r13.D
            r10 = r0
            dm8 r10 = (defpackage.dm8) r10
            r11 = 0
            r12 = 20
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r0 = 3
            hz2 r0 = defpackage.z87.s(r14, r1, r5, r0)
            r13.c = r14
            r13.d = r7
            r13.e = r0
            r13.b = r3
            r5 = 650(0x28a, double:3.21E-321)
            java.lang.Object r5 = defpackage.ade.q(r5, r13)
            if (r5 != r4) goto L7e
            goto L8d
        L7e:
            r5 = r7
        L7f:
            r13.c = r14
            r13.d = r5
            r13.e = r1
            r13.b = r2
            java.lang.Object r0 = r0.await(r13)
            if (r0 != r4) goto L4b
        L8d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xr0.p(java.lang.Object):java.lang.Object");
    }

    private final Object q(Object obj) {
        Object gs9Var;
        m82 m82Var = (m82) this.c;
        int i = this.b;
        try {
            if (i != 0) {
                if (i == 1) {
                    hre.r(obj);
                } else {
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                hre.r(obj);
                nu4 nu4Var = (nu4) this.d;
                String str = (String) this.e;
                String str2 = (String) this.f;
                String str3 = (String) this.C;
                this.c = null;
                this.b = 1;
                obj = nu4Var.h(str, str2, str3, this);
                n82 n82Var = n82.a;
                if (obj == n82Var) {
                    return n82Var;
                }
            }
            gs9Var = (String) obj;
        } catch (Throwable th) {
            gs9Var = new gs9(th);
        }
        if (gs9Var instanceof gs9) {
            gs9Var = null;
        }
        String str4 = (String) gs9Var;
        if (str4 == null) {
            str4 = "";
        }
        if (str4.length() > 0) {
            int length = str4.length();
            ((aw7) this.D).setValue(new jub(str4, sze.a(length, length), 4));
        }
        ((aw7) this.E).setValue(null);
        return pvc.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0079, code lost:
        if (r10.o(r9) == r5) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a A[Catch: all -> 0x00a4, TRY_LEAVE, TryCatch #1 {all -> 0x00a4, blocks: (B:21:0x0091, B:22:0x0093, B:25:0x009a, B:33:0x00ab, B:34:0x00ad, B:36:0x00b3, B:39:0x00ba), top: B:44:0x000b }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [qw7, int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [qw7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object r(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.D
            ow7 r0 = (defpackage.ow7) r0
            int r1 = r9.b
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L43
            if (r1 == r3) goto L2b
            if (r1 != r2) goto L25
            java.lang.Object r0 = r9.c
            ow7 r0 = (defpackage.ow7) r0
            java.lang.Object r1 = r9.d
            qw7 r1 = (defpackage.qw7) r1
            java.lang.Object r9 = r9.f
            mw7 r9 = (defpackage.mw7) r9
            defpackage.hre.r(r10)     // Catch: java.lang.Throwable -> L22
            goto L91
        L22:
            r10 = move-exception
            goto Lab
        L25:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r9)
            return r4
        L2b:
            java.lang.Object r0 = r9.e
            ow7 r0 = (defpackage.ow7) r0
            java.lang.Object r1 = r9.c
            xt4 r1 = (defpackage.xt4) r1
            java.lang.Object r3 = r9.d
            qw7 r3 = (defpackage.qw7) r3
            java.lang.Object r6 = r9.f
            mw7 r6 = (defpackage.mw7) r6
            defpackage.hre.r(r10)
            r10 = r6
            r6 = r1
            r1 = r10
            r10 = r3
            goto L7c
        L43:
            defpackage.hre.r(r10)
            java.lang.Object r10 = r9.f
            m82 r10 = (defpackage.m82) r10
            mw7 r1 = new mw7
            java.lang.Object r6 = r9.C
            jw7 r6 = (defpackage.jw7) r6
            d82 r10 = r10.q()
            r0f r7 = defpackage.r0f.I
            b82 r10 = r10.get(r7)
            r10.getClass()
            w26 r10 = (defpackage.w26) r10
            r1.<init>(r6, r10)
            defpackage.ow7.a(r0, r1)
            sw7 r10 = r0.b
            java.lang.Object r6 = r9.E
            xt4 r6 = (defpackage.xt4) r6
            r9.f = r1
            r9.d = r10
            r9.c = r6
            r9.e = r0
            r9.b = r3
            java.lang.Object r3 = r10.o(r9)
            if (r3 != r5) goto L7c
            goto L8c
        L7c:
            r9.f = r1     // Catch: java.lang.Throwable -> La6
            r9.d = r10     // Catch: java.lang.Throwable -> La6
            r9.c = r0     // Catch: java.lang.Throwable -> La6
            r9.e = r4     // Catch: java.lang.Throwable -> La6
            r9.b = r2     // Catch: java.lang.Throwable -> La6
            java.lang.Object r9 = r6.invoke(r9)     // Catch: java.lang.Throwable -> La6
            if (r9 != r5) goto L8d
        L8c:
            return r5
        L8d:
            r8 = r10
            r10 = r9
            r9 = r1
            r1 = r8
        L91:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch: java.lang.Throwable -> La4
        L93:
            boolean r2 = r0.compareAndSet(r9, r4)     // Catch: java.lang.Throwable -> La4
            if (r2 == 0) goto L9a
            goto La0
        L9a:
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> La4
            if (r2 == r9) goto L93
        La0:
            r1.q(r4)
            return r10
        La4:
            r9 = move-exception
            goto Lbb
        La6:
            r9 = move-exception
            r8 = r10
            r10 = r9
            r9 = r1
            r1 = r8
        Lab:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch: java.lang.Throwable -> La4
        Lad:
            boolean r2 = r0.compareAndSet(r9, r4)     // Catch: java.lang.Throwable -> La4
            if (r2 != 0) goto Lba
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> La4
            if (r2 != r9) goto Lba
            goto Lad
        Lba:
            throw r10     // Catch: java.lang.Throwable -> La4
        Lbb:
            r1.q(r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xr0.r(java.lang.Object):java.lang.Object");
    }

    private final Object s(Object obj) {
        vq8 vq8Var;
        aw7 aw7Var = (aw7) this.E;
        int i = this.b;
        pvc pvcVar = pvc.a;
        if (i != 0) {
            if (i == 1) {
                aw7Var = (aw7) this.d;
                vq8Var = (vq8) this.c;
                hre.r(obj);
            } else {
                vs.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            hre.r(obj);
            int i2 = ct8.c;
            vq8Var = (vq8) ((aw7) this.C).getValue();
            aw7 aw7Var2 = (aw7) this.D;
            if (vq8Var == null) {
                aw7Var2.setValue(-1);
                aw7Var.setValue(ks3.a);
                return pvcVar;
            }
            int i3 = vq8Var.a;
            aw7Var2.setValue(Integer.valueOf(i3));
            int i4 = vq8Var.b;
            int i5 = vq8Var.c;
            this.c = vq8Var;
            this.d = aw7Var;
            this.b = 1;
            obj = ((ss8) this.e).n().a1(i3, i4, i5, this);
            n82 n82Var = n82.a;
            if (obj == n82Var) {
                return n82Var;
            }
        }
        int i6 = ct8.c;
        aw7Var.setValue((List) obj);
        ((dt8) this.f).a(vq8Var.a, true);
        return pvcVar;
    }

    private final Object t(Object obj) {
        d19 d19Var = (d19) this.d;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                hre.r(obj);
            } else {
                vs.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            hre.r(obj);
            w29 w29Var = new w29((m82) this.c, (fsd) this.e, new i59(d19Var), (gsd) this.f, (gsd) this.C, (gsd) this.D, (gsd) this.E, null);
            this.b = 1;
            Object h = yae.h(d19Var, w29Var, this);
            n82 n82Var = n82.a;
            if (h == n82Var) {
                return n82Var;
            }
        }
        return pvc.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
        if (r14 == r11) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
        if (r0.l(new defpackage.wsa(r0, 2), r13) == r11) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0098, code lost:
        if (defpackage.cta.D(r0, r13) != r11) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ae, code lost:
        if (r2 == null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00ce -> B:40:0x00d5). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object u(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xr0.u(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
        if (r4 == r14) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0086, code lost:
        if (r7 == r14) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ad, code lost:
        if (defpackage.oua.D(r1, r17) != r14) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c3, code lost:
        if (r2 == null) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010c  */
    /* JADX WARN: Type inference failed for: r4v20, types: [bw7] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00e3 -> B:43:0x00ea). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object v(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xr0.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:217:0x04a9, code lost:
        if (r0 != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02a8, code lost:
        if (r2 == r13) goto L111;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04f1 A[LOOP:3: B:242:0x04f1->B:243:0x0518, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x042b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x045d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0344 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0235 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0288  */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12, types: [zl9] */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42, types: [zl9] */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v52, types: [zl9] */
    /* JADX WARN: Type inference failed for: r4v18, types: [zl9] */
    /* JADX WARN: Type inference failed for: r4v23, types: [zl9] */
    /* JADX WARN: Type inference failed for: r4v53 */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r6v22, types: [zl9] */
    /* JADX WARN: Type inference failed for: r6v26, types: [zl9] */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v46, types: [zl9] */
    /* JADX WARN: Type inference failed for: r6v48, types: [zl9] */
    /* JADX WARN: Type inference failed for: r6v49, types: [zl9] */
    /* JADX WARN: Type inference failed for: r6v53, types: [zl9] */
    /* JADX WARN: Type inference failed for: r6v66 */
    /* JADX WARN: Type inference failed for: r6v67 */
    /* JADX WARN: Type inference failed for: r6v76 */
    /* JADX WARN: Type inference failed for: r6v77, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v84, types: [mv6] */
    /* JADX WARN: Type inference failed for: r6v88 */
    /* JADX WARN: Type inference failed for: r6v93, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v97 */
    /* JADX WARN: Type inference failed for: r6v99 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v19, types: [zl9] */
    /* JADX WARN: Type inference failed for: r7v83 */
    /* JADX WARN: Type inference failed for: r7v84 */
    /* JADX WARN: Type inference failed for: r7v85, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v89, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object w(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 1336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xr0.w(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c0, code lost:
        if (r2 == r10) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0154, code lost:
        if (r0 != r10) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0116 A[Catch: all -> 0x0030, TRY_ENTER, TryCatch #0 {all -> 0x0030, blocks: (B:9:0x0029, B:69:0x0157, B:16:0x0045, B:60:0x0132, B:62:0x0136, B:66:0x013e, B:57:0x0116), top: B:84:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0136 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:9:0x0029, B:69:0x0157, B:16:0x0045, B:60:0x0132, B:62:0x0136, B:66:0x013e, B:57:0x0116), top: B:84:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013c  */
    /* JADX WARN: Type inference failed for: r11v4, types: [x0d] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object x(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xr0.x(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.E;
        switch (i) {
            case 0:
                xr0 xr0Var = new xr0((zr0) this.d, (Map.Entry) this.e, (lu4) this.f, (lu4) this.C, (AtomicInteger) this.D, (List) obj2, m42Var, 0);
                xr0Var.c = obj;
                return xr0Var;
            case 1:
                xr0 xr0Var2 = new xr0((i53) obj2, m42Var, 1);
                xr0Var2.c = obj;
                return xr0Var2;
            case 2:
                return new xr0((u73) obj2, m42Var, 2);
            case 3:
                return new xr0((m83) obj2, m42Var, 3);
            case 4:
                return new xr0((b93) this.D, (String) obj2, m42Var);
            case 5:
                return new xr0((bo3) this.e, (String) this.f, (String) this.C, (String) this.D, (f76) obj2, m42Var, 5);
            case 6:
                return new xr0((pt3) this.d, (zl9) this.e, (zl9) this.f, (jp5) this.C, this.c, (zl9) this.D, (ox9) obj2, m42Var);
            case 7:
                return new xr0((pt3) this.d, (jp5) this.e, this.c, (xe8) this.f, (ox9) this.C, (h97) this.D, (ov2) obj2, m42Var);
            case 8:
                xr0 xr0Var3 = new xr0((g54) this.C, (HashMap) this.D, (vl9) obj2, m42Var, 8);
                xr0Var3.f = obj;
                return xr0Var3;
            case 9:
                xr0 xr0Var4 = new xr0((br6) obj2, m42Var, 9);
                xr0Var4.D = obj;
                return xr0Var4;
            case 10:
                xr0 xr0Var5 = new xr0((lq) this.f, (List) obj2, (em8) this.C, (dm8) this.D, m42Var);
                xr0Var5.c = obj;
                return xr0Var5;
            case 11:
                return new xr0((zwb) this.d, (aw7) this.e, (aw7) this.f, (aw7) this.C, (aw7) this.D, (aw7) obj2, m42Var, 11);
            case 12:
                xr0 xr0Var6 = new xr0((nu4) this.d, (String) this.e, (String) this.f, (String) this.C, (aw7) this.D, (aw7) obj2, m42Var, 12);
                xr0Var6.c = obj;
                return xr0Var6;
            case 13:
                xr0 xr0Var7 = new xr0((jw7) this.C, (ow7) this.D, (xt4) obj2, m42Var, 13);
                xr0Var7.f = obj;
                return xr0Var7;
            case 14:
                return new xr0((ss8) this.e, (dt8) this.f, (aw7) this.C, (aw7) this.D, (aw7) obj2, m42Var, 14);
            case 15:
                xr0 xr0Var8 = new xr0((d19) this.d, (fsd) this.e, (gsd) this.f, (gsd) this.C, (gsd) this.D, (gsd) obj2, m42Var, 15);
                xr0Var8.c = obj;
                return xr0Var8;
            case 16:
                return new xr0((cta) obj2, m42Var, 16);
            case 17:
                return new xr0((oua) obj2, m42Var, 17);
            case 18:
                xr0 xr0Var9 = new xr0((ylc) obj2, m42Var, 18);
                xr0Var9.D = obj;
                return xr0Var9;
            case 19:
                xr0 xr0Var10 = new xr0((szc) this.C, (String) this.D, (String) obj2, m42Var, 19);
                xr0Var10.c = obj;
                return xr0Var10;
            default:
                xr0 xr0Var11 = new xr0((ContentResolver) this.e, (Uri) this.f, (tkd) this.C, (xy0) this.D, (Context) obj2, m42Var, 20);
                xr0Var11.c = obj;
                return xr0Var11;
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                return ((xr0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 1:
                return ((xr0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 2:
                return ((xr0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 3:
                return ((xr0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 4:
                return ((xr0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 5:
                return ((xr0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 6:
                return ((xr0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 7:
                return ((xr0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 8:
                return ((xr0) create((j6d) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 9:
                return ((xr0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 10:
                ((xr0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return n82.a;
            case 11:
                return ((xr0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 12:
                return ((xr0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 13:
                return ((xr0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 14:
                return ((xr0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 15:
                return ((xr0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 16:
                return ((xr0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 17:
                return ((xr0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 18:
                return ((xr0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 19:
                return ((xr0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            default:
                return ((xr0) create((tj4) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x02b8, code lost:
        if (r0 == r11) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x046d, code lost:
        if (((defpackage.bn6) r0).v(r1, (java.lang.String) r2, (java.lang.String) r34.f, (java.lang.String) r34.C, (java.lang.String) r34.D, (defpackage.f76) r34.E, r34) == r12) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x04f1, code lost:
        if (r1 == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0554, code lost:
        if (r9 == r8) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0590, code lost:
        if (defpackage.m83.E(r4, r34) != r8) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x05ac, code lost:
        if (r6 != null) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x065a, code lost:
        if (r9 == r8) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x068b, code lost:
        if (r5.E(r34) == r8) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x06dc, code lost:
        if (r2 == false) goto L289;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:9:0x002a, B:19:0x0060, B:23:0x0072, B:25:0x007a, B:15:0x0042, B:18:0x0057), top: B:418:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x07ad  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x07fb  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x07fd  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0809 A[Catch: all -> 0x070a, LOOP:5: B:346:0x0809->B:351:0x0840, LOOP_START, TryCatch #2 {all -> 0x070a, blocks: (B:311:0x0705, B:362:0x0881, B:366:0x088c, B:317:0x071e, B:358:0x0869, B:320:0x0735, B:344:0x0800, B:346:0x0809, B:350:0x081e, B:352:0x0842, B:354:0x0853, B:323:0x074e, B:340:0x07d4, B:326:0x075a, B:337:0x07ae, B:329:0x0764, B:331:0x0768, B:333:0x0793), top: B:421:0x06ef }] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0842 A[Catch: all -> 0x070a, TryCatch #2 {all -> 0x070a, blocks: (B:311:0x0705, B:362:0x0881, B:366:0x088c, B:317:0x071e, B:358:0x0869, B:320:0x0735, B:344:0x0800, B:346:0x0809, B:350:0x081e, B:352:0x0842, B:354:0x0853, B:323:0x074e, B:340:0x07d4, B:326:0x075a, B:337:0x07ae, B:329:0x0764, B:331:0x0768, B:333:0x0793), top: B:421:0x06ef }] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0853 A[Catch: all -> 0x070a, TryCatch #2 {all -> 0x070a, blocks: (B:311:0x0705, B:362:0x0881, B:366:0x088c, B:317:0x071e, B:358:0x0869, B:320:0x0735, B:344:0x0800, B:346:0x0809, B:350:0x081e, B:352:0x0842, B:354:0x0853, B:323:0x074e, B:340:0x07d4, B:326:0x075a, B:337:0x07ae, B:329:0x0764, B:331:0x0768, B:333:0x0793), top: B:421:0x06ef }] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0880  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0889  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x088b  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x089b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0240  */
    /* JADX WARN: Type inference failed for: r5v20, types: [bw7] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:201:0x04da -> B:203:0x04de). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:244:0x05cd -> B:245:0x05d2). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a2 -> B:19:0x0060). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:292:0x06b6 -> B:293:0x06b8). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            Method dump skipped, instructions count: 2580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xr0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xr0(b93 b93Var, String str, m42 m42Var) {
        super(2, m42Var);
        this.a = 4;
        this.D = b93Var;
        this.E = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xr0(lq lqVar, List list, em8 em8Var, dm8 dm8Var, m42 m42Var) {
        super(2, m42Var);
        this.a = 10;
        this.f = lqVar;
        this.E = list;
        this.C = em8Var;
        this.D = dm8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xr0(pt3 pt3Var, zl9 zl9Var, zl9 zl9Var2, jp5 jp5Var, Object obj, zl9 zl9Var3, ox9 ox9Var, m42 m42Var) {
        super(2, m42Var);
        this.a = 6;
        this.d = pt3Var;
        this.e = zl9Var;
        this.f = zl9Var2;
        this.C = jp5Var;
        this.c = obj;
        this.D = zl9Var3;
        this.E = ox9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xr0(fdd fddVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.E = fddVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xr0(Object obj, Object obj2, Object obj3, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.C = obj;
        this.D = obj2;
        this.E = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xr0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.e = obj;
        this.f = obj2;
        this.C = obj3;
        this.D = obj4;
        this.E = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xr0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.C = obj4;
        this.D = obj5;
        this.E = obj6;
    }
}
