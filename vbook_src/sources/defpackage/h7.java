package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h7  reason: default package */
/* loaded from: classes3.dex */
public class h7 implements vu4, Serializable {
    public final int C;
    public final Object a;
    public final Class b;
    public final String c;
    public final String d;
    public final boolean e = false;
    public final int f;

    public h7(int i, int i2, Class cls, Object obj, String str, String str2) {
        this.a = obj;
        this.b = cls;
        this.c = str;
        this.d = str2;
        this.f = i;
        this.C = i2 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h7) {
                h7 h7Var = (h7) obj;
                if (this.e == h7Var.e && this.f == h7Var.f && this.C == h7Var.C && c16.i(this.a, h7Var.a) && this.b.equals(h7Var.b) && this.c.equals(h7Var.c) && this.d.equals(h7Var.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.vu4
    public final int getArity() {
        return this.f;
    }

    public final int hashCode() {
        int i;
        int i2;
        Object obj = this.a;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int j = eub.j(eub.j((this.b.hashCode() + (i * 31)) * 31, 31, this.c), 31, this.d);
        if (this.e) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        return ((((j + i2) * 31) + this.f) * 31) + this.C;
    }

    public final String toString() {
        cm9.a.getClass();
        return dm9.a(this);
    }
}
