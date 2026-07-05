package defpackage;

import java.math.RoundingMode;
import java.util.Collections;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tp9  reason: default package */
/* loaded from: classes.dex */
public abstract class tp9 {
    public final zg9 C;
    public final vq4 a;
    public final qs5 b;
    public final long c;
    public final List d;
    public final List e;
    public final List f;

    public tp9(vq4 vq4Var, List list, l5a l5aVar, List list2, List list3, List list4) {
        List unmodifiableList;
        wq9.s(!list.isEmpty());
        this.a = vq4Var;
        this.b = qs5.l(list);
        if (list2 == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = Collections.unmodifiableList(list2);
        }
        this.d = unmodifiableList;
        this.e = list3;
        this.f = list4;
        this.C = l5aVar.a(this);
        long j = l5aVar.c;
        long j2 = l5aVar.b;
        String str = a2d.a;
        this.c = a2d.Y(j, 1000000L, j2, RoundingMode.DOWN);
    }

    public abstract String a();

    public abstract pf2 d();

    public abstract zg9 e();
}
