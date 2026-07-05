package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z0f  reason: default package */
/* loaded from: classes.dex */
public abstract class z0f {
    public static final yz a = new jla(0);

    public static synchronized void a() {
        synchronized (z0f.class) {
            yz yzVar = a;
            Iterator it = ((xz) yzVar.values()).iterator();
            if (!it.hasNext()) {
                yzVar.clear();
            } else if (it.next() == null) {
                throw null;
            } else {
                throw new ClassCastException();
            }
        }
    }
}
