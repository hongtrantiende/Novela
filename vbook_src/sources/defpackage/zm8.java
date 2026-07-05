package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zm8  reason: default package */
/* loaded from: classes.dex */
public final class zm8 {
    public final List a;
    public final List b;

    public zm8(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = list;
        this.b = list2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(sl1.i0(this.a, ", ", null, null, null, 62));
        sb.append('(');
        return s21.p(sb, sl1.i0(this.b, ";", null, null, null, 62), ')');
    }
}
