package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pw9  reason: default package */
/* loaded from: classes.dex */
public final class pw9 extends sw9 implements Iterator {
    public qw9 a;
    public qw9 b;

    @Override // defpackage.sw9
    public final void a(qw9 qw9Var) {
        qw9 qw9Var2 = null;
        if (this.a == qw9Var && qw9Var == this.b) {
            this.b = null;
            this.a = null;
        }
        qw9 qw9Var3 = this.a;
        if (qw9Var3 == qw9Var) {
            this.a = qw9Var3.d;
        }
        qw9 qw9Var4 = this.b;
        if (qw9Var4 == qw9Var) {
            qw9 qw9Var5 = this.a;
            if (qw9Var4 != qw9Var5 && qw9Var5 != null) {
                qw9Var2 = qw9Var4.c;
            }
            this.b = qw9Var2;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        qw9 qw9Var;
        qw9 qw9Var2 = this.b;
        qw9 qw9Var3 = this.a;
        if (qw9Var2 != qw9Var3 && qw9Var3 != null) {
            qw9Var = qw9Var2.c;
        } else {
            qw9Var = null;
        }
        this.b = qw9Var;
        return qw9Var2;
    }
}
