package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bd7  reason: default package */
/* loaded from: classes.dex */
public final class bd7 {
    public final fl8 a;
    public final gd7 b;
    public final Map c;
    public final b76 d;

    public bd7(fl8 fl8Var, gd7 gd7Var, Map map, b76 b76Var) {
        this.a = fl8Var;
        this.b = gd7Var;
        this.c = map;
        this.d = b76Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof bd7) {
                bd7 bd7Var = (bd7) obj;
                if (!this.a.equals(bd7Var.a) || !this.b.equals(bd7Var.b) || !this.c.equals(bd7Var.c) || !c16.i(this.d, bd7Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int a = rs8.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        b76 b76Var = this.d;
        if (b76Var == null) {
            hashCode = 0;
        } else {
            hashCode = b76Var.hashCode();
        }
        return a + hashCode;
    }

    public final String toString() {
        return "MobiEntryHeaders(palmdoc=" + this.a + ", mobi=" + this.b + ", exth=" + this.c + ", kf8=" + this.d + ")";
    }
}
