package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rw9  reason: default package */
/* loaded from: classes.dex */
public final class rw9 extends sw9 implements Iterator {
    public qw9 a;
    public boolean b = true;
    public final /* synthetic */ tw9 c;

    public rw9(tw9 tw9Var) {
        this.c = tw9Var;
    }

    @Override // defpackage.sw9
    public final void a(qw9 qw9Var) {
        boolean z;
        qw9 qw9Var2 = this.a;
        if (qw9Var == qw9Var2) {
            qw9 qw9Var3 = qw9Var2.d;
            this.a = qw9Var3;
            if (qw9Var3 == null) {
                z = true;
            } else {
                z = false;
            }
            this.b = z;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b) {
            if (this.c.a == null) {
                return false;
            }
            return true;
        }
        qw9 qw9Var = this.a;
        if (qw9Var == null || qw9Var.c == null) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        qw9 qw9Var;
        if (this.b) {
            this.b = false;
            this.a = this.c.a;
        } else {
            qw9 qw9Var2 = this.a;
            if (qw9Var2 != null) {
                qw9Var = qw9Var2.c;
            } else {
                qw9Var = null;
            }
            this.a = qw9Var;
        }
        return this.a;
    }
}
