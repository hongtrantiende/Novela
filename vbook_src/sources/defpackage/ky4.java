package defpackage;

import android.content.Context;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ky4  reason: default package */
/* loaded from: classes3.dex */
public final class ky4 extends n42 {
    public Object a;
    public Context b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ aib e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ky4(aib aibVar, n42 n42Var) {
        super(n42Var);
        this.e = aibVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(null, 0, this);
    }
}
