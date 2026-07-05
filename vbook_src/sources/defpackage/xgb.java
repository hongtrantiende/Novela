package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xgb  reason: default package */
/* loaded from: classes.dex */
public final class xgb {
    public final String a;
    public final String b;
    public final List c;

    public xgb(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xgb) {
                xgb xgbVar = (xgb) obj;
                if (!this.a.equals(xgbVar.a) || !this.b.equals(xgbVar.b) || !c16.i(this.c, xgbVar.c)) {
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
        int j = eub.j(this.a.hashCode() * 31, 31, this.b);
        List list = this.c;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return j + hashCode;
    }

    public final String toString() {
        return rs8.n(nk2.y("TOC(label=", this.a, ", href=", this.b, ", subitems="), this.c, ")");
    }
}
