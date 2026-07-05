package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c8a  reason: default package */
/* loaded from: classes.dex */
public final class c8a {
    public final u7a a;
    public final xu7 b;

    public c8a(b8a b8aVar, ny5 ny5Var) {
        this.a = b8aVar.d;
        List j = b8a.j(4, b8aVar);
        this.b = new xu7(j.size());
        int size = j.size();
        for (int i = 0; i < size; i++) {
            b8a b8aVar2 = (b8a) j.get(i);
            if (ny5Var.a(b8aVar2.f)) {
                this.b.a(b8aVar2.f);
            }
        }
    }
}
