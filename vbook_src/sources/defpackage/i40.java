package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i40  reason: default package */
/* loaded from: classes.dex */
public final class i40 implements Iterator, j76 {
    public int a;
    public int b;
    public final /* synthetic */ j40 c;

    public i40(j40 j40Var) {
        this.c = j40Var;
        this.a = j40Var.a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        j40 j40Var = this.c;
        if (j40Var.a == this.a) {
            while (true) {
                int i = this.b;
                if (i >= j40Var.a) {
                    break;
                }
                String str = j40Var.b[i];
                if (str != null) {
                    if (str.length() <= 1 || str.charAt(0) != '/') {
                        break;
                    }
                    this.b++;
                } else {
                    vs.m("Failed requirement.");
                    return false;
                }
            }
            if (this.b >= j40Var.a) {
                return false;
            }
            return true;
        }
        throw new ConcurrentModificationException("Use Iterator#remove() instead to remove attributes while iterating.");
    }

    @Override // java.util.Iterator
    public final Object next() {
        j40 j40Var = this.c;
        int i = j40Var.a;
        if (i == this.a) {
            if (this.b < i) {
                String str = j40Var.b[this.b];
                str.getClass();
                g40 g40Var = new g40(str, (String) j40Var.c[this.b], j40Var);
                this.b++;
                return g40Var;
            }
            xk5.g();
            return null;
        }
        throw new ConcurrentModificationException("Use Iterator#remove() instead to remove attributes while iterating.");
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.b - 1;
        this.b = i;
        this.c.p(i);
        this.a--;
    }
}
