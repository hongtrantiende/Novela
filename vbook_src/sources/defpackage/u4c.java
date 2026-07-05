package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u4c  reason: default package */
/* loaded from: classes3.dex */
public final class u4c extends n42 {
    public /* synthetic */ Object C;
    public final /* synthetic */ y5c D;
    public int E;
    public List a;
    public mv6 b;
    public mv6 c;
    public mv6 d;
    public Iterator e;
    public tmc f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4c(y5c y5cVar, n42 n42Var) {
        super(n42Var);
        this.D = y5cVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return y5c.H(this.D, this);
    }
}
