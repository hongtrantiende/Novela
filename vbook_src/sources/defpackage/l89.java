package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l89  reason: default package */
/* loaded from: classes.dex */
public final class l89 {
    public final List a;
    public final i0b b;
    public final String c;
    public final hw3 d;

    public l89(List list, i0b i0bVar, String str, hw3 hw3Var) {
        this.a = list;
        this.b = i0bVar;
        this.c = str;
        this.d = hw3Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l89) {
                l89 l89Var = (l89) obj;
                if (!this.a.equals(l89Var.a) || !c16.i(this.b, l89Var.b) || !c16.i(this.c, l89Var.c) || !c16.i(this.d, l89Var.d)) {
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
        int hashCode2;
        int hashCode3 = this.a.hashCode() * 31;
        int i = 0;
        i0b i0bVar = this.b;
        if (i0bVar == null) {
            hashCode = 0;
        } else {
            hashCode = i0bVar.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        String str = this.c;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        hw3 hw3Var = this.d;
        if (hw3Var != null) {
            i = hw3Var.a.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        return "PropStat(properties=" + this.a + ", status=" + this.b + ", responseDescription=" + this.c + ", error=" + this.d + ")";
    }
}
