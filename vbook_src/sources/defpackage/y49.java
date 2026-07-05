package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y49  reason: default package */
/* loaded from: classes.dex */
public final class y49 {
    public final List a;
    public final List[] b;
    public int c;
    public int d;
    public boolean e;
    public final /* synthetic */ z49 f;

    public y49(z49 z49Var, List list) {
        this.f = z49Var;
        this.a = list;
        this.b = new List[list.size()];
        if (list.isEmpty()) {
            ov5.a("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
