package defpackage;

import android.graphics.Path;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: in8  reason: default package */
/* loaded from: classes.dex */
public final class in8 extends t3d {
    public hy0 b;
    public float c = 1.0f;
    public List d;
    public float e;
    public float f;
    public hy0 g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public boolean o;
    public boolean p;
    public s4b q;
    public final yj r;
    public yj s;
    public yj t;
    public final ye6 u;

    public in8() {
        int i = k4d.a;
        this.d = ks3.a;
        this.e = 1.0f;
        this.h = 0;
        this.i = 0;
        this.j = 4.0f;
        this.l = 1.0f;
        this.n = true;
        this.o = true;
        yj a = dk.a();
        this.r = a;
        this.s = a;
        this.u = ipe.x(sk6.c, zx1.S);
    }

    @Override // defpackage.t3d
    public final void a(ak3 ak3Var) {
        s4b s4bVar;
        if (this.n) {
            ak0.w(this.d, this.r);
            e();
        } else if (this.p) {
            e();
        }
        this.n = false;
        this.p = false;
        hy0 hy0Var = this.b;
        if (hy0Var != null) {
            ak3.N(ak3Var, this.s, hy0Var, this.c, null, null, 0, 56);
        }
        hy0 hy0Var2 = this.g;
        if (hy0Var2 != null) {
            s4b s4bVar2 = this.q;
            if (!this.o && s4bVar2 != null) {
                s4bVar = s4bVar2;
            } else {
                s4b s4bVar3 = new s4b(this.f, this.j, this.h, this.i, null, 16);
                this.q = s4bVar3;
                this.o = false;
                s4bVar = s4bVar3;
            }
            ak3.N(ak3Var, this.s, hy0Var2, this.e, s4bVar, null, 0, 48);
        }
    }

    public final void e() {
        int i;
        int i2 = (this.k > nae.e ? 1 : (this.k == nae.e ? 0 : -1));
        yj yjVar = this.r;
        if (i2 == 0 && this.l == 1.0f) {
            this.s = yjVar;
            return;
        }
        if (c16.i(this.s, yjVar)) {
            this.s = dk.a();
        } else {
            if (this.s.a.getFillType() == Path.FillType.EVEN_ODD) {
                i = 1;
            } else {
                i = 0;
            }
            this.s.m();
            this.s.n(i);
        }
        ye6 ye6Var = this.u;
        ((bk) ye6Var.getValue()).b(yjVar);
        float length = ((bk) ye6Var.getValue()).a.getLength();
        float f = this.k;
        float f2 = this.m;
        float f3 = ((f + f2) % 1.0f) * length;
        float f4 = ((this.l + f2) % 1.0f) * length;
        if (f3 > f4) {
            yj yjVar2 = this.t;
            if (yjVar2 == null) {
                yjVar2 = dk.a();
                this.t = yjVar2;
            }
            yjVar2.l();
            ((bk) ye6Var.getValue()).a(f3, length, yjVar2);
            yj.b(this.s, yjVar2);
            yjVar2.l();
            ((bk) ye6Var.getValue()).a(nae.e, f4, yjVar2);
            yj.b(this.s, yjVar2);
            return;
        }
        ((bk) ye6Var.getValue()).a(f3, f4, this.s);
    }

    public final String toString() {
        return this.r.toString();
    }
}
