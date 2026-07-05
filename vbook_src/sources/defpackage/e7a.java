package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e7a  reason: default package */
/* loaded from: classes.dex */
public final class e7a implements npb {
    public long a = 9205357640488583168L;
    public long b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ f7a d;

    public e7a(boolean z, f7a f7aVar) {
        this.c = z;
        this.d = f7aVar;
    }

    @Override // defpackage.npb
    public final void a(long j, h6a h6aVar) {
        f6a f6aVar;
        f7a f7aVar = this.d;
        if (f7aVar.h() != null) {
            g6a i = f7aVar.i();
            i.getClass();
            boolean z = this.c;
            if (z) {
                f6aVar = i.a;
            } else {
                f6aVar = i.b;
            }
            Object e = f7aVar.a.c.e(f6aVar.c);
            if (e != null) {
                cu7 cu7Var = (cu7) e;
                sc6 c = cu7Var.c();
                if (c != null) {
                    long a = cu7Var.a(i, z);
                    if ((9223372034707292159L & a) == 9205357640488583168L) {
                        return;
                    }
                    this.a = f7aVar.m().e0(c, a7a.a(a));
                    this.b = 0L;
                    return;
                }
                ov5.d("Current selectable should have layout coordinates.");
                ls2.c();
                return;
            }
            ov5.d("SelectionRegistrar should contain the current selection's selectableIds");
            ls2.c();
        }
    }

    @Override // defpackage.npb
    public final void b() {
        f7a f7aVar = this.d;
        f7aVar.p(true);
        f7aVar.L.setValue(null);
        f7aVar.M.setValue(null);
    }

    @Override // defpackage.npb
    public final void c() {
        f7a f7aVar = this.d;
        f7aVar.p(true);
        f7aVar.L.setValue(null);
        f7aVar.M.setValue(null);
    }

    @Override // defpackage.npb
    public final void d() {
        y78 y78Var;
        g6a i;
        f6a f6aVar;
        sc6 c;
        h35 h35Var;
        boolean z = this.c;
        f7a f7aVar = this.d;
        if (z) {
            y78Var = (y78) f7aVar.J.getValue();
        } else {
            y78Var = (y78) f7aVar.K.getValue();
        }
        if (y78Var != null && (i = f7aVar.i()) != null) {
            if (z) {
                f6aVar = i.a;
            } else {
                f6aVar = i.b;
            }
            cu7 f = f7aVar.f(f6aVar);
            if (f != null && (c = f.c()) != null) {
                long a = f.a(i, z);
                if ((9223372034707292159L & a) != 9205357640488583168L) {
                    f7aVar.M.setValue(new y78(f7aVar.m().e0(c, a7a.a(a))));
                    if (z) {
                        h35Var = h35.b;
                    } else {
                        h35Var = h35.c;
                    }
                    f7aVar.L.setValue(h35Var);
                    f7aVar.p(false);
                }
            }
        }
    }

    @Override // defpackage.npb
    public final void e(long j) {
        f7a f7aVar = this.d;
        if (f7aVar.h() != null) {
            long j2 = y78.j(this.b, j);
            this.b = j2;
            long j3 = y78.j(this.a, j2);
            if (f7aVar.s(j3, this.a, this.c, abf.L)) {
                this.a = j3;
                this.b = 0L;
            }
        }
    }

    @Override // defpackage.npb
    public final void onCancel() {
        f7a f7aVar = this.d;
        f7aVar.p(true);
        f7aVar.L.setValue(null);
        f7aVar.M.setValue(null);
    }
}
