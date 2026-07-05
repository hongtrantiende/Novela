package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c6a  reason: default package */
/* loaded from: classes.dex */
public final class c6a extends uq7 {
    public final boolean C;
    public final int D;
    public final int E;
    public final List F;
    public final xt4 G;
    public final q6a H;
    public final qa0 I;
    public final ps b;
    public final oyb c;
    public final do4 d;
    public final xt4 e;
    public final int f;

    public c6a(ps psVar, oyb oybVar, do4 do4Var, xt4 xt4Var, int i, boolean z, int i2, int i3, List list, xt4 xt4Var2, q6a q6aVar, qa0 qa0Var) {
        this.b = psVar;
        this.c = oybVar;
        this.d = do4Var;
        this.e = xt4Var;
        this.f = i;
        this.C = z;
        this.D = i2;
        this.E = i3;
        this.F = list;
        this.G = xt4Var2;
        this.H = q6aVar;
        this.I = qa0Var;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        return new d6a(this.b, this.c, this.d, this.e, this.f, this.C, this.D, this.E, this.F, this.G, this.H, this.I);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    @Override // defpackage.uq7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.mq7 r13) {
        /*
            r12 = this;
            d6a r13 = (defpackage.d6a) r13
            zlb r0 = r13.N
            oyb r1 = r0.L
            oyb r3 = r12.c
            if (r3 == r1) goto L17
            uva r2 = r3.a
            uva r1 = r1.a
            boolean r1 = r2.c(r1)
            if (r1 == 0) goto L15
            goto L1a
        L15:
            r1 = 1
            goto L1b
        L17:
            r3.getClass()
        L1a:
            r1 = 0
        L1b:
            ps r2 = r12.b
            boolean r11 = r0.M1(r2)
            zlb r2 = r13.N
            java.util.List r4 = r12.F
            int r5 = r12.E
            int r6 = r12.D
            boolean r7 = r12.C
            do4 r8 = r12.d
            int r9 = r12.f
            qa0 r10 = r12.I
            boolean r2 = r2.L1(r3, r4, r5, r6, r7, r8, r9, r10)
            xt4 r3 = r12.e
            xt4 r4 = r12.G
            q6a r12 = r12.H
            r5 = 0
            boolean r3 = r0.K1(r3, r4, r12, r5)
            r0.H1(r1, r11, r2, r3)
            r13.M = r12
            if (r12 == 0) goto L54
            ai6 r0 = r13.K1()
            ij1 r1 = r12.d
            r2 = 3
            ij1 r0 = defpackage.ij1.r(r1, r5, r5, r0, r2)
            r12.d = r0
        L54:
            defpackage.ube.y(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c6a.d(mq7):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c6a) {
                c6a c6aVar = (c6a) obj;
                if (c16.i(this.b, c6aVar.b) && c16.i(this.c, c6aVar.c) && c16.i(this.F, c6aVar.F) && c16.i(this.d, c6aVar.d) && c16.i(this.I, c6aVar.I) && this.e == c6aVar.e && this.f == c6aVar.f && this.C == c6aVar.C && this.D == c6aVar.D && this.E == c6aVar.E && this.G == c6aVar.G && c16.i(this.H, c6aVar.H)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int hashCode = (this.d.hashCode() + eub.m(this.c, this.b.hashCode() * 31, 31)) * 31;
        int i5 = 0;
        xt4 xt4Var = this.e;
        if (xt4Var != null) {
            i = xt4Var.hashCode();
        } else {
            i = 0;
        }
        int k = (((eub.k(hl5.a(this.f, (hashCode + i) * 31, 31), 31, this.C) + this.D) * 31) + this.E) * 31;
        List list = this.F;
        if (list != null) {
            i2 = list.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (k + i2) * 31;
        xt4 xt4Var2 = this.G;
        if (xt4Var2 != null) {
            i3 = xt4Var2.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        q6a q6aVar = this.H;
        if (q6aVar != null) {
            i4 = q6aVar.hashCode();
        } else {
            i4 = 0;
        }
        int i8 = (i7 + i4) * 31;
        qa0 qa0Var = this.I;
        if (qa0Var != null) {
            i5 = qa0Var.hashCode();
        }
        return (i8 + i5) * 31;
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
    }
}
