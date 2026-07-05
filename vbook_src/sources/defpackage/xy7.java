package defpackage;

import android.media.AudioManager;
import java.util.Map;
import java.util.regex.Pattern;
import org.mozilla.javascript.Context;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xy7  reason: default package */
/* loaded from: classes3.dex */
public final class xy7 implements j9d {
    public static final long i;
    public static final long j;
    public static final /* synthetic */ int k = 0;
    public final q9d a;
    public final t50 b;
    public boolean c;
    public Map d;
    public xic e;
    public boolean f;
    public final m41 g;
    public iya h;

    static {
        hq7 hq7Var = wl3.b;
        i = jue.O(Context.VERSION_ECMASCRIPT, am3.MILLISECONDS);
        j = jue.O(1, am3.SECONDS);
    }

    public xy7(q9d q9dVar, t50 t50Var) {
        q9dVar.getClass();
        t50Var.getClass();
        this.a = q9dVar;
        this.b = t50Var;
        this.d = ls3.a;
        b9b b = rse.b();
        sw2 sw2Var = ab3.a;
        this.g = k27.a(nq2.C(b, zz6.a));
    }

    public static vad s(xic xicVar) {
        String str = xicVar.b;
        String str2 = xicVar.e;
        String str3 = xicVar.c;
        Map map = xicVar.d;
        boolean z = true;
        if (!r4b.Q(str, "data:", true)) {
            Pattern compile = Pattern.compile("^[a-zA-Z][a-zA-Z0-9+.-]*:");
            compile.getClass();
            if (!compile.matcher(str).find()) {
                z = false;
            }
        }
        String str4 = xicVar.b;
        if (z) {
            return new syc(str4, str3, str2, map);
        }
        return new fi2(str4, str3, str2, map);
    }

    public final boolean a() {
        if (this.c && !this.f) {
            return true;
        }
        return false;
    }

    @Override // defpackage.j9d
    public final void b(float f) {
        ny8 ny8Var;
        uwd uwdVar = this.a.a.L;
        r0f r0fVar = r0f.K;
        ny8 ny8Var2 = (ny8) ((nb4) ((Map) uwdVar.b).get(r0fVar));
        if (ny8Var2 != null) {
            ny8Var2.a(f);
        }
        if (a() && (ny8Var = (ny8) ((nb4) ((Map) this.b.a.L.b).get(r0fVar))) != null) {
            ny8Var.a(f);
        }
    }

    @Override // defpackage.j9d
    public final void c(boolean z) {
        if (a()) {
            return;
        }
        this.a.d(z);
    }

