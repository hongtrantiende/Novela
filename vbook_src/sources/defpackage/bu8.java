package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bu8  reason: default package */
/* loaded from: classes.dex */
public class bu8 extends zt8 {
    public int C;
    public final au8 d;
    public Object e;
    public boolean f;

    public bu8(au8 au8Var, aoc[] aocVarArr) {
        super(au8Var.c, aocVarArr);
        this.d = au8Var;
        this.C = au8Var.e;
    }

    public final void c(int i, znc zncVar, Object obj, int i2) {
        int i3 = i2 * 5;
        aoc[] aocVarArr = this.a;
        if (i3 > 30) {
            aoc aocVar = aocVarArr[i2];
            Object[] objArr = zncVar.d;
            aocVar.a(objArr, objArr.length, 0);
            while (true) {
                aoc aocVar2 = aocVarArr[i2];
                if (!c16.i(aocVar2.a[aocVar2.c], obj)) {
                    aocVarArr[i2].c += 2;
                } else {
                    this.b = i2;
                    return;
                }
            }
        } else {
            int o = 1 << nae.o(i, i3);
            if (zncVar.h(o)) {
                aocVarArr[i2].a(zncVar.d, Integer.bitCount(zncVar.a) * 2, zncVar.f(o));
                this.b = i2;
                return;
            }
            int t = zncVar.t(o);
            znc s = zncVar.s(t);
            aocVarArr[i2].a(zncVar.d, Integer.bitCount(zncVar.a) * 2, t);
            c(i, s, obj, i2 + 1);
        }
    }

    @Override // defpackage.zt8, java.util.Iterator
    public final Object next() {
        if (this.d.e == this.C) {
            if (this.c) {
                aoc aocVar = this.a[this.b];
                this.e = aocVar.a[aocVar.c];
                this.f = true;
                return super.next();
            }
            xk5.g();
            return null;
        }
        vs.f();
        return null;
    }

    @Override // defpackage.zt8, java.util.Iterator
    public final void remove() {
        int i;
        if (this.f) {
            boolean z = this.c;
            au8 au8Var = this.d;
            if (z) {
                if (z) {
                    aoc aocVar = this.a[this.b];
                    Object obj = aocVar.a[aocVar.c];
                    jsc.s(au8Var).remove(this.e);
                    if (obj != null) {
                        i = obj.hashCode();
                    } else {
                        i = 0;
                    }
                    c(i, au8Var.c, obj, 0);
                } else {
                    xk5.g();
                    return;
                }
            } else {
                jsc.s(au8Var).remove(this.e);
            }
            this.e = null;
            this.f = false;
            this.C = au8Var.e;
            return;
        }
        vm1.d();
    }
}
