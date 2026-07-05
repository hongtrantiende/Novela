package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ao  reason: default package */
/* loaded from: classes.dex */
public final class ao extends n42 {
    public ArrayList a;
    public int b;
    public long c;
    public /* synthetic */ Object d;
    public final /* synthetic */ co e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao(co coVar, n42 n42Var) {
        super(n42Var);
        this.e = coVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.k(null, 0, 0L, this);
    }
}
