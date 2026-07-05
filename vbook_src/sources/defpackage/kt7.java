package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kt7  reason: default package */
/* loaded from: classes.dex */
public final class kt7 implements r13 {
    public fvb a;
    public final /* synthetic */ lt7 b;

    public kt7(lt7 lt7Var) {
        this.b = lt7Var;
    }

    @Override // defpackage.r13
    public final float G0() {
        r13 r13Var = this.b.k;
        r13Var.getClass();
        return r13Var.G0();
    }

    public final fvb a(long j, long j2) {
        long j3;
        long j4;
        lt7 lt7Var = this.b;
        oyb oybVar = lt7Var.l;
        if (e4c.d(j2)) {
            j3 = mt7.a(lt7Var.l.a.b, j2);
        } else {
            j3 = j2;
        }
        if (!e4c.a(j3, lt7Var.l.a.b)) {
            lt7Var.f(oyb.a(lt7Var.l, 0L, j3, null, null, null, 0L, null, 0, 0L, null, 16777213));
        }
        if (lt7Var.f > 1) {
            tc6 tc6Var = lt7Var.n;
            tc6Var.getClass();
            j4 = lt7Var.h(j, tc6Var);
        } else {
            j4 = j;
        }
        tc6 tc6Var2 = lt7Var.n;
        tc6Var2.getClass();
        it7 b = lt7Var.b(j4, tc6Var2);
        tc6 tc6Var3 = lt7Var.n;
        tc6Var3.getClass();
        fvb g = lt7Var.g(tc6Var3, j4, b);
        this.a = g;
        lt7Var.f(oybVar);
        return g;
    }

    @Override // defpackage.r13
    public final float f() {
        r13 r13Var = this.b.k;
        r13Var.getClass();
        return r13Var.f();
    }

    @Override // defpackage.r13
    public final float k1(long j) {
        if (e4c.d(j)) {
            lt7 lt7Var = this.b;
            if (!e4c.d(lt7Var.l.a.b)) {
                if (!e4c.a(lt7Var.l.a.b, e4c.c)) {
                    return e4c.c(j) * k1(lt7Var.l.a.b);
                }
                vs.k("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is not set. Please specify a font size.");
                return nae.e;
            }
            vs.k("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is Em\nDeclare the composable's style.fontSize with Sp units instead.");
            return nae.e;
        }
        return f() * c0(j);
    }
}
