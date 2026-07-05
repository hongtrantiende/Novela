package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lc9  reason: default package */
/* loaded from: classes3.dex */
public final class lc9 extends aab implements lu4 {
    public Object C;
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lc9(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.C = obj5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
        if (r7 == false) goto L7;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0048 -> B:14:0x004b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.b
            r1 = 1
            if (r0 == 0) goto L20
            if (r0 != r1) goto L19
            java.lang.Object r0 = r6.d
            fbc r0 = (defpackage.fbc) r0
            java.lang.Object r2 = r6.f
            java.lang.Object r3 = r6.e
            bw7 r3 = (defpackage.bw7) r3
            java.lang.Object r4 = r6.c
            gbc r4 = (defpackage.gbc) r4
            defpackage.hre.r(r7)
            goto L4b
        L19:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            r6 = 0
            return r6
        L20:
            defpackage.hre.r(r7)
            java.lang.Object r7 = r6.C
            gbc r7 = (defpackage.gbc) r7
            cza r0 = r7.d
            if (r0 == 0) goto L61
            r4 = r7
            r3 = r0
        L2d:
            java.lang.Object r2 = r3.getValue()
            r0 = r2
            fbc r0 = (defpackage.fbc) r0
            src r7 = r4.c
            r6.c = r4
            r6.e = r3
            r6.f = r2
            r6.d = r0
            r6.b = r1
            wrc r7 = (defpackage.wrc) r7
            java.io.Serializable r7 = r7.b(r6)
            n82 r5 = defpackage.n82.a
            if (r7 != r5) goto L4b
            return r5
        L4b:
            java.util.List r7 = (java.util.List) r7
            r0.getClass()
            r7.getClass()
            fbc r0 = new fbc
            r5 = 0
            r0.<init>(r7, r5)
            cza r3 = (defpackage.cza) r3
            boolean r7 = r3.l(r2, r0)
            if (r7 == 0) goto L2d
        L61:
            pvc r6 = defpackage.pvc.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lc9.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x010b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0078 -> B:15:0x007a). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object p(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lc9.p(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
        defpackage.tl1.L();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0097, code lost:
        if (r1 == false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004d -> B:6:0x001d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object q(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            int r1 = r0.b
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L25
            if (r1 != r3) goto L1f
            java.lang.Object r1 = r0.d
            xrc r1 = (defpackage.xrc) r1
            java.lang.Object r4 = r0.f
            java.lang.Object r5 = r0.e
            bw7 r5 = (defpackage.bw7) r5
            java.lang.Object r6 = r0.c
            csc r6 = (defpackage.csc) r6
            defpackage.hre.r(r21)
            r7 = r21
        L1d:
            r8 = r1
            goto L50
        L1f:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r0)
            return r2
        L25:
            defpackage.hre.r(r21)
            java.lang.Object r1 = r0.C
            csc r1 = (defpackage.csc) r1
            cza r4 = r1.j1
            if (r4 == 0) goto L99
            r6 = r1
            r5 = r4
        L32:
            java.lang.Object r4 = r5.getValue()
            r1 = r4
            xrc r1 = (defpackage.xrc) r1
            src r7 = r6.h1
            r0.c = r6
            r0.e = r5
            r0.f = r4
            r0.d = r1
            r0.b = r3
            wrc r7 = (defpackage.wrc) r7
            java.io.Serializable r7 = r7.b(r0)
            n82 r8 = defpackage.n82.a
            if (r7 != r8) goto L1d
            return r8
        L50:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r1 = r7 instanceof java.util.Collection
            r9 = 0
            if (r1 == 0) goto L63
            r1 = r7
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L63
        L60:
            r17 = r9
            goto L80
        L63:
            java.util.Iterator r1 = r7.iterator()
        L67:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L60
            java.lang.Object r7 = r1.next()
            orc r7 = (defpackage.orc) r7
            boolean r7 = r7.b
            if (r7 == 0) goto L67
            int r9 = r9 + 1
            if (r9 < 0) goto L7c
            goto L67
        L7c:
            defpackage.tl1.L()
            throw r2
        L80:
            r18 = 0
            r19 = 3583(0xdff, float:5.021E-42)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            xrc r1 = defpackage.xrc.a(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            cza r5 = (defpackage.cza) r5
            boolean r1 = r5.l(r4, r1)
            if (r1 == 0) goto L32
        L99:
            pvc r0 = defpackage.pvc.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lc9.q(java.lang.Object):java.lang.Object");
    }

    private final Object r(Object obj) {
        Iterator it;
        tj4 tj4Var;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                it = (Iterator) this.c;
                tj4Var = (tj4) this.f;
                hre.r(obj);
            } else {
                vs.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            hre.r(obj);
            tj4 tj4Var2 = (tj4) this.f;
            aqd aqdVar = (aqd) this.d;
            Map map = (Map) aqdVar.e.get(aqdVar.b((String) this.e));
            if (map == null) {
                map = new LinkedHashMap();
            }
            it = map.entrySet().iterator();
            tj4Var = tj4Var2;
        }
        while (it.hasNext()) {
            yqd yqdVar = ((yqd) this.C).a;
            String str = ((wpd) ((Map.Entry) it.next()).getValue()).a;
            str.getClass();
            j6d b = yqdVar.k().b(str);
            this.f = tj4Var;
            this.c = it;
            this.b = 1;
            Object b2 = tj4Var.b(b, this);
            n82 n82Var = n82.a;
            if (b2 == n82Var) {
                return n82Var;
            }
        }
        return pvc.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0140, code lost:
        if (defpackage.erd.A(r2, r7, r0, r9, r20) != r13) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object s(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lc9.s(java.lang.Object):java.lang.Object");
    }

    private final Object t(Object obj) {
        m82 m82Var = (m82) this.f;
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
            atd atdVar = (atd) this.d;
            hk7 hk7Var = new hk7(atdVar, 3);
            zub zubVar = new zub(atdVar, 17);
            x8c x8cVar = new x8c(5, m82Var, atdVar, (aw7) this.C);
            a0b a0bVar = new a0b(28, atdVar, m82Var);
            kbd kbdVar = new kbd(3, atdVar, m82Var);
            this.f = null;
            this.b = 1;
            Object h = yae.h((d19) this.c, new e9d(atdVar, (aw7) this.e, hk7Var, zubVar, kbdVar, a0bVar, x8cVar, (m42) null), this);
            n82 n82Var = n82.a;
            if (h == n82Var) {
                return n82Var;
            }
        }
        return pvc.a;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new lc9((mc9) this.d, m42Var);
            case 1:
                return new lc9((jp5) this.c, (rj9) this.d, (cna) this.e, (ox9) this.f, (ml5) this.C, m42Var, 1);
            case 2:
                lc9 lc9Var = new lc9((kk9) this.d, (jk9) this.e, (xq7) this.C, m42Var, 2);
                lc9Var.f = obj;
                return lc9Var;
            case 3:
                return new lc9((Object) ((xn6) this.e), (Object) ((m82) this.f), (Object) ((lu4) this.C), m42Var, 3, false);
            case 4:
                return new lc9((Object) ((y4a) this.e), this.f, (Object) ((tkc) this.C), m42Var, 4, false);
            case 5:
                return new lc9((yda) this.C, m42Var, 5);
            case 6:
                lc9 lc9Var2 = new lc9((fla) this.c, (String) this.d, (String) this.e, (String) this.C, m42Var, 6);
                lc9Var2.f = obj;
                return lc9Var2;
            case 7:
                lc9 lc9Var3 = new lc9((vt4) this.C, m42Var, 7);
                lc9Var3.e = obj;
                return lc9Var3;
            case 8:
                lc9 lc9Var4 = new lc9((d19) this.c, (mu4) this.d, (xt4) this.e, (j59) this.C, m42Var, 8);
                lc9Var4.f = obj;
                return lc9Var4;
            case 9:
                return new lc9((List) this.c, (aw7) this.d, (aw7) this.e, (aw7) this.f, (aw7) this.C, m42Var, 9);
            case 10:
                return new lc9((d19) this.c, (rk9) this.d, (y82) this.e, (y82) this.f, (ik8) this.C, m42Var, 10);
            case 11:
                return new lc9((d19) this.c, (g3c) this.d, (se0) this.e, (imb) this.f, (p52) this.C, m42Var, 11);
            case 12:
                return new lc9((Object) ((y5c) this.e), (Object) ((String) this.f), (Object) ((String) this.C), m42Var, 12, false);
            case 13:
                return new lc9((s8c) this.f, (t8c) this.C, m42Var);
            case 14:
                lc9 lc9Var5 = new lc9((lu4) this.c, (p1a) this.d, (m82) this.e, (AtomicReference) this.C, m42Var, 14);
                lc9Var5.f = obj;
                return lc9Var5;
            case 15:
                return new lc9((gbc) this.C, m42Var, 15);
            case 16:
                lc9 lc9Var6 = new lc9((rjc) this.d, (t3a) this.e, (zl9) this.C, m42Var, 16);
                lc9Var6.f = obj;
                return lc9Var6;
            case 17:
                return new lc9((csc) this.C, m42Var, 17);
            case 18:
                lc9 lc9Var7 = new lc9((aqd) this.d, (String) this.e, (yqd) this.C, m42Var, 18);
                lc9Var7.f = obj;
                return lc9Var7;
            case 19:
                lc9 lc9Var8 = new lc9((erd) this.C, m42Var, 19);
                lc9Var8.e = obj;
                return lc9Var8;
            case 20:
                lc9 lc9Var9 = new lc9((d19) this.c, (atd) this.d, (aw7) this.e, (aw7) this.C, m42Var, 20);
                lc9Var9.f = obj;
                return lc9Var9;
            default:
                return new lc9((qi8) this.c, (aw7) this.d, (si8) this.e, (ri8) this.f, (xh8) this.C, m42Var, 21);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                return ((lc9) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 1:
                return ((lc9) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 2:
                return ((lc9) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 3:
                return ((lc9) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 4:
                return ((lc9) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 5:
                return ((lc9) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 6:
                return ((lc9) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 7:
                ((lc9) create((tj4) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return n82.a;
            case 8:
                return ((lc9) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 9:
                return ((lc9) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 10:
                return ((lc9) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 11:
                return ((lc9) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 12:
                return ((lc9) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 13:
                return ((lc9) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 14:
                return ((lc9) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 15:
                return ((lc9) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 16:
                return ((lc9) create((s3a) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 17:
                return ((lc9) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 18:
                return ((lc9) create((tj4) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 19:
                return ((lc9) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 20:
                return ((lc9) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            default:
                return ((lc9) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:164:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0459 A[Catch: all -> 0x03f0, TRY_LEAVE, TryCatch #9 {all -> 0x03f0, blocks: (B:154:0x0409, B:165:0x044f, B:162:0x043e, B:167:0x0459, B:148:0x03ec), top: B:496:0x03d5 }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x089a A[Catch: all -> 0x092d, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x080a, blocks: (B:351:0x0805, B:380:0x0893, B:381:0x0899, B:383:0x089e, B:384:0x089f, B:386:0x08a6, B:388:0x08b4, B:390:0x08ba, B:393:0x08c0, B:395:0x08c4, B:396:0x08c8, B:397:0x08cb, B:398:0x08ce, B:382:0x089a), top: B:489:0x07f7 }] */
    /* JADX WARN: Type inference failed for: r1v21, types: [d89, int] */
    /* JADX WARN: Type inference failed for: r3v25, types: [zl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v48, types: [java.lang.Object, l97] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.lang.Object, l97] */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r9v5, types: [zl9, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:161:0x043d -> B:162:0x043e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:166:0x0457 -> B:162:0x043e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:221:0x0580 -> B:215:0x0542). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:477:0x0a1f -> B:479:0x0a23). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 2666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lc9.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc9(s8c s8cVar, t8c t8cVar, m42 m42Var) {
        super(2, m42Var);
        this.a = 13;
        this.f = s8cVar;
        this.C = t8cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lc9(Object obj, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.C = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lc9(Object obj, Object obj2, Object obj3, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = obj;
        this.e = obj2;
        this.C = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lc9(Object obj, Object obj2, Object obj3, m42 m42Var, int i, boolean z) {
        super(2, m42Var);
        this.a = i;
        this.e = obj;
        this.f = obj2;
        this.C = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lc9(Object obj, Object obj2, Object obj3, Object obj4, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.C = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc9(mc9 mc9Var, m42 m42Var) {
        super(2, m42Var);
        this.a = 0;
        this.d = mc9Var;
    }
}
