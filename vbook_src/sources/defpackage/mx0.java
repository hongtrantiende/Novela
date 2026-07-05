package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mx0  reason: default package */
/* loaded from: classes3.dex */
public final class mx0 {
    public final String a;
    public final List b;
    public final List c;
    public final List d;

    public mx0(String str, List list, List list2, List list3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = list3;
    }

    public static mx0 a(mx0 mx0Var, String str, List list, List list2, List list3, int i) {
        if ((i & 1) != 0) {
            str = mx0Var.a;
        }
        if ((i & 2) != 0) {
            list = mx0Var.b;
        }
        if ((i & 4) != 0) {
            list2 = mx0Var.c;
        }
        if ((i & 8) != 0) {
            list3 = mx0Var.d;
        }
        mx0Var.getClass();
        str.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        return new mx0(str, list, list2, list3);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof mx0) {
                mx0 mx0Var = (mx0) obj;
                if (!this.a.equals(mx0Var.a) || !c16.i(this.b, mx0Var.b) || !c16.i(this.c, mx0Var.c) || !c16.i(this.d, mx0Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + eub.l(eub.l(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        return "BrowserSuggestState(searchEngine=" + this.a + ", searchEngineList=" + this.b + ", historyList=" + this.c + ", searchHistoryList=" + this.d + ")";
    }
}
