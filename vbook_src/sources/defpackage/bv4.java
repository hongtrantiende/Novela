package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bv4  reason: default package */
/* loaded from: classes.dex */
public final class bv4 implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    public bv4(q9e q9eVar, String str) {
        this.a = 16;
        this.c = q9eVar;
        am8.p(str);
        this.b = str;
    }

    private final void a() {
        try {
            ((Runnable) this.c).run();
            synchronized (((r9a) this.b).e) {
                ((r9a) this.b).a();
            }
        } catch (Throwable th) {
            synchronized (((r9a) this.b).e) {
                ((r9a) this.b).a();
                throw th;
            }
        }
    }

    private final void b() {
        ymd ymdVar;
        v69 v69Var = ((egb) this.c).a.f;
        String str = (String) this.b;
        synchronized (v69Var.k) {
            try {
                nnd c = v69Var.c(str);
                if (c != null) {
                    ymdVar = c.a;
                } else {
                    ymdVar = null;
                }
            } finally {
            }
        }
        if (ymdVar != null && !c16.i(w02.j, ymdVar.j)) {
            synchronized (((egb) this.c).c) {
                ((egb) this.c).f.put(dxe.s(ymdVar), ymdVar);
                egb egbVar = (egb) this.c;
                ((egb) this.c).C.put(dxe.s(ymdVar), zld.a(egbVar.D, ymdVar, egbVar.b.b, egbVar));
            }
        }
    }

    private final void c() {
        boolean z;
        boolean z2;
        boolean z3;
        ygd ygdVar = (ygd) this.c;
        mr6 mr6Var = (mr6) ((k32) this.b).b;
        if (mr6Var == null) {
            return;
        }
        rwa rwaVar = mr6Var.a;
        try {
            byte[] bArr = ygdVar.a;
            h0e h0eVar = h0e.a;
            int i = kzd.a;
            f6f u = f6f.u(bArr, h0e.b);
            Iterator it = ((g7f) rwaVar.c).f.iterator();
            boolean z4 = false;
            while (it.hasNext()) {
                List<String> t = u.t();
                ((j5f) it.next()).getClass();
                j23 j23Var = z5f.i;
                j23Var.getClass();
                if (t != null && !t.isEmpty()) {
                    z = false;
                    for (String str : t) {
                        z4f z4fVar = (z4f) j23Var.a.get(str);
                        if (z4fVar != null) {
                            z5f z5fVar = z4fVar.a;
                            if (!z5fVar.e) {
                                z2 = true;
                            } else {
                                vz0 vz0Var = z5fVar.a;
                                if (vz0Var != null && (vz0Var.a || ((vf9) vz0Var.e).b == 3 || z5fVar.h.b())) {
                                    synchronized (z5fVar) {
                                        try {
                                            vz0 vz0Var2 = z5fVar.a;
                                            if (vz0Var2 != null) {
                                                if (!vz0Var2.a) {
                                                    if (((vf9) vz0Var2.e).b == 3) {
                                                        z3 = true;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                    if (!z3) {
                                                        if (z5fVar.h.b()) {
                                                        }
                                                    }
                                                }
                                                z5fVar.a = null;
                                                ((AtomicInteger) z5fVar.g.b).incrementAndGet();
                                            }
                                        } finally {
                                        }
                                    }
                                }
                                z2 = false;
                            }
                            z |= z2;
                        }
                    }
                } else {
                    z = false;
                }
                if (z && !z4) {
                    ((l7f) rwaVar.b).zza();
                    z4 = true;
                }
            }
        } catch (i1e unused) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:23|(1:25)(8:254|255|256|(1:258)(2:279|(4:281|260|261|(28:263|(1:265)(1:277)|266|267|269|270|271|28|(2:30|(2:32|(2:34|(2:36|(2:38|(2:40|(1:42)(1:247))(1:248))(1:249))(1:250))(1:251))(1:252))(1:253)|43|44|45|(1:47)(1:244)|48|(1:50)(1:243)|51|(1:53)|55|56|(1:58)(2:240|(8:242|(3:233|234|(6:236|(5:63|(1:65)(3:225|(3:228|(1:230)|226)|231)|(1:67)(1:224)|68|(36:70|(1:72)(1:221)|73|(1:75)|76|(1:78)(1:220)|79|(1:81)|(3:219|83|(1:85))|86|(3:214|215|(18:217|(1:102)(1:213)|103|(1:105)|106|(2:207|(1:212))(1:110)|111|(3:203|(1:205)|206)|115|(1:117)|118|(1:122)|123|(3:125|(7:127|(1:129)(1:159)|130|(1:132)|133|(4:137|(1:139)|140|(1:142))|143)(1:160)|144)(10:161|(4:163|(2:166|(6:168|(1:170)(1:200)|171|(1:173)|174|175))|201|175)(1:202)|176|(1:178)|179|180|181|182|183|(5:185|(1:187)(1:195)|(1:191)|(1:193)|194))|145|(2:147|(5:149|(1:151)|152|(1:154)|155))|156|157))(1:89)|90|(1:99)|100|(0)(0)|103|(0)|106|(1:108)|207|(1:212)|111|(1:113)|203|(0)|206|115|(0)|118|(2:120|122)|123|(0)(0)|145|(0)|156|157)(2:222|223))|232|(0)(0)|68|(0)(0)))|61|(0)|232|(0)(0)|68|(0)(0)))|59|(0)|61|(0)|232|(0)(0)|68|(0)(0))))|259|260|261|(0))|26|27|28|(0)(0)|43|44|45|(0)(0)|48|(0)(0)|51|(0)|55|56|(0)(0)|59|(0)|61|(0)|232|(0)(0)|68|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:254|255)|256|(1:258)(2:279|(4:281|260|261|(28:263|(1:265)(1:277)|266|267|269|270|271|28|(2:30|(2:32|(2:34|(2:36|(2:38|(2:40|(1:42)(1:247))(1:248))(1:249))(1:250))(1:251))(1:252))(1:253)|43|44|45|(1:47)(1:244)|48|(1:50)(1:243)|51|(1:53)|55|56|(1:58)(2:240|(8:242|(3:233|234|(6:236|(5:63|(1:65)(3:225|(3:228|(1:230)|226)|231)|(1:67)(1:224)|68|(36:70|(1:72)(1:221)|73|(1:75)|76|(1:78)(1:220)|79|(1:81)|(3:219|83|(1:85))|86|(3:214|215|(18:217|(1:102)(1:213)|103|(1:105)|106|(2:207|(1:212))(1:110)|111|(3:203|(1:205)|206)|115|(1:117)|118|(1:122)|123|(3:125|(7:127|(1:129)(1:159)|130|(1:132)|133|(4:137|(1:139)|140|(1:142))|143)(1:160)|144)(10:161|(4:163|(2:166|(6:168|(1:170)(1:200)|171|(1:173)|174|175))|201|175)(1:202)|176|(1:178)|179|180|181|182|183|(5:185|(1:187)(1:195)|(1:191)|(1:193)|194))|145|(2:147|(5:149|(1:151)|152|(1:154)|155))|156|157))(1:89)|90|(1:99)|100|(0)(0)|103|(0)|106|(1:108)|207|(1:212)|111|(1:113)|203|(0)|206|115|(0)|118|(2:120|122)|123|(0)(0)|145|(0)|156|157)(2:222|223))|232|(0)(0)|68|(0)(0)))|61|(0)|232|(0)(0)|68|(0)(0)))|59|(0)|61|(0)|232|(0)(0)|68|(0)(0))))|259|260|261|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x03e8, code lost:
        if (r11.v0() == 1) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0198, code lost:
        r6 = "Unknown";
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0263, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0264, code lost:
        defpackage.lte.m(r9);
        r9.f.g(defpackage.ppe.f0(r5), r0, "Fetching Google App Id failed with exception. appId");
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x07af  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0815  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x02a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0179 A[Catch: NameNotFoundException -> 0x0198, TryCatch #1 {NameNotFoundException -> 0x0198, blocks: (B:41:0x016e, B:43:0x0179, B:45:0x0185), top: B:286:0x016e }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0241 A[Catch: IllegalStateException -> 0x0263, TryCatch #4 {IllegalStateException -> 0x0263, blocks: (B:77:0x0238, B:81:0x0247, B:85:0x024f, B:87:0x0253, B:80:0x0241), top: B:292:0x0238 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0253 A[Catch: IllegalStateException -> 0x0263, TRY_LEAVE, TryCatch #4 {IllegalStateException -> 0x0263, blocks: (B:77:0x0238, B:81:0x0247, B:85:0x024f, B:87:0x0253, B:80:0x0241), top: B:292:0x0238 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0294  */
    /* JADX WARN: Type inference failed for: r0v47, types: [l0f, c3e, fne] */
    /* JADX WARN: Type inference failed for: r0v55, types: [pze] */
    /* JADX WARN: Type inference failed for: r2v2, types: [qve, sae] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void d() {
        /*
            Method dump skipped, instructions count: 2091
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bv4.d():void");
    }

    private final void e() {
        IBinder iBinder = (IBinder) this.c;
        r5f r5fVar = (r5f) this.b;
        synchronized (r5fVar) {
            if (iBinder == null) {
                r5fVar.b("Null service connection");
                return;
            }
            try {
                r5fVar.c = new hvc(iBinder);
                r5fVar.a = 2;
                ((ScheduledExecutorService) r5fVar.f.d).execute(new ive(r5fVar, 1));
            } catch (RemoteException e) {
                r5fVar.b(e.getMessage());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
        if (r0 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
        r0 = r0 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
        ((java.lang.Runnable) r12.b).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0061, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
        defpackage.n9a.f.a().log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r12.b), (java.lang.Throwable) r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d0, code lost:
        if (r0 == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d9, code lost:
        r0 = r0 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00da, code lost:
        ((java.lang.Runnable) r12.b).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e8, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00e9, code lost:
        defpackage.m9a.f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r12.b), (java.lang.Throwable) r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f() {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bv4.f():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:297:0x01b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a7  */
    /* JADX WARN: Type inference failed for: r1v37, types: [rh0] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v7, types: [ij5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bv4.run():void");
    }

    public String toString() {
        int i = this.a;
        String str = "IDLE";
        Object obj = this.c;
        switch (i) {
            case 0:
                zg4 zg4Var = new zg4(bv4.class.getSimpleName(), 18);
                eb5 eb5Var = new eb5(8, false);
                ((eb5) zg4Var.d).c = eb5Var;
                zg4Var.d = eb5Var;
                eb5Var.b = (av4) obj;
                return zg4Var.toString();
            case 8:
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i2 = ((m9a) obj).c;
                if (i2 != 1) {
                    if (i2 == 2) {
                        str = "QUEUING";
                    } else if (i2 == 3) {
                        str = "QUEUED";
                    } else if (i2 == 4) {
                        str = "RUNNING";
                    } else {
                        str = "null";
                    }
                }
                sb.append(str);
                sb.append("}");
                return sb.toString();
            case 9:
                Runnable runnable2 = (Runnable) this.b;
                if (runnable2 != null) {
                    return "SequentialExecutorWorker{running=" + runnable2 + "}";
                }
                StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
                int i3 = ((n9a) obj).c;
                if (i3 != 1) {
                    if (i3 == 2) {
                        str = "QUEUING";
                    } else if (i3 == 3) {
                        str = "QUEUED";
                    } else if (i3 == 4) {
                        str = "RUNNING";
                    } else {
                        str = "null";
                    }
                }
                sb2.append(str);
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ bv4(Object obj, boolean z, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ bv4(Executor executor, int i) {
        this.a = i;
        this.c = executor;
    }

    public bv4(jud judVar, nvd nvdVar) {
        this.a = 1;
        Objects.requireNonNull(judVar);
        this.c = judVar;
        this.b = nvdVar;
    }

    public /* synthetic */ bv4(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public bv4(ire ireVar, ice iceVar, ire ireVar2) {
        this.a = 20;
        this.b = iceVar;
        this.c = ireVar;
    }

    public bv4(yze yzeVar, hfe hfeVar) {
        this.a = 24;
        this.b = hfeVar;
        Objects.requireNonNull(yzeVar);
        this.c = yzeVar;
    }
}
