package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pr9  reason: default package */
/* loaded from: classes.dex */
public final class pr9 {
    public final ArrayList a;
    public final ArrayList b;
    public final i0b c;
    public final String d;
    public final String e;
    public final hw3 f;

    public pr9(ArrayList arrayList, ArrayList arrayList2, i0b i0bVar, String str, String str2, hw3 hw3Var) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = i0bVar;
        this.d = str;
        this.e = str2;
        this.f = hw3Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof pr9) {
                pr9 pr9Var = (pr9) obj;
                if (!this.a.equals(pr9Var.a) || !this.b.equals(pr9Var.b) || !c16.i(this.c, pr9Var.c) || !c16.i(this.d, pr9Var.d) || !c16.i(this.e, pr9Var.e) || !c16.i(this.f, pr9Var.f)) {
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
        int hashCode3;
        int hashCode4 = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = 0;
        i0b i0bVar = this.c;
        if (i0bVar == null) {
            hashCode = 0;
        } else {
            hashCode = i0bVar.hashCode();
        }
        int i2 = (hashCode4 + hashCode) * 31;
        String str = this.d;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.e;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        hw3 hw3Var = this.f;
        if (hw3Var != null) {
            i = hw3Var.a.hashCode();
        }
        return i4 + i;
    }

    public final String toString() {
        return "Response(href=" + this.a + ", propStats=" + this.b + ", status=" + this.c + ", responseDescription=" + this.d + ", location=" + this.e + ", error=" + this.f + ")";
    }
}
