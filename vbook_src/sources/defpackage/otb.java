package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: otb  reason: default package */
/* loaded from: classes.dex */
public final class otb implements npb {
    public final a0b a;
    public int b = -1;
    public long c = 9205357640488583168L;
    public long d = 0;
    public h35 e = h35.c;
    public boolean f = true;
    public h6a g = abf.H;
    public final /* synthetic */ ytb h;

    public otb(ytb ytbVar, a0b a0bVar) {
        this.h = ytbVar;
        this.a = a0bVar;
    }

    @Override // defpackage.npb
    public final void a(long j, h6a h6aVar) {
        ytb ytbVar = this.h;
        boolean z = ytbVar.i;
        mkc mkcVar = ytbVar.a;
        hvb hvbVar = ytbVar.b;
        if (z) {
            ytbVar.z(this.e, j);
            ytbVar.v(false);
            ytbVar.r.setValue(ntb.b);
            this.c = j;
            this.d = 0L;
            ytbVar.w = -1;
            this.f = true;
            this.g = h6aVar;
            if (hvbVar.c() != null) {
                if (!hvbVar.f(j)) {
                    int d = hvbVar.d(true, j);
                    s35 s35Var = ytbVar.k;
                    if (s35Var != null) {
                        ((dx8) s35Var).a(0);
                    }
                    mkcVar.getClass();
                    mkcVar.m(sze.a(d, d));
                    ytbVar.v(true);
                    this.f = false;
                    ytbVar.w(x2c.b);
                } else if (mkcVar.f().d.length() == 0) {
                } else {
                    int d2 = hvbVar.d(true, j);
                    long A = ytbVar.A(new grb(ytbVar.a.f(), fxb.b, null, null, null, null, null, Token.IMPORT), d2, d2, false, this.g, false, false, new t35(0));
                    mkcVar.m(A);
                    ytbVar.w(x2c.c);
                    this.b = (int) (A >> 32);
                }
            }
        }
    }

    @Override // defpackage.npb
    public final void b() {
        f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00fd, code lost:
        if (((int) (r2 & 4294967295L)) != ((int) (r16 & 4294967295L))) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ff, code lost:
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0113, code lost:
        if (((r4 + ((int) (r2 & 4294967295L))) / 2.0f) > ((r5 + ((int) (r16 & 4294967295L))) / 2.0f)) goto L43;
     */
    @Override // defpackage.npb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r19) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.otb.e(long):void");
    }

    public final void f() {
        if ((this.c & 9223372034707292159L) != 9205357640488583168L) {
            ytb ytbVar = this.h;
            ytbVar.d();
            this.b = -1;
            this.c = 9205357640488583168L;
            this.d = 0L;
            ytbVar.w = -1;
            this.g = abf.H;
            ytbVar.r.setValue(ntb.a);
            this.a.invoke();
            if (this.f) {
                ytbVar.r();
            }
        }
    }

    @Override // defpackage.npb
    public final void onCancel() {
        f();
    }

    @Override // defpackage.npb
    public final void c() {
    }

    @Override // defpackage.npb
    public final void d() {
    }
}
