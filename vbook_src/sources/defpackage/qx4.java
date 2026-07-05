package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qx4  reason: default package */
/* loaded from: classes.dex */
public final class qx4 {
    public final List a;

    public qx4(List list) {
        this.a = list;
        if (!list.isEmpty()) {
            if (list.size() > 1) {
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ay4 ay4Var = (ay4) it.next();
                    }
                }
                for (ay4 ay4Var2 : this.a) {
                }
                return;
            }
            return;
        }
        vs.m("credentialOptions should not be empty");
        throw null;
    }
}
