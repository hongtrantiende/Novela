package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uz  reason: default package */
/* loaded from: classes.dex */
public final class uz implements Iterator, j76 {
    public int a;
    public int b;
    public boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public uz(yz yzVar, int i) {
        this(yzVar.c);
        this.d = i;
        switch (i) {
            case 1:
                this.e = yzVar;
                this(yzVar.c);
                return;
            default:
                this.e = yzVar;
                return;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b < this.a) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object e;
        if (hasNext()) {
            int i = this.b;
            int i2 = this.d;
            Object obj = this.e;
            switch (i2) {
                case 0:
                    e = ((yz) obj).e(i);
                    break;
                case 1:
                    e = ((yz) obj).h(i);
                    break;
                default:
                    e = ((a00) obj).b[i];
                    break;
            }
            this.b++;
            this.c = true;
            return e;
        }
        xk5.g();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.c) {
            int i = this.b - 1;
            this.b = i;
            int i2 = this.d;
            Object obj = this.e;
            switch (i2) {
                case 0:
                    ((yz) obj).f(i);
                    break;
                case 1:
                    ((yz) obj).f(i);
                    break;
                default:
                    ((a00) obj).a(i);
                    break;
            }
            this.a--;
            this.c = false;
            return;
        }
        vs.k("Call next() before removing an element.");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public uz(a00 a00Var) {
        this(a00Var.c);
        this.d = 2;
        this.e = a00Var;
    }

    public uz(int i) {
        this.a = i;
    }
}
