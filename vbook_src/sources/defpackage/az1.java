package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: az1  reason: default package */
/* loaded from: classes3.dex */
public final class az1 implements h39 {
    public final ArrayList a;

    public az1(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.h39
    public final boolean test(Object obj) {
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                if (!((h39) obj2).test(obj)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }
}