    @Override // defpackage.j9d
    public final void close() {
        iya iyaVar = this.h;
        if (iyaVar != null) {
            iyaVar.cancel(null);
        }
        this.h = null;
        k27.n(this.g, null);
        boolean z = this.c;
        t50 t50Var = this.b;
        if (z) {
            x04 x04Var = t50Var.a;
            if (((py8) x04Var.b.getValue()).compareTo(py8.e) >= 0) {
                x04Var.S();
                cza czaVar = x04Var.c;
                s04 s04Var = (s04) czaVar.getValue();
                czaVar.m(null);
                if (s04Var != null) {
                    s04Var.a();
                }
            }
        }
        this.c = false;
        this.f = false;
        t50Var.a.close();
        this.a.a.close();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(8:18|(1:20)|21|(3:23|(2:25|(1:27))|28)|29|30|31|(1:33))|11|12|13))|35|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    @Override // defpackage.j9d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.xic r7, defpackage.m42 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.wy7
            if (r0 == 0) goto L13
            r0 = r8
            wy7 r0 = (defpackage.wy7) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wy7 r0 = new wy7
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            int r1 = r0.c
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L26
            defpackage.hre.r(r8)     // Catch: java.lang.Throwable -> L85
            goto L80
        L26:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r3
        L2c:
            defpackage.hre.r(r8)
            r6.e = r7
            java.util.Map r8 = r7.d
            r6.d = r8
            iya r8 = r6.h
            if (r8 == 0) goto L3c
            r8.cancel(r3)
        L3c:
            r6.h = r3
            boolean r8 = r6.c
            r1 = 0
            if (r8 == 0) goto L6d
            t50 r8 = r6.b
            x04 r8 = r8.a
            cza r4 = r8.b
            java.lang.Object r4 = r4.getValue()
            py8 r4 = (defpackage.py8) r4
            py8 r5 = defpackage.py8.e
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L58
            goto L6b
        L58:
            r8.S()
            cza r8 = r8.c
            java.lang.Object r4 = r8.getValue()
            s04 r4 = (defpackage.s04) r4
            r8.m(r3)
            if (r4 == 0) goto L6b
            r4.a()
        L6b:
            r6.c = r1
        L6d:
            r6.f = r1
            q9d r6 = r6.a     // Catch: java.lang.Throwable -> L85
            vad r7 = s(r7)     // Catch: java.lang.Throwable -> L85
            r0.c = r2     // Catch: java.lang.Throwable -> L85
            java.lang.Object r8 = r6.b(r7, r3, r0)     // Catch: java.lang.Throwable -> L85
            n82 r6 = defpackage.n82.a
            if (r8 != r6) goto L80
            return r6
        L80:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L85
            r8.getClass()     // Catch: java.lang.Throwable -> L85
        L85:
            pvc r6 = defpackage.pvc.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xy7.d(xic, m42):java.lang.Object");
    }

    @Override // defpackage.j9d
    public final void e() {
        q9d q9dVar = this.a;
        boolean a = q9dVar.a();
        x04 x04Var = q9dVar.a;
        x04Var.getClass();
        py8 py8Var = (py8) x04Var.b.getValue();
        if (py8Var == py8.C) {
            x04Var.q();
        } else if (py8Var == py8.f) {
            x04Var.C();
        }
        if (a()) {
            t50 t50Var = this.b;
            if (a) {
                t50Var.a.q();
            } else {
                t50Var.a.C();
            }
        }
    }

    @Override // defpackage.j9d
    public final void f(long j2) {
        q9d q9dVar = this.a;
        x04 x04Var = q9dVar.a;
        long e = wl3.e(j2);
        x04Var.getClass();
        x04Var.G(x04Var.E.k() + e);
        if (a()) {
            this.b.a.G(wl3.e(jue.P(((Number) q9dVar.a.K.getValue()).longValue(), am3.MILLISECONDS)));
        }
    }

    @Override // defpackage.j9d
    public final sj4 g() {
        return new mx(this.a.a.F, 16);
    }

    @Override // defpackage.j9d
    public final aza h() {
        return this.a.b;
    }

    @Override // defpackage.j9d
    public final void i() {
        xy7 xy7Var;
        if (!this.c) {
            return;
        }
        iya iyaVar = this.h;
        if (iyaVar != null) {
            iyaVar.cancel(null);
        }
        this.h = null;
        q9d q9dVar = this.a;
        long longValue = ((Number) q9dVar.a.K.getValue()).longValue();
        boolean a = q9dVar.a();
        if (this.f) {
            xic xicVar = this.e;
            if (xicVar != null) {
                xy7Var = this;
                z87.v(xy7Var.g, null, null, new vy7(xy7Var, xicVar, longValue, a, null), 3);
            } else {
                xy7Var = this;
            }
        } else {
            xy7Var = this;
            x04 x04Var = xy7Var.b.a;
            if (((py8) x04Var.b.getValue()).compareTo(py8.e) >= 0) {
                x04Var.S();
                cza czaVar = x04Var.c;
                s04 s04Var = (s04) czaVar.getValue();
                czaVar.m(null);
                if (s04Var != null) {
                    s04Var.a();
                }
            }
            q9dVar.d(false);
        }
        xy7Var.c = false;
        xy7Var.f = false;
    }

    @Override // defpackage.j9d
    public final void j() {
        this.a.a.q();
        if (a()) {
            this.b.a.q();
        }
    }

    @Override // defpackage.j9d
    public final void k(float f) {
        q9d q9dVar = this.a;
        q9dVar.getClass();
        if (tte.j(q9dVar, f)) {
            return;
        }
        uwd uwdVar = q9dVar.a.L;
        if (((nb4) ((Map) uwdVar.b).get(cne.b)) == null) {
            tte.j(q9dVar, f);
        } else {
            vm1.h();
        }
    }

    @Override // defpackage.j9d
    public final void l(long j2) {
        this.a.a.G(wl3.e(j2));
        if (a()) {
            this.b.a.G(wl3.e(j2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0199  */
    @Override // defpackage.j9d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(java.lang.String r20, java.util.Map r21, java.lang.String r22, defpackage.m42 r23) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xy7.m(java.lang.String, java.util.Map, java.lang.String, m42):java.lang.Object");
    }

    @Override // defpackage.j9d
    public final Float n() {
        android.content.Context context;
        Object obj;
        AudioManager audioManager;
        int streamMaxVolume;
        q9d q9dVar = this.a;
        q9dVar.getClass();
        Object obj2 = q9dVar.c;
        if (obj2 instanceof android.content.Context) {
            context = (android.content.Context) obj2;
        } else {
            context = null;
        }
        if (context != null) {
            obj = context.getSystemService("audio");
        } else {
            obj = null;
        }
        if (obj instanceof AudioManager) {
            audioManager = (AudioManager) obj;
        } else {
            audioManager = null;
        }
        if (audioManager == null || (streamMaxVolume = audioManager.getStreamMaxVolume(3)) <= 0) {
            return null;
        }
        return Float.valueOf(dce.m(audioManager.getStreamVolume(3) / streamMaxVolume, nae.e, 1.0f));
    }

    @Override // defpackage.j9d
    public final sj4 o() {
        x04 x04Var = this.a.a;
        x04Var.getClass();
        return new yh2(1, new mx(x04Var.F, 4), x04Var.K, new aab(3, null));
    }

    @Override // defpackage.j9d
    public final sj4 p() {
        return new mx(this.a.a.b, 15);
    }

    @Override // defpackage.j9d
    public final void q() {
        this.a.c();
        if (a()) {
            this.b.a.C();
        }
    }

    @Override // defpackage.j9d
    public final cza r() {
        return this.a.a.K;
    }

    @Override // defpackage.j9d
    public final void stop() {
        x04 x04Var = this.a.a;
        py8 py8Var = py8.e;
        if (((py8) x04Var.b.getValue()).compareTo(py8Var) >= 0) {
            x04Var.S();
            cza czaVar = x04Var.c;
            s04 s04Var = (s04) czaVar.getValue();
            czaVar.m(null);
            if (s04Var != null) {
                s04Var.a();
            }
        }
        if (a()) {
            x04 x04Var2 = this.b.a;
            if (((py8) x04Var2.b.getValue()).compareTo(py8Var) >= 0) {
                x04Var2.S();
                cza czaVar2 = x04Var2.c;
                s04 s04Var2 = (s04) czaVar2.getValue();
                czaVar2.m(null);
                if (s04Var2 != null) {
                    s04Var2.a();
                }
            }
        }
    }
}
