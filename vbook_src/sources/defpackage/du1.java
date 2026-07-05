package defpackage;

import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: du1  reason: default package */
/* loaded from: classes.dex */
public interface du1 {
    default Object a(Class cls) {
        return h(mf9.a(cls));
    }

    default Set b(mf9 mf9Var) {
        return (Set) d(mf9Var).get();
    }

    default l99 c(Class cls) {
        return g(mf9.a(cls));
    }

    l99 d(mf9 mf9Var);

    ve8 e(mf9 mf9Var);

    l99 g(mf9 mf9Var);

    default Object h(mf9 mf9Var) {
        l99 g = g(mf9Var);
        if (g == null) {
            return null;
        }
        return g.get();
    }
}
