package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t46  reason: default package */
/* loaded from: classes3.dex */
public final class t46 implements Iterator, j76 {
    public final r36 a;
    public final uh9 b;
    public final s76 c;
    public boolean d;
    public boolean e;

    public t46(r36 r36Var, uh9 uh9Var, s76 s76Var) {
        r36Var.getClass();
        s76Var.getClass();
        this.a = r36Var;
        this.b = uh9Var;
        this.c = s76Var;
        this.d = true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        String str;
        if (this.e) {
            return false;
        }
        uh9 uh9Var = this.b;
        if (uh9Var.w() == 9) {
            this.e = true;
            uh9Var.h((byte) 9);
            if (uh9Var.w() == 10) {
                return false;
            }
            if (uh9Var.w() != 8) {
                uh9Var.p();
                return false;
            }
            z1.r(uh9Var, "There is a start of the new array after the one parsed to sequence. ARRAY_WRAPPED mode doesn't merge consecutive arrays.\nIf you need to parse a stream of arrays, please use WHITESPACE_SEPARATED mode instead.", 0, null, 6);
            throw null;
        } else if (uh9Var.w() != 10 || this.e) {
            return true;
        } else {
            String u = pbe.u((byte) 9);
            int i2 = uh9Var.b;
            if (i2 > 0) {
                i = i2 - 1;
            } else {
                i = i2;
            }
            pz pzVar = uh9Var.F;
            if (i2 != pzVar.b && i >= 0) {
                str = String.valueOf(pzVar.a[i]);
            } else {
                str = "EOF";
            }
            z1.r(uh9Var, hl5.o("Expected ", u, ", but had '", str, "' instead"), i, null, 4);
            throw null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        boolean z = this.d;
        uh9 uh9Var = this.b;
        if (z) {
            this.d = false;
        } else {
            uh9Var.i(',');
        }
        s76 s76Var = this.c;
        return new m1b(this.a, znd.c, uh9Var, s76Var.e(), null).d(s76Var);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
