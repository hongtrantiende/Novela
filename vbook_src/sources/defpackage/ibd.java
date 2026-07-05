package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ibd  reason: default package */
/* loaded from: classes3.dex */
public final class ibd {
    public final String a;
    public final List b;
    public final Set c;

    public ibd(String str, List list, Set set) {
        list.getClass();
        set.getClass();
        this.a = str;
        this.b = list;
        this.c = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    public static ibd a(ibd ibdVar, String str, ArrayList arrayList, int i) {
        if ((i & 1) != 0) {
            str = ibdVar.a;
        }
        ArrayList arrayList2 = arrayList;
        if ((i & 2) != 0) {
            arrayList2 = ibdVar.b;
        }
        Set set = ibdVar.c;
        ibdVar.getClass();
        str.getClass();
        arrayList2.getClass();
        set.getClass();
        return new ibd(str, arrayList2, set);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ibd) {
                ibd ibdVar = (ibd) obj;
                if (!this.a.equals(ibdVar.a) || !c16.i(this.b, ibdVar.b) || !c16.i(this.c, ibdVar.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + eub.l(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return "VideoTableOfContentState(currentId=" + this.a + ", sections=" + this.b + ", downloadingIds=" + this.c + ")";
    }
}
