package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jo1  reason: default package */
/* loaded from: classes3.dex */
public final class jo1 implements d82, Serializable {
    public final d82 a;
    public final b82 b;

    public jo1(b82 b82Var, d82 d82Var) {
        d82Var.getClass();
        b82Var.getClass();
        this.a = d82Var;
        this.b = b82Var;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (obj instanceof jo1) {
                jo1 jo1Var = (jo1) obj;
                int i = 2;
                jo1 jo1Var2 = jo1Var;
                int i2 = 2;
                while (true) {
                    d82 d82Var = jo1Var2.a;
                    if (d82Var instanceof jo1) {
                        jo1Var2 = (jo1) d82Var;
                    } else {
                        jo1Var2 = null;
                    }
                    if (jo1Var2 == null) {
                        break;
                    }
                    i2++;
                }
                jo1 jo1Var3 = this;
                while (true) {
                    d82 d82Var2 = jo1Var3.a;
                    if (d82Var2 instanceof jo1) {
                        jo1Var3 = (jo1) d82Var2;
                    } else {
                        jo1Var3 = null;
                    }
                    if (jo1Var3 == null) {
                        break;
                    }
                    i++;
                }
                if (i2 == i) {
                    while (true) {
                        b82 b82Var = this.b;
                        if (!c16.i(jo1Var.get(b82Var.getKey()), b82Var)) {
                            z = false;
                            break;
                        }
                        d82 d82Var3 = this.a;
                        if (d82Var3 instanceof jo1) {
                            this = (jo1) d82Var3;
                        } else {
                            d82Var3.getClass();
                            b82 b82Var2 = (b82) d82Var3;
                            z = c16.i(jo1Var.get(b82Var2.getKey()), b82Var2);
                            break;
                        }
                    }
                    if (z) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.d82
    public final Object fold(Object obj, lu4 lu4Var) {
        return lu4Var.invoke(this.a.fold(obj, lu4Var), this.b);
    }

    @Override // defpackage.d82
    public final b82 get(c82 c82Var) {
        c82Var.getClass();
        while (true) {
            b82 b82Var = this.b.get(c82Var);
            if (b82Var != null) {
                return b82Var;
            }
            d82 d82Var = this.a;
            if (d82Var instanceof jo1) {
                this = (jo1) d82Var;
            } else {
                return d82Var.get(c82Var);
            }
        }
    }

    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode();
    }

    @Override // defpackage.d82
    public final d82 minusKey(c82 c82Var) {
        c82Var.getClass();
        b82 b82Var = this.b;
        b82 b82Var2 = b82Var.get(c82Var);
        d82 d82Var = this.a;
        if (b82Var2 != null) {
            return d82Var;
        }
        d82 minusKey = d82Var.minusKey(c82Var);
        if (minusKey == d82Var) {
            return this;
        }
        if (minusKey == gs3.a) {
            return b82Var;
        }
        return new jo1(b82Var, minusKey);
    }

    @Override // defpackage.d82
    public final d82 plus(d82 d82Var) {
        d82Var.getClass();
        if (d82Var == gs3.a) {
            return this;
        }
        return (d82) d82Var.fold(this, new tv1(25));
    }

    public final String toString() {
        return s21.p(new StringBuilder("["), (String) fold("", new c8(11, (byte) 0)), ']');
    }
}
