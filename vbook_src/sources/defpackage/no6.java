package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: no6  reason: default package */
/* loaded from: classes3.dex */
public final class no6 {
    public static final List b = tl1.B(new no6(1), new no6(2), new no6(4));
    public final int a;

    public /* synthetic */ no6(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof no6) {
            if (this.a != ((no6) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        if (i == 1) {
            return "CR";
        }
        if (i == 2) {
            return "LF";
        }
        if (i == 4) {
            return "CRLF";
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : b) {
            if ((((no6) obj).a | i) == i) {
                arrayList.add(obj);
            }
        }
        return arrayList.toString();
    }
}
