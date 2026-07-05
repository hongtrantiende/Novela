package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import androidx.glance.appwidget.GlanceAppWidgetReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l  reason: default package */
/* loaded from: classes3.dex */
public final class l extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public final /* synthetic */ Object d;
    public Object e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(pc4 pc4Var, String str, ce4 ce4Var, zl9 zl9Var, m42 m42Var) {
        super(2, m42Var);
        this.a = 21;
        this.c = pc4Var;
        this.d = str;
        this.e = ce4Var;
        this.f = zl9Var;
    }

    private final Object o(Object obj) {
        Object gs9Var;
        Object value;
        Object value2;
        String str;
        h94 h94Var = (h94) this.f;
        a94 a94Var = (a94) this.e;
        cza czaVar = a94Var.a;
        m82 m82Var = (m82) this.c;
        int i = this.b;
        String str2 = "";
        byte[] bArr = null;
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
                do {
                    value2 = czaVar.getValue();
                    byte[] bArr2 = (byte[]) value2;
                } while (!czaVar.l(value2, null));
                a94Var.b = false;
                String str3 = (String) this.d;
                h94Var.x = "";
                x1c B = h94Var.B();
                wyb wybVar = h94Var.l;
                if (wybVar != null) {
                    str = wybVar.a;
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                this.c = null;
                this.b = 1;
                obj = B.d(str3, str, this);
                n82 n82Var = n82.a;
                if (obj == n82Var) {
                    return n82Var;
                }
            }
            gs9Var = (byte[]) obj;
        } catch (Throwable th) {
            gs9Var = new gs9(th);
        }
        Throwable a = hs9.a(gs9Var);
        if (a != null) {
            String message = a.getMessage();
            if (message != null) {
                str2 = message;
            }
            h94Var.x = str2;
        }
        if (!(gs9Var instanceof gs9)) {
            bArr = gs9Var;
        }
        byte[] bArr3 = bArr;
        if (bArr3 == null) {
            bArr3 = new byte[0];
        }
        byte[] bArr4 = bArr3;
        a94Var.b = true;
        do {
            value = czaVar.getValue();
            byte[] bArr5 = (byte[]) value;
        } while (!czaVar.l(value, bArr4));
        return pvc.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
        if (r2.a(r3, r9) == r8) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
        if (defpackage.z1d.D(r10, r0, r9) == r8) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
        if (r2.a(r3, r9) == r8) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
        if (defpackage.z1d.v(r10, r1, r9) == r8) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object p(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f
            r2 = r0
            sj4 r2 = (defpackage.sj4) r2
            java.lang.Object r0 = r9.d
            r3 = r0
            cza r3 = (defpackage.cza) r3
            int r0 = r9.b
            r7 = 4
            r1 = 3
            r4 = 1
            r5 = 2
            n82 r8 = defpackage.n82.a
            if (r0 == 0) goto L2c
            if (r0 == r4) goto L28
            if (r0 == r5) goto L24
            if (r0 == r1) goto L28
            if (r0 != r7) goto L1d
            goto L28
        L1d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r9)
            r9 = 0
            return r9
        L24:
            defpackage.hre.r(r10)
            goto L5a
        L28:
            defpackage.hre.r(r10)
            goto L81
        L2c:
            defpackage.hre.r(r10)
            java.lang.Object r10 = r9.e
            vha r10 = (defpackage.vha) r10
            tw8 r0 = defpackage.uha.a
            if (r10 != r0) goto L40
            r9.b = r4
            java.lang.Object r9 = r2.a(r3, r9)
            if (r9 != r8) goto L81
            goto L80
        L40:
            u28 r0 = defpackage.uha.b
            r4 = r5
            r5 = 0
            if (r10 != r0) goto L63
            s7b r10 = r3.k()
            gf r0 = new gf
            r6 = 17
            r0.<init>(r4, r6, r5)
            r9.b = r4
            java.lang.Object r10 = defpackage.z1d.D(r10, r0, r9)
            if (r10 != r8) goto L5a
            goto L80
        L5a:
            r9.b = r1
            java.lang.Object r9 = r2.a(r3, r9)
            if (r9 != r8) goto L81
            goto L80
        L63:
            s7b r0 = r3.k()
            sj4 r10 = r10.b(r0)
            sj4 r10 = defpackage.z1d.A(r10)
            l r1 = new l
            java.lang.Object r4 = r9.c
            r6 = 23
            r1.<init>(r2, r3, r4, r5, r6)
            r9.b = r7
            java.lang.Object r9 = defpackage.z1d.v(r10, r1, r9)
            if (r9 != r8) goto L81
        L80:
            return r8
        L81:
            pvc r9 = defpackage.pvc.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l.p(java.lang.Object):java.lang.Object");
    }

    private final Object q(Object obj) {
        cza czaVar = (cza) this.f;
        tha thaVar = (tha) this.c;
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
            int ordinal = thaVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        lie lieVar = qga.a;
                        Object obj2 = this.d;
                        if (obj2 != lieVar) {
                            czaVar.m(obj2);
                        } else {
                            czaVar.e();
                            throw null;
                        }
                    } else {
                        xk5.o();
                        return null;
                    }
                }
            } else {
                this.c = null;
                this.b = 1;
                Object a = ((sj4) this.e).a(czaVar, this);
                n82 n82Var = n82.a;
                if (a == n82Var) {
                    return n82Var;
                }
            }
        }
        return pvc.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
        if (r1.b(r0, r8) == r7) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067 A[Catch: all -> 0x0023, TRY_LEAVE, TryCatch #0 {all -> 0x0023, blocks: (B:7:0x001f, B:18:0x0050, B:21:0x005f, B:23:0x0067, B:14:0x0033, B:17:0x004b), top: B:30:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079 A[DONT_GENERATE] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0076 -> B:18:0x0050). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object r(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.d
            pf9 r0 = (defpackage.pf9) r0
            java.lang.Object r1 = r8.c
            tj4 r1 = (defpackage.tj4) r1
            int r2 = r8.b
            pvc r3 = defpackage.pvc.a
            r4 = 2
            r5 = 1
            r6 = 0
            n82 r7 = defpackage.n82.a
            if (r2 == 0) goto L37
            if (r2 == r5) goto L2b
            if (r2 != r4) goto L25
            java.lang.Object r2 = r8.f
            qy0 r2 = (defpackage.qy0) r2
            java.lang.Object r6 = r8.e
            pl4 r6 = (defpackage.pl4) r6
            defpackage.hre.r(r9)     // Catch: java.lang.Throwable -> L23
            goto L50
        L23:
            r8 = move-exception
            goto L7d
        L25:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r6
        L2b:
            java.lang.Object r2 = r8.f
            qy0 r2 = (defpackage.qy0) r2
            java.lang.Object r6 = r8.e
            pl4 r6 = (defpackage.pl4) r6
            defpackage.hre.r(r9)     // Catch: java.lang.Throwable -> L23
            goto L5f
        L37:
            defpackage.hre.r(r9)
            r9 = -1
            r2 = 6
            xy0 r9 = defpackage.xpe.a(r9, r2, r6)
            r9.j(r3)
            pl4 r6 = new pl4
            r6.<init>(r9)
            r0.a(r6)
            qy0 r2 = new qy0     // Catch: java.lang.Throwable -> L23
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L23
        L50:
            r8.c = r1     // Catch: java.lang.Throwable -> L23
            r8.e = r6     // Catch: java.lang.Throwable -> L23
            r8.f = r2     // Catch: java.lang.Throwable -> L23
            r8.b = r5     // Catch: java.lang.Throwable -> L23
            java.lang.Object r9 = r2.a(r8)     // Catch: java.lang.Throwable -> L23
            if (r9 != r7) goto L5f
            goto L78
        L5f:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L23
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L23
            if (r9 == 0) goto L79
            r2.c()     // Catch: java.lang.Throwable -> L23
            r8.c = r1     // Catch: java.lang.Throwable -> L23
            r8.e = r6     // Catch: java.lang.Throwable -> L23
            r8.f = r2     // Catch: java.lang.Throwable -> L23
            r8.b = r4     // Catch: java.lang.Throwable -> L23
            java.lang.Object r9 = r1.b(r0, r8)     // Catch: java.lang.Throwable -> L23
            if (r9 != r7) goto L50
        L78:
            return r7
        L79:
            r0.f(r6)
            return r3
        L7d:
            r0.f(r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l.r(java.lang.Object):java.lang.Object");
    }

    private final Object s(Object obj) {
        zl9 zl9Var = (zl9) this.d;
        zg4 zg4Var = (zg4) this.f;
        d19 d19Var = (d19) this.e;
        int i = this.b;
        pvc pvcVar = pvc.a;
        if (i != 0) {
            if (i == 1) {
                hre.r(obj);
            } else {
                vs.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            hre.r(obj);
            z87.v((m82) this.c, null, null, new qq4(d19Var, zg4Var, zl9Var, (m42) null, 1), 3);
            u32 u32Var = new u32(13, zl9Var, zg4Var);
            this.b = 1;
            Object h = yae.h(d19Var, new bkc(true, u32Var, null), this);
            n82 n82Var = n82.a;
            if (h != n82Var) {
                h = pvcVar;
            }
            if (h == n82Var) {
                return n82Var;
            }
        }
        return pvcVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
        if (r11 == r9) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object t(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f
            ux r0 = (defpackage.ux) r0
            int r1 = r0.a
            java.lang.Object r2 = r10.e
            android.content.Context r2 = (android.content.Context) r2
            int r3 = r10.b
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            pvc r8 = defpackage.pvc.a
            n82 r9 = defpackage.n82.a
            if (r3 == 0) goto L32
            if (r3 == r7) goto L2a
            if (r3 == r6) goto L26
            if (r3 != r5) goto L20
            defpackage.hre.r(r11)
            return r8
        L20:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r10)
            return r4
        L26:
            defpackage.hre.r(r11)
            return r8
        L2a:
            java.lang.Object r3 = r10.c
            kba r3 = (defpackage.kba) r3
            defpackage.hre.r(r11)
            goto L49
        L32:
            defpackage.hre.r(r11)
            java.lang.Object r11 = r10.c
            r3 = r11
            kba r3 = (defpackage.kba) r3
            java.lang.String r11 = defpackage.jue.D(r1)
            r10.c = r3
            r10.b = r7
            java.lang.Object r11 = r3.a(r2, r11, r10)
            if (r11 != r9) goto L49
            goto L86
        L49:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L67
            ey r11 = new ey
            java.lang.Object r1 = r10.d
            aib r1 = (defpackage.aib) r1
            r5 = 248(0xf8, float:3.48E-43)
            r11.<init>(r1, r0, r4, r5)
            r10.c = r4
            r10.b = r6
            java.lang.Object r10 = r3.b(r2, r11, r10)
            if (r10 != r9) goto L87
            goto L86
        L67:
            java.lang.String r11 = defpackage.jue.D(r1)
            java.util.LinkedHashMap r0 = r3.a
            java.lang.Object r11 = r0.get(r11)
            ey r11 = (defpackage.ey) r11
            r11.getClass()
            r10.c = r4
            r10.b = r5
            xx r0 = defpackage.xx.a
            java.lang.Object r10 = r11.e(r0, r10)
            if (r10 != r9) goto L83
            goto L84
        L83:
            r10 = r8
        L84:
            if (r10 != r9) goto L87
        L86:
            return r9
        L87:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l.t(java.lang.Object):java.lang.Object");
    }

    private final Object u(Object obj) {
        Context context = (Context) this.f;
        GlanceAppWidgetReceiver glanceAppWidgetReceiver = (GlanceAppWidgetReceiver) this.e;
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
            m82 m82Var = (m82) this.c;
            GlanceAppWidgetReceiver.a(glanceAppWidgetReceiver, m82Var, context);
            int[] iArr = (int[]) this.d;
            ArrayList arrayList = new ArrayList(iArr.length);
            for (int i2 : iArr) {
                arrayList.add(z87.s(m82Var, null, new pf(glanceAppWidgetReceiver, context, i2, (m42) null, 6), 3));
            }
            this.b = 1;
            Object n = nxe.n(arrayList, this);
            n82 n82Var = n82.a;
            if (n == n82Var) {
                return n82Var;
            }
        }
        return pvc.a;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                l lVar = new l((j) this.e, (v) this.f, (String) obj2, m42Var, 0);
                lVar.c = obj;
                return lVar;
            case 1:
                l lVar2 = new l((Object) ((eb) this.e), (String) obj2, (Object) ((String) this.f), m42Var, 1);
                lVar2.c = obj;
                return lVar2;
            case 2:
                l lVar3 = new l((xt4) this.e, (oj) this.f, (cl6) obj2, m42Var, 2);
                lVar3.c = obj;
                return lVar3;
            case 3:
                return new l(this.c, (lq) this.e, (aw7) this.f, (aw7) obj2, m42Var, 3);
            case 4:
                l lVar4 = new l((ey) this.e, (Context) this.f, (aw7) obj2, m42Var, 4);
                lVar4.c = obj;
                return lVar4;
            case 5:
                l lVar5 = new l((aib) this.e, (Context) this.f, (uy4) obj2, m42Var, 5);
                lVar5.c = obj;
                return lVar5;
            case 6:
                return new l((sk1) this.c, (m82) this.e, (ud0) this.f, (r26) obj2, m42Var, 6);
            case 7:
                l lVar6 = new l((mq0) this.f, (String) obj2, m42Var, 7);
                lVar6.c = obj;
                return lVar6;
            case 8:
                return new l((fy0) this.f, (String) obj2, m42Var, 8);
            case 9:
                l lVar7 = new l((Object) ((uwd) this.e), (String) obj2, (Object) ((oz0) this.f), m42Var, 9);
                lVar7.c = obj;
                return lVar7;
            case 10:
                return new l((cg1) this.c, (kj6) this.e, (aw7) this.f, (aw7) obj2, m42Var, 10);
            case 11:
                return new l((kw1) this.c, (ScrollCaptureSession) this.e, (Rect) this.f, (Consumer) obj2, m42Var, 11);
            case 12:
                l lVar8 = new l((iy1) this.f, (f31) obj2, m42Var, 12);
                lVar8.c = obj;
                return lVar8;
            case 13:
                return new l((hy) this.c, (ymd) this.e, (AtomicInteger) this.f, (ListenableFuture) obj2, m42Var, 13);
            case 14:
                return new l((ConstraintTrackingWorker) this.c, (lr6) this.e, (hy) this.f, (ymd) obj2, m42Var, 14);
            case 15:
                l lVar9 = new l((d19) this.e, (a52) this.f, (xt4) obj2, m42Var, 15);
                lVar9.c = obj;
                return lVar9;
            case 16:
                l lVar10 = new l((lu4) this.e, (m41) this.f, (BroadcastReceiver.PendingResult) obj2, m42Var, 16);
                lVar10.c = obj;
                return lVar10;
            case 17:
                l lVar11 = new l((l93) obj2, m42Var, 17);
                lVar11.c = obj;
                return lVar11;
            case 18:
                l lVar12 = new l((si3) this.e, (pj3) this.f, (ff8) obj2, m42Var, 18);
                lVar12.c = obj;
                return lVar12;
            case 19:
                l lVar13 = new l((pj3) this.e, (th3) this.f, (ff8) obj2, m42Var, 19);
                lVar13.c = obj;
                return lVar13;
            case 20:
                l lVar14 = new l((a94) this.e, (h94) this.f, (String) obj2, m42Var, 20);
                lVar14.c = obj;
                return lVar14;
            case 21:
                return new l((pc4) this.c, (String) obj2, (ce4) this.e, (zl9) this.f, m42Var);
            case 22:
                l lVar15 = new l((zl9) this.f, (tj4) obj2, m42Var, 22);
                lVar15.c = ((jb1) obj).a;
                return lVar15;
            case 23:
                l lVar16 = new l((sj4) this.e, (cza) this.f, this.d, m42Var, 23);
                lVar16.c = obj;
                return lVar16;
            case 24:
                return new l((vha) this.e, (sj4) this.f, (cza) obj2, this.c, m42Var);
            case 25:
                l lVar17 = new l((pf9) obj2, m42Var, 25);
                lVar17.c = obj;
                return lVar17;
            case 26:
                l lVar18 = new l((d19) this.e, (zg4) this.f, (zl9) obj2, m42Var, 26);
                lVar18.c = obj;
                return lVar18;
            case 27:
                l lVar19 = new l((Context) this.e, (ux) this.f, (aib) obj2, m42Var, 27);
                lVar19.c = obj;
                return lVar19;
            case 28:
                l lVar20 = new l((GlanceAppWidgetReceiver) this.e, (Context) this.f, (int[]) obj2, m42Var, 28);
                lVar20.c = obj;
                return lVar20;
            default:
                l lVar21 = new l((zy4) this.e, (ux) this.f, (aib) obj2, m42Var, 29);
                lVar21.c = obj;
                return lVar21;
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                return ((l) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 1:
                return ((l) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 2:
                ((l) create((kk) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return n82.a;
            case 3:
                return ((l) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 4:
                return ((l) create((x69) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 5:
                return ((l) create((y69) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 6:
                return ((l) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 7:
                return ((l) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 8:
                return ((l) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 9:
                return ((l) create((joa) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 10:
                return ((l) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 11:
                return ((l) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 12:
                return ((l) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 13:
                return ((l) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 14:
                return ((l) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 15:
                return ((l) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 16:
                return ((l) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 17:
                return ((l) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 18:
                return ((l) create((ne) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 19:
                return ((l) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 20:
                return ((l) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 21:
                return ((l) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 22:
                Object obj3 = ((jb1) obj).a;
                l lVar = new l((zl9) this.f, (tj4) this.d, (m42) obj2, 22);
                lVar.c = obj3;
                return lVar.invokeSuspend(pvcVar);
            case 23:
                return ((l) create((tha) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 24:
                return ((l) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 25:
                return ((l) create((tj4) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 26:
                return ((l) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 27:
                return ((l) create((kba) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 28:
                return ((l) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            default:
                return ((l) create((kba) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x021e, code lost:
        if (r0 == r9) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
        if (r6 == r9) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x057d, code lost:
        if (r0 == r9) goto L387;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:584:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v44, types: [f31] */
    /* JADX WARN: Type inference failed for: r3v38, types: [f31, java.lang.Object] */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 2498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(vha vhaVar, sj4 sj4Var, cza czaVar, Object obj, m42 m42Var) {
        super(2, m42Var);
        this.a = 24;
        this.e = vhaVar;
        this.f = sj4Var;
        this.d = czaVar;
        this.c = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, Object obj2, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.f = obj;
        this.d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, Object obj2, Object obj3, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.e = obj;
        this.f = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, Object obj2, Object obj3, Object obj4, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = obj;
        this.e = obj2;
        this.f = obj3;
        this.d = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, String str, Object obj2, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.e = obj;
        this.d = str;
        this.f = obj2;
    }
}
