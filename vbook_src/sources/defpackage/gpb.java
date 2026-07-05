package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gpb  reason: default package */
/* loaded from: classes.dex */
public final class gpb {
    public static final gpb b = new gpb(0);
    public static final gpb c = new gpb(1);
    public static final gpb d = new gpb(2);
    public final int a;

    public gpb(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpb)) {
            return false;
        }
        if (this.a == ((gpb) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return rs8.i(arrayList.get(0), "TextDecoration.");
        }
        return hl5.n("TextDecoration[", er6.a(62, null, ", ", arrayList), "]");
    }
}
