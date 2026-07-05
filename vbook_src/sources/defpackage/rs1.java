package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rs1  reason: default package */
/* loaded from: classes.dex */
public final class rs1 implements Iterator {
    public int a;
    public int b;
    public int c;
    public final /* synthetic */ us1 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ us1 f;

    public rs1(us1 us1Var, int i) {
        int i2;
        this.e = i;
        this.f = us1Var;
        this.d = us1Var;
        this.a = us1Var.e;
        if (us1Var.isEmpty()) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        this.b = i2;
        this.c = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        ts1 ts1Var;
        us1 us1Var = this.d;
        if (us1Var.e == this.a) {
            if (hasNext()) {
                int i = this.b;
                this.c = i;
                int i2 = this.e;
                us1 us1Var2 = this.f;
                switch (i2) {
                    case 0:
                        ts1Var = us1Var2.i()[i];
                        break;
                    case 1:
                        ts1Var = new ts1(us1Var2, i);
                        break;
                    default:
                        ts1Var = us1Var2.j()[i];
                        break;
                }
                int i3 = this.b + 1;
                if (i3 >= us1Var.f) {
                    i3 = -1;
                }
                this.b = i3;
                return ts1Var;
            }
            xk5.g();
            return null;
        }
        vs.f();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        us1 us1Var = this.d;
        if (us1Var.e == this.a) {
            if (this.c >= 0) {
                z = true;
            } else {
                z = false;
            }
            wq9.C("no calls to next() since the last call to remove()", z);
            this.a += 32;
            us1Var.remove(us1Var.i()[this.c]);
            this.b--;
            this.c = -1;
            return;
        }
        vs.f();
    }
}
