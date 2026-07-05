package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vi3  reason: default package */
/* loaded from: classes.dex */
public final class vi3 {
    public final List a;
    public final Map b;

    public vi3(List list) {
        list.getClass();
        this.a = list;
        ArrayList arrayList = new ArrayList(tl1.s(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new yk8(new pm0(((xl0) obj).a), Integer.valueOf(i)));
                i = i2;
            } else {
                tl1.M();
                throw null;
            }
        }
        this.b = o17.x(arrayList);
    }
}
