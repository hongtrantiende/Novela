package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bqd  reason: default package */
/* loaded from: classes.dex */
public final class bqd extends n42 {
    public int C;
    public j6d a;
    public List b;
    public Iterator c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ bm1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqd(bm1 bm1Var, n42 n42Var) {
        super(n42Var);
        this.f = bm1Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.C |= Integer.MIN_VALUE;
        return this.f.j(this);
    }
}
