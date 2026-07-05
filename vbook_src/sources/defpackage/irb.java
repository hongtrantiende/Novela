package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: irb  reason: default package */
/* loaded from: classes.dex */
public final class irb extends uq7 {
    public final ytb C;
    public final hy0 D;
    public final boolean E;
    public final k2a F;
    public final ff8 G;
    public final sfc H;
    public final sx8 I;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final hvb e;
    public final mkc f;

    public irb(boolean z, boolean z2, boolean z3, hvb hvbVar, mkc mkcVar, ytb ytbVar, hy0 hy0Var, boolean z4, k2a k2aVar, ff8 ff8Var, sfc sfcVar, sx8 sx8Var) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = hvbVar;
        this.f = mkcVar;
        this.C = ytbVar;
        this.D = hy0Var;
        this.E = z4;
        this.F = k2aVar;
        this.G = ff8Var;
        this.H = sfcVar;
        this.I = sx8Var;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        return new lrb(this.b, this.c, this.d, this.e, this.f, this.C, this.D, this.E, this.F, this.G, this.H, this.I);
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        boolean z;
        rfc rfcVar;
        w26 w26Var;
        lrb lrbVar = (lrb) mq7Var;
        boolean K1 = lrbVar.K1();
        boolean z2 = lrbVar.M;
        mkc mkcVar = lrbVar.P;
        hvb hvbVar = lrbVar.O;
        ytb ytbVar = lrbVar.Q;
        k2a k2aVar = lrbVar.T;
        boolean z3 = this.b;
        lrbVar.M = z3;
        ytb ytbVar2 = this.C;
        ytbVar2.h = z3;
        boolean z4 = this.c;
        lrbVar.N = z4;
        hvb hvbVar2 = this.e;
        lrbVar.O = hvbVar2;
        mkc mkcVar2 = this.f;
        lrbVar.P = mkcVar2;
        lrbVar.Q = ytbVar2;
        lrbVar.R = this.D;
        lrbVar.S = this.E;
        k2a k2aVar2 = this.F;
        lrbVar.T = k2aVar2;
        lrbVar.U = this.G;
        sfc sfcVar = this.H;
        lrbVar.V = sfcVar;
        lrbVar.W = this.I;
        qsb qsbVar = lrbVar.d0;
        if (!z3 && !z4 && !this.d) {
            z = false;
        } else {
            z = true;
        }
        qsbVar.K1(mkcVar2, ytbVar2, hvbVar2, z);
        epb epbVar = lrbVar.e0;
        epbVar.M.a = null;
        epbVar.M = sfcVar;
        sfcVar.a = epbVar;
        if (epbVar.J) {
            rfcVar = rfc.c;
        } else {
            rfcVar = rfc.b;
        }
        sfcVar.b = rfcVar;
        if (!lrbVar.K1()) {
            iya iyaVar = lrbVar.Y;
            if (iyaVar != null) {
                iyaVar.cancel(null);
            }
            lrbVar.Y = null;
            ee2 ee2Var = lrbVar.X;
            if (ee2Var != null && (w26Var = (w26) ee2Var.b.getAndSet(null)) != null) {
                w26Var.cancel(null);
            }
        } else if (!z2 || !c16.i(mkcVar, mkcVar2) || !K1) {
            lrbVar.L1();
        }
        if (c16.i(mkcVar, mkcVar2) && c16.i(hvbVar, hvbVar2) && c16.i(ytbVar, ytbVar2) && c16.i(k2aVar, k2aVar2)) {
            return;
        }
        ube.y(lrbVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof irb) {
                irb irbVar = (irb) obj;
                if (this.b == irbVar.b && this.c == irbVar.c && this.d == irbVar.d && c16.i(this.e, irbVar.e) && c16.i(this.f, irbVar.f) && this.C == irbVar.C && c16.i(this.D, irbVar.D) && this.E == irbVar.E && c16.i(this.F, irbVar.F) && this.G == irbVar.G && c16.i(this.H, irbVar.H) && c16.i(this.I, irbVar.I)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int k = eub.k(eub.k(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d);
        int hashCode2 = this.f.hashCode();
        int hashCode3 = this.C.hashCode();
        int k2 = eub.k((this.D.hashCode() + ((hashCode3 + ((hashCode2 + ((this.e.hashCode() + k) * 31)) * 31)) * 31)) * 31, 31, this.E);
        int hashCode4 = this.G.hashCode();
        int hashCode5 = (this.H.hashCode() + ((hashCode4 + ((this.F.hashCode() + k2) * 31)) * 31)) * 31;
        sx8 sx8Var = this.I;
        if (sx8Var == null) {
            hashCode = 0;
        } else {
            hashCode = sx8Var.hashCode();
        }
        return hashCode5 + hashCode;
    }

    public final String toString() {
        StringBuilder p = rs8.p("TextFieldCoreModifier(isFocused=", this.b, ", isDragHovered=", this.c, ", isTouchDragInProgress=");
        p.append(this.d);
        p.append(", textLayoutState=");
        p.append(this.e);
        p.append(", textFieldState=");
        p.append(this.f);
        p.append(", textFieldSelectionState=");
        p.append(this.C);
        p.append(", cursorBrush=");
        p.append(this.D);
        p.append(", writeable=");
        p.append(this.E);
        p.append(", scrollState=");
        p.append(this.F);
        p.append(", orientation=");
        p.append(this.G);
        p.append(", toolbarRequester=");
        p.append(this.H);
        p.append(", platformSelectionBehaviors=");
        p.append(this.I);
        p.append(")");
        return p.toString();
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
    }
}
