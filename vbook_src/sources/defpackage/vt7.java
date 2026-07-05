package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vt7  reason: default package */
/* loaded from: classes.dex */
public final class vt7 {
    public final ArrayList a;
    public final String b;
    public final String c;

    public vt7(String str, String str2, ArrayList arrayList) {
        this.a = arrayList;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof vt7) {
                vt7 vt7Var = (vt7) obj;
                if (!this.a.equals(vt7Var.a) || !c16.i(this.b, vt7Var.b) || !c16.i(this.c, vt7Var.c)) {
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
        int hashCode2 = this.a.hashCode() * 31;
        int i = 0;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiStatus(responses=");
        sb.append(this.a);
        sb.append(", responseDescription=");
        sb.append(this.b);
        sb.append(", syncToken=");
        return s21.q(sb, this.c, ")");
    }
}
