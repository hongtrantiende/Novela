package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xuc  reason: default package */
/* loaded from: classes.dex */
public final class xuc extends n42 {
    public int C;
    public uuc a;
    public avc b;
    public List c;
    public Iterator d;
    public /* synthetic */ Object e;
    public final /* synthetic */ bm1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xuc(bm1 bm1Var, n42 n42Var) {
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
