package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c75  reason: default package */
/* loaded from: classes.dex */
public final class c75 extends bi0 {
    public final List d;
    public final long e;

    public c75(long j, List list) {
        super(0L, list.size() - 1);
        this.e = j;
        this.d = list;
    }

    @Override // defpackage.a47
    public final long b() {
        a();
        return this.e + ((o75) this.d.get((int) this.c)).e;
    }

    @Override // defpackage.a47
    public final long c() {
        a();
        o75 o75Var = (o75) this.d.get((int) this.c);
        return this.e + o75Var.e + o75Var.c;
    }
}
