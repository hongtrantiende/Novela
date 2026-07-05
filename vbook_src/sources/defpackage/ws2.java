package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ws2  reason: default package */
/* loaded from: classes.dex */
public final class ws2 {
    public mce b;
    public boolean c;
    public Set a = rs3.a;
    public final cq2 d = new cq2(this, 2);

    public final void a() {
        Set set = this.a;
        boolean z = false;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                u4 u4Var = ((we0) it.next()).c;
                we0.e[0].getClass();
                if (((Boolean) u4Var.b).booleanValue()) {
                    z = true;
                    break;
                }
            }
        }
        if (this.c != z) {
            this.c = z;
        }
    }
}
