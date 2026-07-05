package defpackage;

import android.content.Context;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jba  reason: default package */
/* loaded from: classes.dex */
public final class jba extends n42 {
    public kba a;
    public Context b;
    public /* synthetic */ Object c;
    public final /* synthetic */ kba d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jba(kba kbaVar, n42 n42Var) {
        super(n42Var);
        this.d = kbaVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, null, this);
    }
}
