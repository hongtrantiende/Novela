package defpackage;

import android.content.Context;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zx  reason: default package */
/* loaded from: classes.dex */
public final class zx extends n42 {
    public Object a;
    public Context b;
    public up3 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ey e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx(ey eyVar, n42 n42Var) {
        super(n42Var);
        this.e = eyVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(null, null, this);
    }
}
