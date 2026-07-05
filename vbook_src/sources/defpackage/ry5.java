package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ry5  reason: default package */
/* loaded from: classes3.dex */
public class ry5 implements Iterable, j76 {
    public final int a;
    public final int b;
    public final int c;

    public ry5(int i, int i2, int i3) {
        if (i3 != 0) {
            if (i3 != Integer.MIN_VALUE) {
                this.a = i;
                this.b = vae.j(i, i2, i3);
                this.c = i3;
                return;
            }
            vs.m("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        vs.m("Step must be non-zero.");
        throw null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ry5) {
            if (!isEmpty() || !((ry5) obj).isEmpty()) {
                ry5 ry5Var = (ry5) obj;
                if (this.a == ry5Var.a && this.b == ry5Var.b && this.c == ry5Var.c) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public boolean isEmpty() {
        int i = this.b;
        int i2 = this.c;
        int i3 = this.a;
        if (i2 > 0) {
            if (i3 <= i) {
                return false;
            }
            return true;
        } else if (i3 >= i) {
            return false;
        } else {
            return true;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new sy5(this.a, this.b, this.c);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.b;
        int i2 = this.c;
        int i3 = this.a;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}
