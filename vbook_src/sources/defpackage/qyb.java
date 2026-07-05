package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qyb  reason: default package */
/* loaded from: classes3.dex */
public final class qyb {
    public final String a;
    public final List b;
    public final Set c;

    public qyb(String str, List list, Set set) {
        list.getClass();
        set.getClass();
        this.a = str;
        this.b = list;
        this.c = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    public static qyb a(qyb qybVar, String str, ArrayList arrayList, Set set, int i) {
        if ((i & 1) != 0) {
            str = qybVar.a;
        }
        ArrayList arrayList2 = arrayList;
        if ((i & 2) != 0) {
            arrayList2 = qybVar.b;
        }
        if ((i & 4) != 0) {
            set = qybVar.c;
        }
        qybVar.getClass();
        str.getClass();
        arrayList2.getClass();
        set.getClass();
        return new qyb(str, arrayList2, set);
    }

    public final String b() {
        return this.a;
    }

    public final Set c() {
        return this.c;
    }

    public final List d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof qyb) {
                qyb qybVar = (qyb) obj;
                if (!this.a.equals(qybVar.a) || !c16.i(this.b, qybVar.b) || !c16.i(this.c, qybVar.c)) {
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
        return "TextTableOfContentState(currentId=" + this.a + ", tocLinks=" + this.b + ", downloadingIds=" + this.c + ")";
    }
}
