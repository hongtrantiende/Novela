package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: ewa  reason: default package */
/* loaded from: classes.dex */
public final class ewa<T> {
    public static final dwa Companion = new Object();
    public static final ye6[] c = {ipe.x(sk6.b, new mia(21)), null};
    public static final n09 d;
    public final List a;
    public final List b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, dwa] */
    static {
        n09 n09Var = new n09("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", null, 2);
        n09Var.k("keys", false);
        n09Var.k("values", false);
        d = n09Var;
    }

    public /* synthetic */ ewa(int i, List list, List list2) {
        if (3 == (i & 3)) {
            this.a = list;
            this.b = list2;
            return;
        }
        w92.x(i, 3, d);
        throw null;
    }

    public ewa(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }
}
