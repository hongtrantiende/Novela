package defpackage;

import java.util.HashSet;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rb3  reason: default package */
/* loaded from: classes3.dex */
public final class rb3 extends y1 {
    public final Iterator c;
    public final HashSet d;

    public rb3(Iterator it, j9a j9aVar) {
        it.getClass();
        this.c = it;
        this.d = new HashSet();
    }

    @Override // defpackage.y1
    public final void a() {
        Object next;
        do {
            Iterator it = this.c;
            if (it.hasNext()) {
                next = it.next();
            } else {
                this.a = 2;
                return;
            }
        } while (!this.d.add(next));
        this.b = next;
        this.a = 1;
    }
}
