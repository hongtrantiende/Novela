package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o07  reason: default package */
/* loaded from: classes3.dex */
public final class o07 extends q07 implements Iterator, j76 {
    public final /* synthetic */ int e;

    public o07(r07 r07Var, int i) {
        this.e = i;
        r07Var.getClass();
        this.d = r07Var;
        this.b = -1;
        this.c = r07Var.D;
        c();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                b();
                int i = this.a;
                r07 r07Var = (r07) this.d;
                if (i < r07Var.f) {
                    this.a = i + 1;
                    this.b = i;
                    p07 p07Var = new p07(r07Var, i);
                    c();
                    return p07Var;
                }
                xk5.g();
                return null;
            case 1:
                b();
                int i2 = this.a;
                r07 r07Var2 = (r07) this.d;
                if (i2 < r07Var2.f) {
                    this.a = i2 + 1;
                    this.b = i2;
                    Object obj = r07Var2.a[i2];
                    c();
                    return obj;
                }
                xk5.g();
                return null;
            default:
                b();
                int i3 = this.a;
                r07 r07Var3 = (r07) this.d;
                if (i3 < r07Var3.f) {
                    this.a = i3 + 1;
                    this.b = i3;
                    Object[] objArr = r07Var3.b;
                    objArr.getClass();
                    Object obj2 = objArr[this.b];
                    c();
                    return obj2;
                }
                xk5.g();
                return null;
        }
    }
}
