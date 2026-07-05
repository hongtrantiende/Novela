package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w2f  reason: default package */
/* loaded from: classes.dex */
public final class w2f extends fne {
    public ScheduledExecutorService C;
    public final zg1 D;
    public final ArrayList E;
    public final u1f F;
    public final r2f c;
    public lne d;
    public volatile Boolean e;
    public final u1f f;

    public w2f(lte lteVar) {
        super(lteVar);
        this.E = new ArrayList();
        this.D = new zg1(lteVar.G);
        this.c = new r2f(this);
        this.f = new u1f(this, lteVar, 0);
        this.F = new u1f(this, lteVar, 1);
    }

    @Override // defpackage.fne
    public final boolean a0() {
        return false;
    }

    public final void b0(AtomicReference atomicReference) {
        W();
        Y();
        l0(new gp9(this, atomicReference, n0(false)));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c0(android.os.Bundle r8) {
        /*
            r7 = this;
            r7.W()
            r7.Y()
            dbe r4 = new dbe
            r4.<init>(r8)
            r7.j0()
            java.lang.Object r0 = r7.a
            lte r0 = (defpackage.lte) r0
            t7e r1 = r0.d
            r2 = 0
            wme r3 = defpackage.yme.W0
            boolean r1 = r1.i0(r2, r3)
            r2 = 0
            if (r1 == 0) goto L59
            toe r0 = r0.o()
            java.lang.Object r1 = r0.a
            lte r1 = (defpackage.lte) r1
            l6f r3 = r1.E
            ppe r1 = r1.f
            defpackage.lte.k(r3)
            byte[] r3 = defpackage.l6f.H0(r4)
            if (r3 != 0) goto L3f
            defpackage.lte.m(r1)
            s56 r0 = r1.C
            java.lang.String r1 = "Null default event parameters; not writing to database"
            r0.e(r1)
        L3d:
            r0 = r2
            goto L54
        L3f:
            int r5 = r3.length
            r6 = 131072(0x20000, float:1.83671E-40)
            if (r5 <= r6) goto L4f
            defpackage.lte.m(r1)
            s56 r0 = r1.C
            java.lang.String r1 = "Default event parameters too long for local database. Sending directly to service"
            r0.e(r1)
            goto L3d
        L4f:
            r1 = 4
            boolean r0 = r0.e0(r3, r1)
        L54:
            if (r0 == 0) goto L59
            r0 = 1
            r3 = r0
            goto L5a
        L59:
            r3 = r2
        L5a:
            d8f r2 = r7.n0(r2)
            gne r0 = new gne
            r1 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r1.l0(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w2f.c0(android.os.Bundle):void");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [bpe, rh0] */
    public final void d0() {
        W();
        Y();
        if (!o0()) {
            if (!e0()) {
                lte lteVar = (lte) this.a;
                if (!lteVar.d.a0()) {
                    List<ResolveInfo> queryIntentServices = lteVar.a.getPackageManager().queryIntentServices(new Intent().setClassName(lteVar.a, "com.google.android.gms.measurement.AppMeasurementService"), Parser.ARGC_LIMIT);
                    if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                        Intent intent = new Intent("com.google.android.gms.measurement.START");
                        intent.setComponent(new ComponentName(lteVar.a, "com.google.android.gms.measurement.AppMeasurementService"));
                        r2f r2fVar = this.c;
                        w2f w2fVar = r2fVar.c;
                        w2fVar.W();
                        Context context = ((lte) w2fVar.a).a;
                        tz1 b = tz1.b();
                        synchronized (r2fVar) {
                            try {
                                boolean z = r2fVar.a;
                                w2f w2fVar2 = r2fVar.c;
                                if (z) {
                                    ppe ppeVar = ((lte) w2fVar2.a).f;
                                    lte.m(ppeVar);
                                    ppeVar.J.e("Connection attempt already in progress");
                                    return;
                                }
                                ppe ppeVar2 = ((lte) w2fVar2.a).f;
                                lte.m(ppeVar2);
                                ppeVar2.J.e("Using local app measurement service");
                                r2fVar.a = true;
                                b.a(context, intent, w2fVar2.c, Token.DEFAULT);
                                return;
                            } finally {
                            }
                        }
                    }
                    ppe ppeVar3 = lteVar.f;
                    lte.m(ppeVar3);
                    ppeVar3.f.e("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                    return;
                }
                return;
            }
            r2f r2fVar2 = this.c;
            w2f w2fVar3 = r2fVar2.c;
            w2fVar3.W();
            Context context2 = ((lte) w2fVar3.a).a;
            synchronized (r2fVar2) {
                try {
                    if (r2fVar2.a) {
                        ppe ppeVar4 = ((lte) r2fVar2.c.a).f;
                        lte.m(ppeVar4);
                        ppeVar4.J.e("Connection attempt already in progress");
                    } else if (r2fVar2.b != null && (r2fVar2.b.q() || r2fVar2.b.p())) {
                        ppe ppeVar5 = ((lte) r2fVar2.c.a).f;
                        lte.m(ppeVar5);
                        ppeVar5.J.e("Already awaiting connection attempt");
                    } else {
                        r2fVar2.b = new rh0(context2, Looper.getMainLooper(), w6f.a(context2), vz4.b, 93, r2fVar2, r2fVar2, null);
                        ppe ppeVar6 = ((lte) r2fVar2.c.a).f;
                        lte.m(ppeVar6);
                        ppeVar6.J.e("Connecting to remote service");
                        r2fVar2.a = true;
                        am8.s(r2fVar2.b);
                        r2fVar2.b.a();
                    }
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e0() {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w2f.e0():boolean");
    }

    public final void f0() {
        W();
        Y();
        r2f r2fVar = this.c;
        if (r2fVar.b != null && (r2fVar.b.p() || r2fVar.b.q())) {
            r2fVar.b.c();
        }
        r2fVar.b = null;
        try {
            tz1.b().c(((lte) this.a).a, r2fVar);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.d = null;
    }

    public final boolean g0() {
        W();
        Y();
        if (e0()) {
            l6f l6fVar = ((lte) this.a).E;
            lte.k(l6fVar);
            if (l6fVar.J0() < ((Integer) yme.J0.a(null)).intValue()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean h0() {
        W();
        Y();
        if (e0()) {
            l6f l6fVar = ((lte) this.a).E;
            lte.k(l6fVar);
            if (l6fVar.J0() < 241200) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void i0(ComponentName componentName) {
        W();
        if (this.d != null) {
            this.d = null;
            ppe ppeVar = ((lte) this.a).f;
            lte.m(ppeVar);
            ppeVar.J.f(componentName, "Disconnected from device MeasurementService");
            W();
            d0();
        }
    }

    public final void j0() {
        ((lte) this.a).getClass();
    }

    public final void k0() {
        W();
        zg1 zg1Var = this.D;
        ((kh5) zg1Var.c).getClass();
        zg1Var.b = SystemClock.elapsedRealtime();
        ((lte) this.a).getClass();
        this.f.b(((Long) yme.Y.a(null)).longValue());
    }

    public final void l0(Runnable runnable) {
        W();
        if (o0()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.E;
        lte lteVar = (lte) this.a;
        lteVar.getClass();
        if (arrayList.size() >= 1000) {
            ppe ppeVar = lteVar.f;
            lte.m(ppeVar);
            ppeVar.f.e("Discarding data. Max runnable queue size reached");
            return;
        }
        arrayList.add(runnable);
        this.F.b(60000L);
        d0();
    }

    public final void m0() {
        W();
        lte lteVar = (lte) this.a;
        ppe ppeVar = lteVar.f;
        lte.m(ppeVar);
        s56 s56Var = ppeVar.J;
        ArrayList arrayList = this.E;
        s56Var.f(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            try {
                ((Runnable) obj).run();
            } catch (RuntimeException e) {
                ppe ppeVar2 = lteVar.f;
                lte.m(ppeVar2);
                ppeVar2.f.f(e, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.F.c();
    }

    public final d8f n0(boolean z) {
        long abs;
        Pair pair;
        lte lteVar = (lte) this.a;
        lteVar.getClass();
        joe r = lteVar.r();
        String str = null;
        if (z) {
            ppe ppeVar = lteVar.f;
            lte.m(ppeVar);
            lte lteVar2 = (lte) ppeVar.a;
            dre dreVar = lteVar2.e;
            lte.k(dreVar);
            if (dreVar.e != null) {
                dre dreVar2 = lteVar2.e;
                lte.k(dreVar2);
                zqe zqeVar = dreVar2.e;
                dre dreVar3 = (dre) zqeVar.e;
                dreVar3.W();
                dreVar3.W();
                long j = ((dre) zqeVar.e).b0().getLong((String) zqeVar.b, 0L);
                if (j == 0) {
                    zqeVar.b();
                    abs = 0;
                } else {
                    ((lte) dreVar3.a).G.getClass();
                    abs = Math.abs(j - System.currentTimeMillis());
                }
                long j2 = zqeVar.a;
                if (abs >= j2) {
                    if (abs > j2 + j2) {
                        zqeVar.b();
                    } else {
                        String string = dreVar3.b0().getString((String) zqeVar.d, null);
                        long j3 = dreVar3.b0().getLong((String) zqeVar.c, 0L);
                        zqeVar.b();
                        if (string != null && j3 > 0) {
                            pair = new Pair(string, Long.valueOf(j3));
                        } else {
                            pair = dre.V;
                        }
                        if (pair != null && pair != dre.V) {
                            String valueOf = String.valueOf(pair.second);
                            String str2 = (String) pair.first;
                            str = nk2.v(new StringBuilder(valueOf.length() + 1 + String.valueOf(str2).length()), valueOf, ":", str2);
                        }
                    }
                }
                pair = null;
                if (pair != null) {
                    String valueOf2 = String.valueOf(pair.second);
                    String str22 = (String) pair.first;
                    str = nk2.v(new StringBuilder(valueOf2.length() + 1 + String.valueOf(str22).length()), valueOf2, ":", str22);
                }
            }
        }
        return r.b0(str);
    }

    public final boolean o0() {
        W();
        Y();
        if (this.d != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x02d5 A[Catch: all -> 0x01fd, SQLiteException -> 0x02af, SQLiteDatabaseLockedException -> 0x02b4, SQLiteFullException -> 0x02b8, TryCatch #60 {all -> 0x01fd, blocks: (B:101:0x01d8, B:103:0x01ec, B:105:0x01f1, B:117:0x0215, B:118:0x0218, B:116:0x0211, B:121:0x021e, B:123:0x0232, B:130:0x024a, B:131:0x0253, B:132:0x0256, B:128:0x0244, B:135:0x025a, B:137:0x026e, B:144:0x0286, B:145:0x0290, B:146:0x0293, B:142:0x0280, B:149:0x0297, B:153:0x02ab, B:168:0x02d5, B:170:0x02df, B:171:0x02e2, B:166:0x02cf, B:179:0x02f1, B:180:0x02fc, B:205:0x035c), top: B:403:0x01d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x043a A[Catch: all -> 0x0476, TRY_ENTER, TryCatch #50 {all -> 0x0476, blocks: (B:268:0x0466, B:258:0x043a, B:260:0x0440, B:261:0x0443, B:278:0x0487, B:207:0x0371, B:209:0x037b, B:214:0x038c), top: B:393:0x0466 }] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0597 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:456:0x049c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:457:0x049c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:459:0x049c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p0(defpackage.lne r70, defpackage.o3 r71, defpackage.d8f r72) {
        /*
            Method dump skipped, instructions count: 1751
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w2f.p0(lne, o3, d8f):void");
    }

    public final void q0(i4e i4eVar) {
        boolean e0;
        W();
        Y();
        lte lteVar = (lte) this.a;
        lteVar.getClass();
        toe o = lteVar.o();
        lte lteVar2 = (lte) o.a;
        lte.k(lteVar2.E);
        byte[] H0 = l6f.H0(i4eVar);
        if (H0.length > 131072) {
            ppe ppeVar = lteVar2.f;
            lte.m(ppeVar);
            ppeVar.C.e("Conditional user property too long for local database. Sending directly to service");
            e0 = false;
        } else {
            e0 = o.e0(H0, 2);
        }
        l0(new l1f(this, n0(true), e0, new i4e(i4eVar)));
    }
}
