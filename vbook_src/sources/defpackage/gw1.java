package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gw1  reason: default package */
/* loaded from: classes.dex */
public final class gw1 extends RuntimeException {
    public final kv7 a;
    public final kv7 b;
    public final vu7 c;
    public final int d;

    public gw1(kv7 kv7Var, kv7 kv7Var2, vu7 vu7Var, int i, Exception exc) {
        super(exc);
        this.a = kv7Var;
        this.b = kv7Var2;
        this.c = vu7Var;
        this.d = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        List list;
        c9a O = h9a.O(new fw1(this, null));
        if (!O.hasNext()) {
            list = ks3.a;
        } else {
            Object next = O.next();
            if (!O.hasNext()) {
                list = tl1.A(next);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (O.hasNext()) {
                    arrayList.add(O.next());
                }
                list = arrayList;
            }
        }
        String i0 = sl1.i0(sl1.w0(50, list), "\n", null, null, null, 62);
        return l4b.z("\n            |Failed to execute op number " + this.d + ":\n            |" + i0 + "\n            ");
    }
}
