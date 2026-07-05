package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d26  reason: default package */
/* loaded from: classes.dex */
public final class d26 extends jwc {
    public int b;
    public Object c;
    public final /* synthetic */ int d;
    public final Iterator e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d26(bca bcaVar) {
        this();
        this.d = 1;
        this.f = bcaVar;
        this.e = bcaVar.a.iterator();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z;
        Object next;
        if (this.b != 4) {
            z = true;
        } else {
            z = false;
        }
        wq9.D(z);
        int C = a82.C(this.b);
        if (C == 0) {
            return true;
        }
        if (C != 2) {
            this.b = 4;
            int i = this.d;
            Object obj = null;
            Object obj2 = this.f;
            Iterator it = this.e;
            switch (i) {
                case 0:
                    while (it.hasNext()) {
                        next = it.next();
                        if (((i39) obj2).apply(next)) {
                            obj = next;
                            break;
                        }
                    }
                    this.b = 3;
                    break;
                default:
                    while (it.hasNext()) {
                        next = it.next();
                        if (((bca) obj2).b.contains(next)) {
                            obj = next;
                            break;
                        }
                    }
                    this.b = 3;
                    break;
            }
            this.c = obj;
            if (this.b != 3) {
                this.b = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.b = 2;
            Object obj = this.c;
            this.c = null;
            return obj;
        }
        xk5.g();
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d26(Iterator it, i39 i39Var) {
        this();
        this.d = 0;
        this.e = it;
        this.f = i39Var;
    }

    public d26() {
        super(0);
        this.b = 2;
    }
}
